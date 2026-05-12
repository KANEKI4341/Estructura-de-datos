public class Cueva {

    private Estacion tope;
    private int tamanio;

    public Cueva() {

        this.tope = null;
        this.tamanio = 0;
    }

    public boolean estaVacia() {

        return tope == null;
    }

    public void push(Estacion nuevo) {

        nuevo.siguiente = tope;
        tope = nuevo;

        tamanio++;
    }

    public Estacion pop() {

        if (estaVacia()) {
            return null;
        }

        Estacion aux = tope;

        tope = tope.siguiente;

        tamanio--;

        aux.siguiente = null;

        return aux;
    }

    public Estacion peek() {

        return tope;
    }

    public void imprimir() {

        if (estaVacia()) {

            System.out.println("No hay estaciones registradas.");
            return;
        }

        Estacion actual = tope;

        System.out.println("\n=== ESTACIONES EN LA CUEVA ===");

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

    public void retrocederASuperficie() {

        if (estaVacia()) {

            System.out.println("No hay estaciones en la pila.");
            return;
        }

        System.out.println("\nIniciando regreso a la superficie...\n");

        while (!estaVacia()) {

            Estacion actual = pop();

            System.out.println("Pasando por estación: "
                    + actual.nombrePunto);

            if (actual.nivelOxigeno < 18) {

                System.out.println(
                        "ALERTA: Uso de Tanque de Emergencia Requerido"
                );
            }
        }

        System.out.println("\nEl equipo ha salido de la cueva.");
    }
}
