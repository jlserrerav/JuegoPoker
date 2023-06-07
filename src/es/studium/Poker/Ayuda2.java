package es.studium.Poker;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Ayuda2 extends Frame {

	private static final long serialVersionUID = 1L;
	Image imagen;
	Image Atras;
	Toolkit herramienta;

	Ayuda2()
	{
		setTitle("Ayuda");
		setResizable(false);
		setLocationRelativeTo(null);
		setSize(380,380);
		setVisible(true);
		herramienta = getToolkit();
		imagen = herramienta.getImage("img//fondoAyuda2 .jpg");
		Atras = herramienta.getImage("img//Atras.png");
	}

	public void paint(Graphics g)
	{

		g.drawImage(imagen, 4, 23,this);
		Color color = new Color (229, 74, 53);
		g.setColor(color);
		Font font = new Font("Righteous", Font.BOLD, 22);
		g.setFont(font);
		g.drawString("-Cómo funciona la puntación:", 30, 55);
		Font font1 = new Font("Righteous", Font.BOLD, 16);
		g.setFont(font1);
		g.drawString("*Carta alta: 10 ptos", 30, 75);
		g.drawString("*Pareja: 20 ptos", 30, 100);
		g.drawString("*Doble pareja: 30 ptos", 30, 125);
		g.drawString("*Trío: 40 ptos", 30, 150);
		g.drawString("*Full house: 50 ptos", 30, 175);
		g.drawString("*Color: 60 ptos", 30, 200);
		g.drawString("*Póker: 70 ptos", 30, 225);
		g.drawString("*Escalera de color: 80 ptos", 30, 250);
		g.drawString("*Escalera real de color: 90 ptos", 30, 275);
		
		g.drawImage(Atras, 30, 315, this);

	}

}