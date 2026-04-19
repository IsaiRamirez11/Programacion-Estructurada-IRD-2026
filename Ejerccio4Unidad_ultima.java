//Realizar un programa que que lea un número cualquiera  y busque en el vector x, el cual tendrá almacenados n elementos. 
//El programa debe imprimir la posición donde se encuentra almacenado el número en el vector o el mensaje NO sino lo encuentra.

import javax.swing.JOptionPane;

public class Ejerccio4Unidad_ultima {
    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar() {
        double[] vector = new double[solicitarTamano()];
        almacenar(vector);

        
        double buscar = buscar();

        int posicionEncontrada=-1;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == buscar) {
                posicionEncontrada = i;
               
            }
            }
            imprimir(buscar, posicionEncontrada);
    }








    public static void imprimir(double buscar, int posicion) {
        if (posicion ==-1) {

            JOptionPane.showMessageDialog(null,"el numero"+buscar+" no se encuentra en el vector");
                
        } else {
            JOptionPane.showMessageDialog(null,"el numero"+buscar+" esta en posision"+(posicion + 1));
                
        }
    }







    public static int solicitarTamano() {
        while (true) {
            try {
                int num = Integer.parseInt(JOptionPane.showInputDialog("ingresa el tamaño del vector"));
                if (num > 0 && num <= 20){
                    return num;
                }
                JOptionPane.showMessageDialog(null, "solo entre 1 y 20");
                   }catch (NumberFormatException ex) {
                 JOptionPane.showMessageDialog(null, "solo numeros enteros");
      }
     }
    }











    public static double solicitarNum(int posicion) {
        while (true) {
            try {
                return Double.parseDouble(
                    JOptionPane.showInputDialog("ingresa el valor en la posicion "+(posicion+1) + ":"));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "solo numeros");
            }
        }
    }







    public static double buscar() {
        while (true) {
            try {
                return Double.parseDouble(
                    JOptionPane.showInputDialog("numeri para buscar"));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "solo numeros");
            }
        }
    }

    public static void almacenar(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = solicitarNum(i);
        }
    }
}