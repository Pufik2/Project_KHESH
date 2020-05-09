import javax.swing.*;

public class Info extends JFrame {
	public Info() {
		setTitle("Информация");
		setBounds(100, 100, 800, 800);
		setResizable(false);
		JPanel pane = new JPanel(null);
		JLabel label1 = new JLabel("Курсовая работа");
		label1.setBounds(20, 30, 200, 30);

		JLabel label2 = new JLabel("Вариант 10");
		label2.setBounds(20, 50, 200, 30);

		JLabel label3 = new JLabel("Расчет количества символов в тексте");
		label3.setBounds(20, 70, 300, 30);

		JLabel label4 = new JLabel("Выполнили:");
		label4.setBounds(20, 100, 200, 30);

		JLabel label5 = new JLabel("Егорова");
		label5.setBounds(20, 120, 200, 30);

		JLabel label6 = new JLabel("Крымгужин");
		label6.setBounds(20, 140, 200, 30);

		JLabel label7 = new JLabel("Халиуллин");
		label7.setBounds(20, 160, 200, 30);

		JLabel label8 = new JLabel("Шарафиева");
		label8.setBounds(20, 180, 200, 30);

		JLabel label9 = new JLabel("Проверил:");
		label9.setBounds(20, 200, 200, 30);

		JLabel label10 = new JLabel("Казанцев А.В.");
		label10.setBounds(20, 220, 200, 30);
		JLabel label11 = new JLabel("GitHub — крупнейший веб-сервис для хостинга IT-проектов и их совместной разработки.");
		label11.setBounds(100, 240, 800, 100);
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
		pane.add(label11);
		setContentPane(pane);
		setVisible(true);
	}

}
