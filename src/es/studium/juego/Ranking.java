package es.studium.juego;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Ranking extends Frame {

	private static final long serialVersionUID = 1L;
	Image Fondo;
	Image Atras;
	Toolkit herramienta;
	Ranking()
	{
		setTitle("Ranking");
		setResizable(false);
		setLocationRelativeTo(null);
		setSize(900,400);
		setVisible(true);
		herramienta = getToolkit();
		Fondo = herramienta.getImage("img//fondoAyuda2.jpg");
		Atras = herramienta.getImage("img//atras.png");

	}

	public void paint(Graphics g)
	{
		g.drawImage(Fondo, 4, 23,this);
		g.drawImage(Atras, 40, 325, this);
		Color color = new Color (229, 74, 53);
		g.setColor(color);
		Font font = new Font("Righteous", Font.BOLD, 54);
		g.setFont(font);
		g.drawString("RANKING", 30, 55);
		Color color2 = new Color(229, 74, 53);
		g.setColor(color2);
		g.drawRect(40, 325, 126, 50);


	}
}