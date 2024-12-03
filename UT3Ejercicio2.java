/*Diseña 2 funciones: la 1ª calculará y devolverá la superficie de una esfera; la 2ª calculará y
        devolverá su volumen. Ambas funciones recibirán como parámetros el radio (tipo real). (RA4)
        𝑆𝑢𝑝𝑒𝑟𝑓𝑖𝑐𝑖𝑒 = 4𝜋 · 𝑟𝑎𝑑𝑖𝑜2
        𝑉𝑜𝑙𝑢𝑚𝑒𝑛 =
        4𝜋
        · 𝑟𝑎𝑑𝑖𝑜3
        3 */


import java.util.Scanner;
class UT3Ejercico2 {
    static double superficieEsfera (double r) {
        return 4*Math.PI*Math.pow(r, 2);
    }
    static double VolumenEsfera (double r) {
        return 4*Math.PI*Math.pow(r, 3);
    }
    public static void main(String[] args) {
        double r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor del radio de la esfera: ");
        r = sc.nextDouble();
        System.out.print("Ingrese el valor de la superficie de la esfera: " + superficieEsfera(r));
        System.out.print("Ingrese el valor de la volumen de la esfera: " + VolumenEsfera(r));
    }
}
