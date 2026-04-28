public class Historial {
    Comando cabeza;
    Comando cola;
    Comando cursor;

    public boolean estaVacio() {
        return cabeza == null;
    }

    public void agregar(String texto, boolean exitoso, String directorio) {
        Comando nuevo = new Comando(texto, exitoso, directorio);

        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
            nuevo.siguiente = nuevo;
            nuevo.anterior = nuevo;
            cursor = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
            cola = nuevo;
        }
    }

    public void arriba() {
        if (cursor != null) {
            cursor = cursor.anterior;
        }
    }

    public void abajo() {
        if (cursor != null) {
            cursor = cursor.siguiente;
        }
    }

    public void mostrarCursor() {
        if (cursor == null) {
            System.out.println("No hay comandos.");
            return;
        }

        System.out.println(">> Cursor en:");
        System.out.println(cursor.texto + " | " + cursor.directorio + " | " + (cursor.exitoso ? "OK" : "ERROR"));
    }

    public void eliminarActual() {
        if (cursor == null) return;

        if (cursor == cabeza && cursor == cola) {
            cabeza = null;
            cola = null;
            cursor = null;
            return;
        }

        cursor.anterior.siguiente = cursor.siguiente;
        cursor.siguiente.anterior = cursor.anterior;

        if (cursor == cabeza) cabeza = cursor.siguiente;
        if (cursor == cola) cola = cursor.anterior;

        cursor = cursor.siguiente;
    }

    public void mostrarHistorial() {
        if (estaVacio()) {
            System.out.println("Historial vacío.");
            return;
        }

        System.out.println("\n=== Historial de comandos ===");

        Comando actual = cabeza;
        do {
            if (actual == cursor) {
                System.out.print(">> "); 
            } else {
                System.out.print("   ");
            }

            System.out.println(actual.texto + " | " + actual.directorio + " | " + (actual.exitoso ? "OK" : "ERROR"));

            actual = actual.siguiente;
        } while (actual != cabeza);
    }
}