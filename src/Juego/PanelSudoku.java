package Juego;

import javax.swing.JLabel;

public class PanelSudoku extends JLabel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int fila,columna;
	
	public PanelSudoku(int n,int m) {
		columna=n;
		fila=m;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}
	
}
