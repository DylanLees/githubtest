package test1;

/**
 * ģ���վ��Ʊϵͳ����
 * 
 * @author Administrator
 *
 */
public class ThreadSafeTest implements Runnable {// ʵ��Runnable�ӿ�
	int num = 10;// ���õ�ǰƱ��

	@Override
	public void run() {// ��дrun����
		synchronized (this) {// ����ͬ�������
			while (true) {// ��������ѭ��
				if (num > 0) {// �жϵ�ǰƱ���Ƿ����0
					try {
						// ʹ��ǰ�߳�����100ms
						Thread.sleep(100);

					} catch (Exception e) {
						e.printStackTrace();
					}
					// ��ǰƱ����1
					System.out.println("��ǰ�߳����ƣ�" + Thread.currentThread().getName() + "ʣ��Ʊ����" + num--);
				} else {
					System.out.println("�Բ���Ʊ�Ѿ�����");
					break;
				}
			}
		}

	}

	public static void main(String[] args) {
		ThreadSafeTest t = new ThreadSafeTest();// ʵ���������
		Thread t1 = new Thread(t, "�߳�һ");// ʵ�����ĸ��߳�
		Thread t2 = new Thread(t, "�̶߳�");
		Thread t3 = new Thread(t, "�߳���");
		Thread t4 = new Thread(t, "�߳���");
		// �����߳�
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
