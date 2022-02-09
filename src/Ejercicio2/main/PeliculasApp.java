package Ejercicio2.main;

import java.awt.EventQueue;

import Ejercicio2.view.PeliculasLista;

public class PeliculasApp {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PeliculasLista frame = new PeliculasLista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
