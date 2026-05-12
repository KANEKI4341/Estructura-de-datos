//3. Logística de Distribución (Callejón sin Salida)
//Un centro de logística urbana tiene un muelle de carga ubicado al final de un callejón muy 
//estrecho. Los camiones de reparto entran uno tras otro y quedan "atrapados" en el orden de 
//llegada. El último camión en entrar debe ser obligatoriamente el primero en salir para 
//permitir que los demás se retiren.
//La Clase Camion (Nodo): Debe contener placa (String), conductor (String) y cargaToneladas (double).
//El Problema: El supervisor necesita saber cuánta carga total hay en el callejón sin mover los camiones 
//físicamente (solo consultando la estructura).
//Reto: Implementa un método que recorra la pila (sin destruirla permanentemente, o reconstruyéndola) y 
//calcule la suma total de cargaToneladas de todos los camiones estacionados.


import java.util.Scanner;

public class App3 {

    public static void main(String[] args) {

        Supervisor supervisor = new Supervisor();
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {

            System.out.println("\n=== SISTEMA LOGÍSTICO ===");
            System.out.println("1. Ver camiones");
            System.out.println("2. Registrar camión ");
            System.out.println("3. Retirar camión del tope ");
            System.out.println("4. Ver camión del tope ");
            System.out.println("5. Calcular carga total");
            System.out.println("6. Salir");

            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    supervisor.imprimir();

                    break;

                case 2:

                    System.out.print("Placa: ");
                    String placa = scanner.nextLine();

                    System.out.print("Conductor: ");
                    String conductor = scanner.nextLine();

                    System.out.print("Carga en toneladas: ");
                    double carga = scanner.nextDouble();

                    supervisor.push(
                            new Camion(placa, conductor, carga)
                    );

                    System.out.println("Camión agregado correctamente.");

                    break;

                case 3:

                    Camion retirado = supervisor.pop();

                    if (retirado != null) {

                        System.out.println("Camión retirado:");
                        System.out.println(retirado);

                    } else {

                        System.out.println("La pila está vacía.");
                    }

                    break;

                case 4:

                    Camion tope = supervisor.peek();

                    if (tope != null) {

                        System.out.println("Camión en el tope:");
                        System.out.println(tope);

                    } else {

                        System.out.println("La pila está vacía.");
                    }

                    break;

                case 5:

                    double total = supervisor.calcularCargaTotal();

                    System.out.println("Carga total en el callejón: "
                            + total + " toneladas.");

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