///Ejercicio 4 — Placa de un vehículo
///El RUNT almacena datos básicos de vehículos. Modela la información de un carro con:


import java.util.Scanner;

///Placa (String)
///Año de fabricación (int)
///Cilindraje en cc (int)
///Precio de compra (double)
///Inicial del color (char)
///Si tiene SOAT vigente (boolean)
///Muestra todos los datos en consola.

public class Ejer4 {

    public static void main(String[] args) {

        Scanner vehiculo = new Scanner(System.in);

        String placa;
        int año;
        int cilindraje;
        double precio;
        char color;
        boolean SOAT;

        System.out.println("Ingresa el numero de la placa: ");
        placa = vehiculo.nextLine();

        System.out.println("Ingrese el año de fabricacion: ");
        año = vehiculo.nextInt();

        System.out.println("Ingresa el cilindraje: ");
        cilindraje = vehiculo.nextInt();

        System.out.println("Ingrese el precio del veiculo: ");
        precio = vehiculo.nextDouble();

        System.out.println("Ingresa la primera letra del color del veiculo: ");
        color = vehiculo.next().charAt(0);

        System.out.println("Ingresa si tiene el SOAT vigente (true/false) ");
        SOAT = vehiculo.nextBoolean();

        System.out.println(" === PLACA DE VEHICULO === ");
        System.out.println("Placa: " + placa );
        System.out.println("Año: " + año );
        System.out.println("Cilindraje: " + cilindraje);
        System.out.println("Color: " + color );
        System.out.println("SOAT: " + SOAT);

        vehiculo.close();

        
    }
    
}
