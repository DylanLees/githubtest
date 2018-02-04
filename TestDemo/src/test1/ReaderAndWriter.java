package test1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * FileReader��FileWriter��ʹ��
 * 
 * @author Administrator
 *
 */
public class ReaderAndWriter {
	private static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {// ��������ѭ����ʵ�ֿ���̨�Ķ������
			try {
				// ��ָ���Ĵ����д���һ���ı��ļ�
				File file = new File("G:/word.txt");
				if (!file.exists()) {// �ļ��������򴴽����ļ�
					System.out.println("�ļ������ڣ����ڴ�����...");
					file.createNewFile();
				} else {
					System.out.println("�ļ��Ѿ��ҵ�����������Ĳ���ѡ�1��д���ļ��� 2����ȡ�ļ�");
					// ��ȡ����Ĳ���ѡ��
					int option = SC.nextInt();
					switch (option) {
					case 1:// �ڿ���̨����1
							// ����һ���ַ��������������ָ�����ļ���д������
						FileWriter fw = null;
						System.out.println("��������Ҫд�뵽�ļ��е�����");
						String wri = SC.next();
						try {
							fw = new FileWriter(file, true);
							fw.write(wri);// ��ָ������д�뵽�ı���
							System.out.println("���������Ѿ�д���ļ���");
						} catch (Exception e) {
							e.printStackTrace();
						} finally {
							fw.close();// �ر���������ͷ���Դ
						}
						break;
					case 2:// �ڿ���̨����2
						FileReader fr = null;// ����һ�������ַ�����FileReader���ڶ�ȡ�ļ�����
						if (file.length() == 0) {
							System.out.println("�ļ����ַ�Ϊ0���ļ���û������");
						} else {
							try {
								fr = new FileReader(file);// ����������ȡָ���ļ����ݵ��ַ�������
								// ����һ����������1024���ַ����ַ�����
								char[] cbuf = new char[1024];
								int hasread = -1;// ��ʼ���Ѿ���ȡ�����ַ�����-1��ʾ�ļ���û������
								while ((hasread = fr.read(cbuf)) != -1) {
									// ��word.txt��ŵ��ַ������е�����ת��λ�ַ�����ȡ����
									System.out.println("�ļ�word.txt������Ϊ��" + new String(cbuf, 0, hasread));
								}
							} catch (Exception e) {
								e.printStackTrace();
							} finally {
								fr.close();// �ر��ַ����������ͷ���Դ
							}

						}
						break;

					default:
						System.out.println("��ʽ����������������֣�");
						break;
					}
				}

			} catch (Exception e) {
				System.out.println("�ļ���ʽ���벻�ԣ�����������");
			}

		}
	}

}
