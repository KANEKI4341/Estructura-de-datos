///5. El Inspector de Eficiencia (Duelo de Métodos)
///Algoritmos obligatorios: Selección vs Inserción
///Contexto: Un analista de sistemas quiere saber cuál algoritmo es más "pesado" en 
///términos de operaciones para un caso específico.
///Detalle del ejercicio: El usuario debe ingresar 6 números enteros desordenados. 
///El programa aplicará AMBOS métodos al mismo conjunto de datos (puedes usar una copia del arreglo original).
///Lógica de Conteo:
///En Selección: Cuenta cada vez que ocurre un swap (intercambio físico de posiciones).
///En Inserción: Cuenta cada vez que un elemento se "mueve" hacia la izquierda dentro del bucle interno.
///Resultado esperado: El programa debe imprimir cuántos intercambios hizo Selección y cuántos 
///movimientos hizo Inserción. El estudiante debe concluir cuál fue más eficiente para esos datos ingresados 
///por el teclado.

import java.util.Arrays;
import java.util.Scanner;

public class Ejer5 {

    public static void main(String[] args) {

        Scanner analista = new Scanner(System.in);

        int[] numeros = new int[6];

        System.out.println("Ingrese 6 numeros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = analista.nextInt();
        }

        int[] seleccion = Arrays.copyOf(numeros, numeros.length);
        int[] insercion = Arrays.copyOf(numeros, numeros.length);

        int swapsSeleccion = ordenarSeleccion(seleccion);
        int movimientosInsercion = ordenarInsercion(insercion);

        System.out.println("Arreglo original: " + Arrays.toString(numeros));
        System.out.println("Selection Sort: " + Arrays.toString(seleccion));
        System.out.println("Insertion Sort: " + Arrays.toString(insercion));

        System.out.println("Intercambios en Selection Sort: " + swapsSeleccion);
        System.out.println("Movimientos en Insertion Sort: " + movimientosInsercion);

        analista.close();
    }

    public static int ordenarSeleccion(int[] arr) {

        int swaps = 0;
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int indiceMinimo = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            if (indiceMinimo != i) {
                int temp = arr[indiceMinimo];
                arr[indiceMinimo] = arr[i];
                arr[i] = temp;
                swaps++;
            }
        }

        return swaps;
    }

    public static int ordenarInsercion(int[] arr) {

        int movimientos = 0;
        int n = arr.length;

        for (int i = 1; i < n; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
                movimientos++;
            }

            arr[j + 1] = key;
        }

        return movimientos;
    }
}
//El método más eficiente generalmente es Insertion Sort, porque reduce movimientos 
//cuando los datos ya están casi ordenados, mientras que Selection Sort siempre realiza 
//el mismo número de comparaciones sin importar el orden de los datos.