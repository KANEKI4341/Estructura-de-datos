///Ejercicio 4 — Placa de un vehículo
///El RUNT almacena datos básicos de vehículos. Modela la información de un carro con:

///Placa (String)
///Año de fabricación (int)
///Cilindraje en cc (int)
///Precio de compra (double)
///Inicial del color (char)
///Si tiene SOAT vigente (boolean)
///Muestra todos los datos en consola.

public class Ejer4 {

    public static void main(String[] args) {

        String placa = "kena";
        int año = 2009;
        int cilindraje = 250;
        double precio = 500000;
        char color = 'n';
        boolean SOAT = false;

        System.out.println(" === PLACA DE VEHICULO === ");
        System.out.println("Placa: " + placa );
        System.out.println("Año: " + año );
        System.out.println("Cilindraje: " + cilindraje);
        System.out.println("Precio " + precio );
        System.out.println("Color: " + color );
        System.out.println("SOAT: " + SOAT);

    }
    
}
