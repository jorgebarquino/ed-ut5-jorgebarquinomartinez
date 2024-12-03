package practica5;

import java.util.Scanner;

public class Ejercicio2Ra6 {
    public static void main(String[] args) {

        int numeroAleatorio;
        int sumaColumna=0, sumaColumna1=0, sumaColumna2=0;
        int fila, columna;
        boolean continuar = true;

        Scanner entrada = new Scanner(System.in);

        int[][] grupos = new int[5][3];

        for (int i = 0; i < grupos.length; i++) {
            for (int j = 0; j < grupos[i].length; j++) {
                grupos[i][j] = numeroAleatorio = (int) Math.floor(Math.random() * (10 - 1 + 1) + 1);
            }
        }
        System.out.println("Las notas del grupo son: ");
        for (int i = 0; i < grupos.length; i++) {
            System.out.println();
            for (int j = 0; j < grupos[i].length; j++) {
                System.out.print(" [" + grupos[i][j] + "] ");
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                sumaColumna = sumaColumna + grupos[j][i];
            }
            System.out.println("\nEl promedio del grupo en el " + (i+1) + " Trimestre es " + (double)(sumaColumna)/5);
            sumaColumna=0;
        }

        do {
            int sumaFila=0;
            System.out.print("\nSeleciona el Alumno del cual quieras saber su Nota Media (1, 2, 3, 4 o 5): ");

            fila = entrada.nextInt();

            while (fila < 1 || fila > 5) {
                System.out.print("Posición inválida. Debe estar entre 1 y 5. Intenta de nuevo: ");
                fila = entrada.nextInt();
            }

            for (int j = 0; j < 3; j++) {
                sumaFila = sumaFila + grupos[fila - 1][j];
            }

            System.out.println("\nLa nota media del Alumno " + fila + " es:  " + (double) (sumaFila) / 3);

            System.out.println("\n¿Quieres saber la media de otro Alumno? SI/NO");
            entrada.nextLine();
            if(entrada.nextLine().equalsIgnoreCase("NO")){
                continuar=false;
            }

        } while(continuar == true);

        System.out.println("\n ¡ADIOS!");


    }


}