package Juego;

public class Sudoku_Logica {

	private int[][] sudoku;
	
	public Sudoku_Logica() {
		sudoku=new int[9][9];
		
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				sudoku[i][j]=0;
			}
		}
	}
	
	//Insertar devuelve un boolean que avisa si el numero esta cometiendo una colision
	public boolean insertar(int x,int y,int num) {	
		sudoku[y][x]=num;
		
		boolean falla=comprobarColisiones(x,y,num);
		    
		return falla;
	}
	
	public boolean comprobarEstado() {
		boolean terminado=true;
		
		for(int i=0;i<9;i++)
			for(int j=0;j<9;j++)
				if(comprobarColisiones(i,j,sudoku[j][i]) || sudoku[j][i]==0)
					terminado=false;
		
		return terminado;
	}
	
	public void borrar(int x,int y) {
		sudoku[y][x]=0;
	}
	
	private boolean comprobarColisiones(int x,int y,int num) {
		boolean falla=false;
		int minY;
		int maxY;
		int minX;
		int maxX;
		
		//Compruebo filas y columnas
				for(int i=0;i<9;i++) {
					if(sudoku[i][x]==num && i!=y) {
						falla=true;
					}
					
					if(sudoku[y][i]==num && i!=x) {
						falla=true;
					}
				}
				
				//Compruebo el bloque
				if (y < 3){
					minY = 0;
					maxY = 2;
				}else if(y < 6){
					minY = 3;
					maxY = 5;
				}else{
					minY = 6;
					maxY = 8;
				}
					    
				if (x < 3){
					minX = 0;
					maxX = 2;
				}else if(x < 6){
					minX = 3;
					maxX = 5;
				}else{
					minX = 6;
					maxX = 8;
				}
				
				for ( int j = minY; j <= maxY; j++ )
					for ( int k = minX; k <= maxX; k++)
						if ( sudoku[j][k] == num && (j!=y && k!=x)) {
							falla = true;
						}
					
				return falla;
	}
}
