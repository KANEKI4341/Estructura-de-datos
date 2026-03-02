///Ejercicio 5 — Calculadora de IMC
///Pide nombre, peso en kg y altura en metros. Calcula el IMC y clasifícalo.
///Fórmula: IMC = peso / (altura × altura)
///Clasificación:
///IMC < 18.5 → Bajo peso
///18.5 ≤ IMC < 25 → Normal
///25 ≤ IMC < 30 → Sobrepeso
///IMC ≥ 30 → Obesidad
///Datos de entrada: String nombre, double peso, double altura

import java.util.Scanner;

public class Ejer5 {

    public static void main(String[] args) {

        Scanner calculadora = new Scanner(System.in);

        System.out.println("Ingrese el nombre: ");
        String Nombre = calculadora.nextLine();

        System.out.println( "Ingrese el peso en kilogramo: ");
        double peso = calculadora.nextDouble();

        System.out.println("Ingres la altura en metros: ");
        double altura = calculadora.nextDouble();

        double IMC = peso / (altura*altura);

        System.out.println("Nombre: " + Nombre);
        System.out.println("Peso: " + peso );
        System.out.println("Altura: " + altura);

        if (IMC < 18.5){
            System.out.println("Bajo peso");
        }else if (IMC < 25){
            System.out.println("Normal");
        }else if (IMC < 30){
            System.out.println("Sobrepeso");
        }else{
            System.out.println("Obesidad");
        }

        calculadora.close();
    }
}