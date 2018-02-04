package test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileOutputStream��FileInputStream,�ֽ���
 * 
 * @author Administrator
 *
 */
public class FileStreamTest {
	public static void main(String[] args) {
		// ����һ���ļ�����
		File file = new File("G:/datas.txt");
		if (!file.exists()) {
			try {
				System.out.println("�ļ������ڣ����ڴ���...");
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("�ļ��Ѿ����ڣ��������ļ�д����Ϣ...");
		try {
			// ����FileOutputStream�����������ļ���д������
			FileOutputStream fos = new FileOutputStream(file);
			// ����һ���ַ���������Ҫд�뵽ָ���ļ��е�����
			String content = "�������ɼ��賿�ĵ��������";
			byte[] bytes = content.getBytes();// ���ַ���ת��λ�ֽ�����
			fos.write(bytes);// ���ֽ�����д�뵽ָ���ļ���
			fos.close();// �ر���������ͷ���Դ
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			// ����һ��FileInputStream���󣬶�ȡָ���ļ�������
			FileInputStream fis = new FileInputStream(file);
			// ����һ���ֽ����飬���ڴ洢��ȡ��������
			byte byt[] = new byte[1024];
			int len = fis.read(byt);// ���ļ��ж�ȡ��Ϣ�������뵽�ֽ�������ȥ
			// ���ļ��е���Ϣ�ڿ���̨���
			System.out.println("�ļ��е���Ϣ�ǣ�" + new String(byt, 0, len));
			// �ر�������
			fis.close();// �ͷ���Դ
			file.delete();// ���ļ�ʹ���Ѿ����,ɾ���ļ�
			System.out.println("���ļ�ʹ���Ѿ����,�ļ���ɾ��!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
