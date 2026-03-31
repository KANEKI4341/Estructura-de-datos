public class EstanteLacteos {
        Item inicio;

        public EstanteLacteos() {
            this.inicio = null;
        }

        public void insertarProducto(Item nuevo) {
            if (nuevo.diasCaducidad < 3) {
                // prioridad: al inicio
                nuevo.siguiente = inicio;
                inicio = nuevo;
            } else {
                if (inicio == null) {
                    inicio = nuevo;
                } else {
                    Item actual = inicio;
                    while (actual.siguiente != null) {
                        actual = actual.siguiente;
                    }
                    actual.siguiente = nuevo;
                }
            }
        }

        public void mostrarPorCaducar() {
            Item actual = inicio;
            while (actual != null) {
                if (actual.diasCaducidad < 5) {
                    System.out.println("Producto: " + actual.nombre +
                            " | Stock: " + actual.cantidad +
                            " | Días restantes: " + actual.diasCaducidad);
                }
                actual = actual.siguiente;
            }
        }

        public void mostrarTodos() {
            Item actual = inicio;
            while (actual != null) {
                System.out.println("Producto: " + actual.nombre +
                        " | Stock: " + actual.cantidad +
                        " | Días restantes: " + actual.diasCaducidad);
                actual = actual.siguiente;
            }
        }
}
