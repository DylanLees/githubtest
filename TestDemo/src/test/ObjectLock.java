package test;

public class ObjectLock {
	public static void main(String[] args) {
		System.out.println("start time��"+System.currentTimeMillis()+"ms");//�����ǰϵͳʱ��
		 LockTestClass testClass = new LockTestClass();
		 for(int i=0;i<3;i++){
			 //ʵ����һ���߳������
			 Thread thread = new ObjectThread(testClass,i);
			 thread.start();
		 }
	}

}
