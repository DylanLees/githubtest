package test1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * DataInputStream��DataOutputStream
 * 
 * @author Administrator
 *
 */
public class DataStreamTest {
	public static void main(String[] args) {
		// ����һ���ļ�
		File file = new File("G:data.txt");
		if (!file.exists()) {// �ļ��������򴴽�һ���ļ�
			try {
				System.out.println("�ļ������ڣ����ڴ���...");
				file.createNewFile();
				System.out.println("�ļ��������");
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		try {
			// ����һ��FileOutputStream����
			FileOutputStream fos = new FileOutputStream(file);
			// ����һ��DataOutputStream����
			DataOutputStream dos = new DataOutputStream(fos);
			try {
				dos.writeUTF("д���ַ���");// д��String������
				dos.writeInt(12);// д��int������
				dos.writeLong(2689L);// д�볤��������
				dos.writeDouble(198.5);// д��double������
				dos.writeFloat(125.1f);// д��float������
				dos.writeBoolean(true);// д�벼��������
				dos.close();// �ر����������DataOutputStream

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�ļ��Ѿ����ڣ����ڶ�ȡ��Ϣ...");
		try {
			// ����һ��FileInputStream����
			FileInputStream fis = new FileInputStream(file);
			// ����һ��DataInputStream����
			DataInputStream dis = new DataInputStream(fis);
			System.out.println("��ȡUTF�����ݣ�\t" + dis.readUTF());
			System.out.println("��ȡdouble�����ݣ�\t" + dis.readDouble());
			System.out.println("��ȡfloat�����ݣ�\t" + dis.readFloat());
			System.out.println("��ȡLong�����ݣ�\t" + dis.readLong());
			System.out.println("��ȡint�����ݣ�\t" + dis.readInt());
			System.out.println("��ȡboolean�����ݣ�\t" + dis.readBoolean());
			dis.close();// �ر����ݶ�ȡ��DataInputStream

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
