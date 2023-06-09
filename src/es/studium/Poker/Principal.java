package es.studium.Poker;

public class Principal {

	public static void main(String[] args)
	{
		Modelo modelo = new Modelo();
		MenuPrincipal menuPrincipal = new MenuPrincipal();
		Juego juego = new Juego();
		new Controlador(modelo, menuPrincipal);
		new ControladorJuego(juego, modelo);
	}
}