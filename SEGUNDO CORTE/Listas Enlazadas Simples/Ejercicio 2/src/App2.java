//2. Inventario de Alimentos (Control de Caducidad)
//Un supermercado necesita gestionar su estante de lácteos. Los productos que vencen más 
//pronto deben colocarse al principio para ser vendidos primero.
//La Clase Producto (Nodo): Debe contener nombre (String), cantidad (int) y diasParaVencer (int).
//El Problema: Si llega un producto que vence en menos de 3 días, debe insertarse al inicio de 
//la lista (prioridad de venta). Si vence en más tiempo, se pone al final.
//Reto: Crea un método que imprima solo los productos que tienen menos de 5 días para vencer.

import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion;
        EstanteLacteos estante = new EstanteLacteos();

        do {
            System.out.println("\n===============================");
            System.out.println("   CONTROL DE LÁCTEOS");
            System.out.println("===============================");
            System.out.println("1. Registrar nuevo producto");
            System.out.println("2. Listar productos próximos a caducar (<5 días)");
            System.out.println("3. Mostrar todos los productos");
            System.out.println("0. Terminar programa");
            System.out.println("===============================");
            System.out.print("Selecciona una opción: ");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    entrada.nextLine(); 
                    System.out.print("Nombre del producto: ");
                    String nombreProd = entrada.nextLine();
                    System.out.print("Cantidad disponible: ");
                    int stock = entrada.nextInt();
                    System.out.print("Días restantes para caducar: ");
                    int diasRestantes = entrada.nextInt();

                    Item nuevoItem = new Item(nombreProd, stock, diasRestantes);
                    estante.insertarProducto(nuevoItem);
                    break;

                case 2:
                    System.out.println("\n*** Productos que caducan pronto ***");
                    estante.mostrarPorCaducar();
                    break;

                case 3:
                    System.out.println("\n*** Inventario completo ***");
                    estante.mostrarTodos();
                    break;

                case 0:
                    System.out.println("Programa finalizado. ¡Hasta pronto!");
                    break;

                default:
                    System.out.println("Opción inválida, intenta nuevamente.");
            }

        } while (opcion != 0);

        entrada.close();
    }
}
