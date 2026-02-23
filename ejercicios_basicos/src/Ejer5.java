///Ejercicio 5 — Conversor de unidades
///Una aplicación de cocina necesita convertir unidades:


import java.util.Scanner;

///Declara una variable tazas (double) con la cantidad de tazas de un ingrediente.
///Convierte a mililitros (1 taza = 236.588 ml) y guarda el resultado en otra variable.
///Convierte también a litros.
///Muestra las tres medidas por consola. 

public class Ejer5 {

    public static void main(String[] args) {
        
        Scanner unidades = new Scanner(System.in);

        double taza;
        double mililitro;
        double litro;

        System.out.println("Ingresa la catidad de taza: ");
        taza = unidades.nextDouble();

        mililitro = taza * 236.588;

        litro = mililitro / 1000;

        System.out.println(" === CONVERSOR DE UNIDADES === ");
        System.out.println("Taza: " + taza );
        System.out.println("Millitro: " + mililitro + " ml");
        System.out.println("litro: " + litro + " l" );

        unidades.close();


    }
    
}
