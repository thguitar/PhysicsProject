package br.com.physics.view;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;

public class HomeView extends JFrame {

	private static final long serialVersionUID = -7163070996721186537L;
	private JPanel contentPane;
	private JTextField textFieldF1;
	private JTextField textFieldF2;
	private JTextField textFieldTeta1;
	private JTextField textFieldTeta2;
	private JLabel labelF1;
	private JLabel labelF2;
	private JLabel labelTeta1;
	private JLabel labelTeta2;
	private JButton btnCalcular;


	public HomeView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 180);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		labelF1 = new JLabel("For\u00E7a 1:");
		labelF1.setBounds(25, 25, 46, 14);
		contentPane.add(labelF1);
		
		labelF2 = new JLabel("For\u00E7a 2:");
		labelF2.setBounds(25, 69, 46, 14);
		contentPane.add(labelF2);
		
		textFieldF1 = new JTextField();
		textFieldF1.setBounds(77, 22, 86, 20);
		contentPane.add(textFieldF1);
		textFieldF1.setColumns(10);
		
		textFieldF2 = new JTextField();
		textFieldF2.setBounds(77, 66, 86, 20);
		contentPane.add(textFieldF2);
		textFieldF2.setColumns(10);
		
		labelTeta1 = new JLabel("\u0398 1:");
		labelTeta1.setBounds(194, 25, 27, 14);
		contentPane.add(labelTeta1);
		
		labelTeta2 = new JLabel("\u0398 2:");
		labelTeta2.setBounds(194, 69, 27, 14);
		contentPane.add(labelTeta2);
		
		textFieldTeta1 = new JTextField();
		textFieldTeta1.setBounds(225, 22, 86, 20);
		contentPane.add(textFieldTeta1);
		textFieldTeta1.setColumns(10);
		
		textFieldTeta2 = new JTextField();
		textFieldTeta2.setBounds(225, 66, 86, 20);
		contentPane.add(textFieldTeta2);
		textFieldTeta2.setColumns(10);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(122, 108, 89, 23);
		contentPane.add(btnCalcular);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 53, 314, 2);
		contentPane.add(separator);
	}


	public JTextField getTextFieldF1() {
		return textFieldF1;
	}


	public void setTextFieldF1(JTextField textFieldF1) {
		this.textFieldF1 = textFieldF1;
	}


	public JTextField getTextFieldF2() {
		return textFieldF2;
	}


	public void setTextFieldF2(JTextField textFieldF2) {
		this.textFieldF2 = textFieldF2;
	}


	public JTextField getTextFieldTeta1() {
		return textFieldTeta1;
	}


	public void setTextFieldTeta1(JTextField textFieldTeta1) {
		this.textFieldTeta1 = textFieldTeta1;
	}


	public JTextField getTextFieldTeta2() {
		return textFieldTeta2;
	}


	public void setTextFieldTeta2(JTextField textFieldTeta2) {
		this.textFieldTeta2 = textFieldTeta2;
	}


	public JButton getBtnCalcular() {
		return btnCalcular;
	}


	public void setBtnCalcular(JButton btnCalcular) {
		this.btnCalcular = btnCalcular;
	}
}
