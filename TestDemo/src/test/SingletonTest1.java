package test;

/**
 * ����ʽ����ģʽ
 * 
 * @author Administrator
 *
 */
public class SingletonTest1 {
	private SingletonTest1() {

	}

	private static SingletonTest1 singleton1 = null;

	/**
	 * ��һ�ε��õ�ʱ��ʵ�����Լ�
	 * 
	 * @return
	 */
	public static SingletonTest1 getInstance() {
		if (singleton1 == null) {
			singleton1 = new SingletonTest1();
		}
		return singleton1;

	}

}
