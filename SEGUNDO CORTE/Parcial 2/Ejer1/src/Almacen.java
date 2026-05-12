public class Almacen {
    
    Producto inicio;

    public Almacen() {
        this.inicio = null;
    }

    public static void buscar(){
        Object codigo;
        if(codigo == null){
            System.out.println("codigo encontrado");
        }else{
            System.out.println("codigo no encontrado");
        }
        if(codigo == null){
            System.out.println("El codigo no encontrado");
            return;
        }

    }
    
    public void mostrarPorCaducar() {
            Producto actual = inicio;
            while (actual != null) {
                System.out.println("Codigo: " + actual.codigo +
                            " | Nombre: " + actual.nombre +
                            " | Cantidad: " + actual.Cantidad +
                            " | precio: " + actual.precio);
    
                actual = actual.siguiente;
            }
        }

        public void mostrarTodos() {
            Producto actual = inicio;
            while (actual != null) {
                System.out.println("Codigo: " + actual.codigo +
                        " | Nombre: " + actual.nombre +
                        " | cantidad: " + actual.cantidad +
                        " | precio: " + actual.precio);
                actual = actual.siguiente;
            }
        }




}
   