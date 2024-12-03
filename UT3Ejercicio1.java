/*La clase Math de la API de Java contiene diversas funciones estáticas para realizar distintas
operaciones matemáticas. En los anteriores ejercicios hemos utilizado algunas de ellas Math.pow,
Math.sqrt y Math.random.Escribe un programa que solicite varios números por teclado y que te permitan probar 10 de estas
funciones (a tu elección), distintas a las mencionadas anteriormente. Escribe un comentario al
lado de la llamada a cada función que explique qué realiza cada función.*/

import java.util.Scanner;
public class UT3Ejercicio1 {
    static long fibo(int n) {
        long i;
        if (n == 0 || n == 1)
            i = n;
        else
            i = fibo(n - 1) + fibo(n - 2);
        return i;
    }

    static long fibo2(int n) {
        int f0 = 0, f2 = 0;
        int f1 = 1;
        //if (n == 0)
        //f2 = n;
        //else if (n < 3)
        //f2 = 1;
        //else
        for (int i = 1; i <= n; i++) {
            f2 = f0 + f1;
            f0 = f1;
            f1 = f2;
        }
        return f0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < 8; i++) {
            System.out.println("fibo 7:" + fibo2(i));
        }
    }
}
