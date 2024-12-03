package practica5;

import java.util.Scanner;

public class GestionPuntos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la cantidad de puntos: ");
        int cantidad = scanner.nextInt();

        Punto[] puntos = new Punto[cantidad];

        for (int i = 0; i < cantidad; i++) {
            puntos[i] = new Punto();
            System.out.println("Información del punto " + (i + 1) + ":");
            puntos[i].muestra();
        }

        scanner.close();
    }
}
