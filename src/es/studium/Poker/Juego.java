package es.studium.Poker;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
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
	Image Ir;
	Image J1;
	Image J2;
	TextField txtFichas = new TextField();
	TextField txtSubir = new TextField();
	Image tapete, reverso;
	// A --> Diamantes
	// B --> Corazones
	// C --> Tréboles
	// D --> Picas
	Image A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13;
	Image B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13;
	Image C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13;
	Image D1, D2, D3, D4, D5, D6, D7, D8, D9, D10, D11, D12, D13;
	int J1Mostrar = 0;
	int J2Mostrar=0;
	int imagenJugador1 = 0;
	int imagenJugador2 = 0;
	int imagenJugador3 = 0;
	int imagenJugador5 = 0;
	int imagenAmostrar1 = 0;
	int imagenAmostrar2 = 0;
	int imagenAmostrar3 = 0;
	int imagenAmostrar4 = 0;
	int imagenAmostrar5 = 0;
	int imagenAmostrar6 = 0;
	int imagenAmostrar7 = 0;
	int imagenAmostrar8 = 0;
	int imagenAmostrar9 = 0;

	int puntosJugador1 = 0;
	int puntosJugador2 = 0;

	Dialog dlgMensajeFinPartida = new Dialog(this, "Fin", true);
	Label lblMensajeFinPartida = new Label("Gana Jugador 1");

	Dialog dlgMensajeRonda = new Dialog(this, "Resultado Ronda", true);
	Label lblMensajeRonda = new Label("Jugador 1 gana esta ronda!");
	Toolkit herramienta;
	Juego()
	{
		herramienta = getToolkit();
		imagen = herramienta.getImage("img/TableroJuego.png");
		reverso = herramienta.getImage("img/reverso.png");
		Ir = herramienta.getImage("img/Ir.png");
		J1 = herramienta.getImage("img/J1.png");
		J2 = herramienta.getImage("img/J2.png");
		cargarCartas();
		setTitle("Juego");
		add(txtFichas);
		add(txtSubir);
		txtFichas.setBounds(230, 830, 150, 25);
		txtSubir.setBounds(240, 880, 150, 25);
		txtFichas.setEditable(false);
		txtFichas.setEnabled(false);
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		setSize(1729,1000);


		dlgMensajeFinPartida.setLayout(new FlowLayout());
		dlgMensajeFinPartida.setSize(100,100);
		dlgMensajeFinPartida.setLocationRelativeTo(null);
		dlgMensajeFinPartida.setResizable(false);
		dlgMensajeFinPartida.add(lblMensajeFinPartida);

		dlgMensajeRonda.setLayout(new FlowLayout());
		dlgMensajeRonda.setSize(200,100);
		dlgMensajeRonda.setLocationRelativeTo(null);
		dlgMensajeRonda.setResizable(false);
		dlgMensajeRonda.add(lblMensajeRonda);


	}

	public void paint(Graphics g)
	{
		g.drawImage(imagen, 4, 23,this);
		Color color = new Color (229, 74, 53);
		g.setColor(color);
		Color color2 = new Color(229, 74, 53);
		g.setColor(color2);
		//Boton IR
		g.drawRect(1075, 825, 35, 35);
		//Boton NO IR
		g.drawRect(1310, 825, 35, 35);

		//Texto

		Font font = new Font("Righteous", Font.BOLD, 24);

		g.setFont(font);
		g.drawString("Tus Fichas:", 80, 850);
		g.drawString("Subir Fichas:", 80, 900);
		g.drawString("Ir", 1040, 850);
		g.drawString("No ir", 1240, 850);

		g.drawImage(reverso, 320, 80, this);

		switch(J1Mostrar)
		{
		case 1:
			g.drawImage(J1, 520, 55, this);
		}
		switch(J2Mostrar)
		{
		case 1:
			g.drawImage(J2, 520, 55, this);
		}
		switch(imagenAmostrar1)

		{

		case 1:

			g.drawImage(A1, 1125, 425, this);

			break;

		case 2:

			g.drawImage(A2, 1125, 425, this);

			break;

		case 3:

			g.drawImage(A3, 1125, 425, this);

			break;

		case 4:

			g.drawImage(A4, 1125, 425, this);

			break;

		case 5:

			g.drawImage(A5, 1125, 425, this);

			break;

		case 6:

			g.drawImage(A6, 1125, 425, this);

			break;

		case 7:

			g.drawImage(A7, 1125, 425, this);

			break;

		case 8:

			g.drawImage(A8, 1125, 425, this);

			break;

		case 9:

			g.drawImage(A9, 1125, 425, this);

			break;

		case 10:

			g.drawImage(A10, 1125, 425, this);

			break;

		case 11:

			g.drawImage(A11, 1125, 425, this);

			break;

		case 12:

			g.drawImage(A12, 1125, 425, this);

			break;

		case 13:

			g.drawImage(A13, 1125, 425, this);

			break;

		case 14:

			g.drawImage(B1, 1125, 425, this);

			break;

		case 15:

			g.drawImage(B2, 1125, 425, this);

			break;

		case 16:

			g.drawImage(B3, 1125, 425, this);

			break;

		case 17:

			g.drawImage(B4, 1125, 425, this);

			break;

		case 18:

			g.drawImage(B5, 1125, 425, this);

			break;

		case 19:

			g.drawImage(B6, 1125, 425, this);

			break;

		case 20:

			g.drawImage(B7, 1125, 425, this);

			break;

		case 21:

			g.drawImage(B8, 1125, 425, this);

			break;

		case 22:

			g.drawImage(B9, 1125, 425, this);

			break;

		case 23:

			g.drawImage(B10, 1125, 425, this);

			break;

		case 24:

			g.drawImage(B11, 1125, 425, this);

			break;

		case 25:

			g.drawImage(B12, 1125, 425, this);

			break;

		case 26:

			g.drawImage(B13, 1125, 425, this);

			break;

		case 27:

			g.drawImage(C1, 1125, 425, this);

			break;

		case 28:

			g.drawImage(C2, 1125, 425, this);

			break;

		case 29:

			g.drawImage(C3, 1125, 425, this);

			break;

		case 30:

			g.drawImage(C4, 1125, 425, this);

			break;

		case 31:

			g.drawImage(C5, 1125, 425, this);

			break;

		case 32:

			g.drawImage(C6, 1125, 425, this);

			break;

		case 33:

			g.drawImage(C7, 1125, 425, this);

			break;

		case 34:

			g.drawImage(C8, 1125, 425, this);

			break;

		case 35:

			g.drawImage(C9, 1125, 425, this);

			break;

		case 36:

			g.drawImage(C10, 1125, 425, this);

			break;

		case 37:

			g.drawImage(C11, 1125, 425, this);

			break;

		case 38:

			g.drawImage(C12, 1125, 425, this);

			break;

		case 39:

			g.drawImage(C13, 1125, 425, this);

			break;

		case 40:

			g.drawImage(D1, 1125, 425, this);

			break;

		case 41:

			g.drawImage(D2, 1125, 425, this);

			break;

		case 42:

			g.drawImage(D3, 1125, 425, this);

			break;

		case 43:

			g.drawImage(D4, 1125, 425, this);

			break;

		case 44:

			g.drawImage(D5, 1125, 425, this);

			break;

		case 45:

			g.drawImage(D6, 1125, 425, this);

			break;

		case 46:

			g.drawImage(D7, 1125, 425, this);

			break;

		case 47:

			g.drawImage(D8, 1125, 425, this);

			break;

		case 48:

			g.drawImage(D9, 1125, 425, this);

			break;

		case 49:

			g.drawImage(D10, 1125, 425, this);

			break;

		case 50:

			g.drawImage(D11, 1125, 425, this);

			break;

		case 51:

			g.drawImage(D12, 1125, 425, this);

			break;

		case 52:

			g.drawImage(D13, 1125, 425, this);

			break;

		}

		switch(imagenAmostrar2)

		{

		case 1:

			g.drawImage(A1, 975, 425, this);

			break;

		case 2:

			g.drawImage(A2, 975, 425, this);

			break;

		case 3:

			g.drawImage(A3, 975, 425, this);

			break;

		case 4:

			g.drawImage(A4, 975, 425, this);

			break;

		case 5:

			g.drawImage(A5, 975, 425, this);

			break;

		case 6:

			g.drawImage(A6, 975, 425, this);

			break;

		case 7:

			g.drawImage(A7, 975, 425, this);

			break;

		case 8:

			g.drawImage(A8, 975, 425, this);

			break;

		case 9:

			g.drawImage(A9, 975, 425, this);

			break;

		case 10:

			g.drawImage(A10, 975, 425, this);

			break;

		case 11:

			g.drawImage(A11, 975, 425, this);

			break;

		case 12:

			g.drawImage(A12, 975, 425, this);

			break;

		case 13:

			g.drawImage(A13, 975, 425, this);

			break;

		case 14:

			g.drawImage(B1, 975, 425, this);

			break;

		case 15:

			g.drawImage(B2, 975, 425, this);

			break;

		case 16:

			g.drawImage(B3, 975, 425, this);

			break;

		case 17:

			g.drawImage(B4, 975, 425, this);

			break;

		case 18:

			g.drawImage(B5, 975, 425, this);

			break;

		case 19:

			g.drawImage(B6, 975, 425, this);

			break;

		case 20:

			g.drawImage(B7, 975, 425, this);

			break;

		case 21:

			g.drawImage(B8, 975, 425, this);

			break;

		case 22:

			g.drawImage(B9, 975, 425, this);

			break;

		case 23:

			g.drawImage(B10, 975, 425, this);

			break;

		case 24:

			g.drawImage(B11, 975, 425, this);

			break;

		case 25:

			g.drawImage(B12, 975, 425, this);

			break;

		case 26:

			g.drawImage(B13, 975, 425, this);

			break;

		case 27:

			g.drawImage(C1, 975, 425, this);

			break;

		case 28:

			g.drawImage(C2, 975, 425, this);

			break;

		case 29:

			g.drawImage(C3, 975, 425, this);

			break;

		case 30:

			g.drawImage(C4, 975, 425, this);

			break;

		case 31:

			g.drawImage(C5, 975, 425, this);

			break;

		case 32:

			g.drawImage(C6, 975, 425, this);

			break;

		case 33:

			g.drawImage(C7, 975, 425, this);

			break;

		case 34:

			g.drawImage(C8, 975, 425, this);

			break;

		case 35:

			g.drawImage(C9, 975, 425, this);

			break;

		case 36:

			g.drawImage(C10, 975, 425, this);

			break;

		case 37:

			g.drawImage(C11, 975, 425, this);

			break;

		case 38:

			g.drawImage(C12, 975, 425, this);

			break;

		case 39:

			g.drawImage(C13, 975, 425, this);

			break;

		case 40:

			g.drawImage(D1, 975, 425, this);

			break;

		case 41:

			g.drawImage(D2, 975, 425, this);

			break;

		case 42:

			g.drawImage(D3, 975, 425, this);

			break;

		case 43:

			g.drawImage(D4, 975, 425, this);

			break;

		case 44:

			g.drawImage(D5, 975, 425, this);

			break;

		case 45:

			g.drawImage(D6, 975, 425, this);

			break;

		case 46:

			g.drawImage(D7, 975, 425, this);

			break;

		case 47:

			g.drawImage(D8, 975, 425, this);

			break;

		case 48:

			g.drawImage(D9, 975, 425, this);

			break;

		case 49:

			g.drawImage(D10, 975, 425, this);

			break;

		case 50:

			g.drawImage(D11, 975, 425, this);

			break;

		case 51:

			g.drawImage(D12, 975, 425, this);

			break;

		case 52:

			g.drawImage(D13, 975, 425, this);

			break;

		}

		switch(imagenAmostrar3)

		{

		case 1:

			g.drawImage(A1, 825, 425, this);

			break;

		case 2:

			g.drawImage(A2, 825, 425, this);

			break;

		case 3:

			g.drawImage(A3, 825, 425, this);

			break;

		case 4:

			g.drawImage(A4, 825, 425, this);

			break;

		case 5:

			g.drawImage(A5, 825, 425, this);

			break;

		case 6:

			g.drawImage(A6, 825, 425, this);

			break;

		case 7:

			g.drawImage(A7, 825, 425, this);

			break;

		case 8:

			g.drawImage(A8, 825, 425, this);

			break;

		case 9:

			g.drawImage(A9, 825, 425, this);

			break;

		case 10:

			g.drawImage(A10, 825, 425, this);

			break;

		case 11:

			g.drawImage(A11, 825, 425, this);

			break;

		case 12:

			g.drawImage(A12, 825, 425, this);

			break;

		case 13:

			g.drawImage(A13, 825, 425, this);

			break;

		case 14:

			g.drawImage(B1, 825, 425, this);

			break;

		case 15:

			g.drawImage(B2, 825, 425, this);

			break;

		case 16:

			g.drawImage(B3, 825, 425, this);

			break;

		case 17:

			g.drawImage(B4, 825, 425, this);

			break;

		case 18:

			g.drawImage(B5, 825, 425, this);

			break;

		case 19:

			g.drawImage(B6, 825, 425, this);

			break;

		case 20:

			g.drawImage(B7, 825, 425, this);

			break;

		case 21:

			g.drawImage(B8, 825, 425, this);

			break;

		case 22:

			g.drawImage(B9, 825, 425, this);

			break;

		case 23:

			g.drawImage(B10, 825, 425, this);

			break;

		case 24:

			g.drawImage(B11, 825, 425, this);

			break;

		case 25:

			g.drawImage(B12, 825, 425, this);

			break;

		case 26:

			g.drawImage(B13, 825, 425, this);

			break;

		case 27:

			g.drawImage(C1, 825, 425, this);

			break;

		case 28:

			g.drawImage(C2, 825, 425, this);

			break;

		case 29:

			g.drawImage(C3, 825, 425, this);

			break;

		case 30:

			g.drawImage(C4, 825, 425, this);

			break;

		case 31:

			g.drawImage(C5, 825, 425, this);

			break;

		case 32:

			g.drawImage(C6, 825, 425, this);

			break;

		case 33:

			g.drawImage(C7, 825, 425, this);

			break;

		case 34:

			g.drawImage(C8, 825, 425, this);

			break;

		case 35:

			g.drawImage(C9, 825, 425, this);

			break;

		case 36:

			g.drawImage(C10, 825, 425, this);

			break;

		case 37:

			g.drawImage(C11, 825, 425, this);

			break;

		case 38:

			g.drawImage(C12, 825, 425, this);

			break;

		case 39:

			g.drawImage(C13, 825, 425, this);

			break;

		case 40:

			g.drawImage(D1, 825, 425, this);

			break;

		case 41:

			g.drawImage(D2, 825, 425, this);

			break;

		case 42:

			g.drawImage(D3, 825, 425, this);

			break;

		case 43:

			g.drawImage(D4, 825, 425, this);

			break;

		case 44:

			g.drawImage(D5, 825, 425, this);

			break;

		case 45:

			g.drawImage(D6, 825, 425, this);

			break;

		case 46:

			g.drawImage(D7, 825, 425, this);

			break;

		case 47:

			g.drawImage(D8, 825, 425, this);

			break;

		case 48:

			g.drawImage(D9, 825, 425, this);

			break;

		case 49:

			g.drawImage(D10, 825, 425, this);

			break;

		case 50:

			g.drawImage(D11, 825, 425, this);

			break;

		case 51:

			g.drawImage(D12, 825, 425, this);

			break;

		case 52:

			g.drawImage(D13, 825, 425, this);

			break;

		}

		switch(imagenAmostrar4)

		{

		case 1:

			g.drawImage(A1, 675, 425, this);

			break;

		case 2:

			g.drawImage(A2, 675, 425, this);

			break;

		case 3:

			g.drawImage(A3, 675, 425, this);

			break;

		case 4:

			g.drawImage(A4, 675, 425, this);

			break;

		case 5:

			g.drawImage(A5, 675, 425, this);

			break;

		case 6:

			g.drawImage(A6, 675, 425, this);

			break;

		case 7:

			g.drawImage(A7, 675, 425, this);

			break;

		case 8:

			g.drawImage(A8, 675, 425, this);

			break;

		case 9:

			g.drawImage(A9, 675, 425, this);

			break;

		case 10:

			g.drawImage(A10, 675, 425, this);

			break;

		case 11:

			g.drawImage(A11, 675, 425, this);

			break;

		case 12:

			g.drawImage(A12, 675, 425, this);

			break;

		case 13:

			g.drawImage(A13, 675, 425, this);

			break;

		case 14:

			g.drawImage(B1, 675, 425, this);

			break;

		case 15:

			g.drawImage(B2, 675, 425, this);

			break;

		case 16:

			g.drawImage(B3, 675, 425, this);

			break;

		case 17:

			g.drawImage(B4, 675, 425, this);

			break;

		case 18:

			g.drawImage(B5, 675, 425, this);

			break;

		case 19:

			g.drawImage(B6, 675, 425, this);

			break;

		case 20:

			g.drawImage(B7, 675, 425, this);

			break;

		case 21:

			g.drawImage(B8, 675, 425, this);

			break;

		case 22:

			g.drawImage(B9, 675, 425, this);

			break;

		case 23:

			g.drawImage(B10, 675, 425, this);

			break;

		case 24:

			g.drawImage(B11, 675, 425, this);

			break;

		case 25:

			g.drawImage(B12, 675, 425, this);

			break;

		case 26:

			g.drawImage(B13, 675, 425, this);

			break;

		case 27:

			g.drawImage(C1, 675, 425, this);

			break;

		case 28:

			g.drawImage(C2, 675, 425, this);

			break;

		case 29:

			g.drawImage(C3, 675, 425, this);

			break;

		case 30:

			g.drawImage(C4, 675, 425, this);

			break;

		case 31:

			g.drawImage(C5, 675, 425, this);

			break;

		case 32:

			g.drawImage(C6, 675, 425, this);

			break;

		case 33:

			g.drawImage(C7, 675, 425, this);

			break;

		case 34:

			g.drawImage(C8, 675, 425, this);

			break;

		case 35:

			g.drawImage(C9, 675, 425, this);

			break;

		case 36:

			g.drawImage(C10, 675, 425, this);

			break;

		case 37:

			g.drawImage(C11, 675, 425, this);

			break;

		case 38:

			g.drawImage(C12, 675, 425, this);

			break;

		case 39:

			g.drawImage(C13, 675, 425, this);

			break;

		case 40:

			g.drawImage(D1, 675, 425, this);

			break;

		case 41:

			g.drawImage(D2, 675, 425, this);

			break;

		case 42:

			g.drawImage(D3, 675, 425, this);

			break;

		case 43:

			g.drawImage(D4, 675, 425, this);

			break;

		case 44:

			g.drawImage(D5, 675, 425, this);

			break;

		case 45:

			g.drawImage(D6, 675, 425, this);

			break;

		case 46:

			g.drawImage(D7, 675, 425, this);

			break;

		case 47:

			g.drawImage(D8, 675, 425, this);

			break;

		case 48:

			g.drawImage(D9, 675, 425, this);

			break;

		case 49:

			g.drawImage(D10, 675, 425, this);

			break;

		case 50:

			g.drawImage(D11, 675, 425, this);

			break;

		case 51:

			g.drawImage(D12, 675, 425, this);

			break;

		case 52:

			g.drawImage(D13, 675, 425, this);

			break;

		}

		switch(imagenAmostrar5)

		{

		case 1:

			g.drawImage(A1, 525, 425, this);

			break;

		case 2:

			g.drawImage(A2, 525, 425, this);

			break;

		case 3:

			g.drawImage(A3, 525, 425, this);

			break;

		case 4:

			g.drawImage(A4, 525, 425, this);

			break;

		case 5:

			g.drawImage(A5, 525, 425, this);

			break;

		case 6:

			g.drawImage(A6, 525, 425, this);

			break;

		case 7:

			g.drawImage(A7, 525, 425, this);

			break;

		case 8:

			g.drawImage(A8, 525, 425, this);

			break;

		case 9:

			g.drawImage(A9, 525, 425, this);

			break;

		case 10:

			g.drawImage(A10, 525, 425, this);

			break;

		case 11:

			g.drawImage(A11, 525, 425, this);

			break;

		case 12:

			g.drawImage(A12, 525, 425, this);

			break;

		case 13:

			g.drawImage(A13, 525, 425, this);

			break;

		case 14:

			g.drawImage(B1, 525, 425, this);

			break;

		case 15:

			g.drawImage(B2, 525, 425, this);

			break;

		case 16:

			g.drawImage(B3, 525, 425, this);

			break;

		case 17:

			g.drawImage(B4, 525, 425, this);

			break;

		case 18:

			g.drawImage(B5, 525, 425, this);

			break;

		case 19:

			g.drawImage(B6, 525, 425, this);

			break;

		case 20:

			g.drawImage(B7, 525, 425, this);

			break;

		case 21:

			g.drawImage(B8, 525, 425, this);

			break;

		case 22:

			g.drawImage(B9, 525, 425, this);

			break;

		case 23:

			g.drawImage(B10, 525, 425, this);

			break;

		case 24:

			g.drawImage(B11, 525, 425, this);

			break;

		case 25:

			g.drawImage(B12, 525, 425, this);

			break;

		case 26:

			g.drawImage(B13, 525, 425, this);

			break;

		case 27:

			g.drawImage(C1, 525, 425, this);

			break;

		case 28:

			g.drawImage(C2, 525, 425, this);

			break;

		case 29:

			g.drawImage(C3, 525, 425, this);

			break;

		case 30:

			g.drawImage(C4, 525, 425, this);

			break;

		case 31:

			g.drawImage(C5, 525, 425, this);

			break;

		case 32:

			g.drawImage(C6, 525, 425, this);

			break;

		case 33:

			g.drawImage(C7, 525, 425, this);

			break;

		case 34:

			g.drawImage(C8, 525, 425, this);

			break;

		case 35:

			g.drawImage(C9, 525, 425, this);

			break;

		case 36:

			g.drawImage(C10, 525, 425, this);

			break;

		case 37:

			g.drawImage(C11, 525, 425, this);

			break;

		case 38:

			g.drawImage(C12, 525, 425, this);

			break;

		case 39:

			g.drawImage(C13, 525, 425, this);

			break;

		case 40:

			g.drawImage(D1, 525, 425, this);

			break;

		case 41:

			g.drawImage(D2, 525, 425, this);

			break;

		case 42:

			g.drawImage(D3, 525, 425, this);

			break;

		case 43:

			g.drawImage(D4, 525, 425, this);

			break;

		case 44:

			g.drawImage(D5, 525, 425, this);

			break;

		case 45:

			g.drawImage(D6, 525, 425, this);

			break;

		case 46:

			g.drawImage(D7, 525, 425, this);

			break;

		case 47:

			g.drawImage(D8, 525, 425, this);

			break;

		case 48:

			g.drawImage(D9, 525, 425, this);

			break;

		case 49:

			g.drawImage(D10, 525, 425, this);

			break;

		case 50:

			g.drawImage(D11, 525, 425, this);

			break;

		case 51:

			g.drawImage(D12, 525, 425, this);

			break;

		case 52:

			g.drawImage(D13, 525, 425, this);

			break;

		}
		switch(imagenAmostrar6)
		{
		case 1:
			g.drawImage(A1, 875, 800, this);
			break;
		case 2:
			g.drawImage(A2, 875, 800, this);
			break;
		case 3:
			g.drawImage(A3, 875, 800, this);
			break;
		case 4:
			g.drawImage(A4, 875, 800, this);
			break;
		case 5:
			g.drawImage(A5, 875, 800, this);
			break;
		case 6:
			g.drawImage(A6, 875, 800, this);
			break;
		case 7:
			g.drawImage(A7, 875, 800, this);
			break;
		case 8:
			g.drawImage(A8, 875, 800, this);
			break;
		case 9:
			g.drawImage(A9, 875, 800, this);
			break;
		case 10:
			g.drawImage(A10, 875, 800, this);
			break;
		case 11:
			g.drawImage(A11, 875, 800, this);
			break;
		case 12:
			g.drawImage(A12, 875, 800, this);
			break;
		case 13:
			g.drawImage(A13, 875, 800, this);
			break;
		case 14:
			g.drawImage(B1, 875, 800, this);
			break;
		case 15:
			g.drawImage(B2, 875, 800, this);
			break;
		case 16:
			g.drawImage(B3, 875, 800, this);
			break;
		case 17:
			g.drawImage(B4, 875, 800, this);
			break;
		case 18:
			g.drawImage(B5, 875, 800, this);
			break;
		case 19:
			g.drawImage(B6, 875, 800, this);
			break;
		case 20:
			g.drawImage(B7, 875, 800, this);
			break;
		case 21:
			g.drawImage(B8, 875, 800, this);
			break;
		case 22:
			g.drawImage(B9, 875, 800, this);
			break;
		case 23:
			g.drawImage(B10, 875, 800, this);
			break;
		case 24:
			g.drawImage(B11, 875, 800, this);
			break;
		case 25:
			g.drawImage(B12, 875, 800, this);
			break;
		case 26:
			g.drawImage(B13, 875, 800, this);
			break;
		case 27:
			g.drawImage(C1, 875, 800, this);
			break;
		case 28:
			g.drawImage(C2, 875, 800, this);
			break;
		case 29:
			g.drawImage(C3, 875, 800, this);
			break;
		case 30:
			g.drawImage(C4, 875, 800, this);
			break;
		case 31:
			g.drawImage(C5, 875, 800, this);
			break;
		case 32:
			g.drawImage(C6, 875, 800, this);
			break;
		case 33:
			g.drawImage(C7, 875, 800, this);
			break;
		case 34:
			g.drawImage(C8, 875, 800, this);
			break;
		case 35:
			g.drawImage(C9, 875, 800, this);
			break;
		case 36:
			g.drawImage(C10, 875, 800, this);
			break;
		case 37:
			g.drawImage(C11, 875, 800, this);
			break;
		case 38:
			g.drawImage(C12, 875, 800, this);
			break;
		case 39:
			g.drawImage(C13, 875, 800, this);
			break;
		case 40:
			g.drawImage(D1, 875, 800, this);
			break;
		case 41:
			g.drawImage(D2, 875, 800, this);
			break;
		case 42:
			g.drawImage(D3, 875, 800, this);
			break;
		case 43:
			g.drawImage(D4, 875, 800, this);
			break;
		case 44:
			g.drawImage(D5, 875, 800, this);
			break;
		case 45:
			g.drawImage(D6, 875, 800, this);
			break;
		case 46:
			g.drawImage(D7, 875, 800, this);
			break;
		case 47:
			g.drawImage(D8, 875, 800, this);
			break;
		case 48:
			g.drawImage(D9, 875, 800, this);
			break;
		case 49:
			g.drawImage(D10, 875, 800, this);
			break;
		case 50:
			g.drawImage(D11, 875, 800, this);
			break;
		case 51:
			g.drawImage(D12, 875, 800, this);
			break;
		case 52:
			g.drawImage(D13, 875, 800, this);
			break;
		}
		switch(imagenAmostrar7)
		{
		case 1:
			g.drawImage(A1, 725, 800, this);
			break;
		case 2:
			g.drawImage(A2, 725, 800, this);
			break;
		case 3:
			g.drawImage(A3, 725, 800, this);
			break;
		case 4:
			g.drawImage(A4, 725, 800, this);
			break;
		case 5:
			g.drawImage(A5, 725, 800, this);
			break;
		case 6:
			g.drawImage(A6, 725, 800, this);
			break;
		case 7:
			g.drawImage(A7, 725, 800, this);
			break;
		case 8:
			g.drawImage(A8, 725, 800, this);
			break;
		case 9:
			g.drawImage(A9, 725, 800, this);
			break;
		case 10:
			g.drawImage(A10, 725, 800, this);
			break;
		case 11:
			g.drawImage(A11, 725, 800, this);
			break;
		case 12:
			g.drawImage(A12, 725, 800, this);
			break;
		case 13:
			g.drawImage(A13, 725, 800, this);
			break;
		case 14:
			g.drawImage(B1, 725, 800, this);
			break;
		case 15:
			g.drawImage(B2, 725, 800, this);
			break;
		case 16:
			g.drawImage(B3, 725, 800, this);
			break;
		case 17:
			g.drawImage(B4, 725, 800, this);
			break;
		case 18:
			g.drawImage(B5, 725, 800, this);
			break;
		case 19:
			g.drawImage(B6, 725, 800, this);
			break;
		case 20:
			g.drawImage(B7, 725, 800, this);
			break;
		case 21:
			g.drawImage(B8, 725, 800, this);
			break;
		case 22:
			g.drawImage(B9, 725, 800, this);
			break;
		case 23:
			g.drawImage(B10, 725, 800, this);
			break;
		case 24:
			g.drawImage(B11, 725, 800, this);
			break;
		case 25:
			g.drawImage(B12, 725, 800, this);
			break;
		case 26:
			g.drawImage(B13, 725, 800, this);
			break;
		case 27:
			g.drawImage(C1, 725, 800, this);
			break;
		case 28:
			g.drawImage(C2, 725, 800, this);
			break;
		case 29:
			g.drawImage(C3, 725, 800, this);
			break;
		case 30:
			g.drawImage(C4, 725, 800, this);
			break;
		case 31:
			g.drawImage(C5, 725, 800, this);
			break;
		case 32:
			g.drawImage(C6, 725, 800, this);
			break;
		case 33:
			g.drawImage(C7, 725, 800, this);
			break;
		case 34:
			g.drawImage(C8, 725, 800, this);
			break;
		case 35:
			g.drawImage(C9, 725, 800, this);
			break;
		case 36:
			g.drawImage(C10, 725, 800, this);
			break;
		case 37:
			g.drawImage(C11, 725, 800, this);
			break;
		case 38:
			g.drawImage(C12, 725, 800, this);
			break;
		case 39:
			g.drawImage(C13, 725, 800, this);
			break;
		case 40:
			g.drawImage(D1, 725, 800, this);
			break;
		case 41:
			g.drawImage(D2, 725, 800, this);
			break;
		case 42:
			g.drawImage(D3, 725, 800, this);
			break;
		case 43:
			g.drawImage(D4, 725, 800, this);
			break;
		case 44:
			g.drawImage(D5, 725, 800, this);
			break;
		case 45:
			g.drawImage(D6, 725, 800, this);
			break;
		case 46:
			g.drawImage(D7, 725, 800, this);
			break;
		case 47:
			g.drawImage(D8, 725, 800, this);
			break;
		case 48:
			g.drawImage(D9, 725, 800, this);
			break;
		case 49:
			g.drawImage(D10, 725, 800, this);
			break;
		case 50:
			g.drawImage(D11, 725, 800, this);
			break;
		case 51:
			g.drawImage(D12, 725, 800, this);
			break;
		case 52:
			g.drawImage(D13, 725, 800, this);
			break;
		}
		switch(imagenAmostrar8)
		{
		case 1:
			g.drawImage(A1, 875, 60, this);
			break;
		case 2:
			g.drawImage(A2, 875, 60, this);
			break;
		case 3:
			g.drawImage(A3, 875, 60, this);
			break;
		case 4:
			g.drawImage(A4, 875, 60, this);
			break;
		case 5:
			g.drawImage(A5, 875, 60, this);
			break;
		case 6:
			g.drawImage(A6, 875, 60, this);
			break;
		case 7:
			g.drawImage(A7, 875, 60, this);
			break;
		case 8:
			g.drawImage(A8, 875, 60, this);
			break;
		case 9:
			g.drawImage(A9, 875, 60, this);
			break;
		case 10:
			g.drawImage(A10, 875, 60, this);
			break;
		case 11:
			g.drawImage(A11, 875, 60, this);
			break;
		case 12:
			g.drawImage(A12, 875, 60, this);
			break;
		case 13:
			g.drawImage(A13, 875, 60, this);
			break;
		case 14:
			g.drawImage(B1, 875, 60, this);
			break;
		case 15:
			g.drawImage(B2, 875, 60, this);
			break;
		case 16:
			g.drawImage(B3, 875, 60, this);
			break;
		case 17:
			g.drawImage(B4, 875, 60, this);
			break;
		case 18:
			g.drawImage(B5, 875, 60, this);
			break;
		case 19:
			g.drawImage(B6, 875, 60, this);
			break;
		case 20:
			g.drawImage(B7, 875, 60, this);
			break;
		case 21:
			g.drawImage(B8, 875, 60, this);
			break;
		case 22:
			g.drawImage(B9, 875, 60, this);
			break;
		case 23:
			g.drawImage(B10, 875, 60, this);
			break;
		case 24:
			g.drawImage(B11, 875, 60, this);
			break;
		case 25:
			g.drawImage(B12, 875, 60, this);
			break;
		case 26:
			g.drawImage(B13, 875, 60, this);
			break;
		case 27:
			g.drawImage(C1, 875, 60, this);
			break;
		case 28:
			g.drawImage(C2, 875, 60, this);
			break;
		case 29:
			g.drawImage(C3, 875, 60, this);
			break;
		case 30:
			g.drawImage(C4, 875, 60, this);
			break;
		case 31:
			g.drawImage(C5, 875, 60, this);
			break;
		case 32:
			g.drawImage(C6, 875, 60, this);
			break;
		case 33:
			g.drawImage(C7, 875, 60, this);
			break;
		case 34:
			g.drawImage(C8, 875, 60, this);
			break;
		case 35:
			g.drawImage(C9, 875, 60, this);
			break;
		case 36:
			g.drawImage(C10, 875, 60, this);
			break;
		case 37:
			g.drawImage(C11, 875, 60, this);
			break;
		case 38:
			g.drawImage(C12, 875, 60, this);
			break;
		case 39:
			g.drawImage(C13, 875, 60, this);
			break;
		case 40:
			g.drawImage(D1, 875, 60, this);
			break;
		case 41:
			g.drawImage(D2, 875, 60, this);
			break;
		case 42:
			g.drawImage(D3, 875, 60, this);
			break;
		case 43:
			g.drawImage(D4, 875, 60, this);
			break;
		case 44:
			g.drawImage(D5, 875, 60, this);
			break;
		case 45:
			g.drawImage(D6, 875, 60, this);
			break;
		case 46:
			g.drawImage(D7, 875, 60, this);
			break;
		case 47:
			g.drawImage(D8, 875, 60, this);
			break;
		case 48:
			g.drawImage(D9, 875, 60, this);
			break;
		case 49:
			g.drawImage(D10, 875, 60, this);
			break;
		case 50:
			g.drawImage(D11, 875, 60, this);
			break;
		case 51:
			g.drawImage(D12, 875, 60, this);
			break;
		case 52:
			g.drawImage(D13, 875, 60, this);
			break;
		}
		switch(imagenAmostrar9)
		{
		case 1:
			g.drawImage(A1, 725, 60, this);
			break;
		case 2:
			g.drawImage(A2, 725, 60, this);
			break;
		case 3:
			g.drawImage(A3, 725, 60, this);
			break;
		case 4:
			g.drawImage(A4, 725, 60, this);
			break;
		case 5:
			g.drawImage(A5, 725, 60, this);
			break;
		case 6:
			g.drawImage(A6, 725, 60, this);
			break;
		case 7:
			g.drawImage(A7, 725, 60, this);
			break;
		case 8:
			g.drawImage(A8, 725, 60, this);
			break;
		case 9:
			g.drawImage(A9, 725, 60, this);
			break;
		case 10:
			g.drawImage(A10, 725, 60, this);
			break;
		case 11:
			g.drawImage(A11, 725, 60, this);
			break;
		case 12:
			g.drawImage(A12, 725, 60, this);
			break;
		case 13:
			g.drawImage(A13, 725, 60, this);
			break;
		case 14:
			g.drawImage(B1, 725, 60, this);
			break;
		case 15:
			g.drawImage(B2, 725, 60, this);
			break;
		case 16:
			g.drawImage(B3, 725, 60, this);
			break;
		case 17:
			g.drawImage(B4, 725, 60, this);
			break;
		case 18:
			g.drawImage(B5, 725, 60, this);
			break;
		case 19:
			g.drawImage(B6, 725, 60, this);
			break;
		case 20:
			g.drawImage(B7, 725, 60, this);
			break;
		case 21:
			g.drawImage(B8, 725, 60, this);
			break;
		case 22:
			g.drawImage(B9, 725, 60, this);
			break;
		case 23:
			g.drawImage(B10, 725, 60, this);
			break;
		case 24:
			g.drawImage(B11, 725, 60, this);
			break;
		case 25:
			g.drawImage(B12, 725, 60, this);
			break;
		case 26:
			g.drawImage(B13, 725, 60, this);
			break;
		case 27:
			g.drawImage(C1, 725, 60, this);
			break;
		case 28:
			g.drawImage(C2, 725, 60, this);
			break;
		case 29:
			g.drawImage(C3, 725, 60, this);
			break;
		case 30:
			g.drawImage(C4, 725, 60, this);
			break;
		case 31:
			g.drawImage(C5, 725, 60, this);
			break;
		case 32:
			g.drawImage(C6, 725, 60, this);
			break;
		case 33:
			g.drawImage(C7, 725, 60, this);
			break;
		case 34:
			g.drawImage(C8, 725, 60, this);
			break;
		case 35:
			g.drawImage(C9, 725, 60, this);
			break;
		case 36:
			g.drawImage(C10, 725, 60, this);
			break;
		case 37:
			g.drawImage(C11, 725, 60, this);
			break;
		case 38:
			g.drawImage(C12, 725, 60, this);
			break;
		case 39:
			g.drawImage(C13, 725, 60, this);
			break;
		case 40:
			g.drawImage(D1, 725, 60, this);
			break;
		case 41:
			g.drawImage(D2, 725, 60, this);
			break;
		case 42:
			g.drawImage(D3, 725, 60, this);
			break;
		case 43:
			g.drawImage(D4, 725, 60, this);
			break;
		case 44:
			g.drawImage(D5, 725, 60, this);
			break;
		case 45:
			g.drawImage(D6, 725, 60, this);
			break;
		case 46:
			g.drawImage(D7, 725, 60, this);
			break;
		case 47:
			g.drawImage(D8, 725, 60, this);
			break;
		case 48:
			g.drawImage(D9, 725, 60, this);
			break;
		case 49:
			g.drawImage(D10, 725, 60, this);
			break;
		case 50:
			g.drawImage(D11, 725, 60, this);
			break;
		case 51:
			g.drawImage(D12, 725, 60, this);
			break;
		case 52:
			g.drawImage(D13, 725, 60, this);
			break;
		}

	}
	public void cargarCartas()
	{
		A1 = herramienta.getImage("img/cartas/A1.jpg");
		A2 = herramienta.getImage("img/cartas/A2.jpg");
		A3 = herramienta.getImage("img/cartas/A3.jpg");
		A4 = herramienta.getImage("img/cartas/A4.jpg");
		A5 = herramienta.getImage("img/cartas/A5.jpg");
		A6 = herramienta.getImage("img/cartas/A6.jpg");
		A7 = herramienta.getImage("img/cartas/A7.jpg");
		A8 = herramienta.getImage("img/cartas/A8.jpg");
		A9 = herramienta.getImage("img/cartas/A9.jpg");
		A10 = herramienta.getImage("img/cartas/A10.jpg");
		A11 = herramienta.getImage("img/cartas/A11.jpg");
		A12 = herramienta.getImage("img/cartas/A12.jpg");
		A13 = herramienta.getImage("img/cartas/A13.jpg");
		B1 = herramienta.getImage("img/cartas/B1.jpg");
		B2 = herramienta.getImage("img/cartas/B2.jpg");
		B3 = herramienta.getImage("img/cartas/B3.jpg");
		B4 = herramienta.getImage("img/cartas/B4.jpg");
		B5 = herramienta.getImage("img/cartas/B5.jpg");
		B6 = herramienta.getImage("img/cartas/B6.jpg");
		B7 = herramienta.getImage("img/cartas/B7.jpg");
		B8 = herramienta.getImage("img/cartas/B8.jpg");
		B9 = herramienta.getImage("img/cartas/B9.jpg");
		B10 = herramienta.getImage("img/cartas/B10.jpg");
		B11 = herramienta.getImage("img/cartas/B11.jpg");
		B12 = herramienta.getImage("img/cartas/B12.jpg");
		B13 = herramienta.getImage("img/cartas/B13.jpg");
		C1 = herramienta.getImage("img/cartas/C1.jpg");
		C2 = herramienta.getImage("img/cartas/C2.jpg");
		C3 = herramienta.getImage("img/cartas/C3.jpg");
		C4 = herramienta.getImage("img/cartas/C4.jpg");
		C5 = herramienta.getImage("img/cartas/C5.jpg");
		C6 = herramienta.getImage("img/cartas/C6.jpg");
		C7 = herramienta.getImage("img/cartas/C7.jpg");
		C8 = herramienta.getImage("img/cartas/C8.jpg");
		C9 = herramienta.getImage("img/cartas/C9.jpg");
		C10 = herramienta.getImage("img/cartas/C10.jpg");
		C11 = herramienta.getImage("img/cartas/C11.jpg");
		C12 = herramienta.getImage("img/cartas/C12.jpg");
		C13 = herramienta.getImage("img/cartas/C13.jpg");
		D1 = herramienta.getImage("img/cartas/D1.jpg");
		D2 = herramienta.getImage("img/cartas/D2.jpg");
		D3 = herramienta.getImage("img/cartas/D3.jpg");
		D4 = herramienta.getImage("img/cartas/D4.jpg");
		D5 = herramienta.getImage("img/cartas/D5.jpg");
		D6 = herramienta.getImage("img/cartas/D6.jpg");
		D7 = herramienta.getImage("img/cartas/D7.jpg");
		D8 = herramienta.getImage("img/cartas/D8.jpg");
		D9 = herramienta.getImage("img/cartas/D9.jpg");
		D10 = herramienta.getImage("img/cartas/D10.jpg");
		D11 = herramienta.getImage("img/cartas/D11.jpg");
		D12 = herramienta.getImage("img/cartas/D12.jpg");
		D13 = herramienta.getImage("img/cartas/D13.jpg");
	}

	public void mostrarCartaCentro1(int carta)
	{
		imagenAmostrar1 = carta;
		repaint();
	}
	public void mostrarCartaCentro2(int carta)
	{
		imagenAmostrar2 = carta;
		repaint();
	}
	public void mostrarCartaCentro3(int carta)
	{
		imagenAmostrar3 = carta;
		repaint();
	}
	public void mostrarCartaCentro4(int carta)
	{
		imagenAmostrar4 = carta;
		repaint();
	}
	public void mostrarCartaCentro5(int carta)
	{
		imagenAmostrar5 = carta;
		repaint();
	}
	public void mostrarCarta1Jugador1(int carta)
	{
		imagenAmostrar6 = carta;
		repaint();
	}
	public void mostrarCarta2Jugador1(int carta)
	{
		imagenAmostrar7 = carta;
		repaint();
	}
	public void mostrarCarta1Jugador2(int carta)
	{
		imagenAmostrar8 = carta;
		repaint();
	}
	public void mostrarCarta2Jugador2(int carta)
	{
		imagenAmostrar9 = carta;
		repaint();
	}
	public void aumentarPuntosJugador1()
	{
		puntosJugador1++;
		repaint();
	}
	public void aumentarPuntosJugador2()
	{
		puntosJugador2++;
		repaint();
	}
	public void resetearContadores()
	{
		puntosJugador1 = 0;
		puntosJugador2 = 0;
		repaint();
	}
	public void Jugador1(int uno)
	{
		J1Mostrar = uno;
		repaint();
	}
	public void Jugador2(int dos)
	{
		J2Mostrar = dos;
		repaint();
	}

}
