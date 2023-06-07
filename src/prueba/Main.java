package prueba;

public class Main {
	    public static void main(String[] args) {
	        BarajaDeCartasView vista = new BarajaDeCartasView();
	        BarajaDeCartasController controlador = new BarajaDeCartasController(vista);
	        controlador.barajar();

	        // Repartir algunas cartas de ejemplo y mostrar la cantidad restante
	        for (int i = 0; i < 5; i++) {
	            controlador.mostrarCarta();
	        }

	        controlador.mostrarCantidadDeCartas();
	    }
	

}
