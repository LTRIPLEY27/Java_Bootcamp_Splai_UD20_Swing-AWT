package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class HelloPersonalized {

	private JFrame frame; //ATRIBUTO FRAME SOBRE LA QUE SE EJECUTARAN LOS COMPONENTES
	private JPanel panel;
	
	private final int ANCHO = 600; // DIMENSIONES POR DEFECTO DEL FRAME
	private final int LARGO = 600;
	private JTextField text; // ATRIBUTO Jtext
	private JLabel label;
	private JButton boton;
	
	//CONSTRUCTOR POR DEFECTO
	public HelloPersonalized() {
		this.frame = new JFrame("Hello");
		this.frame.setLayout(new GridLayout(0,1));
		this.panel = new JPanel();
		this.panel.setLayout(null);
		setPanel(panel);//SETTEA EL PANEL
		
		this.text = new JTextField("");
		this.label = new JLabel("Indique un nombre para saludar ");
		this.boton = new JButton("Say Hello");
		
		this.text.setBounds(20, 20, 20, 20);
		this.boton.setBounds(20, 20, 20, 20);
		this.boton.addActionListener(new ActionListener(){
		// ACCIÓN DEFINIDA QUE EJECUTARÁ EL BOTON DESDE EL CONSTRUCTOR
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hola " + text.getText());	
			}
		});
		
		this.panel.add(label);
		this.panel.add(text);
		this.panel.add(boton);
		
		showPanel();
		showFrame();// LLAMA AL MÉTODO PARA QUE SEA VISIBLE
	}
	
	public HelloPersonalized(String value) {
		this.text.setText(value);//ACTUALIZA EL VALOR DEL JTEXTFIELD
	}
	
	//MÉTODO PARA HACER VISIBLE EL MARCO
	private void showFrame() {
		this.frame.setSize(ANCHO, LARGO);
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//CIERRA EL FRAME
		this.frame.setVisible(true);
	}
	
	private void showPanel() {
		this.panel.setSize(500, 500);
		//this.panel.setDefaultCloseOperation(JPanel.EXIT_ON_CLOSE);//CIERRA EL FRAME
		this.panel.setVisible(true);
	}
	
	//MÉTODOS DE ACCESO
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

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}
	
}
