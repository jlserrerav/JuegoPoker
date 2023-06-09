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
	int imagenAmostrar1 = 0;
	int imagenAmostrar2 = 0;
	int imagenAmostrar3 = 0;
	int imagenAmostrar4 = 0;
	int imagenAmostrar5 = 0;
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
		cargarCartas();
		setTitle("Juego");
		add(txtFichas);
		add(txtSubir);
		txtFichas.setBounds(225, 600, 150, 25);
		txtSubir.setBounds(990, 600, 150, 25);
		txtFichas.setEditable(false);
		txtFichas.setEnabled(false);
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		setSize(1280,750);
		setVisible(true);
		
		
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
		//centro
		g.drawRect(870, 300, 100, 165);
		g.drawRect(725, 300, 100, 165);
		g.drawRect(600, 300, 100, 165);
		g.drawRect(475, 300, 100, 165);
		g.drawRect(350, 300, 100, 165);

		//Texto
		Font font = new Font("Righteous", Font.BOLD, 24);
		g.setFont(font);
		g.drawString("Tus Fichas:", 75, 620);
		g.drawString("Subir Fichas:", 825, 620);
		g.drawString("Ir", 850, 700);
		g.drawString("No ir", 1040, 700);
		g.drawImage(reverso, 320, 80, this);
		
		switch(imagenAmostrar1)
		{
		case 1:
			g.drawImage(A1, 870, 300, this);
			break;
		case 2:
			g.drawImage(A2, 870, 300, this);
			break;
		case 3:
			g.drawImage(A3, 870, 300, this);
			break;
		case 4:
			g.drawImage(A4, 870, 300, this);
			break;
		case 5:
			g.drawImage(A5, 870, 300, this);
			break;
		case 6:
			g.drawImage(A6, 870, 300, this);
			break;
		case 7:
			g.drawImage(A7, 870, 300, this);
			break;
		case 8:
			g.drawImage(A8, 870, 300, this);
			break;
		case 9:
			g.drawImage(A9, 870, 300, this);
			break;
		case 10:
			g.drawImage(A10, 870, 300, this);
			break;
		case 11:
			g.drawImage(A11, 870, 300, this);
			break;
		case 12:
			g.drawImage(A12, 870, 300, this);
			break;
		case 13:
			g.drawImage(A13, 870, 300, this);
			break;
		case 14:
			g.drawImage(B1, 870, 300, this);
			break;
		case 15:
			g.drawImage(B2, 870, 300, this);
			break;
		case 16:
			g.drawImage(B3, 870, 300, this);
			break;
		case 17:
			g.drawImage(B4, 870, 300, this);
			break;
		case 18:
			g.drawImage(B5, 870, 300, this);
			break;
		case 19:
			g.drawImage(B6, 870, 300, this);
			break;
		case 20:
			g.drawImage(B7, 870, 300, this);
			break;
		case 21:
			g.drawImage(B8, 870, 300, this);
			break;
		case 22:
			g.drawImage(B9, 870, 300, this);
			break;
		case 23:
			g.drawImage(B10, 870, 300, this);
			break;
		case 24:
			g.drawImage(B11, 870, 300, this);
			break;
		case 25:
			g.drawImage(B12, 870, 300, this);
			break;
		case 26:
			g.drawImage(B13, 870, 300, this);
			break;
		case 27:
			g.drawImage(C1, 870, 300, this);
			break;
		case 28:
			g.drawImage(C2, 870, 300, this);
			break;
		case 29:
			g.drawImage(C3, 870, 300, this);
			break;
		case 30:
			g.drawImage(C4, 870, 300, this);
			break;
		case 31:
			g.drawImage(C5, 870, 300, this);
			break;
		case 32:
			g.drawImage(C6, 870, 300, this);
			break;
		case 33:
			g.drawImage(C7, 870, 300, this);
			break;
		case 34:
			g.drawImage(C8, 870, 300, this);
			break;
		case 35:
			g.drawImage(C9, 870, 300, this);
			break;
		case 36:
			g.drawImage(C10, 870, 300, this);
			break;
		case 37:
			g.drawImage(C11, 870, 300, this);
			break;
		case 38:
			g.drawImage(C12, 870, 300, this);
			break;
		case 39:
			g.drawImage(C13, 870, 300, this);
			break;
		case 40:
			g.drawImage(D1, 870, 300, this);
			break;
		case 41:
			g.drawImage(D2, 870, 300, this);
			break;
		case 42:
			g.drawImage(D3, 870, 300, this);
			break;
		case 43:
			g.drawImage(D4, 870, 300, this);
			break;
		case 44:
			g.drawImage(D5, 870, 300, this);
			break;
		case 45:
			g.drawImage(D6, 870, 300, this);
			break;
		case 46:
			g.drawImage(D7, 870, 300, this);
			break;
		case 47:
			g.drawImage(D8, 870, 300, this);
			break;
		case 48:
			g.drawImage(D9, 870, 300, this);
			break;
		case 49:
			g.drawImage(D10, 870, 300, this);
			break;
		case 50:
			g.drawImage(D11, 870, 300, this);
			break;
		case 51:
			g.drawImage(D12, 870, 300, this);
			break;
		case 52:
			g.drawImage(D13, 870, 300, this);
			break;
		}
		switch(imagenAmostrar2)
		{
		case 1:
			g.drawImage(A1, 725, 300, this);
			break;
		case 2:
			g.drawImage(A2, 725, 300, this);
			break;
		case 3:
			g.drawImage(A3, 725, 300, this);
			break;
		case 4:
			g.drawImage(A4, 725, 300, this);
			break;
		case 5:
			g.drawImage(A5, 725, 300, this);
			break;
		case 6:
			g.drawImage(A6, 725, 300, this);
			break;
		case 7:
			g.drawImage(A7, 725, 300, this);
			break;
		case 8:
			g.drawImage(A8, 725, 300, this);
			break;
		case 9:
			g.drawImage(A9, 725, 300, this);
			break;
		case 10:
			g.drawImage(A10, 725, 300, this);
			break;
		case 11:
			g.drawImage(A11, 725, 300, this);
			break;
		case 12:
			g.drawImage(A12, 725, 300, this);
			break;
		case 13:
			g.drawImage(A13, 725, 300, this);
			break;
		case 14:
			g.drawImage(B1, 725, 300, this);
			break;
		case 15:
			g.drawImage(B2, 725, 300, this);
			break;
		case 16:
			g.drawImage(B3, 725, 300, this);
			break;
		case 17:
			g.drawImage(B4, 725, 300, this);
			break;
		case 18:
			g.drawImage(B5, 725, 300, this);
			break;
		case 19:
			g.drawImage(B6, 725, 300, this);
			break;
		case 20:
			g.drawImage(B7, 725, 300, this);
			break;
		case 21:
			g.drawImage(B8, 725, 300, this);
			break;
		case 22:
			g.drawImage(B9, 725, 300, this);
			break;
		case 23:
			g.drawImage(B10, 725, 300, this);
			break;
		case 24:
			g.drawImage(B11, 725, 300, this);
			break;
		case 25:
			g.drawImage(B12, 725, 300, this);
			break;
		case 26:
			g.drawImage(B13, 725, 300, this);
			break;
		case 27:
			g.drawImage(C1, 725, 300, this);
			break;
		case 28:
			g.drawImage(C2, 725, 300, this);
			break;
		case 29:
			g.drawImage(C3, 725, 300, this);
			break;
		case 30:
			g.drawImage(C4, 725, 300, this);
			break;
		case 31:
			g.drawImage(C5, 725, 300, this);
			break;
		case 32:
			g.drawImage(C6, 725, 300, this);
			break;
		case 33:
			g.drawImage(C7, 725, 300, this);
			break;
		case 34:
			g.drawImage(C8, 725, 300, this);
			break;
		case 35:
			g.drawImage(C9, 725, 300, this);
			break;
		case 36:
			g.drawImage(C10, 725, 300, this);
			break;
		case 37:
			g.drawImage(C11, 725, 300, this);
			break;
		case 38:
			g.drawImage(C12, 725, 300, this);
			break;
		case 39:
			g.drawImage(C13, 725, 300, this);
			break;
		case 40:
			g.drawImage(D1, 725, 300, this);
			break;
		case 41:
			g.drawImage(D2, 725, 300, this);
			break;
		case 42:
			g.drawImage(D3, 725, 300, this);
			break;
		case 43:
			g.drawImage(D4, 725, 300, this);
			break;
		case 44:
			g.drawImage(D5, 725, 300, this);
			break;
		case 45:
			g.drawImage(D6, 725, 300, this);
			break;
		case 46:
			g.drawImage(D7, 725, 300, this);
			break;
		case 47:
			g.drawImage(D8, 725, 300, this);
			break;
		case 48:
			g.drawImage(D9, 725, 300, this);
			break;
		case 49:
			g.drawImage(D10, 725, 300, this);
			break;
		case 50:
			g.drawImage(D11, 725, 300, this);
			break;
		case 51:
			g.drawImage(D12, 725, 300, this);
			break;
		case 52:
			g.drawImage(D13, 725, 300, this);
			break;
		}
		switch(imagenAmostrar3)
		{
		case 1:
			g.drawImage(A1, 600, 300, this);
			break;
		case 2:
			g.drawImage(A2, 600, 300, this);
			break;
		case 3:
			g.drawImage(A3, 600, 300, this);
			break;
		case 4:
			g.drawImage(A4, 600, 300, this);
			break;
		case 5:
			g.drawImage(A5, 600, 300, this);
			break;
		case 6:
			g.drawImage(A6, 600, 300, this);
			break;
		case 7:
			g.drawImage(A7, 600, 300, this);
			break;
		case 8:
			g.drawImage(A8, 600, 300, this);
			break;
		case 9:
			g.drawImage(A9, 600, 300, this);
			break;
		case 10:
			g.drawImage(A10, 600, 300, this);
			break;
		case 11:
			g.drawImage(A11, 600, 300, this);
			break;
		case 12:
			g.drawImage(A12, 600, 300, this);
			break;
		case 13:
			g.drawImage(A13, 600, 300, this);
			break;
		case 14:
			g.drawImage(B1, 600, 300, this);
			break;
		case 15:
			g.drawImage(B2, 600, 300, this);
			break;
		case 16:
			g.drawImage(B3, 600, 300, this);
			break;
		case 17:
			g.drawImage(B4, 600, 300, this);
			break;
		case 18:
			g.drawImage(B5, 600, 300, this);
			break;
		case 19:
			g.drawImage(B6, 600, 300, this);
			break;
		case 20:
			g.drawImage(B7, 600, 300, this);
			break;
		case 21:
			g.drawImage(B8, 600, 300, this);
			break;
		case 22:
			g.drawImage(B9, 600, 300, this);
			break;
		case 23:
			g.drawImage(B10, 600, 300, this);
			break;
		case 24:
			g.drawImage(B11, 600, 300, this);
			break;
		case 25:
			g.drawImage(B12, 600, 300, this);
			break;
		case 26:
			g.drawImage(B13, 600, 300, this);
			break;
		case 27:
			g.drawImage(C1, 600, 300, this);
			break;
		case 28:
			g.drawImage(C2, 600, 300, this);
			break;
		case 29:
			g.drawImage(C3, 600, 300, this);
			break;
		case 30:
			g.drawImage(C4, 600, 300, this);
			break;
		case 31:
			g.drawImage(C5, 600, 300, this);
			break;
		case 32:
			g.drawImage(C6, 600, 300, this);
			break;
		case 33:
			g.drawImage(C7, 600, 300, this);
			break;
		case 34:
			g.drawImage(C8, 600, 300, this);
			break;
		case 35:
			g.drawImage(C9, 600, 300, this);
			break;
		case 36:
			g.drawImage(C10, 600, 300, this);
			break;
		case 37:
			g.drawImage(C11, 600, 300, this);
			break;
		case 38:
			g.drawImage(C12, 600, 300, this);
			break;
		case 39:
			g.drawImage(C13, 600, 300, this);
			break;
		case 40:
			g.drawImage(D1, 600, 300, this);
			break;
		case 41:
			g.drawImage(D2, 600, 300, this);
			break;
		case 42:
			g.drawImage(D3, 600, 300, this);
			break;
		case 43:
			g.drawImage(D4, 600, 300, this);
			break;
		case 44:
			g.drawImage(D5, 600, 300, this);
			break;
		case 45:
			g.drawImage(D6, 600, 300, this);
			break;
		case 46:
			g.drawImage(D7, 600, 300, this);
			break;
		case 47:
			g.drawImage(D8, 600, 300, this);
			break;
		case 48:
			g.drawImage(D9, 600, 300, this);
			break;
		case 49:
			g.drawImage(D10, 600, 300, this);
			break;
		case 50:
			g.drawImage(D11, 600, 300, this);
			break;
		case 51:
			g.drawImage(D12, 600, 300, this);
			break;
		case 52:
			g.drawImage(D13, 600, 300, this);
			break;
		}
		switch(imagenAmostrar4)
		{
		case 1:
			g.drawImage(A1, 475, 300, this);
			break;
		case 2:
			g.drawImage(A2, 475, 300, this);
			break;
		case 3:
			g.drawImage(A3, 475, 300, this);
			break;
		case 4:
			g.drawImage(A4, 475, 300, this);
			break;
		case 5:
			g.drawImage(A5, 475, 300, this);
			break;
		case 6:
			g.drawImage(A6, 475, 300, this);
			break;
		case 7:
			g.drawImage(A7, 475, 300, this);
			break;
		case 8:
			g.drawImage(A8, 475, 300, this);
			break;
		case 9:
			g.drawImage(A9, 475, 300, this);
			break;
		case 10:
			g.drawImage(A10, 475, 300, this);
			break;
		case 11:
			g.drawImage(A11, 475, 300, this);
			break;
		case 12:
			g.drawImage(A12, 475, 300, this);
			break;
		case 13:
			g.drawImage(A13, 475, 300, this);
			break;
		case 14:
			g.drawImage(B1, 475, 300, this);
			break;
		case 15:
			g.drawImage(B2, 475, 300, this);
			break;
		case 16:
			g.drawImage(B3, 475, 300, this);
			break;
		case 17:
			g.drawImage(B4, 475, 300, this);
			break;
		case 18:
			g.drawImage(B5, 475, 300, this);
			break;
		case 19:
			g.drawImage(B6, 475, 300, this);
			break;
		case 20:
			g.drawImage(B7, 475, 300, this);
			break;
		case 21:
			g.drawImage(B8, 475, 300, this);
			break;
		case 22:
			g.drawImage(B9, 475, 300, this);
			break;
		case 23:
			g.drawImage(B10, 475, 300, this);
			break;
		case 24:
			g.drawImage(B11, 475, 300, this);
			break;
		case 25:
			g.drawImage(B12, 475, 300, this);
			break;
		case 26:
			g.drawImage(B13, 475, 300, this);
			break;
		case 27:
			g.drawImage(C1, 475, 300, this);
			break;
		case 28:
			g.drawImage(C2, 475, 300, this);
			break;
		case 29:
			g.drawImage(C3, 475, 300, this);
			break;
		case 30:
			g.drawImage(C4, 475, 300, this);
			break;
		case 31:
			g.drawImage(C5, 475, 300, this);
			break;
		case 32:
			g.drawImage(C6, 475, 300, this);
			break;
		case 33:
			g.drawImage(C7, 475, 300, this);
			break;
		case 34:
			g.drawImage(C8, 475, 300, this);
			break;
		case 35:
			g.drawImage(C9, 475, 300, this);
			break;
		case 36:
			g.drawImage(C10, 475, 300, this);
			break;
		case 37:
			g.drawImage(C11, 475, 300, this);
			break;
		case 38:
			g.drawImage(C12, 475, 300, this);
			break;
		case 39:
			g.drawImage(C13, 475, 300, this);
			break;
		case 40:
			g.drawImage(D1, 475, 300, this);
			break;
		case 41:
			g.drawImage(D2, 475, 300, this);
			break;
		case 42:
			g.drawImage(D3, 475, 300, this);
			break;
		case 43:
			g.drawImage(D4, 475, 300, this);
			break;
		case 44:
			g.drawImage(D5, 475, 300, this);
			break;
		case 45:
			g.drawImage(D6, 475, 300, this);
			break;
		case 46:
			g.drawImage(D7, 475, 300, this);
			break;
		case 47:
			g.drawImage(D8, 475, 300, this);
			break;
		case 48:
			g.drawImage(D9, 475, 300, this);
			break;
		case 49:
			g.drawImage(D10, 475, 300, this);
			break;
		case 50:
			g.drawImage(D11, 475, 300, this);
			break;
		case 51:
			g.drawImage(D12, 475, 300, this);
			break;
		case 52:
			g.drawImage(D13, 475, 300, this);
			break;
		}
		switch(imagenAmostrar5)
		{
		case 1:
			g.drawImage(A1, 350, 300, this);
			break;
		case 2:
			g.drawImage(A2, 350, 300, this);
			break;
		case 3:
			g.drawImage(A3, 350, 300, this);
			break;
		case 4:
			g.drawImage(A4, 350, 300, this);
			break;
		case 5:
			g.drawImage(A5, 350, 300, this);
			break;
		case 6:
			g.drawImage(A6, 350, 300, this);
			break;
		case 7:
			g.drawImage(A7, 350, 300, this);
			break;
		case 8:
			g.drawImage(A8, 350, 300, this);
			break;
		case 9:
			g.drawImage(A9, 350, 300, this);
			break;
		case 10:
			g.drawImage(A10, 350, 300, this);
			break;
		case 11:
			g.drawImage(A11, 350, 300, this);
			break;
		case 12:
			g.drawImage(A12, 350, 300, this);
			break;
		case 13:
			g.drawImage(A13, 350, 300, this);
			break;
		case 14:
			g.drawImage(B1, 350, 300, this);
			break;
		case 15:
			g.drawImage(B2, 350, 300, this);
			break;
		case 16:
			g.drawImage(B3, 350, 300, this);
			break;
		case 17:
			g.drawImage(B4, 350, 300, this);
			break;
		case 18:
			g.drawImage(B5, 350, 300, this);
			break;
		case 19:
			g.drawImage(B6, 350, 300, this);
			break;
		case 20:
			g.drawImage(B7, 350, 300, this);
			break;
		case 21:
			g.drawImage(B8, 350, 300, this);
			break;
		case 22:
			g.drawImage(B9, 350, 300, this);
			break;
		case 23:
			g.drawImage(B10, 350, 300, this);
			break;
		case 24:
			g.drawImage(B11, 350, 300, this);
			break;
		case 25:
			g.drawImage(B12, 350, 300, this);
			break;
		case 26:
			g.drawImage(B13, 350, 300, this);
			break;
		case 27:
			g.drawImage(C1, 350, 300, this);
			break;
		case 28:
			g.drawImage(C2, 350, 300, this);
			break;
		case 29:
			g.drawImage(C3, 350, 300, this);
			break;
		case 30:
			g.drawImage(C4, 350, 300, this);
			break;
		case 31:
			g.drawImage(C5, 350, 300, this);
			break;
		case 32:
			g.drawImage(C6, 350, 300, this);
			break;
		case 33:
			g.drawImage(C7, 350, 300, this);
			break;
		case 34:
			g.drawImage(C8, 350, 300, this);
			break;
		case 35:
			g.drawImage(C9, 350, 300, this);
			break;
		case 36:
			g.drawImage(C10, 350, 300, this);
			break;
		case 37:
			g.drawImage(C11, 350, 300, this);
			break;
		case 38:
			g.drawImage(C12, 350, 300, this);
			break;
		case 39:
			g.drawImage(C13, 350, 300, this);
			break;
		case 40:
			g.drawImage(D1, 350, 300, this);
			break;
		case 41:
			g.drawImage(D2, 350, 300, this);
			break;
		case 42:
			g.drawImage(D3, 350, 300, this);
			break;
		case 43:
			g.drawImage(D4, 350, 300, this);
			break;
		case 44:
			g.drawImage(D5, 350, 300, this);
			break;
		case 45:
			g.drawImage(D6, 350, 300, this);
			break;
		case 46:
			g.drawImage(D7, 350, 300, this);
			break;
		case 47:
			g.drawImage(D8, 350, 300, this);
			break;
		case 48:
			g.drawImage(D9, 350, 300, this);
			break;
		case 49:
			g.drawImage(D10, 350, 300, this);
			break;
		case 50:
			g.drawImage(D11, 350, 300, this);
			break;
		case 51:
			g.drawImage(D12, 350, 300, this);
			break;
		case 52:
			g.drawImage(D13, 350, 300, this);
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

}