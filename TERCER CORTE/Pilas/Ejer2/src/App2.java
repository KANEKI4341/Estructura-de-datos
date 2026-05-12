//2. Control de Calidad (Línea de Ensamblaje)
//Un brazo robótico en una fábrica de motores apila componentes siguiendo una secuencia precisa. 
//Un sensor de visión artificial inspecciona cada pieza después de ser colocada.
//La Clase Pieza (Nodo): Debe contener nombrePieza (String), numeroSerie (String) y esDefectuosa (boolean).
//El Problema: Si el sensor detecta una pieza defectuosa, la línea de producción debe detenerse inmediatamente.
//Reto: Crea un método limpiarHastaDefecto() que extraiga (pop) todas las piezas de la pila hasta encontrar 
//la primera que tenga esDefectuosa = true. El método debe imprimir el nombre de todas las piezas "buenas" 
//que tuvieron que ser retiradas y descartadas antes de llegar a la pieza fallida.

import java.util.Scanner;

public class App2 {

    public static void main(String[] args) {

        Sensor sensor = new Sensor();
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {

            System.out.println("\n=== SISTEMA DE CONTROL DE CALIDAD ===");
            System.out.println("1. Ver piezas en la pila");
            System.out.println("2. Registrar nueva pieza ");
            System.out.println("3. Retirar pieza del tope ");
            System.out.println("4. Limpiar hasta encontrar defecto");
            System.out.println("5. Ver pieza del tope ");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.println("\nEstado actual de la pila:");
                    sensor.imprimir();

                    break;

                case 2:

                    System.out.print("Nombre de la pieza: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Número de serie: ");
                    String serie = scanner.nextLine();

                    System.out.print("¿Es defectuosa? (true/false): ");
                    boolean defecto = scanner.nextBoolean();

                    sensor.push(new Pieza(nombre, serie, defecto));

                    System.out.println("Pieza agregada correctamente.");

                    break;

                case 3:

                    Pieza retirada = sensor.pop();

                    if (retirada != null) {
                        System.out.println("Se retiró la pieza:");
                        System.out.println(retirada);
                    } else {
                        System.out.println("La pila está vacía.");
                    }

                    break;

                case 4:

                    System.out.println("\n--- LIMPIANDO HASTA ENCONTRAR DEFECTO ---");
                    sensor.limpiarHastaDefecto();

                    break;

                case 5:

                    Pieza tope = sensor.peek();

                    if (tope != null) {
                        System.out.println("Pieza en el tope:");
                        System.out.println(tope);
                    } else {
                        System.out.println("La pila está vacía.");
                    }

                    break;

                case 6:

                    System.out.println("Saliendo del sistema...");

                    break;

                default:

                    System.out.println("Opción no válida.");
            }

        } while (opcion != 6);

        scanner.close();
    }
}