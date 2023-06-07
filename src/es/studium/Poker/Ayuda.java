package es.studium.Poker;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Ayuda  extends Frame {

	private static final long serialVersionUID = 1L;
	Image imagen;
	Image siguiente;
	Image Atras;
	Toolkit herramienta;
	Ayuda()
	{
		setTitle("Ayuda");
		setResizable(false);
		setLocationRelativeTo(null);
		setSize(900,500);
		setVisible(true);
		herramienta = getToolkit();
		imagen = herramienta.getImage("img//fondoJugar.jpg");
		siguiente = herramienta.getImage("img//Siguiente.png");
		Atras = herramienta.getImage("img//atras.png");

	}

	public void paint(Graphics g)
	{
		g.drawImage(imagen, 4, 23,this);
		Color color = new Color (229, 74, 53);
		g.setColor(color);
		Font font = new Font("Righteous", Font.BOLD, 24);
		g.setFont(font);
		g.drawString("-Como Jugar:", 30, 55);
		Font font1 = new Font("Righteous", Font.BOLD, 14);
		g.setFont(font1);
		g.drawString("El juego comienza, se jugara entre cuatro(MÁX) jugadores a cada uno se le reparte dos cartas aleatorias,", 30, 75);
		g.drawString("el jugador al ver sus dos cartas decide si quiere ir o no, apostando, en forma de simulacion sin apostar dinero real,", 30, 90);
		g.drawString("Si hay un jugador que incrementa la apuesta, todos los demás deberán igualarla o retirarse de la partida,", 30, 105);
		g.drawString("tras esto roban una carta cada uno(aleatoria) y vulven a hacer el mismo proceso de antes, las ven y decinde si ir o no,", 30, 120);
		g.drawString("todos igualando la apuesta mayor sino van se retiran y perderan las fichas apostadas.", 30, 135);

		Font font3 = new Font("Righteous", Font.BOLD, 24);
		g.setFont(font3);
		g.drawString("-Puntuajes:", 30, 185);
		Font font4 = new Font("Righteous", Font.BOLD, 14);
		g.setFont(font4);
		g.drawString(" *Carta alta: en caso de empate, la carta más alta gana.", 30, 200);
		g.drawString(" *Pareja: dos cartas del mismo valor y tres de valores diferentes (en caso de empate, la pareja más alta gana)", 30, 215);
		g.drawString(" *Doble pareja: dos cartas del mismo valor combinadas con otras dos cartas del mismo valor y una quinta diferente.", 30, 230);
		g.drawString(" *Trío: tres cartas del mismo valor y dos de un valor diferente ", 30, 245);
		g.drawString(" *Full house: tres cartas del mismo valor y una pareja.", 30, 260);
		g.drawString(" *Color: cinco cartas del mismo palo.", 30, 275);
		g.drawString(" *Póker: cuatro cartas iguales y una diferente.", 30, 290);
		g.drawString(" *Escalera de color: cinco cartas consecutivas del mismo palo (si hay empate, se reparten las ganancias).", 30, 305);
		g.drawString(" *Escalera real de color: tener un as, una reina, un rey, una jota y un diez del mismo palo.", 30, 320);

		g.drawImage(siguiente, 740, 425, this);
		g.drawImage(Atras, 40, 425, this);
		Color color2 = new Color(229, 74, 53);

		g.setColor(color2);

		g.drawRect(40, 425, 126, 50);

		Color color3 = new Color(229, 74, 53);

		g.setColor(color3);

		g.drawRect(740, 425, 126, 50);
		

	}
}