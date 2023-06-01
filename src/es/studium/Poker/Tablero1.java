package es.studium.Poker;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.TextField;
import java.awt.Toolkit;

public class Tablero1 extends Frame {

	private static final long serialVersionUID = 1L;
	Image Fondo;
	Image Atras;
	Image Siguiente;
	Toolkit herramienta;
	TextField txtJ1 = new TextField();
	TextField txtJ2 = new TextField();
	TextField txtJ3 = new TextField();
	TextField txtJ4 = new TextField();
	Tablero1()
	{
		add(txtJ1);
		add(txtJ2);
		add(txtJ3);
		add(txtJ4);
		txtJ1.setBounds(400, 180, 150, 25);
		txtJ2.setBounds(400, 230, 150, 25);
		txtJ3.setBounds(400, 280, 150, 25);
		txtJ4.setBounds(400, 330, 150, 25);
		setTitle("Elección de nombres");
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		setSize(900,500);
		setVisible(true);
		herramienta = getToolkit();
		Fondo = herramienta.getImage("img//fondoJugar.jpg");
		Atras = herramienta.getImage("img//atras.png");
		Siguiente = herramienta.getImage("img//siguiente.png");

	}

	public void paint(Graphics g)
	{
		g.drawImage(Fondo, 4, 23,this);
		g.drawImage(Atras, 40, 425, this);
		g.drawImage(Siguiente, 740, 425, this);
		Color color2 = new Color(229, 74, 53);
		g.setColor(color2);
		g.drawRect(40, 425, 126, 50);
		Color color3 = new Color(229, 74, 53);
		g.setColor(color3);
		g.drawRect(740, 425, 126, 50);
		Color colorr = new Color(229, 74, 53);
		g.setColor(colorr);
		Font font = new Font("Righteous", Font.BOLD, 54);
		g.setFont(font);
		g.drawString("POKER STUDIUM", 45, 90);
		Font font1 = new Font("Righteous", Font.ITALIC, 20);
		g.setFont(font1);
		g.drawString("Jugador 1", 250, 200);
		g.drawString("Jugador 2", 250, 250);
		g.drawString("Jugador 3", 250, 300);
		g.drawString("Jugador 4", 250, 350);


	}
}
