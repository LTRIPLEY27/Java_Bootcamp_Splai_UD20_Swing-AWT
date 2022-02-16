package Ejercicio4.view;
/*
 * @uthor: Isabel Calzadilla
 * UD20A : Ejercicio4 CALCULADORA
 * */
import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField num1;
	private JTextField num2;
	private JTextField results;
	private JButton sumas;
	private JButton restas;
	private JButton multiplicas;
	private JButton divides;
	private double calculum;
	private JButton salir;
	private JButton btnReset;
	public Calculadora() {
		
		contentPane = new JPanel();
		
		JLabel lblNewLabel = new JLabel("MiniCalculadora");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(166, 11, 127, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("N\u00FAmero1");
		lblNewLabel_1.setBounds(309, 55, 58, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("N\u00FAmero2");
		lblNewLabel_1_1.setBounds(309, 98, 58, 14);
		contentPane.add(lblNewLabel_1_1);
		
		num1 = new JTextField();
		num1.setBounds(410, 52, 86, 20);
		contentPane.add(num1);
		num1.setColumns(10);
		
		num2 = new JTextField();
		num2.setBounds(410, 95, 86, 20);
		contentPane.add(num2);
		num2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Operaciones");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(95, 54, 74, 14);
		contentPane.add(lblNewLabel_2);
		
		salir = new JButton("Salir");
		salir.setFont(new Font("Berlin Sans FB", Font.BOLD | Font.ITALIC, 12));
		salir.setBackground(Color.BLUE);
		salir.setBounds(316, 211, 99, 43);
		salir.addActionListener(act);
		contentPane.add(salir);
		
		btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Berlin Sans FB", Font.BOLD | Font.ITALIC, 12));
		btnReset.setBackground(Color.BLUE);
		btnReset.setBounds(177, 211, 99, 43);
		btnReset.addActionListener(act);
		contentPane.add(btnReset);
		
		results = new JTextField();
		results.setEnabled(false);
		results.setBounds(410, 131, 86, 20);
		contentPane.add(results);
		results.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Resultado");
		lblNewLabel_3.setBounds(309, 134, 72, 14);
		contentPane.add(lblNewLabel_3);
		
		sumas = new JButton("Sumar");
		sumas.setFont(new Font("Tahoma", Font.PLAIN, 9));
		sumas.setBounds(46, 79, 86, 20);
		sumas.addActionListener(act);
		contentPane.add(sumas);
		
		restas = new JButton("Restar");
		restas.setFont(new Font("Tahoma", Font.PLAIN, 9));
		restas.setBounds(158, 79, 86, 20);
		restas.addActionListener(act);
		contentPane.add(restas);
		
		multiplicas = new JButton("Multiplicar");
		multiplicas .setFont(new Font("Tahoma", Font.PLAIN, 9));
		multiplicas .setBounds(46, 106, 86, 20);
		multiplicas.addActionListener(act);
		contentPane.add(multiplicas);
		
		divides = new JButton("Dividir");
		divides.setFont(new Font("Tahoma", Font.PLAIN, 9));
		divides.setBounds(158, 106, 86, 20);
		divides.addActionListener(act);
		contentPane.add(divides);
		showPanel() ;
	}

	public void showPanel() {
		setTitle("Encuesta");
		setBounds(100, 100, 637, 409);
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	ActionListener act = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			double a = Double.parseDouble(num1.getText());
			double b = Double.parseDouble(num2.getText());
			if(e.getSource() == sumas) {
				calculum = a + b;
			}
			if(e.getSource() == restas) {
				calculum = a - b;
			}
			if(e.getSource() == multiplicas) {
				calculum = a * b;
			}
			if(e.getSource() == divides) {
				calculum = a / b;
			}
			if(e.getSource() == salir) {
				contentPane.setVisible(false);
			}
			if(e.getSource() == btnReset) {
				contentPane.setVisible(false);
			}
			results.setEnabled(true);
			results.setText(String.valueOf(calculum));

	}
};
	
}
