import javax.swing.JOptionPane;

/*muestra un menú para convertir temperaturas de Celsius a Fahrenheit y de Fahrenheit a 
Celsius.*/



public class eje3Pack {
    public static void main(String[] args) {

        int opcion;
        String continuar = "S";
        double c, f, resultado;

        do {

            c = 0;
            f = 0;
            resultado = 0;

            do {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(
                        "MENU\n" +
                        "1. Celsius a Fahrenheit\n" +
                        "2. Fahrenheit a Celsius\n" +
                        "3. Salir\n" ));
               

                if(opcion < 1 || opcion > 3) {

                    JOptionPane.showMessageDialog(null,"Ingresa una opcion entre 1 y 3" );
                        
                }

            } while(opcion < 1 || opcion > 3);

            switch(opcion) {

                case 1:
                    c = Double.parseDouble(JOptionPane.showInputDialog("Ingresa grados Celsius:"));

                      resultado = (c * 9/5) + 32;
                        
                    JOptionPane.showMessageDialog(null, "Fahrenheit: " + resultado);
                break;

                case 2:
                    f = Double.parseDouble( JOptionPane.showInputDialog("Ingresa grados Fahrenheit:"));
                       
                    resultado = (f - 32) * 5/9;

                    JOptionPane.showMessageDialog(null, "Celsius: " + resultado);
                break;

                case 3:
                    JOptionPane.showMessageDialog(null, "Salir");
                    
                    continuar = "N";
                break;
            }

      
            if(opcion != 3) {
                continuar = JOptionPane.showInputDialog(
                    "¿Quieres hacer otra conversion? (S/N)").toUpperCase();
                
            }

        } while(continuar.equals("S"));
    }
}
