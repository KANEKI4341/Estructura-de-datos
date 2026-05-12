public class Sensor {

    private Pieza tope;
    private int tamanio;

    public Sensor() {
        this.tope = null;
        this.tamanio = 0;
    }

    public boolean estaVacia() {
        return tope == null;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void push(Pieza nuevo) {
        nuevo.siguiente = tope;
        tope = nuevo;
        tamanio++;
    }

    public Pieza pop() {
        if (estaVacia()) {
            return null;
        }
        Pieza aux = tope;
        tope = tope.siguiente;
        tamanio--;
        aux.siguiente = null; // Limpiar referencia para seguridad
        return aux;
    }

    public Pieza peek() {
        return tope;
    }

    public void imprimir() {
        if (estaVacia()) {
            System.out.println("Pila vacía.");
            return;
        }
        Pieza actual = tope;
        System.out.println("=== ESTADO DEL MUELLE (De Tope a Base) ===");
        while (actual != null) {
            if (actual == tope) {
                System.out.print("  TOPE -> ");
            } else {
                System.out.print("          ");
            }
            System.out.println(actual.toString());
            actual = actual.siguiente;
        }
        System.out.println("===========================================");
    }

    public void limpiarHastaDefecto() {

    if (estaVacia()) {
        System.out.println("La pila está vacía.");
        return;
    }

    while (!estaVacia()) {

        Pieza actual = pop();

        if (actual.esDefectuosa) {
            System.out.println("⚠ Se encontró la pieza defectuosa:");
            System.out.println(actual.nombrePieza);
            break;
        } else {
            System.out.println("Pieza buena retirada y descartada: "
                    + actual.nombrePieza);
        }
    }
    }
}