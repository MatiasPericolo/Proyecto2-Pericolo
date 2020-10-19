package Juego;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class Aplicacion extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JButton btnJugar;
	
	private JFrame ventanaElegirNivel;
	private JPanel panelElegirNivel;
	
	private JPanel contentPane;
	private JLabel menuImagen;
	
	private JFrame sodoku;

	private static final Aplicacion gui=new Aplicacion();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private Aplicacion() {
		menuPrincipal();
	}
	
	public void menuPrincipal() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 1000, 770);
		
		//Creo el panel de inicio
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Creo el boton jugar y lo agrego al panel de inicio
		btnJugar=new JButton(new ImageIcon("Sprites\\button_elegir-nivel.png"));
		oyenteJugar oyenteJugar=new oyenteJugar();
		btnJugar.addActionListener(oyenteJugar);
		btnJugar.setFocusPainted(false);
		btnJugar.setBounds(400, 300, 170, 53);
		contentPane.add(btnJugar);
				
		//Creo el boton salir y lo agrego al panel de inicio
		JButton btnSalir;
		btnSalir=new JButton(new ImageIcon("Sprites\\button_salir.png"));
		oyenteSalir oyenteSalir=new oyenteSalir();
		btnSalir.addActionListener(oyenteSalir);
		btnSalir.setFocusPainted(false);
		btnSalir.setBounds(400, 510, 170, 53);
		contentPane.add(btnSalir);
		
		//Label del panel
		JLabel panel=new JLabel();
		panel.setIcon(new ImageIcon("Sprites\\panel_de_menu.jpg"));
		panel.setBounds(330, 235, 300, 400);
		contentPane.add(panel);
			
		//Label del titulo
		JLabel titulo=new JLabel();
		titulo.setIcon(new ImageIcon("Sprites\\titulo.png"));
		titulo.setBounds(250, -25, 800, 200);
		contentPane.add(titulo);
		
		//Imagen del menu
		menuImagen=new JLabel();
		menuImagen.setIcon(new ImageIcon("Sprites\\fondo.jpg"));
		menuImagen.setBounds(0, 0, 1200, 800);
		contentPane.add(menuImagen);
		setVisible(true);
	} 
	
	class oyenteSalir implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
	
	class oyenteJugar implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			JButton btnNivelUno;
			JButton btnNivelDos;
			JLabel fondo;
			
			//Creo la ventana para elegir Nivel
			ventanaElegirNivel=new JFrame("Elegir Nivel");
			ventanaElegirNivel.setBounds(700, 250, 400, 300);
			ventanaElegirNivel.setVisible(true);
			ventanaElegirNivel.setResizable(false);
			
			//Creo el panel para elegir Nivel
			panelElegirNivel=new JPanel();
			panelElegirNivel.setBorder(new EmptyBorder(5, 5, 5, 5));
			ventanaElegirNivel.setContentPane(panelElegirNivel);
			panelElegirNivel.setLayout(null);
			
			//Creo el boton Nivel uno y lo agrego
			btnNivelUno=new JButton(new ImageIcon("Sprites\\botonFacil.jpg"));
			oyenteDificultadFacil oyenteFacil=new oyenteDificultadFacil();
			btnNivelUno.addActionListener(oyenteFacil);
			btnNivelUno.setBounds(115, 40, 168, 70);
			panelElegirNivel.add(btnNivelUno);
			
			//Creo el boton Nivel dos y lo agrego
			btnNivelDos=new JButton(new ImageIcon("Sprites\\botonDificil.jpg"));
			oyenteDificultadDificil oyenteDificil=new oyenteDificultadDificil();
			btnNivelDos.addActionListener(oyenteDificil);
			btnNivelDos.setBounds(115, 160, 168, 70);
			panelElegirNivel.add(btnNivelDos);
			
			//Creo el fondo
			fondo=new JLabel(new ImageIcon("Sprites\\\\fondo.jpg"));
			panelElegirNivel.add(fondo);
			fondo.setBounds(0,0,400,300);
			fondo.setVisible(true);
			
		}
	}
	
	class oyenteDificultadFacil implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			ventanaElegirNivel.setVisible(false);
			gui.setVisible(false);
			sodoku = new Sudoku_GUI(14);
			sodoku.setVisible(true);
		}
	}
	
	class oyenteDificultadDificil implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			ventanaElegirNivel.setVisible(false);
			gui.setVisible(false);
			sodoku = new Sudoku_GUI(25);
			sodoku.setVisible(true);
		}
	}
}
