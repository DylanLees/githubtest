package test1;

import java.io.File;

public class FolderTest {
	public static void main(String[] args) {
		String path = "G:\\test";// �����ļ���test���ڵ�Ŀ¼
		for (int i = 1; i <= 10; i++) {// ѭ����ȡi������i�����µ��ļ���
			File folder = new File(path + "\\" + i); // �����µ�Ŀ¼����file����
			if (!folder.exists()) {// �ļ��в�����
				folder.mkdirs();// �����µ��ļ��У����������ڵĸ����ļ���
			}
		}
		System.out.println("�ļ��д����ɹ�");
		File file = new File("G:\\");// ����·����������file����
		File[] files = file.listFiles();// ��ȡG���������ļ����ļ���
		for (File folder : files) {
			if (folder.isFile()) {// �ж��Ƿ�Ϊ�ļ�
				System.out.println(folder.getName() + "�ļ�");// ���G�������е��ļ�
			} else if (folder.isDirectory()) {// �ж��Ƿ�Ϊ�ļ���
				System.out.println(folder.getName() + "�ļ���");// ���G�������е��ļ���
			}

		}

	}
}
