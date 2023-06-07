package prueba;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BarajaDeCartasController {
    private List<Carta> cartas;
    private BarajaDeCartasView vista;

    public BarajaDeCartasController(BarajaDeCartasView vista) {
        this.vista = vista;
        cartas = new ArrayList<>();

        // Crear todas las cartas de la baraja
        String[] palos = {"Corazones", "Diamantes", "Tréboles", "Picas"};
        String[] valores = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        for (String palo : palos) {
            for (String valor : valores) {
                Carta carta = new Carta(valor, palo);
                cartas.add(carta);
            }
        }
    }

    public void barajar() {
        Random rnd = new Random();

        for (int i = cartas.size() - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            Carta temp = cartas.get(index);
            cartas.set(index, cartas.get(i));
            cartas.set(i, temp);
        }
    }

    public Carta repartirCarta() {
        if (cartas.isEmpty()) {
            return null; // No hay más cartas en la baraja
        }
        return cartas.remove(0);
    }

    public int cantidadDeCartas() {
        return cartas.size();
    }

    public void mostrarCarta() {
        Carta carta = repartirCarta();
        vista.mostrarCarta(carta);
    }

    public void mostrarCantidadDeCartas() {
        int cantidad = cantidadDeCartas();
        vista.mostrarCantidadDeCartas(cantidad);
    }
}

