import java.util.Scanner;
//31     28     30      31      30      31      31  30  31 30 31

public class ej1ut2 {
    public static void main(String[] args) {
        int dia, mes;
        Scanner sc = new Scanner(System.in);
        dia = sc.nextInt();
        mes = sc.nextInt();
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                if (dia > 31)
                    System.out.println("Fecha incorrecta");
                else
                    System.out.println("Fecha correcta");
                break;
            case 2:
                if (dia > 28)
                    System.out.println("Fecha incorrecta");
                else
                    System.out.println("Fecha correcta");
                break;

            case 4, 6, 9, 11:
                if (dia > 30)
                    System.out.println("Fecha incorrecta");
                else
                    System.out.println("Fecha correcta");
            default:
                if (dia > 30)
                    System.out.println("Fecha incorrecta");
        }
    }

}
