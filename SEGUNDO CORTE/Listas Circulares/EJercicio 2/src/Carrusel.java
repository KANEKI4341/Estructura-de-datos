public class Carrusel {
    Anuncio cabeza;
    Anuncio cola;

    public Carrusel() {
        this.cabeza = null;
        this.cola = null;
    }

    public void agregarAnuncio(Anuncio anuncio) {

        if (cabeza == null) {
            cabeza = anuncio;
            cola = anuncio;
            anuncio.siguiente = cabeza;
        } else {
            cola.siguiente = anuncio;
            anuncio.siguiente = cabeza;
            cola = anuncio;
        }
    }

    public void mostrarAnuncios() {
        if (cabeza == null) {
            System.out.println("No hay anuncios registrados.");
            return;
        }

        Anuncio actual = cabeza;

        do {
            System.out.println("Título: " + actual.titulo +
                    ", Duración: " + actual.duracionSegundos +
                    ", Categoría: " + actual.categoria +
                    ", Veces repetido: " + actual.vecesRepetidos);

            actual = actual.siguiente;

        } while (actual != cabeza);
    }

    public void reproducir(int ciclos) {
        if (cabeza == null) {
            System.out.println("No hay anuncios.");
            return;
        }

        int tiempoTotal = 0;
        Anuncio masRepetido = cabeza;

        for (int i = 0; i < ciclos; i++) {

            Anuncio actual = cabeza;

            do {
                System.out.println("Mostrando: " + actual.titulo);

                actual.vecesRepetidos++;
                tiempoTotal += actual.duracionSegundos;

                if (actual.vecesRepetidos > masRepetido.vecesRepetidos) {
                    masRepetido = actual;
                }

                actual = actual.siguiente;

            } while (actual != cabeza);
        }

        System.out.println("Tiempo total: " + tiempoTotal + " segundos");
        System.out.println("Anuncio más repetido: " +
                masRepetido.titulo + " (" + masRepetido.vecesRepetidos + " veces)");
    }
}