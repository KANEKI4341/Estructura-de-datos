import java.util.Arrays;
import java.util.Scanner;

///4. Registro Alfabético de Estudiantes
///Algoritmo obligatorio: Ordenamiento por Inserción (Insertion Sort)
///Contexto: El profesor necesita pasar asistencia y requiere que la lista de nombres 
///ingresada en el sistema se ordene alfabéticamente de la A a la Z.
///Detalle del ejercicio: El programa debe preguntar cuántos alumnos hay en clase y 
///solicitar sus nombres (cadenas de texto).
///Lógica de Texto: Se debe usar el método de Inserción adaptado para String.
///Requisito técnico: El estudiante debe investigar y aplicar el método 
///nombre1.compareToIgnoreCase(nombre2). Es vital explicar que si el resultado es 
///mayor a 0, el primer nombre es alfabéticamente "mayor" que el segundo.
///Resultado esperado: La lista de asistencia impresa en orden alfabético perfecto.

public class Ejer4 {
    
    public static void main(String[] args) {
        
        Scanner profesor = new Scanner(System.in);

        System.out.println("Ingrese cuantos estudiante va a ingreser: ");
        int estudiante = profesor.nextInt();
        profesor.nextLine();
        
        String ordenar [] = new String [estudiante];

        for (int i = 0; i < ordenar.length; i++) {
            System.out.println("Ingrese los nombre de los estudiante: ");
            ordenar [i] = profesor.nextLine();
        }
        ordenar(ordenar);
        System.out.println("=======================");
        System.out.println("Nombre alfabeticamente : ");

        ///for (String i : ordenar) {
           /// System.out.println(i);
        ///}

        System.out.println(" ==== RESULTADO ==== ");
        System.out.println(Arrays.toString(ordenar));

        profesor.close();    
    }
    public static void ordenar(String[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            String key = arr[i];
            int j = i - 1;
            // Mueve los elementos de arr[0..i-1], que son mayores que key,
            // una posición adelante de su posición actual
            while (j >= 0 && arr[j].compareToIgnoreCase(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
