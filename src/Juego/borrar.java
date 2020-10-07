package Juego;

import java.io.File;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class borrar {
	
	private static int segundos;
	
	public static void main(String[] args) {
		
		segundos=0;
		
		// Clase en la que está el código a ejecutar
	     TimerTask timerTask = new TimerTask()
	     {
	         public void run() 
	         {
	        	 segundos++;
	             System.out.println(""+segundos);
	         }
	     };

	      // Aquí se pone en marcha el timer cada segundo.
	     Timer timer = new Timer();
	     // Dentro de 0 milisegundos avísame cada 1000 milisegundos
	     timer.scheduleAtFixedRate(timerTask, 0, 1000);
		
	}
	
}
