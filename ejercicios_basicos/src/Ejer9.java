///Ejercicio 9 — Notas de un curso
///Un profesor tiene las notas de 4 estudiantes en un arreglo. El coordinador recibe una 
///referencia al mismo arreglo para revisarlas.

import java.util.Arrays;

///El coordinador corrige la nota del estudiante 2 (índice 1) de 2.5 a 3.0.
///Muestra que el arreglo del profesor también refleja el cambio.
///Añade comentarios explicando el concepto de referencia en memoria.

public class Ejer9 {

    public static void main(String[] args) {
        
        double [] notasProfesor = { 4.0, 2.5, 3.4, 4,3 };
        double [] notasCoordinador = notasProfesor;

        System.out.println("Notas Del Profesor " );
        System.out.println(Arrays.toString(notasProfesor));

        notasCoordinador [1] = 3.0;
        
        System.out.println("Notas Del Coordinador ");
        System.out.println(Arrays.toString(notasCoordinador));

        ///EXPLICACIÓN:
        ///En Java, los arreglos son objetos.
        ///Cuando hacemos:
        ///double[] notasCoordinador = notasProfesor;
        ///NO se crea un nuevo arreglo.
         
        ///Ambas variables apuntan al mismo espacio en memoria.
         
        ///Por eso, cuando el coordinador cambia:
        ///notasCoordinador[1] = 3.0;
        ///también cambia el arreglo del profesor.

    }
    
}
