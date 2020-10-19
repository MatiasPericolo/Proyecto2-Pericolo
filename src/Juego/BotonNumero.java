package Juego;

import javax.swing.JButton;

public class BotonNumero extends JButton{

	private int numero;
	
	public BotonNumero(int num) {
		numero=num;
	}

	public int getNumero() {
		return numero;
	}
}
