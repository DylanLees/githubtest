package test2;

import java.io.UnsupportedEncodingException;
/**
 * �����ʽת��
 * @author Administrator
 *
 */
public class Test2 {
	public static void main(String[] args) {
		String s1 = "���";
		// s1.getBytes��ʾ���ַ���s1ת��Ϊ�ֽ���
		try {
			String s2 = new String(s1.getBytes("GB2312"), "ISO-8859-1");// ��GB2312������ַ���ת��Ϊ8859
			System.out.println(s2);
			String s3 = new String(s2.getBytes("ISO-8859-1"), "GB2312");
			System.out.println(s3);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
