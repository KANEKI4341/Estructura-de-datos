//3. Navegación de Pestañas de Navegador
//Imagina un navegador donde puedes moverte entre pestañas abiertas.
//La Clase Pestana (Nodo): Debe contener tituloPagina (String), url (String) y horaApertura (String).
//El Problema: Las pestañas se abren una tras otra. A veces el usuario quiere cerrar la pestaña actual 
//y el foco debe pasar a la pestaña anterior.
//Reto: Implementar el método cerrarPestanaActual(String url) que busque la pestaña por URL, la elimine 
//de la lista y reconecte el nodo anterior con el siguiente correctamente 
// (¡Cuidado con la Cabeza y la Cola!).

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        Navegacion navegador = new Navegacion();
        Pestaña actual = null;

        int opcion;

        do{
            System.out.println("1. Abrir nueva pestaña");
            System.out.println("2. Ir a la siguiente pestaña");
            System.out.println("3. Ir a la pestaña anterior");
            System.out.println("4. Cerrar pestaña actual");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Título de la página: ");
                    String titulo = scanner.nextLine();
                    System.out.print("URL: ");
                    String url = scanner.nextLine();
                    System.out.print("Hora de apertura: ");
                    String hora = scanner.nextLine();
                    navegador.agregarPestana(titulo, url, hora);
                    if (actual == null) {
                        actual = navegador.cabeza;
                    }
                    break;
                case 2:
                    actual = navegador.pestañaSiguiente(actual);
                    break;
                case 3:
                    actual = navegador.pestañaAnterior(actual);
                    break;
                case 4:
                    if (actual != null) {
                        actual = navegador.cerrarPestanaActual(actual.url);
                    } else {
                        System.out.println("No hay pestaña actual para cerrar.");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 5);
        scanner.close();    
    }
}
