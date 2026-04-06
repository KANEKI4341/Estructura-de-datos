//4. Monitoreo Industrial (Sensores en Tiempo Real)
//Una planta química registra lecturas de sus tanques cada hora en una lista
//enlazada para auditoría.
//La Clase Lectura (Nodo): Debe contener idSensor (int), temperatura (double), 
//presion (double) y hora (String).
//El Problema: Las lecturas se van agregando al inicio para que la más reciente 
//sea siempre la primera que vea el supervisor.
//Reto: Implementa un método que busque y muestre la lectura con la temperatura 
//más alta registrada en el historial.

import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ListaLectura lista = new ListaLectura();

        int opcion;

        do {
            System.out.println("\n===============================");
            System.out.println("   MONITOREO INDUSTRIAL");
            System.out.println("===============================");
            System.out.println("1. Agregar lectura");
            System.out.println("2. Mostrar temperatura maxima");
            System.out.println("3. Salir");
            System.out.println("===============================");
            System.out.print("Selecciona una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("ID Sensor: ");
                    int id = entrada.nextInt();

                    System.out.print("Temperatura: ");
                    double temp = entrada.nextDouble();

                    System.out.print("Presion: ");
                    double presion = entrada.nextDouble();

                    entrada.nextLine(); 

                    System.out.print("Hora: ");
                    String hora = entrada.nextLine();

                    lista.agregarInicio(id, temp, presion, hora);
                    System.out.println("Lectura agregada correctamente.");
                    break;

                case 2:
                    lista.mostrarLecturaMasAlta();
                    break;

                case 3:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }

        } while (opcion != 3);

        entrada.close();
    }
}