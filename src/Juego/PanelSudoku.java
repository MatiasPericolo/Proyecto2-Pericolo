package Juego;

import javax.swing.JLabel;

public class PanelSudoku extends JLabel{

	private int fila,columna;
	private boolean bloqueado;
	
	public PanelSudoku(int n,int m) {
		columna=n;
		fila=m;
		bloqueado=false;
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
	
	public boolean getBloqueado() {
		return bloqueado;
	}
	
	public void setBloqueado(boolean estado) {
		bloqueado=estado;
	}
}
