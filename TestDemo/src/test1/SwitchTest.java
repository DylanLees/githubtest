package test1;

import java.util.Scanner;

public class SwitchTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("������1~7������");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		switch (key) {
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wensday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("sunday");
			break;

		default:
			System.out.println("��������ֲ�����Ҫ��");
			break;
		}
	}
}
