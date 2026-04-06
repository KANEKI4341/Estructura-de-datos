public class ListaLectura {
    Lectura inicio;

    public ListaLectura() {
        this.inicio = null;
    }

    public void agregarInicio(int id, double temp, double presion, String hora) {
        Lectura nueva = new Lectura(id, temp, presion, hora);
        nueva.siguiente = inicio;
        inicio = nueva;
    }

    public void mostrarLecturaMasAlta() {
        if (inicio == null) {
            System.out.println("No hay lecturas registradas.");
            return;
        }

        Lectura max = inicio;
        Lectura actual = inicio.siguiente;

        while (actual != null) {
            if (actual.temperatura > max.temperatura) {
                max = actual;
            }
            actual = actual.siguiente;
        }

        System.out.println("\nLectura con la temperatura más alta:");
        System.out.println("ID Sensor: " + max.idSensor);
        System.out.println("Temperatura: " + max.temperatura);
        System.out.println("Presión: " + max.presion);
        System.out.println("Hora: " + max.hora);
    }
}