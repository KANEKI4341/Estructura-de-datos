///Ejercicio 2 — Calculadora de una tienda
///Una tienda de barrio vende productos al por menor. El cajero necesita calcular:

///Precio unitario de un producto (double)
///Cantidad comprada (int)
///Descuento aplicado en porcentaje (double)
///Total a pagar después del descuento
///Declara las variables, realiza el cálculo y muestra el resultado por consola

public class Ejer2 {
    public static void main(String[] args) {
        
        double precioProd = 2.500;
        int cantidad = 45;
        double descuento = 15;
        double subtotal;
        double totalDes;

        subtotal = precioProd * cantidad;
        totalDes = subtotal - (subtotal * descuento/100);

        System.out.println("=== Resultado De compra ===");
        System.out.println("Subtotal: " + subtotal );
        System.out.println("totalDescuento: " + totalDes );

    }
}
