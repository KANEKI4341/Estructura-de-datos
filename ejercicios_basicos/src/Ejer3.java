///Ejercicio 3 — Sensor de temperatura
///Un sensor industrial registra temperaturas. El sistema recibe:

///Temperatura actual en Celsius (double)
///Nombre del sensor (String)
///Número de lectura (int)
///Si la temperatura supera el límite de 80°C, una variable boolean llamada enAlarma debe ser true.
///Imprime el estado del sensor con todos sus datos.

public class Ejer3 {

    public static void main(String[] args) {

        double temperatura = 45;
        String sensor = "ken";
        int lectura = 98;
        boolean alarma = true;

        System.out.println(" === SENSOR DE TEMPERATURA === ");
        System.out.println("Temperatura: " + temperatura + " celsius ");
        System.out.println("Sensor: " + sensor );
        System.out.println("Lectura: " + lectura );
        System.out.println("Alarma: " + alarma);
        
    }  
}
