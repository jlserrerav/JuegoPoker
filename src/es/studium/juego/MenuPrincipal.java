package es.studium.juego;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class MenuPrincipal extends Frame
{
	private static final long serialVersionUID = 1L;
	Button btnJugar = new Button ("Jugar");
	Button btnAyuda = new Button ("Ayuda");
	Button btnRanking = new Button ("Ranking");
	Button btnSalir = new Button ("Salir");
	Image Fondo;
	Image Jugar;
	Image Ayuda;
	Image Ranking;
	Image Salir;
	Toolkit herramienta;
	
	MenuPrincipal()
	{
		setSize(1080,750);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		herramienta = getToolkit();
		Fondo = herramienta.getImage("img//Fondo.jpg");
		Jugar = herramienta.getImage("img//Jugar.png");
		Ayuda = herramienta.getImage("img//Ayuda2.png");
		Ranking = herramienta.getImage("img//Ranking.png");
		Salir = herramienta.getImage("img//Salir.png");
		
		setVisible(true);
	}
	public void paint(Graphics g)
	{
		g.drawImage(Fondo,4,23,this);
		g.drawImage(Jugar,80,150,this);
		g.drawImage(Ayuda,80,250,this);
		g.drawImage(Ranking,80,350,this);
		g.drawImage(Salir,80,450,this);
		Color colorr = new Color(229, 74, 53);
		g.setColor(colorr);
		Font font = new Font("Righteous", Font.BOLD, 54);
		g.setFont(font);
		g.drawString("POKER STUDIUM", 45, 90);

		Color color = new Color(229, 74, 53);
		g.setColor(color);
		g.drawRect(80, 150, 126, 50);
		Color color2 = new Color(229, 74, 53);
		g.setColor(color2);
		g.drawRect(80, 250, 126, 50);
		Color color3 = new Color(229, 74, 53);
		g.setColor(color3);
		g.drawRect(80, 350, 128, 52);
		Color color4 = new Color(229, 74, 53);
		g.setColor(color4);
		g.drawRect(80, 450, 127, 50);
	}
}
