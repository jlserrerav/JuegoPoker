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
	//Cartas Centro 2
	int cartaActualCentro1 = 0;
	int cartaActualCentro2 = 0;
	int cartaActualCentro3 = 0;
	int cartaActualCentro4 = 0;
	int cartaActualCentro5 = 0;
	//udsbjwid 
	int cartaActualJugador1 = 0;
	int cartaActualJugador2 = 0;
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
	}
	@Override
	public void mouseClicked(MouseEvent evento) 
	{
		int x = evento.getX();
		int y = evento.getY();

		if ((x >= 900) && (x <= 935) && (y >= 675) && (y <= 710)) {
		    // Clic en el botón "ir"
		    clicks++;
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
			cartaActualJugador1 = 0;
			cartaActualJugador2 = 0;
			puntosJugador1 = 0;
			puntosJugador2 = 0;
			this.juego.resetearContadores();
			turno = 0;
			this.juego.mostrarCartaCentro1(-1); // Quitar última carta mostrada
			this.juego.mostrarCartaCentro2(-1); // Quitar última carta mostrada
			this.modelo.barajarJugadores(mazoJugador1, mazoJugador2);
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