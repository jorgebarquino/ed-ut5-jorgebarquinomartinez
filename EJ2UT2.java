import java.util.Scanner;


public class EJ2UT2 {
    public static void main(String[] args) {
        double a, b, c, x1, x2 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de a: ");
        a = sc.nextDouble();
        System.out.println("Ingrese el valor de b: ");
        b = sc.nextDouble();
        System.out.println("Ingrese el valor de c: ");
        c = sc.nextDouble();
        if (a == 0)
            System.out.println("El valor de a es: 0");
        else if ((b * b - 4 * a * c)<0) {
            System.out.println("No existen valores reales");

        }
        x1=(-b+Math.sqrt(b * b - 4 * a * c))/(2 * a);
        x2=(-b-Math.sqrt(b * b - 4 * a * c))/(2 * a);
        System.out.println("El valor de x1: " + x1 + "; El valor de \nx2: " + x2);



    }
}
