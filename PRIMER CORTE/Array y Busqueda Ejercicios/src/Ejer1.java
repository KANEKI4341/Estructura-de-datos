///1. El Cajero del Supermercado (Inventario)
///Un cajero escaneaun producto con el código de barras 770123. El sistema tiene un 
///arreglo desordenado con los códigos de los productos disponibles en el estante actual.
///El Problema: Debes recorrer la lista para verificar si el producto existe y en qué 
///posición de la estantería se encuentra.
///Algoritmo a usar: Búsqueda Lineal . Es el ideal porque los productos en el estante 
///no tienen un orden numérico específico.

public class Ejer1 {

    public static void main(String[] args) {
        
        int [] codigo = {
            346343, 435252, 276964, 
            756432, 770123, 426474, 
            234554, 345275, 763678,
            236463, 745765, 657688
        };
        int codigoBarras = 770123;

         int posicion = -1; 

        for (int i = 0; i < codigo.length; i++) {
            if (codigo[i] == codigoBarras) {
                posicion = i;
                break;
            }
        }
        
        if (posicion != -1) {
            System.out.println("Producto encontrado en la posición: " + posicion);
        } else {
            System.out.println("Producto no encontrado en el inventario.");
        }
    }
    
}
