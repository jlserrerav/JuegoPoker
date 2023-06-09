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
	int cartaCentro1[] = new int[52];
	int cartaCentro2[] = new int[52];
	int cartaCentro3[] = new int[52];
	int cartaCentro4[] = new int[52];
	int cartaCentro5[] = new int[52];
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
	int turno = 0; // 0 turno jugador 1, 1 turno jugador 2
	int uno, dos;
	int jugador1ir = 0;
	public ControladorJuego(Juego j, Modelo m)
	{
		this.juego = j;
		this.modelo = m;
		this.juego.addWindowListener(this);
		this.juego.addMouseListener(this);
		this.juego.dlgMensajeFinPartida.addWindowListener(this);
		this.juego.dlgMensajeRonda.addWindowListener(this);
		this.modelo.barajarCentro(cartaCentro1, cartaCentro2, cartaCentro3, cartaCentro4, cartaCentro5);
		for(int i= 0; i < 26; i++)
		{
			System.out.println(cartaCentro3[i]+"-->"+cartaCentro4[i]);
		}
	}
	@Override
	public void mouseClicked(MouseEvent evento) 
	{
		int x = evento.getX();
		int y = evento.getY();
		if((x>=900)&&(x<=935)&&(y>=675)&&(y<=710)) //Clicka en el botón ir
		{
			if (turno == 0) {
			jugador1ir = 1;
			turno = 1;
			}else if( turno == 1) {
				if (jugador1ir == 1) {
					this.juego.mostrarCartaCentro1(cartaCentro1[cartaActualCentro1]);
					this.juego.mostrarCartaCentro2(cartaCentro2[cartaActualCentro2]);
					this.juego.mostrarCartaCentro3(cartaCentro3[cartaActualCentro3]);
					this.juego.mostrarCartaCentro4(cartaCentro4[cartaActualCentro4]);
					this.juego.mostrarCartaCentro5(cartaCentro5[cartaActualCentro5]);
					turno = 0;
					//muestra carta
				}else {
				//gana jugador 2
				}
			}
		}
		else if ((x>=320)&&(x<=429)&&(y>=250)&&(y<=400)&&(turno==1))
		{
			// Mostrar la carta del Mazo 2

			uno = mazoJugador1[cartaActualJugador1] % 13;
			if(uno==0)
			{
				uno = 13;
			}
			dos = mazoJugador2[cartaActualJugador2] % 13;
			if(dos==0)
			{
				dos = 13;
			}
			if(uno>dos)
			{
				puntosJugador1++;
				this.juego.aumentarPuntosJugador1();
				this.juego.lblMensajeRonda.setText("Jugador 1 gana esta ronda!");
				this.juego.dlgMensajeRonda.setVisible(true);
			}
			else if (uno<dos)
			{
				puntosJugador2++;
				this.juego.aumentarPuntosJugador2();
				this.juego.lblMensajeRonda.setText("Jugador 2 gana esta ronda!");
				this.juego.dlgMensajeRonda.setVisible(true);
			}
			else // uno = dos
			{
				this.juego.lblMensajeRonda.setText("Nadie gana esta ronda!");
				this.juego.dlgMensajeRonda.setVisible(true);
			}
			cartaActualJugador1++;
			cartaActualJugador2++;
			turno = 0;
		}
		if((puntosJugador1 >= 4) && (puntosJugador1 >= puntosJugador2+2))
		{
			// Ganador el Jugador 1
			this.juego.lblMensajeFinPartida.setText("GANA Jugador 1");
			this.juego.dlgMensajeFinPartida.setVisible(true);
		}
		else if ((puntosJugador2 >= 4) && (puntosJugador2 >= puntosJugador1+2))
		{
			// Ganador el Jugador 2
			this.juego.lblMensajeFinPartida.setText("GANA Jugador 2");
			this.juego.dlgMensajeFinPartida.setVisible(true);
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
			this.modelo.barajar(mazoJugador1, mazoJugador2);
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
