package test1;

/**
 * ����ʽ
 * 
 * @author Administrator
 *
 */
public class Singleton {

	private Singleton() {

	}

	// ����ص�ʱ��ͽ���ʵ����
	private static final Singleton SINGLETON = new Singleton();

	public Singleton getInstance() {
		return SINGLETON;
	}
}
