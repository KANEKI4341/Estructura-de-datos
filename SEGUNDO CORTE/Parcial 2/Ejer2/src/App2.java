import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opcion;
        Consola galeria = new Consola();

        do {
            System.out.println("\n==============================================");
            System.out.println(" Galería  — Menú Principal");
            System.out.println("==============================================");
            System.out.println("  [1] Agregar comando");
            System.out.println("  [2] Siguiente comando");
            System.out.println("  [3] comando anterior");
            System.out.println("  [4] Eliminar comando");
            System.out.println("  [6] Mostrar comando");
            System.out.println();
            System.out.println("  [0] Salir");
            System.out.println("==============================================");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese el texto: ");
                    String t = sc.nextLine();

                    System.out.print("Ingrese la hora: ");
                    String f = sc.nextLine();

                    galeria.agregar(t, f);
                    break;

                case 2:
                    galeria.siguiente();
                    galeria.mostrarGaleria();
                    break;

                case 3:
                    galeria.anterior();
                    galeria.mostrarGaleria();
                    break;

                case 4:
                    galeria.eliminarActual();
                    galeria.mostrarGaleria();
                    break;

                case 5:


                case 6:
                    galeria.mostrarGaleria();
                    break;

                case 0:
                    System.out.println("¡Saliendo del módulo de Listas Dobles Circulares!");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}