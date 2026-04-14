public class Fila {
    
    Paciente cabeza;
    Paciente cola;

    public Fila() {
        this.cabeza = null;
        this.cola = null;
    }

    public void agregarPaciente(String nombre, int edad, int nivelUrgencia) {
        Paciente nuevoPaciente = new Paciente(nombre, edad, nivelUrgencia);
        
        if (cabeza == null) {
            cabeza = nuevoPaciente;
            cola = nuevoPaciente;
        } else {
            if (nivelUrgencia == 5) {
                nuevoPaciente.siguiente = cabeza.siguiente;
                nuevoPaciente.anterior = cabeza;
                if (cabeza.siguiente != null) {
                    cabeza.siguiente.anterior = nuevoPaciente;
                }
                cabeza.siguiente = nuevoPaciente;
                if (cola == cabeza) {
                    cola = nuevoPaciente;
                }
            } else {
                cola.siguiente = nuevoPaciente;
                nuevoPaciente.anterior = cola;
                cola = nuevoPaciente;
            }
        }
    }

    public void mostrarMayorEdad() {
        if (cola == null) {
            System.out.println("No hay pacientes en la fila.");
            return;
        }

        Paciente pacienteMayorEdad = cola;
        Paciente actual = cola;

        while (actual != null) {
            if (actual.edad > pacienteMayorEdad.edad) {
                pacienteMayorEdad = actual;
            }
            actual = actual.anterior;
        }

        System.out.println("Paciente de mayor edad:");
        System.out.println("Nombre: " + pacienteMayorEdad.nombre);
        System.out.println("Edad: " + pacienteMayorEdad.edad);
        System.out.println("Nivel de Urgencia: " + pacienteMayorEdad.nivelUrgencia);
    }
}
