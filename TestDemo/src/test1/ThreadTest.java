
package test1;

public class ThreadTest extends Thread {
	//����һ��������¼����
	int count=10;
	//�����̵߳�run����
	@Override
	public void run() {
		while(true){
			System.out.print(count+" ");//��ӡ�������
			if(--count==0){
				break;
			}
		}
	}
	public static void main(String[] args) {
		ThreadTest threadTest = new ThreadTest();
		//�����߳�
		threadTest.start();
	}
}
