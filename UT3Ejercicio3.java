/*Crea una función que muestre por consola una serie de números aleatorios enteros. Los
parámetros de la función serán: la cantidad de números aleatorios que se mostrarán y los valores
mínimos y máximos que estos pueden tomar. (RA4)
Prueba desde el programa principal (main) el funcionamiento de la función. (RA2)*/

/*Ejercicio 4 (RA2, RA4)
Sobrecarga la función realizada en el ejercicio anterior para que el único parámetro sea la
cantidad de números aleatorios que se muestra por consola. Los números aleatorios serán reales
y estarán comprendidos entre 0 y 1. (RA4)
Prueba desde el programa principal (main) el funcionamiento de la función. (RA2)*/

import java.util.Scanner;

public class UT3Ejercicio3 {
    /* ejercicio 3  primera parte del ejercicio*/
    static void numeroaleatorio(int num, int minimo, int maximo) {
        for (int i = 0; i < num; i++) {
            System.out.print(minimo + (int) (Math.random() * (maximo - minimo)) + " \t");
        }
        System.out.println("\n");
    }

    /* ejercicio4 */
    static void numeroaleatorio(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print(Math.random() + " \t");
        }
    }
    /* tramo final del ejercicio 4 */

    // Llamadas
    public static void main(String[] args) {
        int numero, min, max;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de numeros que desea: ");
        numero = sc.nextInt();
        System.out.print("Introduzca el valor de minimo que desea: ");
        min = sc.nextInt();
        System.out.print("Introduzca el valor de maximo que desea: ");
        max = sc.nextInt();

        numeroaleatorio(numero, min, max);
        numeroaleatorio(numero); /* llamada ejercicio 4 para sobrecargar */
    }
}

