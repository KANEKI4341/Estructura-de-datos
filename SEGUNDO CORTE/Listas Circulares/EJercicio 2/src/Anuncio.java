public class Anuncio {
    
    String titulo;
    int duracionSegundos;
    int vecesRepetidos;
    String categoria;

    Anuncio siguiente; 

    public Anuncio(String titulo, int duracionSegundos, String categoria) {
        this.titulo = titulo;
        this.duracionSegundos = duracionSegundos;
        this.categoria = categoria;
        this.vecesRepetidos = 0; 
        
    }
}
