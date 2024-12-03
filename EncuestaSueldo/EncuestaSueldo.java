package EncuestaSueldo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class EncuestaSueldo {
    public static void main(String[] args) {
        int sueldo;
        Integer encuestados;
        int suma=0;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el número de encuestados : ");
        encuestados = entrada.nextInt();
        while (encuestados < 0) {
            System.out.println("El valor no puede ser negativo");
            System.out.print("Introduce el número de encuestados : ");
            encuestados = entrada.nextInt();
        }
        Integer [] sueldosEncuestados = new Integer[encuestados];
        for (int i = 0; i < encuestados; i++) {
            System.out.println("Introduce el Sueldo " + (i+1) );
            sueldosEncuestados[i] = entrada.nextInt();
        }
        Arrays.sort(sueldosEncuestados, Collections.reverseOrder());
        for(int i = 0; i < sueldosEncuestados.length; i++){
            suma= suma + sueldosEncuestados[i];
        }
        System.out.println("La lista ordenada es la siguiente:");
        for (int sueldoEncuestado : sueldosEncuestados) {
            System.out.println(sueldoEncuestado + " € ");
        }
        System.out.println("El sueldo medio es: " +  (suma/encuestados) + " € ");
        int maximo;
        int minimo;
        maximo = sueldosEncuestados[0];
        minimo = sueldosEncuestados[0];

        for(int valor: sueldosEncuestados) {
            if (valor > maximo) {
                maximo = valor;
            }
            if (valor < minimo) {
                minimo = valor;
            }
        }
        System.out.println("El sueldo máximo es: " + maximo + " € ");
        System.out.println("El sueldo mínimo es: " + minimo + " € ");
    }

}