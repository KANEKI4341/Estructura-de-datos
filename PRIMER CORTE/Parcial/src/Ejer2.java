import java.util.Scanner;

public class Ejer2 {

    public static void main(String[] args) {
        Scanner gestionar = new Scanner(System.in);

        biblioteca[] libros = new biblioteca[5];

        System.out.println("--- INGRESO DE LIBROS ---");
        for (int i = 0; i < libros.length; i++) {

            System.out.println("\nLibro " + (i + 1) + ":");

            System.out.print("Ingrese código: ");
            int codigo = gestionar.nextInt();
            gestionar.nextLine();

            System.out.print("Ingrese título: ");
            String titulo = gestionar.nextLine();

            System.out.print("Ingrese número de páginas: ");
            int paginas = gestionar.nextInt();

            libros[i] = new biblioteca(codigo, titulo, paginas);
        }

        ordenar(libros);

        System.out.println("\n--- LISTA DE LIBROS ORDENADOS ---");
        for (int i = 0; i < libros.length; i++) {
            System.out.println(libros[i]);
        }

        biblioteca libroMenor = libroConMenosPaginas(libros);
        System.out.println("\n--- LIBRO CON MENOS PÁGINAS ---");
        System.out.println(">> " + libroMenor.titulo +
                           " - Código: " + libroMenor.codigo +
                           " - Páginas: " + libroMenor.paginas);

        System.out.println("\n--- BÚSQUEDA BINARIA ---");
        System.out.print("Ingrese código a buscar: ");
        int idBuscar = gestionar.nextInt();

        int posicion = busquedaBinaria(libros, idBuscar);

        if (posicion != -1) {
            biblioteca b = libros[posicion];
            System.out.println(">> LIBRO ENCONTRADO: " +
                    b.titulo + " - Código: " + b.codigo + " - Páginas: " + b.paginas);
        } else {
            System.out.println("Libro no encontrado.");
        }

        gestionar.close();
    }

    public static class biblioteca {
        int codigo;
        String titulo;
        int paginas;

        public biblioteca(int codigo, String titulo, int paginas) {
            this.codigo = codigo;
            this.titulo = titulo;
            this.paginas = paginas;
        }

        @Override
        public String toString() {
            return "Código: " + codigo + " | Título: " + titulo +
                   " | Páginas: " + paginas;
        }
    }

    public static void ordenar(biblioteca[] libros) {
        for (int i = 1; i < libros.length; i++) {
            biblioteca key = libros[i];
            int j = i - 1;

            while (j >= 0 && libros[j].codigo > key.codigo) {
                libros[j + 1] = libros[j];
                j--;
            }
            libros[j + 1] = key;
        }
    }

    public static int busquedaBinaria(biblioteca[] libros, int id) {
        int low = 0, high = libros.length - 1;
        while (low <= high) {
            int mitad = low + (high - low) / 2;
            if (libros[mitad].codigo == id) {
                return mitad;
            } else if (libros[mitad].codigo < id) {
                low = mitad + 1;
            } else {
                high = mitad - 1;
            }
        }
        return -1;
    }

    public static int busquedaLineal(biblioteca[] libros, int id) {
        for (int i = 0; i < libros.length; i++) {
            if (libros[i].codigo == id) {
                return i;
            }
        }
        return -1;
    }

    public static biblioteca libroConMenosPaginas(biblioteca[] libros) {
        if (libros.length == 0) return null;

        biblioteca menor = libros[0];
        for (int i = 1; i < libros.length; i++) {
            if (libros[i].paginas < menor.paginas) {
                menor = libros[i];
            }
        }
        return menor;
    }
}