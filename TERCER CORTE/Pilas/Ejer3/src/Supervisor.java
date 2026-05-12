public class Supervisor {

    private Camion tope;
    private int tamanio;

    public Supervisor() {

        this.tope = null;
        this.tamanio = 0;
    }

    public boolean estaVacia() {

        return tope == null;
    }

    public int getTamanio() {

        return tamanio;
    }

    public void push(Camion nuevo) {

        nuevo.siguiente = tope;
        tope = nuevo;
        tamanio++;
    }

    public Camion pop() {

        if (estaVacia()) {
            return null;
        }

        Camion aux = tope;
        tope = tope.siguiente;

        tamanio--;

        aux.siguiente = null;

        return aux;
    }

    public Camion peek() {

        return tope;
    }

    public void imprimir() {

        if (estaVacia()) {

            System.out.println("La pila está vacía.");
            return;
        }

        Camion actual = tope;

        System.out.println("\n=== CAMIONES EN EL CALLEJÓN ===");

        while (actual != null) {

            if (actual == tope) {
                System.out.print("TOPE -> ");
            } else {
                System.out.print("         ");
            }

            System.out.println(actual);

            actual = actual.siguiente;
        }
    }

    public double calcularCargaTotal() {

        double suma = 0;

        Camion actual = tope;

        while (actual != null) {

            suma += actual.cargaToneladas;

            actual = actual.siguiente;
        }

        return suma;
    }
}