import javax.swing.JOptionPane;

public class Ejerccio3Unidad_ultima {
    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar() {
        double[] arr1 = new double[solicitarTamano()];
        almacenar(arr1);

        int c=0, p=0, n= 0;
        double sumaP=0, sumaN=0;

        for (int i = 0; i<arr1.length; i++) {
           
            if (arr1[i] == 0) {
            c++;



            } else if (arr1[i] >0) {
            p++;
            sumaP += arr1[i];

            
            } else {
                n++;
                sumaN += arr1[i];
            }
        }

        imprimir(c,p,n,sumaP,sumaN);
    }

    public static void imprimir(int c, int p, int n,double sumaP, double sumaN) { 
                                 
        JOptionPane.showMessageDialog(null,
            "ceros: " + c +"\n" +
            "positivos: " +p +"\n"  +
            "negativos: " + n +"\n"  +
            "suma positivos: " + sumaP +"\n"  +
            "\nsuma negativos: " + sumaN);
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
                    JOptionPane.showInputDialog("Ingresa el numero"));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "solo numeros");
        }
        }
    }

    public static void almacenar(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] =solicitarNum(i);
    }
    }
}
