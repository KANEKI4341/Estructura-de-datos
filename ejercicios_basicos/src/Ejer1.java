///Ejercicio 1 — Ficha de un estudiante
///Un sistema universitario necesita registrar la información básica de un estudiante: nombre completo, código (número entero), 
// semestre actual, promedio acumulado y si está matriculado o no.

///Declara las variables con los tipos de datos apropiados.
///Asigna valores de ejemplo
        
public class Ejer1 {

    public static void main(String[] args) {


        String nombre = "Kaneki";
        int codigo = 1234;
        int semestre = 4;
        double promedio = 4.1;
        boolean matriculado = true;

        System.out.println("=== Ficha del Estudiante ===");
        System.out.println("Nombre: " + nombre );
        System.out.println("Codigo: " + codigo );
        System.out.println("Semestre: " + semestre );
        System.out.println("Promedio: " + promedio );
        System.out.println("Matricula: " + matriculado);


    }
}
