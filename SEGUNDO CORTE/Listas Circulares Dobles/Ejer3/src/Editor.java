public class Editor {

    Capa cabeza;
    Capa cola;
    Capa capaActiva;

    public boolean estaVacio() {
        return cabeza == null;
    }

    public void agregar(String nombre, boolean visible, String tipo) {
        Capa nueva = new Capa(nombre, visible, tipo);

        if (cabeza == null) {
            cabeza = nueva;
            cola = nueva;
            nueva.siguiente = nueva;
            nueva.anterior = nueva;
            capaActiva = nueva;
        } else {
            cola.siguiente = nueva;
            nueva.anterior = cola;
            nueva.siguiente = cabeza;
            cabeza.anterior = nueva;
            cola = nueva;
        }
    }

    public void subirCapa() {
        if (capaActiva != null) {
            capaActiva = capaActiva.siguiente;
        }
    }

    public void bajarCapa() {
        if (capaActiva != null) {
            capaActiva = capaActiva.anterior;
        }
    }

    public void toggleVisibilidad() {
        if (capaActiva != null) {
            capaActiva.visible = !capaActiva.visible;
        }
    }

    public void eliminarActiva() {
        if (capaActiva == null) return;

        if (capaActiva == cabeza && capaActiva == cola) {
            cabeza = null;
            cola = null;
            capaActiva = null;
            return;
        }

        capaActiva.anterior.siguiente = capaActiva.siguiente;
        capaActiva.siguiente.anterior = capaActiva.anterior;

        if (capaActiva == cabeza) cabeza = capaActiva.siguiente;
        if (capaActiva == cola) cola = capaActiva.anterior;

        capaActiva = capaActiva.siguiente;
    }

    public void mostrarCapas() {
        if (estaVacio()) {
            System.out.println("No hay capas.");
            return;
        }

        System.out.println("\n=== Capas ===");

        Capa actual = cabeza;
        do {
            if (actual == capaActiva) {
                System.out.print("[✓] ");
            } else {
                System.out.print("[ ] ");
            }

            System.out.println(actual.nombre +
                    " | " + actual.tipo +
                    " | " + (actual.visible ? "VISIBLE" : "OCULTA"));

            actual = actual.siguiente;

        } while (actual != cabeza);
    }
}
