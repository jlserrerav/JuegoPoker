package es.studium.Poker;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ControladorRanking  implements WindowListener, MouseListener{

	Modelo modelo;
	Ranking ranking;
	MenuPrincipal menuPrincipal;
	ControladorRanking (Modelo m, Ayuda a)
	{
		this.modelo = m;
		this.ranking.addWindowListener(this);
		this.ranking.addMouseListener(this);

	}

	@Override
	public void mouseClicked(MouseEvent me) {
		int x = me.getX();
		int y = me.getY();
		if(ranking.isActive())
			{
				if(x>40&&x<166&&y>425&&y<475)
				{
					menuPrincipal.setVisible(true);
					ranking.setVisible(false);
				}
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
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
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
