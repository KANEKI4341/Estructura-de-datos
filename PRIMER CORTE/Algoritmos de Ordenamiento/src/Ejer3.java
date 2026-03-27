import java.util.Arrays;
import java.util.Scanner;

///3. El Salto de Shell (Optimización de Datos)
///Algoritmo obligatorio: Ordenamiento Shell (Shell Sort)
///Contexto: Una empresa de logística maneja paquetes con diferentes pesos y necesita ordenarlos de forma 
///más eficiente que el método de burbuja o inserción simple.
///Detalle del ejercicio: Solicita al usuario el peso de N paquetes (se recomienda probar con al menos 
///10 para notar el efecto).
///Lógica de Shell: Implementa el algoritmo usando el salto (gap) inicial de N/2
///El estudiante debe explicar en comentarios por qué este método es generalmente más rápido que la 
///inserción simple al trabajar con elementos que están muy lejos de su posición final.
///Resultado esperado: Mostrar el arreglo original y el arreglo final ordenado después de aplicar todas 
///las fases de reducción de saltos.

public class Ejer3 {

    public static void main(String[] args) {
        
        Scanner paquete = new Scanner(System.in);

        System.out.println("Ingresa cuanto paque  Minimo 10: ");
        int peso = paquete.nextInt();

        double [] ordenando = new double [peso];

        for (int i = 0; i < ordenando.length; i++) {
            System.out.println("Ingrese el peso de los paquetes" + ( i + 1 ) + ":");
            ordenando [i] = paquete.nextDouble();
        }
        System.out.println("Arreglo original: " + Arrays.toString(ordenando));
        ordenar(ordenando);
        System.out.println("Paquetes de menor a mayor: " + Arrays.toString(ordenando));

        paquete.close();
    }
    
    public static void ordenar(double[] ordenar) {
        int n = ordenar.length;
            // Empezar con una brecha grande y reducirla
            for (int brecha = n / 2; brecha > 0; brecha /= 2) {
            // Realizar un ordenamiento por inserción para esta brecha
                for (int i = brecha; i < n; i++) {
                    double temp = ordenar[i];
                    int j;
                    for (j = i; j >= brecha && ordenar[j - brecha] > temp; j -= brecha) {
                        ordenar[j] = ordenar[j - brecha];
                    }
                    ordenar[j] = temp;
                }
            }
        System.out.println(Arrays.toString(ordenar));    
    }
    // Shell Sort es más rápido que inserción simple porque primero compara
    // elementos que están lejos entre sí usando una brecha (gap).
    // Esto permite mover rápidamente los elementos cerca de su posición correcta.
    // Cuando la brecha llega a 1, el arreglo ya está casi ordenado,
    // por lo que el ordenamiento final es mucho más rápido.
}
