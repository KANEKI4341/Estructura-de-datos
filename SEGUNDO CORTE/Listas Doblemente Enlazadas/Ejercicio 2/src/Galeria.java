public class Galeria {
    Fotografia cabeza;
    Fotografia cola;

    public Galeria(){
        this.cabeza = null;
        this.cola = null;
    }

    public void agregarFotografia(Fotografia foto) {
        if (cabeza == null) {
            cabeza = foto;
            cola = foto;
        } else {
            cola.siguiente = foto;
            foto.anterior = cola;
            cola = foto;
        }
    }

    public Fotografia siguienteFoto(Fotografia fotoActual) {
        if (fotoActual.siguiente == null) {
            System.out.println("No hay más fotos para avanzar.");
            return fotoActual; 
        }
        return fotoActual.siguiente; 
    }

    public Fotografia fotoAnterior(Fotografia fotoActual) {
        if (fotoActual.anterior == null) {
            System.out.println("No hay más fotos para retroceder.");
            return fotoActual;
        }
        return fotoActual.anterior; 
    }

    public void reproducirGaleria() {

        System.out.println("Reproduciendo galería hacia adelante:");
        Fotografia fotoActual = cabeza;

        while (fotoActual != null) {
            System.out.println("Foto: " + fotoActual.nombreArchivo + ", Tamaño: " 
            + fotoActual.tamanoMB + "MB, Resolución: " + fotoActual.resolucion);
            fotoActual = fotoActual.siguiente;
        }

        System.out.println("\nReproduciendo galería hacia atrás:");
        fotoActual = cola;
        while (fotoActual != null) {
            System.out.println("Foto: " + fotoActual.nombreArchivo + ", Tamaño: " 
            + fotoActual.tamanoMB + "MB, Resolución: " + fotoActual.resolucion);
            fotoActual = fotoActual.anterior;
        }
    }
}
