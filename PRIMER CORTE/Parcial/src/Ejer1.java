import java.util.Scanner;

public class Ejer1 {
    
    public static void main(String[] args) {
        
        Scanner clima = new Scanner(System.in);
        double [] puntajes = new double [7];
        
        System.out.println("--- INGRESO EL CLIMA ---");
        for (int i = 0; i < puntajes.length; i++) {

            System.out.print("Ingrese la temperatura " + (i + 1) + ": ");
            puntajes[i] = clima.nextInt();
        }

        ordenar(puntajes);

        System.out.println("\n--- TABLA DE RESULTADOS (de mayor a menor) ---");

        for (int i = 0; i < puntajes.length; i++) {
            System.out.println((i + 1) + "° Lugar: " + puntajes[i]);
        }

        double suma = 0;

        ///int[] puntaje;
        for (double p : puntajes) {
            suma += p;
        }

        double promedio = suma / puntajes.length;

        System.out.println("El promedio total de los puntajes fue: " + promedio);

        System.out.println("\n--- BÚSQUEDA LINEAL ---");
        System.out.print("Ingrese puntaje a buscar: ");
        int objetivo = clima.nextInt();

        int posicion = busquedaLineal(puntajes, objetivo);

        if (posicion != -1) {
            System.out.println(">> El puntaje " + objetivo +
                    " se encuentra en el " + (posicion + 1) + "° lugar de la tabla.");
        } else {
            System.out.println("Puntaje no encontrado.");
        }    
            clima.close();
        }
        
    

    public static void ordenar(double[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            double temp = arr[indiceMinimo];
            arr[indiceMinimo] = arr[i];
            arr[i] = temp;
        }
    }

    public static int busquedaLineal(double[] puntajes, int objetivo) {
        for (int i = 0; i < puntajes.length; i++) {
            if (puntajes[i] == objetivo) {
                return i;
            }
        }
        return -1;
    }
}
