///Ejercicio 9 — String inmutable
///Pide al usuario su nombre. Asigna alias = nombre. Pide un nuevo alias. 
///Muestra que nombre no cambió y explica la inmutabilidad de String con un mensaje en consola.
///Datos de entrada: String nombre, String nuevo alias
import java.util.Scanner;

public class Ejer9 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = teclado.nextLine();

        String alias = nombre;

        System.out.print("Ingrese un nuevo alias: ");
        alias = teclado.nextLine();

        System.out.println("==== RESULTADOS ====");
        System.out.println("Nombre original: " + nombre);
        System.out.println("Alias actual: " + alias);

        System.out.println("Explicación:");
        System.out.println("En Java, los objetos String son INMUTABLES.");
        System.out.println("Cuando cambiamos el alias, se crea un nuevo objeto en memoria.");
        System.out.println("Por eso, la variable 'nombre' no cambió.");

        teclado.close();
    }
}