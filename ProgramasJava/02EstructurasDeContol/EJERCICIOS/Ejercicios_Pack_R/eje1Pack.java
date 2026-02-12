import javax.swing.JOptionPane;

public class eje1Pack {
    public static void main(String[] args) {

        int numero;
        int suma = 0;
        int contador = 0;

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero enter:"));

            if(numero >= 0) {
                suma = suma + numero;
                contador++;
            }

        } while(numero >= 0);

        JOptionPane.showMessageDialog(null, "Total: " + suma + 
        "\nNumero ingresados: " + contador);
        
    }
}
