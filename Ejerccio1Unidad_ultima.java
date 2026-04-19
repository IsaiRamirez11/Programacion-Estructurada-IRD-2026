import javax.swing.JOptionPane;

public class Ejerccio1Unidad_ultima {
    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar() {
        double[] vector = new double[solicitarTam()];
        almacenar(vector);

        int mayor=0;
        for (int i = 1; i<vector.length; i++) {
    if (vector[i] >vector[mayor]) {
    mayor = i;
            }
        }

        imprimir(vector,mayor);
    }

    public static void imprimir(double[] vector, int mayor) {
   

        JOptionPane.showMessageDialog(null,"el nmero mayor es " + vector[mayor] +" su pscicion es" + (mayor+1));
    }

    public static int solicitarTam() {
        while (true) {
            try {
                int num = Integer.parseInt(JOptionPane.showInputDialog("ingresa el el tamaño"));
                if (num>0 && num<=20) {
                    return num;
                                      }
               
 JOptionPane.showMessageDialog(null, "el tamaño debe ser entre 1 y 20");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "solo numeros enteros");
            }
        }
    }

    public static double solicitarNum(double[] arr, int numero) {
        while (true) {
            try {
                double num = Double.parseDouble(JOptionPane.showInputDialog("ingresa el numero"));

                


                
                boolean rep = false;




                for (int i = 0; i  <numero;   i++) {
                    if (arr[i]==num) {
                 rep = true;
                        break;
                    }
                }

                if (rep){
                JOptionPane.showMessageDialog(null, "el numero repetifo");
                }
                else {
            return num;
                }

            } catch (NumberFormatException ex) {
          JOptionPane.showMessageDialog(null, "solo numeros");
            }
        }
    }

    public static void almacenar(double arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = solicitarNum( arr,i); 
        }
    }
}





















//  JOptionPane.showInputDialog("ingresa el numero  " + (posicion + 1) + ":"));