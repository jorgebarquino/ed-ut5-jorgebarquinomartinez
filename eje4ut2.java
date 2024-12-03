import java.util.Scanner;


public class eje4ut2 {
    public static void main(String[] args) {
        float n;
        boolean c=false;
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<5; i++) {
            do {
                System.out.println("Introduce " + (i+1) +" nota del 1 al 10: ");
                n = sc.nextInt();
                if (n<0 || n>10) {
                    System.out.println("Nota incorrecta ");
                }
            } while (n<0 || n>10);
            if (n < 5) {
                c=true;
                break;
            }
        }
            if (!c)
                System.out.print("No hay suspensos");
            else
                System.out.print("Hay Suspensos");
        }
    }


