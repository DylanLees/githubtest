package test1;

public class ThreadSafeTest1 implements Runnable {
	int num = 10;// Ĭ��Ʊ��

	/**
	 * ����ͬ������
	 */
	public synchronized boolean doit() {
		boolean soldout = false;// Ĭ��δ����
		if (num > 0) {
			try {
				// �����߳�����ʱ��100ms
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "Ʊ����" + num--);
		} else {
			System.out.println("�Բ���Ʊ�Ѿ�����");
			soldout = true;
		}
		return soldout;
	}

	@Override
	public void run() {
		while (true) {
			// ����ͬ������
			boolean doit = doit();
			if (doit) {
				break;
			}
		}

	}

	public static void main(String[] args) {
		ThreadSafeTest1 t = new ThreadSafeTest1();// ʵ������
		// ����4���߳�
		Thread t1 = new Thread(t, "�߳�1");
		Thread t2 = new Thread(t, "�߳�2");
		Thread t3 = new Thread(t, "�߳�3");
		Thread t4 = new Thread(t, "�߳�4");
		// �����߳�
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
