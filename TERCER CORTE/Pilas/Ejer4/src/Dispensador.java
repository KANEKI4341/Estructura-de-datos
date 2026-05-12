public class Dispensador {

    private Medicamento tope;
    private int tamanio;

    public Dispensador() {

        this.tope = null;
        this.tamanio = 0;
    }

    public boolean estaVacia() {

        return tope == null;
    }

    public void push(Medicamento nuevo) {

        nuevo.siguiente = tope;
        tope = nuevo;

        tamanio++;
    }

    public Medicamento pop() {

        if (estaVacia()) {
            return null;
        }

        Medicamento aux = tope;

        tope = tope.siguiente;

        tamanio--;

        aux.siguiente = null;

        return aux;
    }

    public Medicamento peek() {

        return tope;
    }

    public void imprimir() {

        if (estaVacia()) {

            System.out.println("Pila vacía.");
            return;
        }

        Medicamento actual = tope;

        System.out.println("\n=== MEDICAMENTOS EN EL TUBO ===");

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

    public void validarDespacho() {

        while (!estaVacia() && peek().diasParaVencer < 10) {

            Medicamento retirado = pop();

            System.out.println("Medicamento retirado por vencimiento próximo:");
            System.out.println(retirado);
        }

        if (estaVacia()) {

            System.out.println("No quedan medicamentos seguros.");

        } else {

            System.out.println("Medicamento seguro para despacho:");
            System.out.println(peek());
        }
    }
}