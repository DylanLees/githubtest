package test;

/**
 * ����ʽ����ģʽ
 * 
 * @author Administrator
 *
 */
public class Singleton {
	private Singleton() {

	}
	//��Ҫʹ�õ�ʱ�򣬲Ž���ʵ����
	private static Singleton singleton = null;
	public static synchronized Singleton getInstance() {
		if (singleton == null) {
			new Singleton();
		}
		return singleton;
	}
}
