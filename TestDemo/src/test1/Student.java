package test1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * BufferedWriter��BufferedReader
 * 
 * @author Administrator
 *
 */
public class Student {
	public static void main(String[] args) {
		// ����һ���ַ�������
		String content[] = { "�㲻ϲ���ң�", "��һ�㶼�����⡣", "��Ϊ�һ�������", "����Ϊ��ȡ���㣡" };
		// ����һ���ļ�
		File file = new File("G:/word.txt");
		if (!file.exists()) {// �ļ��������򴴽��ļ�
			try {
				System.out.println("�ļ����������ڴ����ļ���...");
				file.createNewFile();
				System.out.println("�ļ������ɹ�");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			try {
				FileWriter fw = new FileWriter(file);// ����FileWriter����
				BufferedWriter bufw = new BufferedWriter(fw);// ����BufferedWriter����
				for (int i = 0; i < content.length; i++) {// ѭ�������ַ������������
					bufw.write(content[i]);// ��������������д�뵽��������
					bufw.newLine();// �������еĵ���Ԫ���Ե��е���ʽд�뵽�ļ���
				}
				bufw.close();// �ر�BufferedWriter��
				fw.close();// �ر�FileWriter��
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				FileReader fr = new FileReader(file);// ����FileReader����
				BufferedReader bufr = new BufferedReader(fr);// ����BufferedReader��
				// ����һ���ַ�������
				String s = null;
				int row = 0;// ����ͳ�������ı���
				while ((s = bufr.readLine()) != null) {// ����ļ��ı�������Ϊ�վͽ���ѭ��
					row++;
					System.out.println("��" + row + "�У�" + s);
				}
				bufr.close();// �ر�BufferedReader��
				fr.close();// �ر�FileReader��

			} catch (Exception e) {
				// TODO: handle exception
			}

		}
	}
}
