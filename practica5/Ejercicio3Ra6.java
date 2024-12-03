package practica5;

public class Ejercicio3Ra6 {
    public static void main(String[] args) {

        String texto = "  Hola, Mundo! Bienvenido a Java.  ";

        System.out.println("1. length(): " + texto.length());

        System.out.println("2. toUpperCase(): " + texto.toUpperCase());

        System.out.println("3. toLowerCase(): " + texto.toLowerCase());

        System.out.println("4. trim(): '" + texto.trim() + "'");

        System.out.println("5. substring(7, 12): " + texto.substring(7, 12));

        System.out.println("6. charAt(5): " + texto.charAt(5));

        System.out.println("7. indexOf('o'): " + texto.indexOf('o'));

        System.out.println("8. replace('Mundo', 'Java'): " + texto.replace("Mundo", "Java"));

        System.out.println("9. contains('Java'): " + texto.contains("Java"));

        String[] partes = texto.split(" ");
        System.out.print("10. split(' '): ");
        for (String parte : partes) {
            System.out.print(parte + " ");
        }
        System.out.println();

        System.out.println("11. startsWith('  Hola'): " + texto.startsWith("  Hola"));

        System.out.println("12. endsWith('Java.  '): " + texto.endsWith("Java.  "));
    }
}
