package test2;

/**
 * ʵ���ַ����ķ�ת
 * 
 * @author Administrator
 *
 */
public class Test1 {
	public static void main(String[] args) {
		String reverse = reverse("123bad");
		System.out.println(reverse);
	}

	/**
	 * ����һ����̬��ת�ַ����ķ���
	 * 
	 * @param originStr
	 * @return
	 */
	public static String reverse(String originStr) {
		if (originStr == null || originStr.length() <= 1) {// �ַ���Ϊ�գ�����С�ڵ���1��ֱ�ӷ��ظ��ַ���
			return originStr;
		}
		System.out.println(originStr.substring(1));
		System.out.println(originStr.charAt(0));
		return reverse(originStr.substring(1)) + originStr.charAt(0);
		
	}
}
