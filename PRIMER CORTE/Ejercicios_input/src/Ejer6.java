///Ejercicio 6 — Demostración por valor
///Pide al usuario dos números enteros a y b. Asigna b = a, luego pide un nuevo valor para b. 
///Imprime a y b después del cambio y explica con un mensaje en consola por qué a no cambió.
///Datos de entrada: int a, int b (dos veces)
///Salida esperada:
///a = 10  ← no cambió, se pasó por VALOR
///b = 99  ← esta sí cambió

import java.util.Scanner;

public class Ejer6 {

    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in);

        int a, b;

        System.out.print("Ingrese el valor de a: ");
        a = valor.nextInt();

        System.out.print("Ingrese el valor de b: ");
        b = valor.nextInt();

        b = a;

        System.out.print("Ingrese un nuevo valor para b: ");
        b = valor.nextInt();

        System.out.println("a = " +  a);
        System.out.println("b = " + b );
        
        valor.close();
    }
}