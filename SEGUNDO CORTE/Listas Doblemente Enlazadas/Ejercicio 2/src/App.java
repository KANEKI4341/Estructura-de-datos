//2. Carrusel de Imágenes (Galería Interactiva)
//Simula el comportamiento de una galería de fotos en una aplicación móvil.
//La Clase Fotografia (Nodo): Debe contener nombreArchivo (String), tamanoMB (double) y resolucion (String).
//El Problema: El usuario puede avanzar a la "Siguiente Foto" o retroceder a la "Foto Anterior". Si llega al 
//final, no puede avanzar más (a menos que sea circular, pero por ahora manténlo lineal).
//Reto: Crea un método reproducirGaleria() que recorra toda la lista hacia adelante y luego toda la lista hacia 
//atrás para mostrar todas las fotos.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        int opcion;
        Galeria galeria = new Galeria();
        Fotografia fotoActual = null;

        do{
            System.out.println("\n==============================================");
            System.out.println("   Galería de Fotos — Menú Principal");
            System.out.println("==============================================");
            System.out.println("  [1] Agregar Fotografía");
            System.out.println("  [2] Siguiente Foto");
            System.out.println("  [3] Foto Anterior");
            System.out.println("  [4] Reproducir Galería");
            System.out.println();
            System.out.println("  [0] Salir");
            System.out.println("==============================================");
            System.out.print("Elige una opción: ");

            opcion = scanner.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del archivo: ");
                    scanner.nextLine();
                    String nombreArchivo = scanner.nextLine();
                    System.out.print("Ingrese el tamaño en MB: ");
                    double tamanoMB = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Ingrese la resolución (ej: 1920x1080): ");
                    String resolucion = scanner.nextLine();
                    Fotografia nuevaFoto = new Fotografia(nombreArchivo, tamanoMB, resolucion);
                    galeria.agregarFotografia(nuevaFoto);
                    fotoActual = nuevaFoto; 
                    break;

                case 2:
                    if (fotoActual != null) {
                        fotoActual = galeria.siguienteFoto(fotoActual);
                        System.out.println("Foto actual: " + fotoActual.nombreArchivo);
                    } else {
                        System.out.println("No hay fotos en la galería.");
                    }
                    break;

                case 3:
                    if (fotoActual != null) {
                        fotoActual = galeria.fotoAnterior(fotoActual);
                        System.out.println("Foto actual: " + fotoActual.nombreArchivo);
                    } else {
                        System.out.println("No hay fotos en la galería.");
                    }
                    break;

                case 4:
                    galeria.reproducirGaleria();
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del menú.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}
