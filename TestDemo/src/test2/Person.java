package test2;

import java.io.Serializable;

/**
 * ʵ�����л�
 * 
 * @author Administrator
 *
 */
public class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	// �����Ա����
	private String name;
	private int age;

	/**
	 * ����������Ĺ��췽��
	 * 
	 * @param name
	 * @param age
	 */
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// ��дtoString����
	@Override
	public String toString() {
		return "������" + this.name + "���䣺" + age;
	}
}
