package es.studium.Poker;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Controlador implements WindowListener, MouseListener
{
	Modelo modelo;
	MenuPrincipal menuPrincipal;
	Tablero tablero;
	Tablero1 tablero1;
	Juego juego;
	Ranking ranking;
	Ayuda ayuda;
	int mazoJugador1[] = new int[26];
	int mazoJugador2[] = new int[26];
	int cartaActualJugador1 = 0;
	int cartaActualJugador2 = 0;
	int puntosJugador1 = 0;
	int puntosJugador2 = 0;
	int turno = 0; // 0 turno jugador 1, 1 turno jugador 2
	int uno, dos;

	Controlador(Modelo m, MenuPrincipal mp)
	{
		this.modelo = m;
		this.menuPrincipal = mp;

		this.menuPrincipal.addWindowListener(this);
		this.menuPrincipal.addMouseListener(this);
	}
	

	@Override
	public void windowOpened(WindowEvent e){}
	@Override
	public void windowClosing(WindowEvent e)
	{
		if(tablero!=null&&tablero.isActive())
		{
			tablero.setVisible(false);
		}
		if(juego!=null&&juego.isActive())
		{
			juego.setVisible(false);
		}
		else if(ranking!=null&&ranking.isActive())
		{
			ranking.setVisible(false);
		}
		else if(menuPrincipal!=null&&menuPrincipal.isActive())
		{
			menuPrincipal.setVisible(false);
		}
}
	@Override
	public void windowClosed(WindowEvent e){}
	@Override
	public void windowIconified(WindowEvent e){}
	@Override
	public void windowDeiconified(WindowEvent e){}
	@Override
	public void windowActivated(WindowEvent e){}
	@Override
	public void windowDeactivated(WindowEvent e){}

	@Override
	public void mouseClicked(MouseEvent me)
	{
		int x = me.getX();
		int y = me.getY();

		if(menuPrincipal.isActive())
		{
			if(x>80&&x<206&&y>150&&y<200)
			{
				// Primera opción: Tablero
				tablero = new Tablero();
				this.tablero.addWindowListener(this);
				this.tablero.addMouseListener(this);
			}
			else if(x>80&&x<206&&y>250&&y<300)
			{
				Ayuda ayuda = new Ayuda();
				ayuda.AyudaPoker();

			}
			else if(x>80&&x<208&&y>350&&y<400)
			{
				// Tercer opción: Ranking
				ranking = new Ranking();
				this.ranking.addWindowListener(this);
				this.ranking.addMouseListener(this);
			}
			else if(x>80&&x<207&&y>450&&y<500)
			{
				// Cuarta opción: Salir
				System.exit(0);
			}
		}
		
			
		else if(tablero.isActive())
		{
			// Botón ATRAS de Tablero
			if(x>40&&x<166&&y>425&&y<475)
			{
				
				menuPrincipal.setVisible(true);
				tablero.setVisible(false);

			}
			// Botón SIGUIENTE de Tablero
			else if (x>740&&x<866&&y>425&&y<475)
			{
				tablero1 = new Tablero1();
				this.tablero1.addWindowListener(this);
				this.tablero1.addMouseListener(this);
				tablero1.setVisible(true);
				tablero.setVisible(false);
			}
		}
		
		
		
		else if(tablero1.isActive())
		{
			// Botón ATRAS de Tablero1
			if(x>40&&x<166&&y>425&&y<475)
			{

				tablero.setVisible(true);
				tablero1.setVisible(false);

			}
			else if (x>740&&x<866&&y>425&&y<475)
			{
				juego  = new Juego();
				this.juego.addWindowListener(this);
				this.juego.addMouseListener(this);
				juego.setVisible(true);
				tablero1.setVisible(false);
			}
		}
		
		else if(ranking.isActive())
		{
			if(x>40&&x<166&&y>425&&y<475)
			{
				menuPrincipal.setVisible(true);
				ranking.setVisible(false);
			}
		}
	}


	@Override
	public void mousePressed(MouseEvent e){}
	@Override
	public void mouseReleased(MouseEvent e){}
	@Override
	public void mouseEntered(MouseEvent e){}
	@Override
	public void mouseExited(MouseEvent e){}
}