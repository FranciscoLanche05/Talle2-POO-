package EjercicioAvanzado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        double nuevoValor = -600;
        int nuevoStock = -20;

        Producto producto1 = new Producto("gorra",15.50,5);

        producto1.setPrecio(nuevoValor);
        producto1.setStock(nuevoStock);
        producto1.mostrarDatos();
        producto1.calcularPrecioTotal();
    }
}
