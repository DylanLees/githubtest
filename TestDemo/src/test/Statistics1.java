package test;

import java.util.Scanner;

public class Statistics1 {
	public static void main(String[] args) {
		// ͳ��Ӣ����ĸ����
		int letter = 0;
		// ͳ�����ָ���
		int digit = 0;
		// ͳ�ƿո����
		int space = 0;
		// ͳ�������ַ�����
		int other = 0;
		// ʵ����ɨ����
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������ַ�����");
		// ��ȡ������ַ���
		String str = scanner.nextLine();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
				letter++;
			} else if (c >= '0' && c <= '9') {
				digit++;
			} else if (c == ' ') {
				space++;
			} else {
				other++;
			}
		}
		System.out.println("Ӣ����ĸ������" + letter);
		System.out.println("���ָ�����" + digit);
		System.out.println("�ո������" + space);
		System.out.println("�����ַ�������" + other);

	}
}
