package test;

public class PokerTest {
	public static void main(String[] args) {
		Poker poker = new Poker();
		poker.shuffle(); // ϴ��
		for(int i=0;i<3;i++){
			Poker.Card c3 = poker.deal(i);
			System.out.println("c3:"+c3);
		}
		// ���ڷǾ�̬�ڲ���Card
		// ֻ��ͨ�����ⲿ��Poker������ܴ���Card����
		Poker.Card c2 = poker.new Card("����", 1); // �Լ�����һ����
		Poker.Card c1 = poker.deal(0); // ����һ����
		System.out.println(c1); // ϴ�ƺ�ĵ�һ��
		System.out.println(c2); // ��ӡ: ����A
	}
}
