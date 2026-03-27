///Ejercicio 8 — Historial de mensajes
///Un chat guarda el último mensaje enviado. Se usan dos variables String:

///ultimoMensaje = "Hola"
///copiaTexto = ultimoMensaje
///Luego copiaTexto se cambia a "¿Cómo estás?"
///Muestra ambas variables y explica en un comentario por qué ultimoMensaje no cambió (inmutabilidad de String).

public class Ejer8 {
    public static void main(String[] args) {

        String ultimoMensaje = "Hola";

        String copiaTexto = ultimoMensaje;

        copiaTexto = "¿como estas?";

        System.out.println("ultimoMensaje " + ultimoMensaje);
        System.out.println("copiaTexto " + copiaTexto);

        ///EXPLICACIÓN:
        ///Los String en Java son inmutables.
        ///Cuando hacemos:
        ///copiaTexto = "¿Cómo estás?";
        ///no estamos modificando el texto original,
        ///sino que se crea un nuevo objeto String en memoria.
         
        ///Por eso ultimoMensaje sigue siendo "Hola"
    }
}
    
    

