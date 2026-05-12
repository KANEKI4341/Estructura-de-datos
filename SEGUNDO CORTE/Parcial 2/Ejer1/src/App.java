import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int opcion;

        Almacen estante = new Almacen();

        do {
            System.out.println("\n==============================================");
            System.out.println("   GESTIONAR STOCK - Menú Principal");
            System.out.println("==============================================");
            System.out.println("1. REGIDTRAR PRODUCTO");
            System.out.println("2. BUSCAR");  
            System.out.println("3. MOSTRAR"); 
            System.out.println("4. ELIMINAR");
            System.out.println();
            System.out.println("0. Salir");
            System.out.println("==============================================");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();

            System.out.println();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese el codigo: ");
                    sc.nextLine();
                    String codigo = sc.nextLine();
                    System.out.print("Ingrese el nombre: ");
                    sc.nextLine();
                    System.out.print("Ingrese la cantidad: ");
                    sc.nextLine();
                    System.out.print("Ingrese el precio: ");
                    break;
                case 2:
                    System.out.println("Ingrese el codigo del producto: ");
                    sc.nextLine();
                    estante.buscar();
                    break;
                case 3:
                    System.out.println("\n*** Inventario completo ***");
                    estante.mostrarTodos();
                    break;
                    //mostrar();
                case 4:

                case 0:
                    System.out.println("¡Saliendo del módulo de Tren de Carga!");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
