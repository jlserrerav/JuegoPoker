package prueba;

public class BarajaDeCartasView {
    public void mostrarCarta(Carta carta) {
        System.out.println("Carta: " + carta.getValor() + " de " + carta.getPalo());
    }

    public void mostrarCantidadDeCartas(int cantidad) {
        System.out.println("Cantidad de cartas restantes: " + cantidad);
    }
}
