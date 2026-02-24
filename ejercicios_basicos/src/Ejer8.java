import java.util.Scanner;

public class Ejer8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] precios = new double[5];
        double suma = 0;
        double mayor = 0;

        // Pedir los 5 precios
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el precio del producto " + (i + 1) + ": ");
            precios[i] = sc.nextDouble();
        }

        // Calcular suma y precio mayor
        for (int i = 0; i < 5; i++) {
            suma = suma + precios[i];

            if (precios[i] > mayor) {
                mayor = precios[i];
            }
        }

        System.out.println("La suma total es: " + suma);
        System.out.println("El precio más alto es: " + mayor);

        // Descuento
        if (suma > 20000) {
            System.out.println("Tienes un descuento de 2000!");
            suma = suma - 2000;
        }

        System.out.println("Total a pagar: " + suma);
    }
}
    
    

