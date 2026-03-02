///Ejercicio 4 — Perfil de usuario
///Pide al usuario los datos de su perfil: nombre, edad, ciudad, correo y si acepta términos y condiciones. 
///Muestra un resumen indicando el tipo de dato que se usó para cada campo.
///Datos de entrada: String, int, String, String, boolean
///Salida esperada:
///========= Perfil creado =========
///Nombre  (String)  : Ana Pérez
///Edad    (int)     : 22
///Ciudad  (String)  : Bogotá
///Correo  (String)  : ana@mail.com
///T&C     (boolean) : true


import java.util.Scanner;

public class Ejer4 {

    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);

        System.out.println("Ingrese el nombre del usuario: ");
        String Nombre = usuario.nextLine();

        System.out.println("Ingrese la edad del usuario: ");
        int Edad = usuario.nextInt();
        usuario.nextLine();

        System.out.println("Ingrese la ciudad del usuario: ");
        String Ciudad = usuario.nextLine();

        System.out.println("Ingrese el correo del usuario: ");
        String Correo = usuario.nextLine();

        System.out.println("Si acepta términos y condiciones (true/false) ");
        boolean condicion = usuario.nextBoolean();

        System.out.println("Nombre (String): " + Nombre);
        System.out.println("Edad   (Int): " + Edad );
        System.out.println("Ciudad (String): " + Ciudad );
        System.out.println("Correo (String): " + Correo );
        System.out.println("T&C    (Boolean): " + condicion);

        usuario.close();

    }
}