///Ejercicio 7 — Inventario compartido
///Un almacén tiene un arreglo con el stock de 5 productos. El sistema de ventas y el sistema de 
///reportes apuntan al mismo arreglo.

///Crea el arreglo stockAlmacen con valores iniciales.
///Asigna stockReportes = stockAlmacen.
///Simula una venta reduciendo el stock de un producto desde stockReportes.
///Muestra que stockAlmacen también cambió y explica en comentarios por qué

public class Ejer7 {

    public static void main(String[] args) {
        
        int [] stockAlmacen = { 1,2,3,4,5};
        int [] stockReportes = stockAlmacen;

        for (int i = 0; i < stockAlmacen.length; i++) {
                System.out.println("Producto stockAlmacen " + i + ": " + stockAlmacen[i] );
        }

        stockReportes[1] -= 5;

        for (int i = 0; i < stockAlmacen.length; i++) {
                System.out.println("Producto stockReporte " + i + ": " + stockAlmacen[i] );
        }

        ///EXPLICACIÓN:
        ///Los arreglos en Java se pasan por referencia.
        ///Cuando hacemos:
        ///stockReportes = stockAlmacen;
        ///ambas variables apuntan al mismo espacio en memoria.
        ///Por eso al modificar stockReportes,
        ///también cambia stockAlmacen.

    }
}
