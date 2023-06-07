package es.studium.Poker;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ControladorAyuda  implements WindowListener, MouseListener{

	Modelo modelo;
	Ayuda ayuda;
	Ayuda2 ayuda2;
	MenuPrincipal menuPrincipal;
	ControladorAyuda (Modelo m, Ayuda a)
	{
		this.modelo = m;
		this.ayuda = a;


		this.ayuda.addWindowListener(this);
		this.ayuda.addMouseListener(this);

	}

	@Override
	public void mouseClicked(MouseEvent me) {
		int x = me.getX();
		int y = me.getY();
		// Botón SIGUIENTE de Ayuda
		if(x>40&&x<166&&y>425&&y<475)
		{
			menuPrincipal.setVisible(true);
			ayuda.setVisible(false);

		}
		else if (x>740&&x<866&&y>425&&y<475)
		{
			ayuda2 = new Ayuda2();
			this.ayuda2.addWindowListener(this);
			this.ayuda2.addMouseListener(this);
			ayuda2.setVisible(true);
			ayuda.setVisible(false);
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