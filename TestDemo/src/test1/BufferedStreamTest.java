package test1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ���������� 1��BufferedInputStream(����������) 2��BufferedOutputstream�������������
 * 
 * @author Administrator
 *
 */
public class BufferedStreamTest {
	public static void main(String[] args) {
		// ����һ���ַ�������
		String content[] = { "�㲻ϲ���ң�", "��һ�㶼�����⡣", "��Ϊ�һ�������", "����Ϊ��ȡ���㣡" };
		File file = new File("G:/word.txt");
		if (!file.exists()) {// �ļ��������򴴽��ļ�
			try {
				System.out.println("�ļ����������ڴ���...");
				file.createNewFile();
				System.out.println("�ļ�������ɣ�����д��...");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("�ļ��Ѿ�����");
			FileOutputStream fos = null;// ����FileOutputStream����
			BufferedOutputStream bos = null;// ����BufferedOutputStream����
			FileInputStream fis = null;// ����FileInputStream����
			BufferedInputStream bis = null;// ����BufferedInputStream����
			try {
				// ʵ����FileOutPutstream����
				fos = new FileOutputStream(file);
				// ʵ����BufferedOutputStream����
				bos = new BufferedOutputStream(fos);
				// ����һ���ֽ��������ڴ����Ҫд���ļ�������
				byte[] bcontent = new byte[1024];
				for (int i = 0; i < content.length; i++) {// ѭ�������ַ�������
					bcontent = content[i].getBytes();// ������������������ת��Ϊ�ֽ�����
					bos.write(bcontent);// ���ֽ�����д���ļ�
				}
				System.out.println("д��ɹ���");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					// �ر������ͷ���Դ
					bos.close();
					fos.close();

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			try {
				fis = new FileInputStream(file);// ʵ����FileInputStream����
				bis = new BufferedInputStream(fis);// ʵ����BufferedInputStream����
				// ����һ���ֽ��������ڴ�Ŷ�ȡ����Ϣ
				byte[] bcontent = new byte[1024];
				// �����ļ��ж�ȡ����Ϣ��ŵ��ֽ�������
				int len = bis.read(bcontent);
				System.out.println("��word.txt�ж�ȡ�������ǣ�" + new String(bcontent, 0, len));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					// �ر���(�ȹرջ��������ڹر��ļ���)���ͷ���Դ
					bis.close();
					fis.close();
					file.delete();

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}
}
