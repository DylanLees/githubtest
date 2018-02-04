package test2;

import java.time.Clock;
import java.time.LocalDateTime;
import java.util.Calendar;

public class DateTimeTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();// ��ȡ��ǰʱ���һ��ʵ������
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)); // 0 - 11
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		System.out.println("************�ָ���*************");
		// Java 8
		LocalDateTime dt = LocalDateTime.now();// ��ȡ��ǰʱ���һ��ʵ������
		System.out.println(dt.getYear());
		System.out.println(dt.getMonthValue()); // 1 - 12
		System.out.println(dt.getDayOfMonth());
		System.out.println(dt.getHour());
		System.out.println(dt.getMinute());
		System.out.println(dt.getSecond());
		System.out.println("*************�ָ���1**********");
		long millis = cal.getTimeInMillis();// ��ȡ������
		System.out.println(millis);
		long millis2 = Clock.systemDefaultZone().millis();// ��ȡ������
		System.out.println(millis2);
		// ��ȡĳ�µ����һ��
		int actualMaximum = cal.getActualMaximum(Calendar.DAY_OF_MONTH);// ��ȡ��ǰ�µ����һ��
		System.out.println(actualMaximum);
	}

}
