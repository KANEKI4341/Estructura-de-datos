public class Item {
    String nombre;
    int cantidad;
    int diasCaducidad;
    Item siguiente;

    public Item(String nombre, int cantidad, int diasCaducidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.diasCaducidad = diasCaducidad;
        this.siguiente = null;
    }
}
