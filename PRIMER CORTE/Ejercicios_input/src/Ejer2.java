///Ejercicio 2 — Conversor de temperatura
///Pide al usuario una temperatura en Celsius y conviértela a Fahrenheit y Kelvin.
///Fórmulas:
///F = (C × 9/5) + 32
///K = C + 273.15
///Dato de entrada: double temperatura en Celsius
///Salida esperada:
///25.0 °C = 77.0 °F = 298.15 K

import java.util.Scanner;

public class Ejer2 {

    public static void main(String[] args) {

        Scanner temperatura = new Scanner(System.in);

        System.out.println("Ingresa la temperatura en celsius: ");
        double celsius =  temperatura.nextDouble();

        double Fahrenheit = (celsius*9.0/5.0) + 32;
        double Kelvin = (celsius + 273.15);

        System.out.println(celsius + "°C " + Fahrenheit + "°F " + Kelvin + "K" );
     
        temperatura.close();
    }
}