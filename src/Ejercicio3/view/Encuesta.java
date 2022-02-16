package Ejercicio3.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.JTextPane;

public class Encuesta extends JFrame {
	private final int ANCHO = 400;
	private final int LARGO = 400;
	private JPanel panel;
	private JLabel labelA;
	private JLabel labelB;
	private JRadioButton botonRadi1;
	private JRadioButton botonRadi2;
	private JRadioButton botonRadi3;
	private JLabel labelC;
	private JLabel labelD;
	private JCheckBox chboxA;
	private JCheckBox chboxB;
	private JCheckBox chboxC;
	private JSlider slider;
	private JTextPane textPane;
	private JButton btn;
	
	public Encuesta() {
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		labelA = new JLabel("Encuesta");
		labelA.setFont(new Font("Tahoma", Font.BOLD, 13));
		labelA.setBounds(277, 11, 228, 14);
		panel.add(labelA);
		
		labelB = new JLabel("Elige sistema operativo");
		labelB.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelB.setBounds(22, 61, 174, 14);
		panel.add(labelB);
		
		botonRadi1 = new JRadioButton("Windows");
		botonRadi1.setBounds(39, 99, 109, 23);
		panel.add(botonRadi1);
		
		botonRadi2 = new JRadioButton("Linux");
		botonRadi2.setBounds(39, 124, 109, 23);
		panel.add(botonRadi2);
		
		botonRadi3 = new JRadioButton("Mac");
		botonRadi3.setBounds(39, 150, 109, 23);
		panel.add(botonRadi3);
		
		labelC = new JLabel("Especialidad");
		labelC.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelC.setBounds(236, 61, 97, 14);
		panel.add(labelC);
		
		chboxA = new JCheckBox("Programaci\u00F3n");
		chboxA.setBounds(224, 99, 97, 23);
		panel.add(chboxA);
		
		chboxB = new JCheckBox("Dise\u00F1o Gr\u00E1fico");
		chboxB.setBounds(224, 124, 97, 23);
		panel.add(chboxB);
		
		chboxC = new JCheckBox("Administraci\u00F3n");
		chboxC.setBounds(224, 150, 97, 23);
		panel.add(chboxC);
		
		labelD = new JLabel("Horas dedicadas al oldernador");
		labelD.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelD.setBounds(382, 57, 204, 23);
		panel.add(labelD);
		
		slider = new JSlider();
		slider.setMaximum(10);
		slider.setBounds(367, 91, 200, 26);
		panel.add(slider);
		
		textPane = new JTextPane();
		textPane.setBounds(89, 232, 446, 78);
		panel.add(textPane);
		
		btn = new JButton("Enviar");
		btn.setBounds(244, 193, 89, 23);
		panel.add(btn);
		
		showPanel();
	}
	
	public void showPanel() {
		setTitle("Encuesta");
		setBounds(100, 100, 637, 409);
		setContentPane(panel);
		panel.setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
}
