///Ejercicio 1: Inventario "TecnoStore" (Shell Sort)
///Objetivo: Registrar productos y ordenarlos por su ID para realizar búsquedas rápidas.
///Qué debes hacer?
///1. Clase: Crea una clase Producto con: id (int), nombre (String), precio (double) y stock (int).
///2. Entrada de Datos: Pide al usuario que ingrese los datos de 5 productos por teclado y guárdalos en un arreglo
///Producto[] .
///3. Ordenamiento: Usa Shell Sort para ordenar los productos de menor a mayor según su id .
///4. Búsqueda: Pide un id al usuario y búscalo usando Búsqueda Binaria.
///Ejemplo de lo que se debe ver en consola:
///--- REGISTRO DE PRODUCTOS ---
///Producto 1:
///Ingrese ID: 105
///Ingrese Nombre: Mouse
///Ingrese Precio: 25.50
///Ingrese Stock: 10
///... (se repite hasta completar los 5 productos) ...
///--- INVENTARIO ORDENADO POR ID (Shell Sort) ---
///ID: 101 | Nombre: Laptop | Precio: 850.0 | Stock: 5
///ID: 102 | Nombre: Teclado | Precio: 45.0 | Stock: 12
///ID: 105 | Nombre: Mouse | Precio: 25.5 | Stock: 10
///...
///--- BÚSQUEDA DE PRODUCTO ---
///Ingrese el ID a buscar: 102
///>> PRODUCTO ENCONTRADO: Teclado - Precio: $45.0 - Stock: 12


import java.util.Scanner;

public class Ejer1 {

    public static void main(String[] args) {

        Scanner busqueda = new Scanner(System.in);
        Producto [] productos = new Producto [5];
        
        System.out.println("--- REGISTRO DE PRODUCTOS ---");
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Producto " + (i + 1) + ":");

            System.out.print("Ingrese ID: ");
            int id = busqueda.nextInt();
            busqueda.nextLine();

            System.out.print("Ingrese Nombre: ");
            String nombre = busqueda.nextLine(); 

            System.out.print("Ingrese Precio: ");
            double precio = busqueda.nextDouble();
            
            System.out.print("Ingrese Stock: ");
            int stock = busqueda.nextInt();
            
            productos[i] = new Producto (id, nombre, precio, stock);
        }

        ordenar(productos);

        System.out.println("\n--- INVENTARIO ORDENADO POR ID (Shell Sort) ---");

        for (Producto p : productos) {
            System.out.println(p);
        }

        System.out.println("\n--- BÚSQUEDA DE PRODUCTO ---");
        System.out.print("Ingrese el ID a buscar: ");
        int idBuscar = busqueda.nextInt();

        int posicion = busquedaBinaria(productos, idBuscar);

        if (posicion != -1) {
            Producto p = productos[posicion];
            System.out.println(">> PRODUCTO ENCONTRADO: " +
                    p.nombre + " - Precio: $" + p.precio + " - Stock: " + p.stock);
        } else {
            System.out.println("Producto no encontrado.");
        }

        
        busqueda.close();

    }
    public static class Producto {

        int ID;
        String nombre;
        double precio;
        int stock;

        public Producto (int ID, String nombre, double precio, int stock){
            this.ID = ID;
            this.nombre = nombre;
            this.precio = precio;
            this.stock = stock;
        }    

        @Override
        public String toString() {
            return "ID: " + ID + " | Nombre: " + nombre +
                   " | Precio: " + precio + " | Stock: " + stock;
        }

    }
    
    public static void ordenar(Producto[] ordenar) {
        int n = ordenar.length;
            for (int brecha = n / 2; brecha > 0; brecha /= 2) {
                for (int i = brecha; i < n; i++) {
                    Producto temp = ordenar[i];
                    int j;
                    for (j = i; j >= brecha && ordenar[j - brecha].ID > temp.ID; j -= brecha) {
                        ordenar[j] = ordenar[j - brecha];
                    }
                    ordenar[j] = temp;
                }
            }    
    }

    public static int busquedaBinaria(Producto[] productos, int id) {
        int low = 0, high = productos.length - 1;
        while (low <= high) {
            int mitad = low + (high - low) / 2;
            if (productos[mitad].ID == id) {
                return mitad;
            } else if (productos[mitad].ID < id) {
                low = mitad + 1;
            } else {
                high = mitad - 1;
            }
        }
        return -1;
    }
}
