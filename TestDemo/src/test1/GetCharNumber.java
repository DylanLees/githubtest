package test1;

import java.util.Scanner;

public class GetCharNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//ͳ��Ӣ����ĸ
		int letter=0;
		//ͳ������
		int digit=0;
		//ͳ�ƿո�
		int space=0;
		//ͳ�������ַ�
		int other=0;
		System.out.println("��������Ҫͳ�Ƶ��ַ���");
		Scanner sc = new Scanner(System.in);
		//��ȡ������ַ���
		String str = sc.nextLine();//�����ո�
		for(int i=0;i<str.length();i++){
			char c = str.charAt(i);
			if(c>='a'&&c<='z'||c>='A'&&c<='Z'){
				letter++;
			}
			else if (c>='0'&&c<='9') {
				digit++;
			}
			else if (c==' ') {
				space++;
				
			}
			else {
				other++;
			}
		}
		System.out.println("letter\t"+letter);
		System.out.println("digit \t"+digit);
		System.out.println("space \t"+space);
		System.out.println("other \t"+other);
		
	}
}
