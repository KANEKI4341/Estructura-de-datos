import java.util.Scanner;

///1. El Podio de la Competencia
///Algoritmo obligatorio: Ordenamiento por Selección (Selection Sort)
///Contexto: Se ha realizado una carrera de 100 metros planos y el comité olímpico 
///necesita determinar quiénes ganarán las medallas
///Detalle del ejercicio: El programa debe solicitar primero cuántos corredores 
///participarán (ej. 5 a 10). Luego, debe pedir el tiempo en segundos (con decimales) 
///de cada corredor.
///Lógica de Selección: El algoritmo debe buscar el tiempo más bajo (el más rápido) 
///en cada iteración y colocarlo al inicio.
///Resultado esperado: El programa debe imprimir el arreglo totalmente ordenado y, 
///adicionalmente, mostrar un mensaje claro indicando quién obtuvo el Oro (1er lugar),
///Plata (2do lugar) y Bronce (3er lugar).

public class Ejer1 {

    public static void main(String[] args) {
        
        Scanner olimpico = new Scanner(System.in);
        
        System.out.println("Cuanto corredores participa: ");
        int corredores = olimpico.nextInt();

        double [] tiempo = new double [corredores];

        for (int i = 0; i < tiempo.length; i++) {
            System.out.println("Ingrese el tiempo del corredor " + ( i + 1) + ":");
            tiempo [i] = olimpico.nextDouble();
        }
        ordenar(tiempo);
        System.out.println("Tiempo de menor a mayor: ");

        for (double d : tiempo) {
            System.out.println(d);
        }
        System.out.println(" ==== RESULTADO ==== ");
        System.out.println("Oro: " + tiempo [0] + " segundos");
        System.out.println("Plata: " + tiempo [1] + " segundos");
        System.out.println("Bronce: " + tiempo [2] + " segundos");

        olimpico.close();
    }

    
    public static void ordenar(double[] tiempo) {
        int n = tiempo.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < n; j++) {
                if (tiempo[j] < tiempo[indiceMinimo]) {
                indiceMinimo = j;
            }
        }
        double temp = tiempo[indiceMinimo];
        tiempo[indiceMinimo] = tiempo[i];
        tiempo[i] = temp;
        }
    }
}
