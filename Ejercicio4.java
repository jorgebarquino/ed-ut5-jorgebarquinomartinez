import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int numHormigas, numArañas, numCochinilla, totalpatas;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el numero de hormigas: ");
        int hormigas = sc.nextInt();
        System.out.print("Ingrese el numero de arañas: ");
        int arañas = sc.nextInt();
        System.out.print("Ingrese el numero de cochinilla: ");
        int cochinilla = sc.nextInt();

        totalpatas = hormigas * 6 + arañas * 8 + cochinilla * 14;
        System.out.print("El total de patas es: " + totalpatas);






    }
}
