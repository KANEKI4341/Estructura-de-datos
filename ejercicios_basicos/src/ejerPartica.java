import java.util.Scanner;

public class ejerPartica {

    public static void main(String[] args) {
        
        Scanner superMercado = new Scanner(System.in);

        double[] precios = new double[5];
        double suma = 0;
        double mayor = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el precio del producto que desee arquirir " + (i + 1) + ": ");
            precios[i] = superMercado.nextDouble();
        }

        for (int i = 0; i < 5; i++) {
            suma = suma + precios[i];

            if (precios[i] > mayor) {
                mayor = precios[i];
            }
        }

        System.out.println("La suma total de todos los productos es : " + suma);
        System.out.println("El precio mas alto del producto fue : " + mayor);

        if (suma > 20000) {
            System.out.println("Tienes un descuento de 2000!");
            suma = suma - 2000;
        }

        System.out.println("Total a pagar: " + suma);

        superMercado.close();

    }
    
}
