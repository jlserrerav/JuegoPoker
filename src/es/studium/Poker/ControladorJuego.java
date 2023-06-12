package es.studium.Poker;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ControladorJuego  implements WindowListener, MouseListener 
{

	Juego juego;
	Modelo modelo;

	int mazoJugador1[] = new int[26];
	int mazoJugador2[] = new int[26];
	//Cartas Centro
	int cartaCentro1[] = new int[26];
	int cartaCentro2[] = new int[26];
	int cartaCentro3[] = new int[16];
	int cartaCentro4[] = new int[16];
	int cartaCentro5[] = new int[16];
	int Carta1Jugador1[] = new int[26];
	int Carta2Jugador1[] = new int[26];
	int Carta1Jugador2[] = new int[26];
	int Carta2Jugador2[] = new int[26];


	//Cartas Centro 2
	int cartaActualCentro1 = 0;
	int cartaActualCentro2 = 0;
	int cartaActualCentro3 = 0;
	int cartaActualCentro4 = 0;
	int cartaActualCentro5 = 0;
	
	//udsbjwid 
	int cartaActual1Jugador1 = 0;
	int cartaActual2Jugador1 = 0;
	int cartaActual1Jugador2 = 0;
	int cartaActual2Jugador2 = 0;
	int puntosJugador1 = 0;
	int puntosJugador2 = 0;
	int uno, dos;
	int clicks;
	int turno;
	public ControladorJuego(Juego j, Modelo m)
	{
		this.juego = j;
		this.modelo = m;
		this.juego.addWindowListener(this);
		this.juego.addMouseListener(this);
		this.juego.dlgMensajeFinPartida.addWindowListener(this);
		this.juego.dlgMensajeRonda.addWindowListener(this);
		this.modelo.barajarCentro1(cartaCentro1, cartaCentro2);
		this.modelo.barajarCentro2(cartaCentro3, cartaCentro4, cartaCentro5);
		this.modelo.barajarJugador1(Carta1Jugador1, Carta2Jugador1);
		this.modelo.barajarJugador2(Carta1Jugador2, Carta2Jugador2);
	}
	@Override
	public void mouseClicked(MouseEvent evento) 
	{
		int x = evento.getX();
		int y = evento.getY();

		if ((x >= 1075) && (x <= 1110) && (y >= 825) && (y <= 860)) {
		    // Clic en el botón "ir"
		    clicks++;
		    this.juego.mostrarCarta1Jugador1(Carta1Jugador1[cartaActual1Jugador1]);
		    this.juego.mostrarCarta2Jugador1(Carta2Jugador1[cartaActual2Jugador1]);
		    this.juego.mostrarCarta1Jugador2(Carta1Jugador2[cartaActual1Jugador2]);
		    this.juego.mostrarCarta2Jugador2(Carta2Jugador2[cartaActual2Jugador2]);
		    this.juego.mostrarCartaCentro1(cartaCentro1[cartaActualCentro1]);
	        this.juego.mostrarCartaCentro2(cartaCentro2[cartaActualCentro2]);
		    if (clicks == 3) {
		        // Mostrar CartaCentro3 en el tercer clic
		        this.juego.mostrarCartaCentro3(cartaCentro3[cartaActualCentro3]);
		    } else if (clicks == 5) {
		        // Mostrar CartaCentro4 en el quinto clic
		        this.juego.mostrarCartaCentro4(cartaCentro4[cartaActualCentro4]);
		    }
		    else if (clicks == 7)
		    {
		        // Mostrar CartaCentro4 en el septimo clic
		        this.juego.mostrarCartaCentro5(cartaCentro5[cartaActualCentro5]);
		    }
		    if (clicks >= 7) {
		        turno = 1; // Reiniciar el turno al jugador 1
		        clicks = 0; // Reiniciar el contador de clics
		    }
		}

		else if ((x>=1110)&&(x<=1145)&&(y>=675)&&(y<=710)&&(turno==0))
		{
			// Mostrar la carta del Mazo 2
			this.juego.lblMensajeRonda.setText("Gana Jugador 1!");
			this.juego.dlgMensajeRonda.setVisible(true);
			
		}	
		else if ((x>=1110)&&(x<=1145)&&(y>=675)&&(y<=710)&&(turno==1))
		{
			// Mostrar la carta del Mazo 2
			this.juego.lblMensajeRonda.setText("Gana Jugador 2!");
			this.juego.dlgMensajeRonda.setVisible(true);
			
		}

	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void windowClosing(WindowEvent e) 
	{
		if(this.juego.dlgMensajeFinPartida.isActive())
		{
			this.juego.dlgMensajeFinPartida.setVisible(false);
			// Reinicio
			puntosJugador1 = 0;
			puntosJugador2 = 0;
			this.juego.resetearContadores();
			turno = 0;
			this.juego.mostrarCartaCentro1(-1); // Quitar última carta mostrada
			this.juego.mostrarCartaCentro2(-1); // Quitar última carta mostrada
		}
		else if(this.juego.dlgMensajeRonda.isActive())
		{
			this.juego.dlgMensajeRonda.setVisible(false);
		}
		else
		{
			System.exit(0);
		}

	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}
}	
