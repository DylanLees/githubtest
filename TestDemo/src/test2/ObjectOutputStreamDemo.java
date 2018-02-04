package test2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {
	public static void main(String[] args) {
		// ���л�������ָ���ļ�·��
		File file = new File("G:" + File.separator + "person.ser");
		ObjectOutputStream oos = null;
		try {
			// ����һ�����������
			oos = new ObjectOutputStream(new FileOutputStream(file));
			// ʵ����Person��
			Person per = new Person("����", 25);
			oos.writeObject(per);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
