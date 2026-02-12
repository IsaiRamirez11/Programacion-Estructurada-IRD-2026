import javax.swing.JOptionPane;

public class eje2Pack {
    public static void main(String[] args) {

        int opcion;
        String continuar = "S";
        double num1, num2, resultado;

        do {

            num1 = 0;
            num2 = 0;
            resultado = 0;

            do {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("1. Sumar\n" 
                  + "2. Restar\n" 
                 + "3. Multiplicar\n" 
                  + "4. Salir\n"));

                if(opcion < 1 || opcion > 4) {
                    JOptionPane.showMessageDialog(null, "Ingresa  uno entre 1 y 4");
                }

            } while(opcion < 1 || opcion > 4);

            if(opcion != 4) {
                num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el primer numero:"));

                num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el segundo numero:"));
            }

            switch(opcion) {

                case 1:
                    resultado = num1 + num2;
                    JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                break;

                
                    case 2:
                    resultado = num1 - num2;
                    JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                break;

                   case 3:
                    resultado = num1 * num2;
                    JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                break;

             case 4:
                    JOptionPane.showMessageDialog(null, "Salir");

                    continuar = "N";
                break;
            }

            if(opcion != 4) {
                continuar = JOptionPane.showInputDialog("¿Continuar? (S/N)").toUpperCase();
            }

        } while(continuar.equals("S"));
    }
}
