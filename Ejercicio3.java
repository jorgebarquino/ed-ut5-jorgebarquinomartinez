import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        float mm, cm, m,totalCm ;
        Scanner sc = new Scanner(System.in);
        System.out.print("mm: ");
        mm = sc.nextFloat();
        System.out.print("cm: ");
        cm = sc.nextFloat();
        System.out.print("m: ");
        m = sc.nextFloat();


        totalCm = mm/10 + cm +m*100 ;
        System.out.print("Distacia: " + totalCm);

    }
}
