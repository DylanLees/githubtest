package test;

public class ProgramSeven {

	/**
	 * ��Ŀ������2n��������������ѡ��n��������ʹ��ѡ����n��������ͬʣ�µ�n������֮�͵Ĳ���С��
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int A[] = { 1, 2, 3, 5, 7, 8, 9 };
		// int A[] = { 1, 5, 7, 8, 9, 6, 3, 11, 20, 17 };
		func(A);
	}

	public static void func(int A[]) {
		int i;
		int j;
		// ����ı��������غ�ֱ�ף�������
		int n2 = A.length;
		int n = n2 / 2;
		int sum = 0;
		// ���������ܺ�
		for (i = 0; i < A.length; i++) {
			sum += A[i];
		}

		/*
		 * ���ǵñ��֮���еĻ���
		 * ���ǵĳ�����Ҫ�����������ƹ�ʽ����ÿ�����ϣ�ֻ��ҪΪÿ��������һ����־���飬���SUM/2��1��������е���Щֵ���Ա����������
		 * flag[i][j]:����i������֮����j,��flag[i][j]Ϊtrue������֮��flag[i][j]Ϊtrue��
		 * ��ôһ�����ҵ�һ��������ʹ���ǵĺ���j�� ����Ĵ��뽫��flag������г�ʼ��
		 */
		boolean flag[][] = new boolean[A.length + 1][sum / 2 + 1];
		for (i = 0; i < A.length; i++) {
			for (j = 0; j < sum / 2 + 1; j++) {
				flag[i][j] = false;
				flag[0][0] = true;
			}
		}

		// �ص�����
		for (int k = 0; k < n2; k++) {
			// iȡk��n�еĽ�Сֵ�����ǵ�Ŀ�����ҳ�����S(2N,
			// N)����SUM��ӽ����Ǹ��ͣ�����k>nʱ��ȡ��n���㹻�ˡ�k<nʱ��������Ȼ�޷���3����������ѡ��4����������ȡkֵ
			for (i = k > n ? n : k; i >= 1; i--) {
				// ������ѭ���Ǳ�������S(k,i)������˳��S[1][1],S[2][2],S[2][1],S[3][3]���������������ϵ���±�����������㷨
				// �ڲ�ѭ�����㽫A[k]���뵽��������ȡ���Ŀ��ܵ�jֵ
				for (j = 0; j <= sum / 2; j++) {
					// j��i�������������ܵĺͣ���0������sum /2���ж��ܷ�õ�
					// �õ�jֵ��������j�Ǻͣ�A[k]ֻ������һ�����϶���Ҫj >= A[k]������ȡflag[i - 1][j -
					// A[k]]��ֵ��ʱ��ᷢ��Խ�������flag[i - 1][j - A[k]] = true��������ҵ�i -
					// 1������ʹ���ǵĺ�Ϊj - A[k]�����Դ���������ʱ��ζ��flag[i][j] = true
					if (j >= A[k] && flag[i - 1][j - A[k]])
						flag[i][j] = true;
				}
			}
		}
		// ���ڼ������ˣ������ҵ�����ʵĽ���ͺ��ˣ�Ҫ�ҵ���ӽ�SUM / 2�ĺͣ������������
		for (j = sum / 2; j >= 0; j--) {
			if (flag[n][j]) {
				System.out.println("sum is " + sum);
				System.out.println("sum/2 is " + sum / 2);
				System.out.println("j is " + j);
				System.out.println("minimum delta is " + Math.abs(2 * j - sum));
				break;
			}
		}
	}
}
