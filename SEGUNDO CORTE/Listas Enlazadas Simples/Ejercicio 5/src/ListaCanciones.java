public class ListaCanciones {
    Cancion cabeza;
    Cancion actual; 

    public ListaCanciones() {
        this.cabeza = null;
        this.actual = null;
    }

    public void agregarAContinuacion(Cancion nueva) {
        if (cabeza == null) {
            cabeza = nueva;
            actual = nueva;
        } else {
            nueva.siguiente = actual.siguiente;
            actual.siguiente = nueva;
            actual = nueva;
        }

    }

    public void agregarAlFinal(Cancion nueva) {
        if (cabeza == null) {
            cabeza = nueva;
            actual = nueva;
        } else {
            Cancion aux = cabeza;
            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = nueva;
        }
    }

        public void mostrarLista() {
        if (cabeza == null) {
            System.out.println("Lista vacía.");
            return;
        }

        System.out.println("\n========================================");
        System.out.println("        LISTA DE REPRODUCCIÓN");
        System.out.println("========================================");

        Cancion aux = cabeza;
        while (aux != null) {
            System.out.println(  aux.titulo + " | " + aux.artista +
                    " | " + aux.duracionSegundos + " seg | " + aux.genero);
            aux = aux.siguiente;
        }
    }

    public void tiempoTotal() {
        int total = 0;
        Cancion aux = cabeza;

        while (aux != null) {
            total += aux.duracionSegundos;
            aux = aux.siguiente;
        }

        int minutos = total / 60;
        int segundos = total % 60;

        System.out.printf("\n Tiempo total: %02d:%02d\n", minutos, segundos);
    }
}