package test2;

import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FormateDate {
	public static void main(String[] args) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");// ָ��Ҫ��ʽ���ĸ�ʽ
		Date date = new Date();// ��ȡ��ǰ����
		String format = simpleDateFormat.format(date);// ����simpleDateFormat����ĸ�ʽ������formate()��ʽ������
		System.out.println(format);
		// java 8�ṩ�ķ�ʽ,ָ����ʽ�������ڸ�ʽ
		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		// ��ȡ��ǰʱ��
		LocalDate now = LocalDate.now();
		String format2 = ofPattern.format(now);
		System.out.println(format2);

		System.out.println(LocalDateTime.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDate.now());
		System.out.println(Clock.systemDefaultZone());//��ӡ��ǰϵͳʱ��
	}
}
