package Project02;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AirplaneList extends JFrame implements ActionListener {
	public DatabaseClass db;

	private JTable table;
	private DefaultTableModel tableModel;

	public AirplaneList() {

	}

	public AirplaneList(DatabaseClass db) {
		this.db = db;

		String[] columnNames = { "소요시간", "나라", "가격" };
		List<Airplane> airplaneList = db.getAirplane();
		Object[][] data = new Object[airplaneList.size()][3];

		for (int i = 0; i < airplaneList.size(); i++) {
			Airplane airplane = airplaneList.get(i);
			data[i][0] = airplane.getTime();
			data[i][1] = airplane.getCountry();
			data[i][2] = airplane.getPrice();
		}
		tableModel = new DefaultTableModel(data, columnNames);
		table = new JTable(tableModel);

		JButton deleteButton = new JButton("취소하기");
		deleteButton.setBackground(new Color(255, 0, 0));
		deleteButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int row = table.getSelectedRow();
				if (row == -1)
					return;
				tableModel.removeRow(row);
				airplaneList.remove(row);
			}
		});

		JButton closeButton = new JButton("나가기");
		closeButton.setBackground(new Color(0, 0, 0));
		closeButton.addActionListener(this);

		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(4, 2));
		mainPanel.add(new JScrollPane(table), BorderLayout.CENTER);

		JPanel inputPanel = new JPanel();
		inputPanel.setLayout(new GridLayout());

		mainPanel.add(inputPanel, BorderLayout.SOUTH);
		mainPanel.add(deleteButton, BorderLayout.NORTH);
		mainPanel.add(closeButton, BorderLayout.SOUTH);
		

		// Set up the frame
		setTitle("비행기 예매 현황");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(mainPanel);
		setSize(500, 300);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		this.dispose();

		Mainmenu mainMenu = new Mainmenu(db);
		mainMenu.setVisible(true);
	}

	public static void main(String[] args) {
		new AirplaneList();
	}

}
