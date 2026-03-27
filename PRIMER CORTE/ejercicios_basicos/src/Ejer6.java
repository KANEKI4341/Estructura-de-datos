///Ejercicio 6 — Turno en un banco
///Un cajero de banco trabaja con el número del turno actual. Se crea una variable 
// turnoActual y se asigna a turnoEnPantalla.

///Demuestra con código que cambiar turnoEnPantalla no afecta a turnoActual (comportamiento por valor).
///Explica en un comentario por qué ocurre esto.

public class Ejer6 {
    public static void main(String[] args) {

        int turnoActual = 50;

        int turnoEnPantalla = turnoActual;

        System.out.println("Turno Actual: " + turnoActual);
        System.out.println("Turno Por Pantalla: " + turnoEnPantalla);

        turnoEnPantalla = 60;

        System.out.println("Turno Actual: " + turnoActual);
        System.out.println("Turno Por Pantalla: " + turnoEnPantalla);
        
    }
    
}
