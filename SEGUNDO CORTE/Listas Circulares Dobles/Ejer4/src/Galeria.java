public class Galeria {

    Foto cabeza;
    Foto cola;
    Foto actual;

    public boolean estaVacia() {
        return cabeza == null;
    }

    public void agregar(String titulo, String fecha) {
        Foto nueva = new Foto(titulo, fecha);

        if (cabeza == null) {
            cabeza = nueva;
            cola = nueva;
            nueva.siguiente = nueva;
            nueva.anterior = nueva;
            actual = nueva;
        } else {
            cola.siguiente = nueva;
            nueva.anterior = cola;
            nueva.siguiente = cabeza;
            cabeza.anterior = nueva;
            cola = nueva;
        }
    }

    public void siguiente() {
        if (actual != null) {
            actual = actual.siguiente;
        }
    }

    public void anterior() {
        if (actual != null) {
            actual = actual.anterior;
        }
    }

    public void toggleFavorita() {
        if (actual != null) {
            actual.esFavorita = !actual.esFavorita;
        }
    }

    public void eliminarActual() {
        if (actual == null) return;

        if (actual == cabeza && actual == cola) {
            cabeza = null;
            cola = null;
            actual = null;
            return;
        }

        actual.anterior.siguiente = actual.siguiente;
        actual.siguiente.anterior = actual.anterior;

        if (actual == cabeza) cabeza = actual.siguiente;
        if (actual == cola) cola = actual.anterior;

        actual = actual.siguiente;
    }

    public void mostrarGaleria() {
        if (estaVacia()) {
            System.out.println("No hay fotos.");
            return;
        }

        System.out.println("\n=== Galería ===");

        Foto temp = cabeza;
        do {
        
            if (temp == actual) {
                System.out.print("[▶] ");
            } else {
                System.out.print("[ ] ");
            }

            if (temp.esFavorita) {
                System.out.print("[★] ");
            } else {
                System.out.print("[ ] ");
            }

            System.out.println(temp.titulo + " | " + temp.fecha);

            temp = temp.siguiente;

        } while (temp != cabeza);
    }
}
