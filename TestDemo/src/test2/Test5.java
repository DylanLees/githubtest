package test2;

public class Test5 {
	public static void main(String[] args) {
		RecallTest recallTest = new RecallTest();
		// recallTest.setStudy(new ImplTest());
		recallTest.setStudy(new StudyCallBack() {
			// �������ʹ�ã�new������Ը�һ���ӿڣ�Ҳ���Ը�һ�������࣬Ȼ��ͨ��������Ľӿڻص�ʵ������ķ���

			@Override
			public void studyMath(String bookname) {
				System.out.println(bookname);

			}
		});
		// StudyCallBack implTest = new ImplTest();
		// recallTest.setStudy(implTest);
		try {
			Thread.sleep(100);//sleep()���߳�Thread���һ����̬����
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			recallTest.wait();//wait��Object���еķ��������еĶ��󶼿���ȥ����
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
