import java.util.Scanner;
/*Ejercicio 1: Crea un programa que lea por teclado tres números enteros, calcule el
mayor de los tres y lo muestre por salida estándar.
*/

public class Ejemplo1 {
    public static void main(String[] args) {
        int a=0, buf;
        Scanner sc = new Scanner(System.in);

        for (int C=0; C<3; C++) {
            System.out.print("Numero" + (C+1) + ": ");
            buf = sc.nextInt();
            if(buf>a)
                a=buf;
        }
        System.out.print(a);

    }
}
