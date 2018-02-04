package test1;

import java.awt.Container;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class SwingAndThread extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel jl = new JLabel();// ����JLabel����
	private static Thread t;// ����һ���̶߳���
	private int count = 0;// ������������
	private Container container = getContentPane();// ��������
	// ����һ�����췽��

	public SwingAndThread() {
		// ���Զ�λ�����С��λ��
		setBounds(300, 200, 250, 100);
		// ʹ���岻ʹ���κβ��ֹ�����
		container.setLayout(null);
		try {
			// ��ȡͼƬ��url����ͼƬ�뱾����ͬһ������
			URL url = SwingAndThread.class.getResource("1.png");
			// ʵ����һ��Icon
			ImageIcon icon = new ImageIcon(url);
			// ��ͼƬ��ֹ�ڱ�ǩ��
			jl.setIcon(icon);
		} catch (Exception e) {
			System.out.println("ͼƬ�����ڣ��뽫1.png��ͼƬ���Ƶ���ǰĿ¼�£�");
			return;
		}
		// ��ͼƬ�����ڱ�ǩ�������
		jl.setHorizontalAlignment(SwingConstants.LEFT);
		// ���ñ�ǩ��λ�����С
		jl.setBounds(10, 10, 200, 50);
		jl.setOpaque(true);// ����͸����Ϊ��͸��
		Thread t = new Thread(new Roll());// ��ȡһ���߳�
		t.start();// �����߳�
		container.add(jl);// ����ǩ��ӵ�������
		setVisible(true);// ���ô���ɼ�
		setDefaultCloseOperation(EXIT_ON_CLOSE);// �رմ������˳�����

	}

	// ����һ���ڲ��࣬ʵ��Runnable�ӿ�
	class Roll implements Runnable {

		@Override
		public void run() {
			while (count <= 200) {// ����ѭ������
				// ����ǩ�������ñ�����ʾ
				jl.setBounds(count, 10, 200, 50);
				try {
					// Ϊ�����ֽ��������ƶ�Ч������������ʱ��Ϊ1000����
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				count += 4;// ʹ������ÿ������4
				// ��ͼ��ﵽ���ұ�ʱʹ��ص���ǩ�������
				if (count == 200) {
					count = 10;// ��ǩ����ߵĳ�ʼ����ֵΪ10
				}
			}

		}
	}

	public static void main(String[] args) {
		new SwingAndThread();
	}

}
