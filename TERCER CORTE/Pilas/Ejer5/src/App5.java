//5. Ruta de Rescate (Espeleología Geológica)
//Un equipo de rescatistas entra en una cueva inexplorada. Para no perderse, van dejando "Estaciones de Seguridad" 
//representadas por una baliza que registra los datos del entorno.
//La Clase Estacion (Nodo): Debe contener nombrePunto (String), profundidad (int) y nivelOxigeno (double).
//El Problema: Para salir de la cueva, el equipo debe seguir las estaciones en el orden inverso al que fueron 
//colocadas (de la más profunda a la entrada).
//Reto: Implementa el método retrocederASuperficie(). Este debe mostrar el nombre de cada estación a medida que 
//se desapila. Importante: Si en alguna estación el nivelOxigeno es inferior al 18%, el sistema debe imprimir una 
//alerta de "Uso de Tanque de Emergencia Requerido" al pasar por ese punto.

import java.util.Scanner;

public class App5 {

    public static void main(String[] args) {

        Cueva cueva = new Cueva();

        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {

            System.out.println("\n=== SISTEMA DE RESCATE ===");
            System.out.println("1. Ver estaciones");
            System.out.println("2. Registrar estación");
            System.out.println("3. Retirar estación");
            System.out.println("4. Ver estación del tope");
            System.out.println("5. Retroceder a superficie");
            System.out.println("6. Salir");

            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    cueva.imprimir();

                    break;

                case 2:

                    System.out.print("Nombre del punto: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Profundidad: ");
                    int profundidad = scanner.nextInt();

                    System.out.print("Nivel de oxígeno: ");
                    double oxigeno = scanner.nextDouble();

                    cueva.push(
                            new Estacion(nombre, profundidad, oxigeno)
                    );

                    System.out.println("Estación registrada correctamente.");

                    break;

                case 3:

                    Estacion retirada = cueva.pop();

                    if (retirada != null) {

                        System.out.println("Estación retirada:");
                        System.out.println(retirada);

                    } else {

                        System.out.println("La pila está vacía.");
                    }

                    break;

                case 4:

                    Estacion tope = cueva.peek();

                    if (tope != null) {

                        System.out.println("Estación en el tope:");
                        System.out.println(tope);

                    } else {

                        System.out.println("La pila está vacía.");
                    }

                    break;

                case 5:

                    cueva.retrocederASuperficie();

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
