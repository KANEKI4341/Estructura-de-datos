///Ejercicio 3 — Sensor de temperatura
///Un sensor industrial registra temperaturas. El sistema recibe:


import java.util.Scanner;

///Temperatura actual en Celsius (double)
///Nombre del sensor (String)
///Número de lectura (int)
///Si la temperatura supera el límite de 80°C, una variable boolean llamada enAlarma debe ser true.
///Imprime el estado del sensor con todos sus datos.

public class Ejer3 {

    public static void main(String[] args) {

        Scanner registro = new Scanner(System.in);

        double temperatura;
        String sensor;
        int lectura;
        boolean alarma;

        System.out.println("Ingrese la temperatura actual en grado celsius: ");
        temperatura = registro.nextDouble();
        registro.nextLine(); 


        System.out.println("Ingrese el nombre del sensor: ");
        sensor = registro.nextLine();

        System.out.println("Ingrese el numero de lectura: ");
        lectura = registro.nextInt();

        if (temperatura > 80 ){
            alarma = true;
        }else{
            alarma = false;
        }

        System.out.println(" === SENSOR DE TEMPERATURA === ");
        System.out.println("Temperatura: " + temperatura + " celsius ");
        System.out.println("Sensor: " + sensor );
        System.out.println("Lectura: " + lectura );
        System.out.println("Alarma: " + alarma);

        registro.close();
        
    }  
}
