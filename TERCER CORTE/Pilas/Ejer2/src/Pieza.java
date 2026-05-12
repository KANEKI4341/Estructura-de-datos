public class Pieza {

    String nombrePieza;
    String numeroSerie;
    boolean esDefectuosa;

    Pieza siguiente;

    public Pieza(String nombrePieza, String numeroSerie, boolean esDefectuasa) {
        this.nombrePieza = nombrePieza;
        this.numeroSerie = numeroSerie;
        this.esDefectuosa = esDefectuasa;

        this.siguiente = null;
    }

    @Override
    public String toString() {
        return "[" + nombrePieza + " | " + numeroSerie + " | Defectuosa: " + esDefectuosa + "]";
    }
}
