package Project02;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class AirplaneForm extends JFrame implements ActionListener {

	public DatabaseClass db;

	private JTable table;

	private JTextField timeField;
	private JTextField countryField;
	private JTextField priceField;

	public AirplaneForm() {

	}

	public AirplaneForm(DatabaseClass db) {
		this.db = db;

		timeField = new JTextField(10);
		countryField = new JTextField(10);
		priceField = new JTextField(10);

		JLabel timeLabel = new JLabel("출발시간 : ");
		JLabel countryLabel = new JLabel("나라 : ");
		JLabel priceLabel = new JLabel("가격 : ");

		JButton addButton = new JButton("예매하기");
		addButton.setBackground(new Color(0, 255, 170));

		addButton.addActionListener(this);

		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(new JScrollPane(table), BorderLayout.CENTER);

		JPanel inputPanel = new JPanel();
		inputPanel.setLayout(new GridLayout(3, 10));

		inputPanel.add(timeLabel);
		inputPanel.add(timeField);

		inputPanel.add(countryLabel);
		inputPanel.add(countryField);

		inputPanel.add(priceLabel);
		inputPanel.add(priceField);

		mainPanel.add(inputPanel, BorderLayout.NORTH);
		mainPanel.add(addButton, BorderLayout.SOUTH);

		setTitle("비행기 예매");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(mainPanel);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new AirplaneForm();
	}

	public void actionPerformed(ActionEvent e) {
		String time = timeField.getText();
		String country = countryField.getText();
		int price = Integer.parseInt(priceField.getText());

		Airplane airplane = new Airplane(time, country, price);
		this.db.addAirplane(airplane);

		JOptionPane.showMessageDialog(this, "예매했습니다..");

		System.out.println("예매 목록 : " + db.getAirplaneCount());

		this.dispose();

		Mainmenu mainmenu = new Mainmenu(db);

		mainmenu.setVisible(true);
	}

}
