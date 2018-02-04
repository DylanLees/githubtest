package test1;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest1 {
	/*
	 * �����ļ������ַ�ʽ 1��File(String pathname) 2��File(String parent,String child)
	 * 3��File(File f,String child)
	 */
	public static void main(String[] args) {
//		File file = new File("G:/test.txt");// ��ʽһ
//		File file = new File("G:/", "letter.txt");// ��ʽ��,��һ���ַ��������ļ�·�����ڶ����ַ��������ļ���
		File file = new File("G:/", "digit");// ��ʽ��
		if (!file.exists()) {// �ļ������ڣ�ִ�е�����
			System.out.println("�ļ������ڣ����ڴ���...");
			try {
				file.createNewFile();// �ļ������ڣ������µ��ļ�
				System.out.println("�ļ������ɹ�");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("�ļ��Ѿ�����");
			if (file.isFile() && file.canRead()) {// ���ļ���һ����׼�ļ����ҿɶ�
				System.out.println("�ļ��ɶ������ڶ�ȡ�ļ���Ϣ...");
				String fileName = file.getName();// ��ȡ�ļ���
				String filePath = file.getAbsolutePath();// ��ȡ�ļ�����·��
				long lastModifiedTime = file.lastModified();// ��ȡ�ļ�����޸�ʱ��,���ص�ʱ���Ǻ���
				boolean hidden = file.isHidden();// ��ȡ���ļ��Ƿ�ɶ�
				long len = file.length();// ��ȡ���ļ��е��ֽ���
				// ����simpleDateFormate��������ָ��ʱ���ʽ
				SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/DD HH:mm:ss");
				// ʹ���ļ�����޸�ʱ�䴴��һ��Date����
				Date date = new Date(lastModifiedTime);
				// ��ʽ���޸ĺ��ʱ��
				String time = sdf.format(date);
				System.out.println("fileName\t" + fileName);
				System.out.println("filePath\t" + filePath);
				System.out.println("lastModifiedTime\t" + lastModifiedTime+"ms");
				System.out.println("hidden\t" + hidden);
				System.out.println("len\t" + len);
				System.out.println("time\t" + time);
				// ɾ���ļ�
				file.delete();
				System.out.println("���ļ���ʹ���Ѿ���ɣ��Ѿ���ɾ��");

			} else {
				System.out.println("�ļ����ɶ�");
			}
		}

	}
}
