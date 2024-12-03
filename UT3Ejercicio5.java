/*Escribe una función recursiva que calcule el enésimo término de la serie de Fibonacci. En esta
serie el enésimo valor se calcula sumando los dos valores anteriores de la serie. (RA4)
𝑓𝑖𝑏𝑜𝑛𝑎𝑐𝑐𝑖(𝑛) = 𝑓𝑖𝑏𝑜𝑛𝑎𝑐𝑐𝑖(𝑛 − 1) + 𝑓𝑖𝑏𝑜𝑛𝑎𝑐𝑐𝑖(𝑛 − 2)
𝑓𝑖𝑏𝑜𝑛𝑎𝑐𝑐𝑖(0) = 1
𝑓𝑖𝑏𝑜𝑛𝑎𝑐𝑐𝑖(1) = 1
Prueba desde el programa principal (main) el funcionamiento de la función. (RA2)*/
import java.util.Scanner;

public class UT3Ejercicio5 {
    // Función recursiva para calcular el enésimo término de la serie de Fibonacci
    public static int fibonacci(int n) {
        if (n == 0) {
            return 1;
        }
        else if (n == 1) {
            return 1;
        }
        return n;
    }
// Programa principal para comprobar la finción
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("El término" + n + "de la serie de Fibonacci es:" + fibonacci(n));
    }
}

