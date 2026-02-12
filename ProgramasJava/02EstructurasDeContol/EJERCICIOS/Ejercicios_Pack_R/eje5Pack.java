import javax.swing.JOptionPane;

public class eje5Pack {
   public static void main(String[] args) {

        int numero;

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero "));

            if(numero <= 0) {
                JOptionPane.showMessageDialog(null, "Error ingresa un numero positivo");
            }

        } while(numero <= 0);

        boolean esPrimo = true;

        if(numero == 1) {
            esPrimo = false;
        }

        for(int i = 2; i < numero; i++) {
            if(numero % i == 0) {
                esPrimo = false;
                break;
            }
        }

        if(esPrimo) {
            JOptionPane.showMessageDialog(null, "El numero " + numero + " es primo");
        } else {
            JOptionPane.showMessageDialog(null, "El numero " + numero + " no es primo");
        }
    } 
}