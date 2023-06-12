package es.studium.Poker;

public class Principal {

	public static void main(String[] args)
	{
		new Controlador(new Juego(), new Modelo(), new MenuPrincipal());
	}
}
