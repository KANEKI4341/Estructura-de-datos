///Ejercicio 2 — Calculadora de una tienda
///Una tienda de barrio vende productos al por menor. El cajero necesita calcular:


import java.util.Scanner;

///Precio unitario de un producto (double)
///Cantidad comprada (int)
///Descuento aplicado en porcentaje (double)
///Total a pagar después del descuento
///Declara las variables, realiza el cálculo y muestra el resultado por consola

public class Ejer2 {
    public static void main(String[] args) {
        
        Scanner inventario = new Scanner(System.in);

        double precioProd;
        int cantidad;
        double descuento;
        double subtotal;
        double totalDes;

        System.out.println("Ingrese el precio unitario del producto: ");
        precioProd = inventario.nextDouble();

        System.out.println("Ingrese la catidad del producto: ");
        cantidad = inventario.nextInt();

        System.out.println("Ingrese el descuento aplicado: ");
        descuento = inventario.nextDouble();

        subtotal = precioProd * cantidad;
        totalDes = subtotal - (subtotal * descuento/100);

        System.out.println("=== Resultado De compra ===");
        System.out.println("Subtotal: " + subtotal );
        System.out.println("totalDescuento: " + totalDes );

        inventario.close();

    }
}
