import javax.swing.*;

public class Info extends JFrame {
	public Info() {
		setTitle("����������");
		setBounds(100, 100, 400, 400);
		setResizable(false);
		JPanel pane = new JPanel(null);
		JLabel label1 = new JLabel("�������� ������");
		label1.setBounds(20, 30, 200, 30);

		JLabel label2 = new JLabel("������� 10");
		label2.setBounds(20, 50, 200, 30);

		JLabel label3 = new JLabel("������ ���������� �������� � ������");
		label3.setBounds(20, 70, 300, 30);

		JLabel label4 = new JLabel("���������:");
		label4.setBounds(20, 100, 200, 30);

		JLabel label5 = new JLabel("�������");
		label5.setBounds(20, 120, 200, 30);

		JLabel label6 = new JLabel("���������");
		label6.setBounds(20, 140, 200, 30);

		JLabel label7 = new JLabel("���������");
		label7.setBounds(20, 160, 200, 30);

		JLabel label8 = new JLabel("���������");
		label8.setBounds(20, 180, 200, 30);

		JLabel label9 = new JLabel("��������:");
		label9.setBounds(20, 200, 200, 30);

		JLabel label10 = new JLabel("�������� �.�.");
		label10.setBounds(20, 220, 200, 30);

		pane.add(label1);
		pane.add(label2);
		pane.add(label3);
		pane.add(label4);
		pane.add(label5);
		pane.add(label6);
		pane.add(label7);
		pane.add(label8);
		pane.add(label9);
		pane.add(label10);
		setContentPane(pane);
		setVisible(true);
	}

}
