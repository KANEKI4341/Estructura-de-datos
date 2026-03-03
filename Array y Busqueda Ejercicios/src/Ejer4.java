///4. Control de Acceso (Gimnasio)
///Un gimnasio tiene una lista de códigos de acceso de los socios que pagaron la mensualidad. 
///La lista está ordenada de menor a mayor.
///El Problema: Cuando un socio digita su código, el sistema debe validar si el código está 
///en la lista de "pagos al día". Si no está, se le niega la entrada.
///Algoritmo a usar: Búsqueda Binaria. Es eficiente para buscar códigos numéricos en una lista 
///que ya está organizada.

import java.util.Scanner;

public class Ejer4 {

    public static void main(String[] args) {

        Scanner gimnasio = new Scanner(System.in);

        int[] codigos = {
            1010, 1120, 1235, 1340, 1455,
            1560, 1675, 1780, 1895, 2000,
            2120, 2235, 2350, 2465, 2580
        };

        int low = 0;
        int high = codigos.length - 1;

        System.out.print("Ingrese su codigo de acceso: ");
        int codigoIngresado = gimnasio.nextInt();
        gimnasio.close();

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (codigos[mid] == codigoIngresado) {
                System.out.println("Acceso permitido. Bienvenido al gimnasio.");
                return;
            } 
            else if (codigos[mid] < codigoIngresado) {
                low = mid + 1; 
            } 
            else {
                high = mid - 1;
            }
        }

        System.out.println("Acceso denegado. Mensualidad pendiente.");
    }
}
