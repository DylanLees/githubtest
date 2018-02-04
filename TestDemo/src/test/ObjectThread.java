package test;

/**
 * ���߳�����������ͬ������
 * 
 * @author Administrator
 *
 */
public class ObjectThread extends Thread {
	LockTestClass lock;
	int i = 0;

	public ObjectThread(LockTestClass lock, int i) {
		this.lock = lock;
		this.i = i;
	}

	/**
	 * ���������Ͷ�����
	 */
	public void run3() {
		// ��������
		// lock.noSynMethod(this.getId(),this);
		// ����������1������synchronized synInMethod�ķ�ʽ
		lock.synInMethod();
		// ����������2������synchronized(this)�ķ�ʽ
		// lock.synOnMethod();
		// ˽��������������synchronized(object)�ķ�ʽ
		// lock.synMethodWithObj();
		// ��������������static synchronized increment�ķ�ʽ
		LockTestClass.increament();
	}

	/**
	 * ˽�����Ͷ�����
	 */
	public void run() {
		// ��������
		// lock.noSynMethod(this.getId(),this);
		// ����������1������synchronized synInMethod�ķ�ʽ
		lock.synInMethod();
		// ����������2������synchronized(this)�ķ�ʽ
		// lock.synOnMethod();
		// ˽��������������synchronized(object)�ķ�ʽ
		lock.synMethodWithObj();
		// ��������������static synchronized increment�ķ�ʽ
		// LockTestClass.increament();
	}

	/**
	 * �����Ͷ�����
	 */
	public void run2() {
		// ��������
		// lock.noSynMethod(this.getId(),this);
		// ����������1������synchronized synInMethod�ķ�ʽ
		lock.synInMethod();
		// ����������2������synchronized(this)�ķ�ʽ
		lock.synOnMethod();
		// ˽��������������synchronized(object)�ķ�ʽ
		// lock.synMethodWithObj();
		// ��������������static synchronized increment�ķ�ʽ
		// LockTestClass.increament();
	}
}
