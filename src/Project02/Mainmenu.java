package Project02;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Mainmenu extends JFrame implements ActionListener {

	public DatabaseClass db;

	private JLabel titleJLabel;
	private JButton TrainButton;
	private JButton BusButton;
	private JButton AirplaneButton;
	private JButton TrainListButton;
	private JButton BusListButton;
	private JButton AirplaneListButton;
	private JButton exitButton;

	public Mainmenu(DatabaseClass db) {
		this.db = db;

		setTitle("예약시스템");
		setLayout(null);
		setSize(600, 500);

		titleJLabel = new JLabel("무엇을 도와드릴까요?");
		titleJLabel.setBounds(0, 0, 550, 55);
		titleJLabel.setHorizontalAlignment(JLabel.CENTER);
		add(titleJLabel);

		TrainButton = new JButton("기차 예매");
		TrainButton.setBounds(10, 70, 190, 150);
		TrainButton.setBackground(new Color(139, 137, 137));
		TrainButton.addActionListener(this);
		add(TrainButton);

		BusButton = new JButton("버스 예매");
		BusButton.setBounds(200, 70, 190, 150);
		BusButton.setBackground(new Color(106, 90, 139));
		BusButton.addActionListener(this);
		add(BusButton);

		AirplaneButton = new JButton("비행기 예매");
		AirplaneButton.setBounds(390, 70, 190, 150);
		AirplaneButton.setBackground(new Color(0, 255, 255));
		AirplaneButton.addActionListener(this);
		add(AirplaneButton);

		TrainListButton = new JButton("기차 예매 현황");
		TrainListButton.setBounds(10, 230, 190, 120);
		TrainListButton.setBackground(new Color(253, 255, 153));
		TrainListButton.addActionListener(this);
		add(TrainListButton);

		BusListButton = new JButton("버스 예매 현황");
		BusListButton.setBounds(200, 230, 190, 120);
		BusListButton.setBackground(new Color(255, 000, 102));
		BusListButton.addActionListener(this);
		add(BusListButton);

		AirplaneListButton = new JButton("비행기예매 현황");
		AirplaneListButton.setBounds(390, 230, 190, 120);
		AirplaneListButton.setBackground(new Color(051, 255, 102));
		AirplaneListButton.addActionListener(this);
		add(AirplaneListButton);

		exitButton = new JButton("Exit");
		exitButton.setBounds(200, 350, 190, 100);
		exitButton.setBackground(new Color(0, 0, 0));
		exitButton.addActionListener(this);
		add(exitButton);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == TrainButton) {
			System.out.println("기차 예매");
			this.dispose();
			TrainForm trainForm = new TrainForm(db);
			trainForm.setVisible(true);
		} else if (e.getSource() == BusButton) {
			System.out.println("버스 예매");
			this.dispose();
			BusForm busForm = new BusForm(db);
			busForm.setVisible(true);
		} else if (e.getSource() == AirplaneButton) {
			System.out.println("비행기 예매");
			this.dispose();
			AirplaneForm airplaneForm = new AirplaneForm(db);
			airplaneForm.setVisible(true);
		} else if (e.getSource() == TrainListButton) {
			System.out.println("기차 예매 현황");
			this.dispose();
			TrainList trainList = new TrainList(db);
			trainList.setVisible(true);
		} else if (e.getSource() == BusListButton) {
			System.out.println("버스 예매 현황");
			this.dispose();
			BusList buslist = new BusList(db);
			buslist.setVisible(true);
		} else if (e.getSource() == AirplaneListButton) {
			System.out.println("비행기 예매 현황");
			this.dispose();
			AirplaneList airplaneList = new AirplaneList(db);
			airplaneList.setVisible(true);
		} else if (e.getSource() == exitButton) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		new Mainmenu(new DatabaseClass());
	}

}