import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.imageio.ImageIO;

public class RaschetObjema {
	public static void main(String[] args) {
		Graf f = new Graf();
		new BgPanel();
		f.setVisible(true);
	}
}

class Graf extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel lbl;
	JLabel lb2;
	JLabel lb3;
	JLabel lb4;
	JLabel lb5;
	JLabel lb6;
	JLabel lb7;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> VetkaHaliullin
	JLabel lb14;
=======
	JLabel lb13;
>>>>>>> 5ea5129c28b3b2c8d17a8eccf33a669bd6387db6
<<<<<<< HEAD
=======
	JLabel lb8;
	JLabel lb9;
	JLabel lb10;
	JLabel lb11;
	JLabel lb12;
>>>>>>> Vetka_egorova
=======
	JLabel lb15;
>>>>>>> SharafievaBranch
=======
>>>>>>> VetkaHaliullin
	JTextArea ta;

	public Graf() {
		setTitle("������������ ������ �5");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(200, 100, 790, 430);
		setResizable(false);
		setContentPane(new BgPanel());
		Container cont = getContentPane();
		cont.setLayout(null);
		lb2 = new JLabel("����� ������: ��-220");
		lb2.setBounds(30, 40, 300, 50);
		lb3 = new JLabel("�������: ");
		lb3.setBounds(30, 60, 700, 50);
		lb4 = new JLabel("����� �� ");
		lb4.setBounds(330, 10, 200, 20);
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> VetkaHaliullin
		lb14 = new JLabel("bahamen_1@mail.ru");
		lb14.setBounds(200, 105, 700, 50);
=======
		lb13 = new JLabel("timur_krymguzhin@mail.ru");
		lb13.setBounds(200, 75, 700, 50);
>>>>>>> 5ea5129c28b3b2c8d17a8eccf33a669bd6387db6
<<<<<<< HEAD
=======
		lb8 = new JLabel("��������� ");
		lb8.setBounds(30, 75, 700, 50);
		lb9 = new JLabel("������� ");
		lb9.setBounds(30, 90, 700, 50);
		lb10 = new JLabel("��������� ");
		lb10.setBounds(30, 105, 700, 50);
		lb11 = new JLabel("��������� ");
		lb11.setBounds(30, 120, 700, 50);
		lb12 = new JLabel("egorva.lina@mail.ru ");
		lb12.setBounds(200, 90, 700, 50);
>>>>>>> Vetka_egorova
=======
		lb15 = new JLabel("kseniyasharafieva@yandex.ru");
		lb15.setBounds(200,120,700,50);
>>>>>>> SharafievaBranch
=======
>>>>>>> VetkaHaliullin
		lb7 = new JLabel("������ ���������� ���������");
		lb7.setBounds(200, 190, 200, 50);
		lb5 = new JLabel("�������� ��������������� ����������� ����������� �����������");
		lb5.setBounds(140, 20, 700, 50);
		lb6 = new JLabel("������ �� ������ ������� ���:");
		lb6.setBounds(30, 170, 250, 30);
		JTextArea area2 = new JTextArea(
				"���������� �� �������� ������: 10 ������� (������ ���������� �������� � ������)");

		area2.setBounds(30, 160, 700, 20);
		area2.setEditable(false);
		area2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		area2.setLineWrap(true);
		area2.setWrapStyleWord(true);

		lb2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lb3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lb6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lb4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lb5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		ta = new JTextArea(2, 10);
		ta.setBounds(50, 200, 50, 30);
		
		JButton button = new JButton("����������");
		button.setBounds(200, 240, 120, 50);
			
		button.setBounds(200, 240, 120, 50);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Info();
			}
		});
		cont.add(button);
		
		JButton rach = new JButton("������");
		rach.setBounds(50, 240, 120, 50);
		rach.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dlin = ta.getText();
				if (dlin.isEmpty()) {
					JOptionPane.showMessageDialog(Graf.this, "������� �����!");
				} else {
					int a = 75;
					double b = 0.5;
					a = Integer.parseInt(dlin);
					int c = 5;
					double d = 0.01;
					double V = (a * b * c) * d;
					String VO = "V = a*b*c = " + a + "*0.5*5*0.01 = " + V + "�^3";
//������� � ����������
					String VOSm = "=" + V * 10000 + "��^3";
					JOptionPane.showMessageDialog(Graf.this, "��������� �������:" + VO + "\n" + VOSm);

				}
			}
		});

		JButton mnemo = new JButton("����������");
		mnemo.setBounds(50, 310, 120, 50);
		mnemo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Schema m = new Schema();
				new Mnem();
				m.setVisible(true);
			}
		});

		cont.add(mnemo);
		cont.add(ta);
		cont.add(rach);
		cont.add(lb2);
		cont.add(lb3);
		cont.add(lb4);
		cont.add(lb5);
		cont.add(lb6);
		cont.add(lb7);
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> VetkaHaliullin
		cont.add(lb14);
