package test1;

/**
 * �ݹ����
 * 
 * @author Administrator
 *
 */
public class Recursion {
	/**
	 * ����һ���ݹ���׳˵ķ���
	 */
	public static int getProduct(int src) {
		if (src <= 1) {
			return 1;
		} else {
			return src * getProduct(src - 1);// �ݹ鼴�Լ������Լ�
		}
	}

	public static void main(String[] args) {
		int product = getProduct(6);
		System.out.println(product);
	}
}
