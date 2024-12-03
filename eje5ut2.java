import java.util.Scanner;


public class eje5ut2 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        for (int i=0; i<a; i++) {

            for (int n = 0; n <= i; n++) {
                System.out.println("*");
            }
            System.out.println("\n");
        }
    }
}
