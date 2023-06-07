package es.studium.Poker;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Tablero  extends Frame
{
	private static final long serialVersionUID = 1L;
	Choice choLista = new Choice();
	Image Fondo;
	Image Atras;
	Image Siguiente;
	Toolkit herramienta;
	Tablero()
	{
		choLista.add("Selecciona el número de Jugadores");
		choLista.add("1");
		choLista.add("2");
		choLista.add("3");
		choLista.add("4");
		add(choLista);
		choLista.setBounds(275, 225, 350, 150);
		setLayout(null);
		setTitle("Nº Jugadores");
		setResizable(false);
		setLocationRelativeTo(null);
		setSize(900,500);
		setVisible(true);
		herramienta = getToolkit();
		Fondo = herramienta.getImage("img//fondoJugar.jpg");
		Siguiente = herramienta.getImage("img//Siguiente.png");
		Atras = herramienta.getImage("img//atras.png");
	}

	public void paint(Graphics g)
	{
		g.drawImage(Fondo, 4, 23,this);
		g.drawImage(Siguiente, 740, 425, this);
		g.drawImage(Atras, 40, 425, this);
		Color color2 = new Color(229, 74, 53);
		g.setColor(color2);
		g.drawRect(40, 425, 126, 50);
		Color color3 = new Color(229, 74, 53);
		g.setColor(color3);

		g.drawRect(740, 425, 126, 50);
		Color colorr = new Color(229, 74, 53);
		g.setColor(colorr);
		Font font = new Font("Righteous", Font.BOLD, 30);
		g.setFont(font);
		g.drawString("POKER STUDIUM", 35, 65);
	}

}