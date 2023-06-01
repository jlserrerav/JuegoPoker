package es.studium.Poker;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Toolkit;

public class Juego extends Frame {

		private static final long serialVersionUID = 1L;
		Image imagen;
		Image Atras;
		TextField txtFichas = new TextField();
		TextField txtSubir = new TextField();
		Toolkit herramienta;
		Juego()
		{
			setTitle("Juego");
			add(txtFichas);
			add(txtSubir);
			txtFichas.setBounds(100, 690, 150, 25);
			txtSubir.setBounds(400, 230, 150, 25);
			txtFichas.setEditable(false);
			txtFichas.setEnabled(false);
			setLayout(null);
			setResizable(false);
			setLocationRelativeTo(null);
			setSize(1280,750);
			setVisible(true);
			herramienta = getToolkit();
			imagen = herramienta.getImage("img//TableroJuego.png");
			
			

		}

		public void paint(Graphics g)
		{
			g.drawImage(imagen, 4, 23,this);
			Color color = new Color (229, 74, 53);
			g.setColor(color);
			Color color2 = new Color(229, 74, 53);
			g.setColor(color2);
			//Izquierda
			g.drawRect(40, 275, 165, 100);
			g.drawRect(40, 425, 165, 100);
			//Derecha
			g.drawRect(1070, 275, 165, 100);
			g.drawRect(1070, 425, 165, 100);
			//Arriba
			g.drawRect(520, 60, 100, 165);
			g.drawRect(670, 60, 100, 165);
			//Abajo
			g.drawRect(520, 550, 100, 165);
			g.drawRect(670, 550, 100, 165);
			//Boton IR
			g.drawRect(900, 675, 35, 35);
			//Boton NO IR
			g.drawRect(1110, 675, 35, 35);
			
			//Texto
			Font font = new Font("Righteous", Font.BOLD, 24);
			g.setFont(font);
			g.drawString("Tus Fichas:", 75, 670);
			g.drawString("Subir Fichas", 825, 630);
			g.drawString("Ir", 850, 700);
			g.drawString("No ir", 1040, 700);
			
		}

}