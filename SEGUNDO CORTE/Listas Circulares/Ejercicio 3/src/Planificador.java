public class Planificador {
    Proceso cabeza;
    Proceso cola;

    public Planificador() {
        this.cabeza = null;
        this.cola = null;
    }

    public void agregarProceso(Proceso proceso) {

        if (cabeza == null) {
            cabeza = proceso;
            cola = proceso;
            proceso.siguiente = cabeza;
        } else {
            cola.siguiente = proceso;
            proceso.siguiente = cabeza;
            cola = proceso;
        }
    }

    public void mostrarProcesos() {
        if (cabeza == null) {
            System.out.println("No hay procesos.");
            return;
        }

        Proceso actual = cabeza;

        do {
            System.out.println("Nombre: " + actual.nombre +
                    ", PID: " + actual.pid +
                    ", Tiempo restante: " + actual.tiempo_restante +
                    ", Prioridad: " + actual.prioridad);

            actual = actual.siguiente;

        } while (actual != cabeza);
    }

    public void ejecutar(int quantum) {
        if (cabeza == null) {
            System.out.println("No hay procesos para ejecutar.");
            return;
        }

        String ordenFinal = "";

        while (cabeza != null) {

            Proceso actual = cabeza;

            do {
                System.out.println("Ejecutando: " + actual.nombre);

                actual.tiempo_restante -= quantum;

                if (actual.tiempo_restante <= 0) {
                    System.out.println("Proceso terminado: " + actual.nombre);

                    ordenFinal += actual.nombre + " -> ";

                    Proceso siguiente = actual.siguiente;
                    eliminarProceso(actual);

                    if (cabeza == null) {
                        break;
                    }

                    actual = siguiente;
                } else {
                    System.out.println("Tiempo restante: " + actual.tiempo_restante);
                    actual = actual.siguiente;
                }

            } while (cabeza != null && actual != cabeza);
        }

        System.out.println("Orden de finalización: " + ordenFinal);
    }

    private void eliminarProceso(Proceso proceso) {
        if (cabeza == null || proceso == null) {
            return;
        }

        if (cabeza == proceso && cabeza == cola) {
            cabeza = null;
            cola = null;
        } else if (cabeza == proceso) {
            cabeza = cabeza.siguiente;
            cola.siguiente = cabeza;
        } else {
            Proceso actual = cabeza;

            while (actual.siguiente != proceso) {
                actual = actual.siguiente;
            }

            actual.siguiente = proceso.siguiente;

            if (cola == proceso) {
                cola = actual;
            }
        }
    }
}