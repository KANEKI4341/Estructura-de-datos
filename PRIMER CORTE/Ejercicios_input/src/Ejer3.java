///Ejercicio 3 — Promedio de notas
///Pide al usuario su nombre y 4 notas de un curso. Calcula el promedio y determina si aprobó (promedio >= 3.0).
///Datos de entrada:
///String nombre
///double nota1, nota2, nota3, nota4
///Salida esperada:
///Estudiante: Carlos
///Promedio  : 3.45
///Estado    : APROBADO
///Pista: usa una variable boolean aprobado = promedio >= 3.0; para el estado.

import java.util.Scanner;

public class Ejer3 {

    public static void main(String[] args) {

        Scanner curso = new Scanner(System.in);

        System.out.println("Ingrese el nombre del estudiante: ");
        String nombre = curso.nextLine();

        System.out.println("Ingrese la primera nota del estudiante: ");
        double nota1 = curso.nextDouble();

        System.out.println("Ingrese la segunda nota del estudiante: ");
        double nota2 = curso.nextDouble();

        System.out.println("Ingrese la tercera nota del estudiante: ");
        double nota3 = curso.nextDouble();

        System.out.println("Ingresa la cuarta nota del estudiante: ");
        double nota4 = curso.nextDouble();

        double notaFinal = ( nota1 + nota2 + nota3 + nota4 )/ 4;

        System.out.println("Estudiante: " + nombre );
        System.out.println("Promedio: " + notaFinal ); 
        
        if (notaFinal >= 3.0){
            System.out.println("APROBADO");
        }else{
            System.out.println("DESAPROBADO");
        }

        curso.close();
    }
}
