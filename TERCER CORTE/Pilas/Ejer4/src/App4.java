//4. Farmacia Automatizada (Dispensador Tubo LIFO)
//En una farmacia de alta tecnología, los medicamentos de alta rotación se almacenan en tubos dispensadores 
//verticales. El personal introduce las cajas por la parte superior y las retira de la misma forma 
//(el último lote en llegar es el primero en ser despachado)
//La Clase Medicamento (Nodo): Debe contener nombre (String), lote (String) y diasParaVencer (int).
//El Problema: Por norma de seguridad, no se puede despachar un medicamento si le quedan menos de 10 
//días para vencer.
//Reto: Implementa un método validarDespacho() que revise el medicamento en el tope. Si está a punto de 
//vencer, debe ser retirado automáticamente y el sistema debe revisar el siguiente. El proceso se repite 
//hasta que el tope sea un medicamento seguro o la pila quede vacía.

import java.util.Scanner;

public class App4 {

    public static void main(String[] args) {

        Dispensador dispensador = new Dispensador();

        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {

            System.out.println("\n=== FARMACIA AUTOMATIZADA ===");
            System.out.println("1. Ver medicamentos");
            System.out.println("2. Registrar medicamento");
            System.out.println("3. Retirar medicamento");
            System.out.println("4. Ver medicamento del tope");
            System.out.println("5. Validar despacho");
            System.out.println("6. Salir");

            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    dispensador.imprimir();

                    break;

                case 2:

                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Lote: ");
                    String lote = scanner.nextLine();

                    System.out.print("Días para vencer: ");
                    int dias = scanner.nextInt();

                    dispensador.push(
                            new Medicamento(nombre, lote, dias)
                    );

                    System.out.println("Medicamento agregado correctamente.");

                    break;

                case 3:

                    Medicamento retirado = dispensador.pop();

                    if (retirado != null) {

                        System.out.println("Medicamento retirado:");
                        System.out.println(retirado);

                    } else {

                        System.out.println("La pila está vacía.");
                    }

                    break;

                case 4:

                    Medicamento tope = dispensador.peek();

                    if (tope != null) {

                        System.out.println("Medicamento en el tope:");
                        System.out.println(tope);

                    } else {

                        System.out.println("La pila está vacía.");
                    }

                    break;

                case 5:

                    System.out.println("\n--- VALIDANDO DESPACHO ---");

                    dispensador.validarDespacho();

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
