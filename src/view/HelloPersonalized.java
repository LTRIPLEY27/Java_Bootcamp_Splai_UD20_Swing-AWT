package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class HelloPersonalized {

	private JFrame frame; //ATRIBUTO FRAME SOBRE LA QUE SE EJECUTARAN LOS COMPONENTES
	
	private final int ANCHO = 600; // DIMENSIONES POR DEFECTO DEL FRAME
	private final int LARGO = 600;
	private JTextField text; // ATRIBUTO Jtext
	private JLabel label;
	private JButton boton;
	
	//CONSTRUCTOR POR DEFECTO
	public HelloPersonalized() {
		this.frame = new JFrame("Hello");
		this.frame.setLayout(new GridLayout(0,1));
		this.text = new JTextField("");
		this.label = new JLabel("Indique un nombre para saludar ");
		this.boton = new JButton("Say Hello");
		
		this.text.setBounds(20, 20, 20, 20);
		this.boton.setBounds(20, 20, 20, 20);
		this.boton.addActionListener(new ActionListener(){
		// ACCI�N DEFINIDA QUE EJECUTAR� EL BOTON DESDE EL CONSTRUCTOR
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hola " + text.getText());	
			}
		});
		
		this.frame.add(label);
		this.frame.add(text);
		this.frame.add(boton);
		
		showFrame();// LLAMA AL M�TODO PARA QUE SEA VISIBLE
	}
	
	public HelloPersonalized(String value) {
		this.text.setText(value);//ACTUALIZA EL VALOR DEL JTEXTFIELD
	}
	
	//M�TODO PARA HACER VISIBLE EL MARCO
	private void showFrame() {
		this.frame.setSize(ANCHO, LARGO);
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//CIERRA EL FRAME
		this.frame.setVisible(true);
	}
	
	//M�TODOS DE ACCESO
	public void setFrame(JFrame ventana) {
		this.frame = frame;
	}
	
	public JFrame getFrame() {
		return this.frame;
	}
	
	public void setText(JTextField text) {
		this.text = text;
	}
	
	public JTextField getText() {
		return this.text;
	}
	
}