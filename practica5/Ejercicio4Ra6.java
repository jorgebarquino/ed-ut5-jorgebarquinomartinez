package practica5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio4Ra6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu dirección de correo electrónico: ");
        String correo = scanner.nextLine();

        String regex = "^[a-zA-Z0-9._-]+@alu\\.gva\\.es$";

        Pattern patron = Pattern.compile(regex);

        Matcher matcher = patron.matcher(correo);

        if (matcher.matches()) {
            System.out.println("La dirección de correo electrónico es válida.");
        } else {
            System.out.println("La dirección de correo electrónico no es válida.");
        }

        scanner.close();
    }
}
