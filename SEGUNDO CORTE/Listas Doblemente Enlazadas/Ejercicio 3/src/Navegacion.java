public class Navegacion {
    
    Pestaña cabeza;
    Pestaña cola;

    public Navegacion() {
        this.cabeza = null;
        this.cola = null;
    }

    public void agregarPestana(String tituloPagina, String url, String horaApertura) {
        Pestaña nuevaPestana = new Pestaña(tituloPagina, url, horaApertura);

        if (cabeza == null) {
            cabeza = nuevaPestana;
            cola = nuevaPestana;
        } else {
            cola.siguiente = nuevaPestana;
            nuevaPestana.anterior = cola;
            cola = nuevaPestana;
        }
    }

    public Pestaña pestañaSiguiente(Pestaña actual) {
        if (actual == null || actual.siguiente == null) {
            System.out.println("No hay pestaña siguiente");
            return actual;
        }
        return actual.siguiente;
    }

    public Pestaña pestañaAnterior(Pestaña actual) {
        if (actual == null || actual.anterior == null) {
            System.out.println("No hay pestaña anterior");
            return actual;
        }
        return actual.anterior;
    }
    
    public Pestaña cerrarPestanaActual(String url) {

        if (cabeza == null) {
            System.out.println("No hay pestañas");
            return null;
        }

        Pestaña actual = cabeza;

        while (actual != null) {

            if (actual.url.equals(url)) {

                if (cabeza == cola) {
                    cabeza = null;
                    cola = null;
                    return null;
                }

                if (actual == cabeza) {
                    cabeza = actual.siguiente;
                    cabeza.anterior = null;
                    return cabeza;
                }

                if (actual == cola) {
                    cola = actual.anterior;
                    cola.siguiente = null;
                    return cola;
                }

                actual.anterior.siguiente = actual.siguiente;
                actual.siguiente.anterior = actual.anterior;

                return actual.anterior;
            }

            actual = actual.siguiente;
        }

        System.out.println("No se encontró la pestaña");
        return null;
    }
}