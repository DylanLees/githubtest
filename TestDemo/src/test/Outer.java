package test;

public class Outer {
	// �Ǿ�̬�ڲ���
	class Inner {
		public void test() {
			System.out.println("hello world");
			bar();
		}
	}

	// ��̬����
	public static void foo() {
		new Outer().new Inner().test();
	}

	public void bar() {
		System.out.println("���");
	}

	/**
	 * Ҫ�ھ�̬�����е����ڲ��࣬�����ͨ��ʵ������ȡһ���ⲿ��Ķ���Ȼ��ͨ���ⲿ��Ķ���ȥ�����ڲ����ʵ������������ķ�����
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new Outer().new Inner().test();
		System.gc();// �������յķ���
		Runtime.getRuntime().gc();// ����ϵͳ�����������յķ���
	}
}

class Demo {

}
