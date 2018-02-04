package test1;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;

/**
 * �߳�����
 * 
 * @author Administrator
 *
 */
public class ThreadSleep extends JFrame {

	private static final long serialVersionUID = 1L;
	private Thread t;// ����һ���̱߳���
	// ������ɫ����
	private static Color[] color = { Color.BLACK, Color.BLUE, Color.CYAN, Color.GREEN, Color.ORANGE, Color.YELLOW,
			Color.PINK, Color.LIGHT_GRAY };
	// �����������
	private static final Random RANDOM = new Random();

	/**
	 * �����ȡ��ɫ�ķ���
	 * 
	 * @return
	 */
	public static Color getColor() {
		// �������һ��color���鳤�ȷ�Χ�ڵ����֣��Դ�Ϊ������ȡ��ɫ
		return color[RANDOM.nextInt(color.length)];
	}

	public ThreadSleep() {
		t = new Thread(new Draw());// ��ȡ�̶߳���
		t.start();// �����߳�
	}

	// ����һ���ڲ��࣬ʵ��Runnable�ӿڣ������ڴ����л�������
	class Draw implements Runnable {
		int x = 200;// �����ʼ����
		int y = 50;

		@Override
		public void run() {// ��дrun����
			while (true) {// ����ѭ��
				try {
					// �����߳�����ʱ��Ϊ100����
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				// ��ȡ�����ͼ�����Ķ���
				Graphics graphics = getGraphics();
				// ���û�ͼ��ɫ
				graphics.setColor(getColor());
				// ����ֱ�߲��ȴ�ֱ����
				graphics.drawLine(x, y, 500, y += 4);
				if (y >= 500) {
					y = 50;// �����򷵻�����ʼλ��
				}
			}

		}
	}

	/**
	 * �����ʼ���������ķ���
	 */
	public static void init(JFrame frame, int width, int height) {
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);// �رմ��ڣ��˳�����
		frame.setSize(width, height);// ���ô���Ŀ�͸�
		frame.setVisible(true);// ʹ���ڿɼ�
		frame.setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		init(new ThreadSleep(), 400, 500);
	}

}