=======
		cont.add(lb13);
>>>>>>> 5ea5129c28b3b2c8d17a8eccf33a669bd6387db6
<<<<<<< HEAD
=======
		cont.add(lb8);
		cont.add(lb9);
		cont.add(lb10);
		cont.add(lb11);
		cont.add(lb12);
>>>>>>> Vetka_egorova
=======
		cont.add(lb15);
>>>>>>> SharafievaBranch
=======
>>>>>>> VetkaHaliullin
		cont.add(area2);
		setContentPane(cont);
//��� ��� ���������� ������

		JLabel txtBrowserURILabel;
		txtBrowserURILabel = new JLabel("asu.ugatu.ac.ru/index.php");
		txtBrowserURILabel.setBounds(260, 170, 150, 30);
		txtBrowserURILabel.setForeground(Color.blue);
		txtBrowserURILabel.setFont(new Font("Arial", Font.BOLD, 12));

		MouseListener listener = new LinkMouseListener();
		txtBrowserURILabel.addMouseListener(listener);

		txtBrowserURILabel.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (e.getButton() == MouseEvent.BUTTON1) {
					launchBrowser(txtBrowserURILabel.getText());
				}
			}
		});

		add(txtBrowserURILabel);
	}

	class LinkMouseListener extends MouseAdapter {
		public void mouseEntered(MouseEvent e) {
			if (!(e.getSource() instanceof JLabel)) {
				return;
			}
			JLabel label = (JLabel) e.getSource();
			label.setForeground(Color.RED);
			Cursor cursor = Cursor.getPredefinedCursor(Cursor.HAND_CURSOR);
			label.setCursor(cursor);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			if (!(e.getSource() instanceof JLabel)) {
				return;
			}
			JLabel label = (JLabel) e.getSource();
			label.setForeground(Color.BLUE);
		}
	}

// launch browser
	private void launchBrowser(String uriStr) {
		Desktop desktop;
		if (Desktop.isDesktopSupported()) {
			desktop = Desktop.getDesktop();
			if (desktop.isSupported(Desktop.Action.BROWSE)) {
// launch browser
				URI uri;
				try {
					uri = new URI("http://" + uriStr);
					desktop.browse(uri);
				} catch (IOException ioe) {
					ioe.printStackTrace();
				} catch (URISyntaxException use) {
					use.printStackTrace();
				}
			}
		}
	}

//�� ����
	public static void main(String[] args) {
		Graf frame = new Graf();
		frame.setVisible(true);
	}

}

class BgPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics g) {
		Image image = null;
		try {
			image = ImageIO.read(new File("img.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		super.paintComponent(g);
		g.drawImage(image, 0, 0, null);
	}
}

class Schema extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Schema() {
		setBounds(100, 100, 780, 500);
		setResizable(false);
		setContentPane(new Mnem());
		getContentPane();
		setVisible(true);

	}
}

class Mnem extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics g) {
		Image image = null;
		try {
			image = ImageIO.read(new File("mnem.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		super.paintComponent(g);
		g.drawImage(image, 0, 0, null);
	}
}