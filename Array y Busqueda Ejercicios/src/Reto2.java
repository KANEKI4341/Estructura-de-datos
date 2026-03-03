import java.util.Scanner;

public class Reto2 {

    public static void main(String[] args) {

        Scanner banco = new Scanner(System.in);

        int[] cuentasVIP = {10, 25, 40, 80, 150}; 

        int[] cuentas = new int[5];
        double[] montos = new double[5];

        for (int i = 0; i < 5; i++) {

            System.out.println("Transaccion " + (i + 1));

            System.out.print("Ingrese el numero de cuenta: ");
            cuentas[i] = banco.nextInt();

            System.out.print("Ingrese el monto: ");
            montos[i] = banco.nextDouble();
        }

        for (int i = 0; i < 5; i++) {

            if (montos[i] > 5000) {

                System.out.println("Cuenta: " + cuentas[i] + " Monto: " + montos[i]);

                int low = 0;
                int high = cuentasVIP.length - 1;
                boolean encontrada = false;

                while (low <= high) {

                    int mitad = low + (high - low) / 2;

                    if (cuentasVIP[mitad] == cuentas[i]) {
                        encontrada = true;
                        break;
                    } 
                    else if (cuentasVIP[mitad] < cuentas[i]) {
                        low = mitad + 1;
                    } 
                    else {
                        high = mitad - 1;
                    }
                }

                if (!encontrada) {
                    System.out.println("Alerta de fraude: Cuenta no autorizada para montos altos");
                } 
            }
        }
        banco.close();
    }
}
