package test2;

import java.time.LocalDateTime;
import java.util.Calendar;

public class YesterdayDateTime {
	public static void main(String[] args) {
		// ��ӡ����ĵ�ǰʱ��
		Calendar cal = Calendar.getInstance();// ��ȡһ��������ʵ������
		cal.add(Calendar.DATE, -1);// ��ȡ�����ʱ��
		System.out.println(cal.getTime());//��ȡʱ���
		
		//java 8��ȡ����ķ���
		LocalDateTime today = LocalDateTime.now();//��ȡ����ʱ��
		LocalDateTime yesterday=today.minusDays(1);
		System.out.println("����ĵ�ǰʱ�̣�"+yesterday);
	}
}
