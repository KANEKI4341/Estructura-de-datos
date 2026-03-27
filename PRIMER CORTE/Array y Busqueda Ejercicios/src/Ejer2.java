///2. Buscador de Cédulas (Base de Datos Bancaria)
///Un banco tiene una lista de 1.000 clientes organizados de forma estricta y ascendente 
///por su número de cédula o ID.
///El Problema: Un cliente llega a la ventanilla y da su número. El sistema debe encontrar 
///sus datos de la manera más rápida posible (en pocos pasos).
///Algoritmo a usar: Búsqueda Binaria. Como los datos ya están ordenados, este algoritmo 
///permitirá encontrar al cliente dividiendo la lista a la mitad en cada paso.

import java.util.Scanner;

public class Ejer2 {

    public static void main(String[] args) {

        Scanner ID = new Scanner(System.in);

        int[] cedulas = {
            10234, 11345, 12456, 13567, 14678,
            15789, 16890, 17901, 19012, 20123,
            21234, 22345, 23456, 24567, 25678,
            26789, 27890, 28901, 30012, 31123,
            32234, 33345, 34456, 35567, 36678
        };

        int low = 0;
        int high = cedulas.length - 1;

        System.out.print("Ingrese su numero de cedula: ");
        int Cedula = ID.nextInt();
        ID.close();

        while (low <= high) {

            int mitad = low + (high - low) / 2;

            if (cedulas[mitad] == Cedula) {
                System.out.println("Cedula encontrada en la posicion: " + mitad);
                return; 
            }
            else if (cedulas[mitad] < Cedula) {
                low = mitad + 1;  
            }
            else {
                high = mitad - 1; 
            }
        }

        System.out.println("Cedula no encontrada");
    }
}
