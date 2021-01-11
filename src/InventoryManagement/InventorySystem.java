package InventoryManagement;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class InventorySystem extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JFrame frame;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InventorySystem frame = new InventorySystem();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public InventorySystem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(00, 00, 1450, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel.setBounds(20, 30, 619, 161);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Production Description");
		lblNewLabel.setBounds(10, 11, 174, 26);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		panel.add(lblNewLabel);
		
		JLabel lblProductCode = new JLabel("Product Code");
		lblProductCode.setBounds(10, 103, 174, 26);
		lblProductCode.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		panel.add(lblProductCode);
		
		JLabel lblNewLabel_1_1 = new JLabel("No. Of Days");
		lblNewLabel_1_1.setBounds(339, 11, 121, 26);
		lblNewLabel_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Cost Per Day(Rs.)");
		lblNewLabel_1_1_1.setBounds(339, 103, 130, 26);
		lblNewLabel_1_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		panel.add(lblNewLabel_1_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField_1.setText((String)comboBox.getSelectedItem());
				textField_2.setText((String)comboBox.getSelectedItem());
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"0", "5", "10", "15", "20", "25", "30"}));
		comboBox.setBounds(474, 11, 135, 26);
		comboBox.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(comboBox_1.getSelectedItem().equals("Lawnmower"))
				{
					textField_7.setText("LAWM89");
					textField.setText("17");
				}
				else if(comboBox_1.getSelectedItem().equals("Pickup Van"))
				{
					textField_7.setText("PVAN19");
					textField.setText("20");
				}
				else if(comboBox_1.getSelectedItem().equals("Cement Mixer"))
				{
					textField_7.setText("CMIX124");
					textField.setText("14");
				}
				else if(comboBox_1.getSelectedItem().equals("Generator"))
				{
					textField_7.setText("Gen724");
					textField.setText("18");
				}
			}
		});
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select An Item", "Lawnmower", "Pickup Van", "Cement Mixer", "Generator"}));
		comboBox_1.setBounds(191, 11, 139, 26);
		comboBox_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		panel.add(comboBox_1);
		
		textField = new JTextField();
		textField.setBounds(474, 103, 135, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(194, 103, 135, 26);
		panel.add(textField_7);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_1.setBounds(20, 233, 619, 450);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Credit Limit");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 11, 128, 26);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Set Due Day");
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_2.setBounds(10, 48, 128, 26);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Discount");
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_3.setBounds(10, 85, 128, 26);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Pay Due Days");
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_4.setBounds(10, 122, 128, 26);
		panel_1.add(lblNewLabel_4);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_3.setBounds(10, 159, 599, 164);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Can Charge Credit");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (chckbxNewCheckBox.isSelected())
				{
					textField_3.setText("Can Charge Credit");
				}
				else
				{
					textField_3.setText("");
				}
			}
		});
		chckbxNewCheckBox.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		chckbxNewCheckBox.setBounds(6, 7, 165, 26);
		panel_3.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Terms Agreed");
		chckbxNewCheckBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (chckbxNewCheckBox_1.isSelected())
				{
					textField_4.setText("Terms Agreed");
				}
				else
				{
					textField_4.setText("");
				}
			}
		});
		chckbxNewCheckBox_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		chckbxNewCheckBox_1.setBounds(6, 45, 165, 26);
		panel_3.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Account On Hold");
		chckbxNewCheckBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (chckbxNewCheckBox_2.isSelected())
				{
					textField_5.setText("Account On Hold");
				}
				else
				{
					textField_5.setText("");
				}
			}
		});
		chckbxNewCheckBox_2.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		chckbxNewCheckBox_2.setBounds(6, 87, 165, 26);
		panel_3.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Restrict Mailing");
		chckbxNewCheckBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (chckbxNewCheckBox_3.isSelected())
				{
					textField_6.setText("Restrict Mails");
				}
				else
				{
					textField_6.setText("");
				}
			}
		});
		chckbxNewCheckBox_3.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		chckbxNewCheckBox_3.setBounds(6, 129, 165, 26);
		panel_3.add(chckbxNewCheckBox_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(177, 7, 412, 26);
		panel_3.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(177, 45, 412, 26);
		panel_3.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(177, 87, 412, 26);
		panel_3.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(177, 129, 412, 26);
		panel_3.add(textField_6);
		
		JLabel lblNewLabel_5 = new JLabel("Credit Check");
		lblNewLabel_5.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_5.setBounds(298, 11, 152, 26);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Payment Overdue");
		lblNewLabel_6.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_6.setBounds(298, 48, 152, 26);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Deposit Paid");
		lblNewLabel_7.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_7.setBounds(298, 85, 152, 26);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Method Of Payment");
		lblNewLabel_8.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_8.setBounds(298, 122, 152, 26);
		panel_1.add(lblNewLabel_8);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"0", "50", "100", "150", "200"}));
		comboBox_2.setBounds(148, 11, 140, 26);
		panel_1.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"0", "5", "10", "15", "20"}));
		comboBox_3.setBounds(148, 85, 140, 26);
		panel_1.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Select An Option", "Yes", "NO"}));
		comboBox_4.setBounds(485, 11, 124, 26);
		panel_1.add(comboBox_4);
		
		JComboBox comboBox_4_1 = new JComboBox();
		comboBox_4_1.setModel(new DefaultComboBoxModel(new String[] {"Select An Option", "Yes", "NO"}));
		comboBox_4_1.setBounds(485, 48, 124, 26);
		panel_1.add(comboBox_4_1);
		
		JComboBox comboBox_4_1_1 = new JComboBox();
		comboBox_4_1_1.setModel(new DefaultComboBoxModel(new String[] {"Select An Option", "Yes", "NO"}));
		comboBox_4_1_1.setBounds(485, 85, 124, 26);
		panel_1.add(comboBox_4_1_1);
		
		JComboBox comboBox_4_1_1_1 = new JComboBox();
		comboBox_4_1_1_1.setModel(new DefaultComboBoxModel(new String[] {"Select Payment Method", "Cash", "Credit Crad", "Debit Card", "BHIM UPI"}));
		comboBox_4_1_1_1.setBounds(485, 122, 124, 26);
		panel_1.add(comboBox_4_1_1_1);
		
		JLabel lblNewLabel_9 = new JLabel("TAX");
		lblNewLabel_9.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_9.setBounds(10, 334, 128, 26);
		panel_1.add(lblNewLabel_9);
		
		JLabel lblNewLabel_9_1 = new JLabel("Sub Total");
		lblNewLabel_9_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_9_1.setBounds(242, 334, 140, 26);
		panel_1.add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_9_1_1 = new JLabel("Total");
		lblNewLabel_9_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_9_1_1.setBounds(480, 334, 124, 26);
		panel_1.add(lblNewLabel_9_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(148, 48, 140, 26);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(148, 122, 140, 26);
		panel_1.add(textField_2);
		
		textField_8 = new JTextField();
		textField_8.setBounds(10, 371, 128, 47);
		panel_1.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(242, 371, 128, 47);
		panel_1.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(480, 371, 128, 47);
		panel_1.add(textField_10);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_1_1.setBounds(727, 30, 619, 450);
		contentPane.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_5_1 = new JLabel("Acoount Opened");
		lblNewLabel_5_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_5_1.setBounds(10, 11, 152, 26);
		panel_1_1.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("Last Credit Review");
		lblNewLabel_5_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_5_1_1.setBounds(10, 48, 152, 26);
		panel_1_1.add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_5_1_2 = new JLabel("Next Credit Review");
		lblNewLabel_5_1_2.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_5_1_2.setBounds(10, 85, 152, 26);
		panel_1_1.add(lblNewLabel_5_1_2);
		
		JLabel lblNewLabel_5_1_3 = new JLabel("Application Date");
		lblNewLabel_5_1_3.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_5_1_3.setBounds(10, 122, 152, 26);
		panel_1_1.add(lblNewLabel_5_1_3);
		
		JLabel lblNewLabel_5_1_4 = new JLabel("Date Recieved");
		lblNewLabel_5_1_4.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_5_1_4.setBounds(10, 159, 152, 26);
		panel_1_1.add(lblNewLabel_5_1_4);
		
		JComboBox comboBox_4_2 = new JComboBox();
		comboBox_4_2.setModel(new DefaultComboBoxModel(new String[] {"Select Date", "01/01/2018", "01/01/2019", "01/01/2020", "01/01/2021", "01/01/2022", "01/01/2023", "01/01/2024", "01/01/2025"}));
		comboBox_4_2.setBounds(172, 11, 437, 26);
		panel_1_1.add(comboBox_4_2);
		
		JComboBox comboBox_4_3 = new JComboBox();
		comboBox_4_3.setModel(new DefaultComboBoxModel(new String[] {"Select Date", "01/01/2018", "01/01/2019", "01/01/2020", "01/01/2021", "01/01/2022", "01/01/2023", "01/01/2024", "01/01/2025"}));
		comboBox_4_3.setBounds(172, 52, 437, 26);
		panel_1_1.add(comboBox_4_3);
		
		JComboBox comboBox_4_4 = new JComboBox();
		comboBox_4_4.setModel(new DefaultComboBoxModel(new String[] {"Select Date", "01/01/2018", "01/01/2019", "01/01/2020", "01/01/2021", "01/01/2022", "01/01/2023", "01/01/2024", "01/01/2025"}));
		comboBox_4_4.setBounds(172, 89, 437, 26);
		panel_1_1.add(comboBox_4_4);
		
		JComboBox comboBox_4_5 = new JComboBox();
		comboBox_4_5.setModel(new DefaultComboBoxModel(new String[] {"Select Date", "01/01/2018", "01/01/2019", "01/01/2020", "01/01/2021", "01/01/2022", "01/01/2023", "01/01/2024", "01/01/2025"}));
		comboBox_4_5.setBounds(172, 126, 437, 26);
		panel_1_1.add(comboBox_4_5);
		
		JComboBox comboBox_4_6 = new JComboBox();
		comboBox_4_6.setModel(new DefaultComboBoxModel(new String[] {"Select Date", "01/01/2018", "01/01/2019", "01/01/2020", "01/01/2021", "01/01/2022", "01/01/2023", "01/01/2024", "01/01/2025"}));
		comboBox_4_6.setBounds(172, 163, 437, 26);
		panel_1_1.add(comboBox_4_6);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(20, 196, 577, 243);
		panel_1_1.add(textArea);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_1_1_1.setBounds(727, 522, 619, 161);
		contentPane.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Total");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textArea.setText(null);
				double Discount, SubTotal, Tax, Total;
				double CostPerDay = Double.parseDouble(textField.getText());
				double SetDueDay = Double.parseDouble(textField_1.getText());
				
				Object NoSelected = comboBox.getSelectedItem();
				String NoOfDay = NoSelected.toString();
				double daysSelected = Double.parseDouble(NoOfDay);
				
				Object NoDiscount = comboBox_3.getSelectedItem();
				String ApproveDiscount = NoDiscount.toString();
				double StatedDiscount = Double.parseDouble(ApproveDiscount);
				
				Discount = ((CostPerDay * SetDueDay) * StatedDiscount)/100;
				SubTotal = ((CostPerDay * SetDueDay) - Discount);
				Tax = SubTotal * 0.2;
				Total = (Tax + SubTotal);
				
				String isub = String.format("Rs.%.2f",SubTotal);
				textField_9.setText(isub);
				
				String iTax = String.format("Rs.%2f",Tax);
				textField_8.setText(iTax);
				
				
				String iTotal = String.format("Rs.%2f",Total);
				textField_10.setText(iTotal);
				
				//=========================Reciept=========================
				
				double Qty1 = Double.parseDouble(textField.getText());
				double Qty2 = Double.parseDouble(textField_1.getText());
				double Qty3 = Double.parseDouble(NoOfDay);
				String Qty4 = (textField_7.getText());
				textArea.append("\t\tInventory Management System\n\n"
				+ "\tProduct Code: \t\t\t" + Qty4 + "\n\tNumber Of Days:\t\t"
				      + Qty3 + "\n\tCost Per Day:\t\t\t" + 
				        Qty1 + "\n\tSet Due Day: \t\t\t" + Qty2
				        + "\n\n\tTax:\t\t\t" + iTax + 
				        "\n" + "\tSub Total:\t\t\t" + isub + 
				        "\n\n" + "\tTotal: \t\t\t" + iTotal + "\n\n\n\t Please keep the Reciept For Your Record");
				
			}
		});
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		btnNewButton.setBounds(10, 44, 171, 70);
		panel_1_1_1.add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField_1.setText(null);
				textField_2.setText(null);
				textField.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textArea.setText(null);
				comboBox_4.setSelectedIndex(0);
				comboBox.setSelectedIndex(0);
				comboBox_1.setSelectedIndex(0);
				comboBox_2.setSelectedIndex(0);
				comboBox_3.setSelectedIndex(0);
				comboBox_4_1.setSelectedIndex(0);
				comboBox_4_1_1.setSelectedIndex(0);
				comboBox_4_1_1_1.setSelectedIndex(0);
				comboBox_4_2.setSelectedIndex(0);
				comboBox_4_3.setSelectedIndex(0);
				comboBox_4_4.setSelectedIndex(0);
				comboBox_4_5.setSelectedIndex(0);
				comboBox_4_6.setSelectedIndex(0);
				chckbxNewCheckBox.setSelected(false);
				chckbxNewCheckBox_1.setSelected(false);
				chckbxNewCheckBox_2.setSelected(false);
				chckbxNewCheckBox_3.setSelected(false);
				
			}
		});
		btnReset.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		btnReset.setBounds(223, 44, 171, 70);
		panel_1_1_1.add(btnReset);
		
		JButton btnExit = new JButton("Exit\r\n");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Inventory System",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
		btnExit.setBounds(438, 44, 171, 70);
		panel_1_1_1.add(btnExit);
	}
}
