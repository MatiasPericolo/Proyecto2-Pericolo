package Juego;



public class Reloj {
	protected boolean run;
	protected Sudoku_GUI juego;
	
	public Reloj(Sudoku_GUI juego) {
		this.juego=juego;
		run=true;
	}
	
	public void detenerHilo() {
		run=false;
	}

	public void run() {
		while(run){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}
