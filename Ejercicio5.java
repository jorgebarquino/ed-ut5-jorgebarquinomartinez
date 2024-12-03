import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        double temperatura;
        String mes;
        int dia;
        Scanner sc = new Scanner(System.in);
        System.out.print("temperatura: ");
         temperatura = sc.nextDouble();
        System.out.print("mes: ");
        mes = sc.next();
        System.out.print("dia: ");
        dia = sc.nextInt();
        System.out.print("El"+ dia + "de" + mes + "hace temperatura de " + temperatura + "grados");


    }
}
