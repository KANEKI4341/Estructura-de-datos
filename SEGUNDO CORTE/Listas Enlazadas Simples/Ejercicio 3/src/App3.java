//3. Torre de Control (Aterrizajes de Emergencia)
//Simula la cola de aviones esperando para aterrizar en un aeropuerto congestionado.
//La Clase Vuelo (Nodo): Debe contener numeroVuelo (String), aerolinea (String), 
//combustibleRestante (int) y pasajeros (int).
//El Problema: Normalmente los vuelos se forman al final de la cola. Sin embargo, 
//si un vuelo reporta menos de 10 unidades de combustible, debe ser movido inmediatamente al inicio de la lista (Cabeza).
//Reto: Implementar el método reportarEmergencia(String numeroVuelo) que busque un 
//vuelo en la cola y lo mueva al principio.

import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion;
        ColaVuelos cola = new ColaVuelos();

        do {
            System.out.println("\n===============================");
            System.out.println("   TORRE DE CONTROL - VUELOS");
            System.out.println("===============================");
            System.out.println("1. Registrar vuelo en la cola");
            System.out.println("2. Mostrar cola de vuelos");
            System.out.println("3. Reportar emergencia de combustible");
            System.out.println("0. Finalizar programa");
            System.out.println("===============================");
            System.out.print("Selecciona una opción: ");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    entrada.nextLine(); 
                    System.out.print("Número de vuelo: ");
                    String numero = entrada.nextLine();
                    System.out.print("Aerolínea: ");
                    String aerolinea = entrada.nextLine();
                    System.out.print("Combustible restante: ");
                    int combustible = entrada.nextInt();
                    System.out.print("Cantidad de pasajeros: ");
                    int pasajeros = entrada.nextInt();

                    Vuelo nuevoVuelo = new Vuelo(numero, aerolinea, combustible, pasajeros);
                    cola.agregarVuelo(nuevoVuelo);
                    break;

                case 2:
                    System.out.println("\n*** Cola de vuelos ***");
                    cola.mostrarCola();
                    break;

                case 3:
                    entrada.nextLine();
                    System.out.print("Ingrese el número de vuelo en emergencia: ");
                    String vueloEmergencia = entrada.nextLine();
                    cola.reportarEmergencia(vueloEmergencia);
                    break;

                case 0:
                    System.out.println("Programa finalizado. ¡Buen aterrizaje!");
                    break;

                default:
                    System.out.println("Opción inválida, intenta nuevamente.");
            }

        } while (opcion != 0);

        entrada.close();
    }
}
