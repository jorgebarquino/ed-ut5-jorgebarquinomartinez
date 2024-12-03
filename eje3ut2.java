import java.util.Scanner;

public class eje3ut2 {
    public static void main(String[] args) {
        int n, a;
        Scanner sc = new Scanner(System.in);
        n=1+(int) (Math.random() * 100);
        do {
            System.out.print("Introduce un numero entre el 1 y el 100");
            a = sc.nextInt();
            if (a > n)
                System.out.print("El numero secreto es menor al introducido");
            else if (a < n) {
                System.out.print("El numero secreto es mayor al introducido");

            } else
                System.out.print("Enhorabuena. El numero secreto es menor al introducido");

        }while (n != a);

}
}