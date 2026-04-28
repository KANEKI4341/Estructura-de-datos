public class Historial {
    Comando cabeza;
    Comando cola;

    public Historial(){
        this.cabeza = null;
        this.cola = null;
    }

    public boolean estaVacido(){
        return cabeza == null;
    }

    public void agregarComando(String texto, boolean exitoso, String directorio){
        Comando nuevo = new Comando (texto, exitoso, directorio);
        if (cabeza == null){
            nuevo.siguiente = nuevo;
            nuevo.anterior = nuevo;
        }
    }
}
