package test;

import java.util.Scanner;

public class Statistics {
	public static void main(String[] args) {
		statistics();

	}

	public static void statistics() {
		// ͳ����ĸ
		int letter = 0;
		// ͳ������
		int digit = 0;
		// ͳ�ƿո�
		int space = 0;
		// �����ַ�
		int other = 0;
		// ������һ���ַ���
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ���ַ���:");
		// ��ȡ������ַ���
		String str = scanner.nextLine();// nextLine()�������Ի�ô��ո���ַ���
		// ���ַ���ת��λһ���ַ�����
		char[] ch = str.toCharArray();
		// ѭ���ַ�����
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z' || ch[i] >= 'A' && ch[i] <= 'Z') {
				letter++;// ͳ����ĸ����
			} else if (ch[i] >= '0' && ch[i] <= '9') {
				digit++;// ͳ�����ָ���
			} else if (ch[i] == ' ') {
				space++;// ͳ�ƿո����
			} else {
				other++;// ͳ�������ַ�����
			}

		}
		System.out.println("Ӣ����ĸ�У�" + letter+"��");
		System.out.println("�����У�" + digit+"��");
		System.out.println("�ո��У�" + space+"��");
		System.out.println("�����ַ��У�" + other+"��");

	}
}
