package Ejercicio1.view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class HelloPersonalized extends JFrame {

	//private JFrame frame; //ATRIBUTO FRAME SOBRE LA QUE SE EJECUTARAN LOS COMPONENTES
	private JPanel panel;
	
	private final int ANCHO = 600; // DIMENSIONES POR DEFECTO DEL FRAME
	private final int LARGO = 600;
	private JTextField text; // ATRIBUTO Jtext
	private JLabel label;
	private JButton boton;
	
	//CONSTRUCTOR POR DEFECTO
	public HelloPersonalized() {
		panel = new JPanel();
		this.text = new JTextField("");
		this.label = new JLabel("Indique un nombre para saludar ");
		this.boton = new JButton("Say Hello");
		label.setBounds(100, 80, 200, 30);
		text.setBounds(90, 140, 210,20);
		boton.setBounds(140, 220, 100, 20);
		boton.addActionListener(new ActionListener(){
		// ACCIÓN DEFINIDA QUE EJECUTARÁ EL BOTON DESDE EL CONSTRUCTOR
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hola " + text.getText());	
			}
		});
		
		panel.add(label);
		panel.add(text);
		panel.add(boton);
		
		setVisible();
// LLAMA AL MÉTODO PARA QUE SEA VISIBLE
	}
	
	public HelloPersonalized(String value) {
		this.text.setText(value);//ACTUALIZA EL VALOR DEL JTEXTFIELD
	}
	
	//MÉTODO PARA HACER VISIBLE EL MARCO
	public void setVisible() {
		setTitle("Cambia letras");
		setBounds(400, 400, 400, 400);
		setContentPane(panel);
		panel.setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	
	//MÉTODOS DE ACCESO

	
	public void setText(JTextField text) {
		this.text = text;
	}
	
	public JTextField getText() {
		return this.text;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}
	
}

