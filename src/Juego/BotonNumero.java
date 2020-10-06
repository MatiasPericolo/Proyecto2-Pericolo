package Juego;

import javax.swing.JButton;

public class BotonNumero extends JButton{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int numero;
	
	public BotonNumero(int num) {
		numero=num;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
