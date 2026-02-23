///Ejercicio 1 — Ficha de un estudiante
///Un sistema universitario necesita registrar la información básica de un estudiante: nombre completo, código (número entero), 
// semestre actual, promedio acumulado y si está matriculado o no.

///Declara las variables con los tipos de datos apropiados.
///Asigna valores de ejemplo
import java.util.Scanner;
        
public class Ejer1 {

    public static void main(String[] args) {

        Scanner lista = new Scanner(System.in);

        String nombre;
        int codigo;
        int semestre;
        double promedio;
        boolean matriculado;

        System.out.print("Ingrese el nombre del estudiante completo: ");
        nombre = lista.nextLine();

        System.out.print("Ingresa el codigo del estudiante completo: ");
        codigo = lista.nextInt();

        System.out.print("Ingresa el semestre del estudiante: ");
        semestre = lista.nextInt();

        System.out.print("Ingresa el promedio del estudiante: ");
        promedio = lista.nextDouble();

        System.out.print("Esta matriculado? (true/false): ");
        matriculado = lista.nextBoolean();

        System.out.println("=== Ficha del Estudiante ===");
        System.out.println("Nombre: " + nombre );
        System.out.println("Codigo: " + codigo );
        System.out.println("Semestre: " + semestre );
        System.out.println("Promedio: " + promedio );
        System.out.println("Matricula: " + matriculado);

        lista.close();


    }
}
