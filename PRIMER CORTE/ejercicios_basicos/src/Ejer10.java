///Ejercicio 10 — Copiando configuración
///Una app tiene un objeto int[] configuracion = {1920, 1080, 60} (resolución y FPS).

import java.util.Arrays;

///Crea una copia real del arreglo (no una referencia) usando un nuevo arreglo y copiando elemento por elemento.
///Modifica la copia y demuestra que el original no cambia.
///Comenta la diferencia con la asignación directa.

public class Ejer10 {

    public static void main(String[] args) {
        
        int [] configuracion = { 1920, 1080, 60 };
        int [] copiaConfiguracion = new int [configuracion.length];

        for (int i = 0; i < copiaConfiguracion.length; i++) {
            copiaConfiguracion [i] = configuracion [i];
        }

        System.out.println(" Configuracion de la app ");
        System.out.println(Arrays.toString(configuracion));

        copiaConfiguracion [2] = 2025;

        System.out.println("Copia de configuracion de la app ");
        System.out.println(Arrays.toString(copiaConfiguracion));

        System.out.println("COnfiguracion original despues del cambio ");
        System.out.println(Arrays.toString(configuracion));

        ///EXPLICACIÓN:
        ///Aquí sí se creó un nuevo arreglo en memoria.
        ///copiaConfiguracion tiene su propio espacio.
         
        ///Por eso, al modificar la copia,
        ///el arreglo original NO cambia.
    }
}
