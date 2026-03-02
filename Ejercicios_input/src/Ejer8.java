///Ejercicio 8 — Copia real vs referencia
///Pide al usuario 3 calificaciones para llenar notas[]. Crea una copia real 
///en notasRespaldo[] copiando elemento por elemento. Modifica notas[0] con 
///un valor que el usuario ingrese. Muestra ambos arreglos y verifica que notasRespaldo no cambió.
///Datos de entrada: double × 3 notas, double nuevo valor para notas[0]
///Salida esperada:
///notas[0]         = 4.5  ← cambió
///notasRespaldo[0] = 3.2  ← no cambió, es una copia independiente

import java.util.Scanner;

public class Ejer8 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double[] notas = new double[3];
        double[] notasRespaldo = new double[3];

        System.out.println("Ingrese 3 calificaciones:");

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = teclado.nextDouble();
        }

        for (int i = 0; i < notas.length; i++) {
            notasRespaldo[i] = notas[i];
        }

        System.out.print("\nIngrese nuevo valor para notas[0]: ");
        notas[0] = teclado.nextDouble();


        System.out.println("==== RESULTADOS ====");

        System.out.println("notas[0]         = " + notas[0]);
        System.out.println("notasRespaldo[0] = " + notasRespaldo[0]);

        teclado.close();
    }
}
