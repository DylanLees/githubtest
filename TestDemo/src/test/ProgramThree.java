package test;

public class ProgramThree {
	public static void main(String[] args) {

		// String str = getStrAsBytes("��ABC", 3);
		String str = getStrAsBytes("��ABC��DE", 6);
		System.out.println(str);
	}

	private static String getStrAsBytes(String src, int Cutlen) {
		// ��������ַ���ת��Ϊ�ֽ�����
		byte[] strBytes = src.getBytes();
		// ����ȡ���ֽڳ���
		int rlen = 0;
		// ���ڱ�ʶ����Ĭ��δfalse
		boolean chineseFlag = false;
		// ��ȡ�ֽ�����ĳ���
		int srcLen = strBytes.length;
		// �ж���Ҫ��ȡ���ֽڳ����Ƿ񳬳������ַ����ĳ���
		if (Cutlen > srcLen) {
			// �������ȡ���ֽڳ��ȴ��������ַ����ĳ�������������
			System.out.println("you want more than the source");
		} else {
			for (int i = 0; i < Cutlen; i++) {

				if (strBytes[i] > 0 && strBytes[i] < 256) {
					rlen++;
				} else {
					if (chineseFlag) {
						rlen++;// ���Ǻ��֣�����ȡ���ֽڳ���+1
						chineseFlag = false;// Ȼ�󽫺��ֱ�־ChineseFlag����Ϊfalse
					} else {
						chineseFlag = true;// �Ǻ�����ֱ�ӷ���true������ȡ���ֽڳ��Ȳ���Ҫ��1
					}
				}
			}
		}
		return src.substring(0, rlen);// ͨ���ַ����Դ���substring������ȡ�ַ����������ء�
	}
}
