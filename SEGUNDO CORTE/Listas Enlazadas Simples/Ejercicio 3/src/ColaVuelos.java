public class ColaVuelos {
    Vuelo inicio;

    public ColaVuelos() {
        this.inicio = null;
    }

    public void agregarVuelo(Vuelo nuevo) {
        if (nuevo.combustibleRestante < 10) {
            nuevo.siguiente = inicio;
            inicio = nuevo;
        } else {
            if (inicio == null) {
                inicio = nuevo;
            } else {
                Vuelo actual = inicio;
                while (actual.siguiente != null) {
                    actual = actual.siguiente;
                }
                actual.siguiente = nuevo;
            }
        }
    }

    public void mostrarCola() {
        Vuelo actual = inicio;
        while (actual != null) {
            System.out.println("Vuelo: " + actual.numeroVuelo +
                    " | Aerolínea: " + actual.aerolinea +
                    " | Combustible: " + actual.combustibleRestante +
                    " | Pasajeros: " + actual.pasajeros);
            actual = actual.siguiente;
        }
    }

    public void reportarEmergencia(String numeroVuelo) {
        if (inicio == null || inicio.numeroVuelo.equals(numeroVuelo)) {
            System.out.println("El vuelo ya está en la cabeza o la cola está vacía.");
            return;
        }

        Vuelo anterior = null;
        Vuelo actual = inicio;

        while (actual != null && !actual.numeroVuelo.equals(numeroVuelo)) {
            anterior = actual;
            actual = actual.siguiente;
        }

        if (actual == null) {
            System.out.println("Vuelo no encontrado en la cola.");
        } else {
            if (anterior != null) {
                anterior.siguiente = actual.siguiente;
            }
            actual.siguiente = inicio;
            inicio = actual;
            System.out.println("El vuelo " + numeroVuelo + " ha sido movido al inicio por emergencia.");
        }
    }
}
