package test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ProgramFour {
	static final int lineLength = 81;

	public static void main(String[] args) {
		FileOutputStream fos;
		// �����绰�������Ķ�������
		byte[] phone = new byte[lineLength];
		byte[] name = new byte[lineLength];
		try {
			fos = new FileOutputStream("word.txt");
			while (true) {
				if ("done".equalsIgnoreCase(new String(name, 0, 4))) {
					System.out.println("¼�����");
					break;
				}
				System.err.println("������绰�ţ�");
				readLine(phone);
				
				for (int i = 0; phone[i] != 0; i++) {
					fos.write(phone[i]);
				}
				fos.write(',');
				System.err.println("������һ�����֣�");
				readLine(name);
				for (int j = 0; name[j] != 0; j++) {
					fos.write(name[j]);
				}
				fos.write('\n');
				System.out.println("��Ϣ�Ѿ�д���ļ�");
			}
			fos.close();
		} catch (Exception e) {
			// TODO �Զ����� catch ��
			e.printStackTrace();
		}
	}

	private static void readLine(byte[] name) throws IOException {
		int b = 0, i = 0;
		while ((i < (lineLength - 1)) && (b = System.in.read()) != '\n') {
			name[i++] = (byte) b;
		}
		name[i] = (byte) 0;
	}
}
