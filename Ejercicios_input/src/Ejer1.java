import java.util.Scanner;

///Ejercicio 1 — Recibo de compra
///Pide al usuario el nombre de un producto, la cantidad comprada y el precio unitario. 
///Calcula el subtotal, aplica un IVA del 19% y muestra el recibo con el total a pagar.
///Datos de entrada:
///String nombre del producto
///int cantidad
///double precio unitario
///Salida esperada:
///===== Recibo =====
///Producto  : Arroz
///Cantidad  : 3
///Precio c/u: $2500.00
///Subtotal  : $7500.00
///IVA (19%) : $1425.00
///Total     : $8925.00

public class Ejer1 {

    public static void main(String[] args) {
         
        Scanner inventario = new Scanner(System.in);

        System.out.println("Ingrese el nombre del producto: ");
        String nombre = inventario.nextLine();

        System.out.println("Ingrese la cantidad del producto: ");
        int cantidad = inventario.nextInt();

        System.out.println("Ingrese el precio del producto: ");
        double precio = inventario.nextDouble();

        double subtotal = cantidad * precio;
        double iva = subtotal * 0.19;
        double total = subtotal + iva;

        System.out.println("\n===== Recibo =====");
        System.out.println("Producto  : " + nombre);
        System.out.println("Cantidad  : " + cantidad);
        System.out.println("Precio: " + precio);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("IVA (19%): " + iva);
        System.out.println("Total: " + total);

        inventario.close();

    }
    
}
