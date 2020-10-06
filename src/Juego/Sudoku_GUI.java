package Juego;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;
import java.awt.Font;

public class Sudoku_GUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	private int numeroActual;
	
	private PanelSodoku[][] grilla;
	
	JLabel borrar;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sudoku_GUI frame = new Sudoku_GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Sudoku_GUI() {
		iniciarJuego();
	}
	
	public void iniciarJuego() {
		
		numeroActual=0;
		grilla=new PanelSodoku[9][9];
		
		addMouseListener(click);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 898, 581);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		PanelSodoku panel_1_1 = new PanelSodoku(1,1);
		panel_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_1_1.setBounds(24, 24, 56, 56);
		contentPane.add(panel_1_1);
		grilla[0][0]=panel_1_1;
		
		PanelSodoku panel_1_2 = new PanelSodoku(1,2);
		panel_1_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_1_2.setBounds(80, 24, 56, 56);
		contentPane.add(panel_1_2);
		grilla[0][1]=panel_1_2;
		
		PanelSodoku panel_1_3 = new PanelSodoku(1,3);
		panel_1_3.setBorder(new MatteBorder(1, 1, 1, 4, (Color) Color.BLACK));
		panel_1_3.setBounds(136, 24, 56, 56);
		contentPane.add(panel_1_3);
		grilla[0][2]=panel_1_3;
		
		PanelSodoku panel_1_4 = new PanelSodoku(1,4);
		panel_1_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_1_4.setBounds(192, 24, 56, 56);
		contentPane.add(panel_1_4);
		grilla[0][3]=panel_1_4;
		
		PanelSodoku panel_1_5 = new PanelSodoku(1,5);
		panel_1_5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_1_5.setBounds(248, 24, 56, 56);
		contentPane.add(panel_1_5);
		grilla[0][4]=panel_1_5;
		
		PanelSodoku panel_1_6 = new PanelSodoku(1,6);
		panel_1_6.setBorder(new MatteBorder(1, 1, 1, 4, (Color) new Color(0, 0, 0)));
		panel_1_6.setBounds(304, 24, 56, 56);
		contentPane.add(panel_1_6);
		grilla[0][5]=panel_1_6;
		
		PanelSodoku panel_1_7 = new PanelSodoku(1,7);
		panel_1_7.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_1_7.setBounds(360, 24, 56, 56);
		contentPane.add(panel_1_7);
		grilla[0][6]=panel_1_7;
		
		PanelSodoku panel_1_8 = new PanelSodoku(1,8);
		panel_1_8.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_1_8.setBounds(416, 24, 56, 56);
		contentPane.add(panel_1_8);
		grilla[0][7]=panel_1_8;
		
		PanelSodoku panel_1_9 = new PanelSodoku(1,9);
		panel_1_9.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_1_9.setBounds(472, 24, 56, 56);
		contentPane.add(panel_1_9);
		grilla[0][8]=panel_1_9;
		
		PanelSodoku panel_2_1 = new PanelSodoku(2,1);
		panel_2_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_2_1.setBounds(24, 80, 56, 56);
		contentPane.add(panel_2_1);
		grilla[1][0]=panel_2_1;
		
		PanelSodoku panel_2_2 = new PanelSodoku(2,2);
		panel_2_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_2_2.setBounds(80, 80, 56, 56);
		contentPane.add(panel_2_2);
		grilla[1][1]=panel_2_2;
		
		PanelSodoku panel_2_3 = new PanelSodoku(2,3);
		panel_2_3.setBorder(new MatteBorder(1, 1, 1, 4, (Color) new Color(0, 0, 0)));
		panel_2_3.setBounds(136, 80, 56, 56);
		contentPane.add(panel_2_3);
		grilla[1][2]=panel_2_3;
		
		PanelSodoku panel_2_4 = new PanelSodoku(2,4);
		panel_2_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_2_4.setBounds(192, 80, 56, 56);
		contentPane.add(panel_2_4);
		grilla[1][3]=panel_2_4;
		
		PanelSodoku panel_2_5 = new PanelSodoku(2,5);
		panel_2_5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_2_5.setBounds(248, 80, 56, 56);
		contentPane.add(panel_2_5);
		grilla[1][4]=panel_2_5;
		
		PanelSodoku panel_2_6 = new PanelSodoku(2,6);
		panel_2_6.setBorder(new MatteBorder(1, 1, 1, 4, (Color) new Color(0, 0, 0)));
		panel_2_6.setBounds(304, 80, 56, 56);
		contentPane.add(panel_2_6);
		grilla[1][5]=panel_2_6;
		
		PanelSodoku panel_2_7 = new PanelSodoku(2,7);
		panel_2_7.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_2_7.setBounds(360, 80, 56, 56);
		contentPane.add(panel_2_7);
		grilla[1][6]=panel_2_7;
		
		PanelSodoku panel_2_8 = new PanelSodoku(2,8);
		panel_2_8.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_2_8.setBounds(416, 80, 56, 56);
		contentPane.add(panel_2_8);
		grilla[1][7]=panel_2_8;
		
		PanelSodoku panel_2_9 = new PanelSodoku(2,9);
		panel_2_9.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_2_9.setBounds(472, 80, 56, 56);
		contentPane.add(panel_2_9);
		grilla[1][8]=panel_2_9;
		
		PanelSodoku panel_3_1 = new PanelSodoku(3,1);
		panel_3_1.setBorder(new MatteBorder(1, 1, 4, 0, (Color) new Color(0, 0, 0)));
		panel_3_1.setBounds(24, 136, 56, 56);
		contentPane.add(panel_3_1);
		grilla[2][0]=panel_3_1;
		
		PanelSodoku panel_3_2 = new PanelSodoku(3,2);
		panel_3_2.setBorder(new MatteBorder(1, 1, 4, 0, (Color) new Color(0, 0, 0)));
		panel_3_2.setBounds(80, 136, 56, 56);
		contentPane.add(panel_3_2);
		grilla[2][1]=panel_3_2;
		
		PanelSodoku panel_3_3 = new PanelSodoku(3,3);
		panel_3_3.setBorder(new MatteBorder(1, 1, 4, 4, (Color) new Color(0, 0, 0)));
		panel_3_3.setBounds(136, 136, 56, 56);
		contentPane.add(panel_3_3);
		grilla[2][2]=panel_3_3;
		
		PanelSodoku panel_3_4 = new PanelSodoku(3,4);
		panel_3_4.setBorder(new MatteBorder(1, 1, 4, 1, (Color) new Color(0, 0, 0)));
		panel_3_4.setBounds(192, 136, 56, 56);
		contentPane.add(panel_3_4);
		grilla[2][3]=panel_3_4;
		
		PanelSodoku panel_3_5 = new PanelSodoku(3,5);
		panel_3_5.setBorder(new MatteBorder(1, 1, 4, 1, (Color) new Color(0, 0, 0)));
		panel_3_5.setBounds(248, 136, 56, 56);
		contentPane.add(panel_3_5);
		grilla[2][4]=panel_3_5;
		
		PanelSodoku panel_3_6 = new PanelSodoku(3,6);
		panel_3_6.setBorder(new MatteBorder(1, 1, 4, 4, (Color) new Color(0, 0, 0)));
		panel_3_6.setBounds(304, 136, 56, 56);
		contentPane.add(panel_3_6);
		grilla[2][5]=panel_3_6;
		
		PanelSodoku panel_3_7 = new PanelSodoku(3,7);
		panel_3_7.setBorder(new MatteBorder(1, 1, 4, 1, (Color) new Color(0, 0, 0)));
		panel_3_7.setBounds(360, 136, 56, 56);
		contentPane.add(panel_3_7);
		grilla[2][6]=panel_3_7;
		
		PanelSodoku panel_3_8 = new PanelSodoku(3,8);
		panel_3_8.setBorder(new MatteBorder(1, 1, 4, 1, (Color) new Color(0, 0, 0)));
		panel_3_8.setBounds(416, 136, 56, 56);
		contentPane.add(panel_3_8);
		grilla[2][7]=panel_3_8;
		
		PanelSodoku panel_3_9 = new PanelSodoku(3,9);
		panel_3_9.setBorder(new MatteBorder(1, 1, 4, 1, (Color) new Color(0, 0, 0)));
		panel_3_9.setBounds(472, 136, 56, 56);
		contentPane.add(panel_3_9);
		grilla[2][8]=panel_3_9;
		
		PanelSodoku panel_4_1 = new PanelSodoku(4,1);
		panel_4_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_4_1.setBounds(24, 192, 56, 56);
		contentPane.add(panel_4_1);
		grilla[3][0]=panel_4_1;
		
		PanelSodoku panel_4_2 = new PanelSodoku(4,2);
		panel_4_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_4_2.setBounds(80, 192, 56, 56);
		contentPane.add(panel_4_2);
		grilla[3][1]=panel_4_2;
		
		PanelSodoku panel_4_3 = new PanelSodoku(4,3);
		panel_4_3.setBorder(new MatteBorder(1, 1, 1, 4, (Color) new Color(0, 0, 0)));
		panel_4_3.setBounds(136, 192, 56, 56);
		contentPane.add(panel_4_3);
		grilla[3][2]=panel_4_3;
		
		PanelSodoku panel_4_4 = new PanelSodoku(4,4);
		panel_4_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_4_4.setBounds(192, 192, 56, 56);
		contentPane.add(panel_4_4);
		grilla[3][3]=panel_4_4;
		
		PanelSodoku panel_4_5 = new PanelSodoku(4,5);
		panel_4_5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_4_5.setBounds(248, 192, 56, 56);
		contentPane.add(panel_4_5);
		grilla[3][4]=panel_4_5;
		
		PanelSodoku panel_4_6 = new PanelSodoku(4,6);
		panel_4_6.setBorder(new MatteBorder(1, 1, 1, 4, (Color) new Color(0, 0, 0)));
		panel_4_6.setBounds(304, 192, 56, 56);
		contentPane.add(panel_4_6);
		grilla[3][5]=panel_4_6;
		
		PanelSodoku panel_4_7 = new PanelSodoku(4,7);
		panel_4_7.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_4_7.setBounds(360, 192, 56, 56);
		contentPane.add(panel_4_7);
		grilla[3][6]=panel_4_7;
		
		PanelSodoku panel_4_8 = new PanelSodoku(4,8);
		panel_4_8.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_4_8.setBounds(416, 192, 56, 56);
		contentPane.add(panel_4_8);
		grilla[3][7]=panel_4_8;
		
		PanelSodoku panel_4_9 = new PanelSodoku(4,9);
		panel_4_9.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_4_9.setBounds(472, 192, 56, 56);
		contentPane.add(panel_4_9);
		grilla[3][8]=panel_4_9;
		
		PanelSodoku panel_5_1 = new PanelSodoku(5,1);
		panel_5_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_5_1.setBounds(24, 248, 56, 56);
		contentPane.add(panel_5_1);
		grilla[4][0]=panel_5_1;
		
		PanelSodoku panel_5_2 = new PanelSodoku(5,2);
		panel_5_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_5_2.setBounds(80, 248, 56, 56);
		contentPane.add(panel_5_2);
		grilla[4][1]=panel_5_2;
		
		PanelSodoku panel_5_3 = new PanelSodoku(5,3);
		panel_5_3.setBorder(new MatteBorder(1, 1, 1, 4, (Color) new Color(0, 0, 0)));
		panel_5_3.setBounds(136, 248, 56, 56);
		contentPane.add(panel_5_3);
		grilla[4][2]=panel_5_3;
		
		PanelSodoku panel_5_4 = new PanelSodoku(5,4);
		panel_5_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_5_4.setBounds(192, 248, 56, 56);
		contentPane.add(panel_5_4);
		grilla[4][3]=panel_5_4;
		
		PanelSodoku panel_5_5 = new PanelSodoku(5,5);
		panel_5_5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_5_5.setBounds(248, 248, 56, 56);
		contentPane.add(panel_5_5);
		grilla[4][4]=panel_5_5;
		
		PanelSodoku panel_5_6 = new PanelSodoku(5,6);
		panel_5_6.setBorder(new MatteBorder(1, 1, 1, 4, (Color) new Color(0, 0, 0)));
		panel_5_6.setBounds(304, 248, 56, 56);
		contentPane.add(panel_5_6);
		grilla[4][5]=panel_5_6;
		
		PanelSodoku panel_5_7 = new PanelSodoku(5,7);
		panel_5_7.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_5_7.setBounds(360, 248, 56, 56);
		contentPane.add(panel_5_7);
		grilla[4][6]=panel_5_7;
		
		PanelSodoku panel_5_8 = new PanelSodoku(5,8);
		panel_5_8.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_5_8.setBounds(416, 248, 56, 56);
		contentPane.add(panel_5_8);
		grilla[4][7]=panel_5_8;
		
		PanelSodoku panel_5_9 = new PanelSodoku(5,9);
		panel_5_9.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_5_9.setBounds(472, 248, 56, 56);
		contentPane.add(panel_5_9);
		grilla[4][8]=panel_5_9;
		
		PanelSodoku panel_6_1 = new PanelSodoku(6,1);
		panel_6_1.setBorder(new MatteBorder(1, 1, 4, 1, (Color) new Color(0, 0, 0)));
		panel_6_1.setBounds(24, 304, 56, 56);
		contentPane.add(panel_6_1);
		grilla[5][0]=panel_6_1;
		
		PanelSodoku panel_6_2 = new PanelSodoku(6,2);
		panel_6_2.setBorder(new MatteBorder(1, 1, 4, 1, (Color) new Color(0, 0, 0)));
		panel_6_2.setBounds(80, 304, 56, 56);
		contentPane.add(panel_6_2);
		grilla[5][1]=panel_6_2;
		
		PanelSodoku panel_6_3 = new PanelSodoku(6,3);
		panel_6_3.setBorder(new MatteBorder(1, 1, 4, 4, (Color) new Color(0, 0, 0)));
		panel_6_3.setBounds(136, 304, 56, 56);
		contentPane.add(panel_6_3);
		grilla[5][2]=panel_6_3;
		
		PanelSodoku panel_6_4 = new PanelSodoku(6,4);
		panel_6_4.setBorder(new MatteBorder(1, 1, 4, 1, (Color) new Color(0, 0, 0)));
		panel_6_4.setBounds(192, 304, 56, 56);
		contentPane.add(panel_6_4);
		grilla[5][3]=panel_6_4;
		
		PanelSodoku panel_6_5 = new PanelSodoku(6,5);
		panel_6_5.setBorder(new MatteBorder(1, 1, 4, 1, (Color) new Color(0, 0, 0)));
		panel_6_5.setBounds(248, 304, 56, 56);
		contentPane.add(panel_6_5);
		grilla[5][4]=panel_6_5;
		
		PanelSodoku panel_6_6 = new PanelSodoku(6,6);
		panel_6_6.setBorder(new MatteBorder(1, 1, 4, 4, (Color) new Color(0, 0, 0)));
		panel_6_6.setBounds(304, 304, 56, 56);
		contentPane.add(panel_6_6);
		grilla[5][5]=panel_6_6;
		
		PanelSodoku panel_6_7 = new PanelSodoku(6,7);
		panel_6_7.setBorder(new MatteBorder(1, 1, 4, 1, (Color) new Color(0, 0, 0)));
		panel_6_7.setBounds(360, 304, 56, 56);
		contentPane.add(panel_6_7);
		grilla[5][6]=panel_6_7;
		
		PanelSodoku panel_6_8 = new PanelSodoku(6,8);
		panel_6_8.setBorder(new MatteBorder(1, 1, 4, 1, (Color) new Color(0, 0, 0)));
		panel_6_8.setBounds(416, 304, 56, 56);
		contentPane.add(panel_6_8);
		grilla[5][7]=panel_6_8;
		
		PanelSodoku panel_6_9 = new PanelSodoku(6,9);
		panel_6_9.setBorder(new MatteBorder(1, 1, 4, 1, (Color) new Color(0, 0, 0)));
		panel_6_9.setBounds(472, 304, 56, 56);
		contentPane.add(panel_6_9);
		grilla[5][8]=panel_6_9;
		
		PanelSodoku panel_7_1 = new PanelSodoku(7,1);
		panel_7_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_7_1.setBounds(24, 360, 56, 56);
		contentPane.add(panel_7_1);
		grilla[6][0]=panel_7_1;
		
		PanelSodoku panel_7_2 = new PanelSodoku(7,2);
		panel_7_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_7_2.setBounds(80, 360, 56, 56);
		contentPane.add(panel_7_2);
		grilla[6][1]=panel_7_2;
		
		PanelSodoku panel_7_3 = new PanelSodoku(7,3);
		panel_7_3.setBorder(new MatteBorder(1, 1, 1, 4, (Color) new Color(0, 0, 0)));
		panel_7_3.setBounds(136, 360, 56, 56);
		contentPane.add(panel_7_3);
		grilla[6][2]=panel_7_3;
		
		PanelSodoku panel_7_4 = new PanelSodoku(7,4);
		panel_7_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_7_4.setBounds(192, 360, 56, 56);
		contentPane.add(panel_7_4);
		grilla[6][3]=panel_7_4;
		
		PanelSodoku panel_7_5 = new PanelSodoku(7,5);
		panel_7_5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_7_5.setBounds(248, 360, 56, 56);
		contentPane.add(panel_7_5);
		grilla[6][4]=panel_7_5;
		
		PanelSodoku panel_7_6 = new PanelSodoku(7,6);
		panel_7_6.setBorder(new MatteBorder(1, 1, 1, 4, (Color) new Color(0, 0, 0)));
		panel_7_6.setBounds(304, 360, 56, 56);
		contentPane.add(panel_7_6);
		grilla[6][5]=panel_7_6;
		
		PanelSodoku panel_7_7 = new PanelSodoku(7,7);
		panel_7_7.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_7_7.setBounds(360, 360, 56, 56);
		contentPane.add(panel_7_7);
		grilla[6][6]=panel_7_7;
		
		PanelSodoku panel_7_8 = new PanelSodoku(7,8);
		panel_7_8.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_7_8.setBounds(416, 360, 56, 56);
		contentPane.add(panel_7_8);
		grilla[6][7]=panel_7_8;
		
		PanelSodoku panel_7_9 = new PanelSodoku(7,9);
		panel_7_9.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_7_9.setBounds(472, 360, 56, 56);
		contentPane.add(panel_7_9);
		grilla[6][8]=panel_7_9;
		
		PanelSodoku panel_8_1 = new PanelSodoku(8,1);
		panel_8_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_8_1.setBounds(24, 416, 56, 56);
		contentPane.add(panel_8_1);
		grilla[7][0]=panel_8_1;
		
		PanelSodoku panel_8_2 = new PanelSodoku(8,2);
		panel_8_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_8_2.setBounds(80, 416, 56, 56);
		contentPane.add(panel_8_2);
		grilla[7][1]=panel_8_2;
		
		PanelSodoku panel_8_3 = new PanelSodoku(8,3);
		panel_8_3.setBorder(new MatteBorder(1, 1, 1, 4, (Color) new Color(0, 0, 0)));
		panel_8_3.setBounds(136, 416, 56, 56);
		contentPane.add(panel_8_3);
		grilla[7][2]=panel_8_3;
		
		PanelSodoku panel_8_4 = new PanelSodoku(8,4);
		panel_8_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_8_4.setBounds(192, 416, 56, 56);
		contentPane.add(panel_8_4);
		grilla[7][3]=panel_8_4;
		
		PanelSodoku panel_8_5 = new PanelSodoku(8,5);
		panel_8_5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_8_5.setBounds(248, 416, 56, 56);
		contentPane.add(panel_8_5);
		grilla[7][4]=panel_8_5;
		
		PanelSodoku panel_8_6 = new PanelSodoku(8,6);
		panel_8_6.setBorder(new MatteBorder(1, 1, 1, 4, (Color) new Color(0, 0, 0)));
		panel_8_6.setBounds(304, 416, 56, 56);
		contentPane.add(panel_8_6);
		grilla[7][5]=panel_8_6;
		
		PanelSodoku panel_8_7 = new PanelSodoku(8,7);
		panel_8_7.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_8_7.setBounds(360, 416, 56, 56);
		contentPane.add(panel_8_7);
		grilla[7][6]=panel_8_7;
		
		PanelSodoku panel_8_8 = new PanelSodoku(8,8);
		panel_8_8.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_8_8.setBounds(416, 416, 56, 56);
		contentPane.add(panel_8_8);
		grilla[7][7]=panel_8_8;
		
		PanelSodoku panel_8_9 = new PanelSodoku(8,9);
		panel_8_9.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_8_9.setBounds(472, 416, 56, 56);
		contentPane.add(panel_8_9);
		grilla[7][8]=panel_8_9;
		
		PanelSodoku panel_9_1 = new PanelSodoku(9,1);
		panel_9_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_9_1.setBounds(24, 472, 56, 56);
		contentPane.add(panel_9_1);
		grilla[8][0]=panel_9_1;
		
		PanelSodoku panel_9_2 = new PanelSodoku(9,2);
		panel_9_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_9_2.setBounds(80, 472, 56, 56);
		contentPane.add(panel_9_2);
		grilla[8][1]=panel_9_2;
		
		PanelSodoku panel_9_3 = new PanelSodoku(9,3);
		panel_9_3.setBorder(new MatteBorder(1, 1, 1, 4, (Color) new Color(0, 0, 0)));
		panel_9_3.setBounds(136, 472, 56, 56);
		contentPane.add(panel_9_3);
		grilla[8][2]=panel_9_3;
		
		PanelSodoku panel_9_4 = new PanelSodoku(9,4);
		panel_9_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_9_4.setBounds(192, 472, 56, 56);
		contentPane.add(panel_9_4);
		grilla[8][3]=panel_9_4;
		
		PanelSodoku panel_9_5 = new PanelSodoku(9,5);
		panel_9_5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_9_5.setBounds(248, 472, 56, 56);
		contentPane.add(panel_9_5);
		grilla[8][4]=panel_9_5;
		
		PanelSodoku panel_9_6 = new PanelSodoku(9,6);
		panel_9_6.setBorder(new MatteBorder(1, 1, 1, 4, (Color) new Color(0, 0, 0)));
		panel_9_6.setBounds(304, 472, 56, 56);
		contentPane.add(panel_9_6);
		grilla[8][5]=panel_9_6;
		
		PanelSodoku panel_9_7 = new PanelSodoku(9,7);
		panel_9_7.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_9_7.setBounds(360, 472, 56, 56);
		contentPane.add(panel_9_7);
		grilla[8][6]=panel_9_7;
		
		PanelSodoku panel_9_8 = new PanelSodoku(9,8);
		panel_9_8.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_9_8.setBounds(416, 472, 56, 56);
		contentPane.add(panel_9_8);
		grilla[8][7]=panel_9_8;
		
		PanelSodoku panel_9_9 = new PanelSodoku(9,9);
		panel_9_9.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_9_9.setBounds(472, 472, 56, 56);
		contentPane.add(panel_9_9);
		grilla[8][8]=panel_9_9;
		
		OyenteBotonNumero oyente=new OyenteBotonNumero();
		
		BotonNumero btn1 = new BotonNumero(1);
		btn1.addActionListener(oyente);
		btn1.setBounds(606, 248, 70, 70);
		btn1.setIcon(new ImageIcon("Sprites\\numero 1.png"));
		contentPane.add(btn1);
		
		BotonNumero btn2 = new BotonNumero(2);
		btn2.addActionListener(oyente);
		btn2.setBounds(686, 248, 70, 70);
		btn2.setIcon(new ImageIcon("Sprites\\numero 2.png"));
		contentPane.add(btn2);
		
		BotonNumero btn3 = new BotonNumero(3);
		btn3.addActionListener(oyente);
		btn3.setBounds(766, 248, 70, 70);
		btn3.setIcon(new ImageIcon("Sprites\\numero 3.png"));
		contentPane.add(btn3);
		
		BotonNumero btn4 = new BotonNumero(4);
		btn4.addActionListener(oyente);
		btn4.setBounds(606, 325, 70, 70);
		btn4.setIcon(new ImageIcon("Sprites\\numero 4.png"));
		contentPane.add(btn4);
		
		BotonNumero btn5 = new BotonNumero(5);
		btn5.addActionListener(oyente);
		btn5.setBounds(686, 325, 70, 70);
		btn5.setIcon(new ImageIcon("Sprites\\numero 5.png"));
		contentPane.add(btn5);
		
		BotonNumero btn6 = new BotonNumero(6);
		btn6.addActionListener(oyente);
		btn6.setBounds(766, 325, 70, 70);
		btn6.setIcon(new ImageIcon("Sprites\\numero 6.png"));
		contentPane.add(btn6);
		
		BotonNumero btn7 = new BotonNumero(7);
		btn7.addActionListener(oyente);
		btn7.setBounds(606, 406, 70, 70);
		btn7.setIcon(new ImageIcon("Sprites\\numero 7.png"));
		contentPane.add(btn7);
		
		BotonNumero btn8 = new BotonNumero(8);
		btn8.addActionListener(oyente);
		btn8.setBounds(686, 406, 70, 70);
		btn8.setIcon(new ImageIcon("Sprites\\numero 8.png"));
		contentPane.add(btn8);
		
		BotonNumero btn9 = new BotonNumero(9);
		btn9.addActionListener(oyente);
		btn9.setBounds(766, 406, 70, 70);
		btn9.setIcon(new ImageIcon("Sprites\\numero 9.png"));
		contentPane.add(btn9);
		
		JLabel panelNumeros = new JLabel();
		panelNumeros.setBounds(584, 236, 274, 248);
		panelNumeros.setIcon(new ImageIcon("Sprites\\fondo_numeros.png"));
		contentPane.add(panelNumeros);
		
		JPanel panel_minutos_1 = new JPanel();
		panel_minutos_1.setBounds(593, 46, 56, 70);
		contentPane.add(panel_minutos_1);
		
		JPanel panel_minutos_2 = new JPanel();
		panel_minutos_2.setBounds(648, 46, 56, 70);
		contentPane.add(panel_minutos_2);
		
		JPanel panel_segundos_1 = new JPanel();
		panel_segundos_1.setBounds(727, 46, 56, 70);
		contentPane.add(panel_segundos_1);
		
		JPanel panel_segundos_2 = new JPanel();
		panel_segundos_2.setBounds(782, 46, 56, 70);
		contentPane.add(panel_segundos_2);
		
		JLabel label = new JLabel(":");
		label.setFont(new Font("Tahoma", Font.PLAIN, 26));
		label.setBounds(714, 64, 14, 39);
		contentPane.add(label);
		
		borrar = new JLabel("");
		borrar.setBounds(672, 156, 98, 47);
		contentPane.add(borrar);
		
	}
	
	class OyenteBotonNumero implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			BotonNumero aux = (BotonNumero) e.getSource();
			numeroActual=aux.getNumero();
		}
	}
	
	private int traducirX(int x) {
		int aux=0;
		
		if(x<86) {
			aux=1;
		}else if(x<142) {
			aux=2;
		}else if(x<198) {
			aux=3;
		}else if(x<254) {
			aux=4;
		}else if(x<310) {
			aux=5;
		}else if(x<366) {
			aux=6;
		}else if(x<422) {
			aux=7;
		}else if(x<478) {
			aux=8;
		}else if(x<535)
			aux=9;
		
		return aux;
	}
	
	private int traducirY(int y) {
		int aux=0;
		
		if(y<110) {
			aux=1;
		}else if(y<166) {
			aux=2;
		}else if(y<222) {
			aux=3;
		}else if(y<278) {
			aux=4;
		}else if(y<334) {
			aux=5;
		}else if(y<390) {
			aux=6;
		}else if(y<446) {
			aux=7;
		}else if(y<502) {
			aux=8;
		}else if(y<560)
			aux=9;
		
		return aux;
	}
	
	private void actualizarPanel(PanelSodoku panel,int numero) {
		switch (numero) {
		case 1:
			panel.setIcon(new ImageIcon("Sprites\\numero_grilla_1.png"));
			break;
		case 2:
			panel.setIcon(new ImageIcon("Sprites\\numero_grilla_2.png"));
			break;
		case 3:
			panel.setIcon(new ImageIcon("Sprites\\numero_grilla_3.png"));
			break;
		case 4:
			panel.setIcon(new ImageIcon("Sprites\\numero_grilla_4.png"));
			break;
		case 5:
			panel.setIcon(new ImageIcon("Sprites\\numero_grilla_5.png"));
			break;
		case 6:
			panel.setIcon(new ImageIcon("Sprites\\numero_grilla_6.png"));
			break;
		case 7:
			panel.setIcon(new ImageIcon("Sprites\\numero_grilla_7.png"));
			break;
		case 8:
			panel.setIcon(new ImageIcon("Sprites\\numero_grilla_8.png"));
			break;
		case 9:
			panel.setIcon(new ImageIcon("Sprites\\numero_grilla_9.png"));
			break;
		}
	}
	
	MouseListener click=new MouseListener() {
		@Override
		public void mousePressed(MouseEvent evento) {
			//Clickea en un lugar de la cuadrilla
			if(evento.getX()<535 && evento.getX()>30 && evento.getY()<560 && evento.getY()>55) {
				int xTraducido=traducirX(evento.getX());
				int yTraducido=traducirY(evento.getY());
				actualizarPanel(grilla[yTraducido-1][xTraducido-1],numeroActual);			
			}
			
		}
		@Override
		public void mouseReleased(MouseEvent evento) {
	
		}
		@Override
		public void mouseEntered(MouseEvent evento) {

		}
		@Override
		public void mouseExited(MouseEvent evento) {

		}
		@Override
		public void mouseClicked(MouseEvent evento) {
			
		}
	};
}