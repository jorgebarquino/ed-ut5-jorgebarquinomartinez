
/*
1. Inicio
2. Leer C1, C2, C3, C4
3. Hacer S = C1 + C2 + C3 + C4
4. Hacer P = S/4
5. Escribir P
6. Fin
 */

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("C1: ");
        float C1 = sc.nextFloat();
        System.out.print("C2: ");
        float C2 = sc.nextFloat();
        System.out.print("C3: ");
        float C3 = sc.nextFloat();
        System.out.print("C4: ");
        float C4 = sc.nextFloat();
        float S = C1 + C2 + C3 + C4;
        float P = S / 4;
        System.out.print(P);
    }
        }