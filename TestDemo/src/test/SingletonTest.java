package test;

/**
 * ����ʽ����ģʽ
 * 
 * @author Administrator
 *
 */
public class SingletonTest {

	private SingletonTest() {

	}

	// ������ص�ʱ���Զ�ʵ����
	private static final SingletonTest SINGLETON = new SingletonTest();

	public static SingletonTest getInstance() {

		return SINGLETON;
	}

}
