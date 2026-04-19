import javax.swing.JOptionPane;

public class Ejerccio2Unidad_ultima {
     public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar() {
     double[] arr1 = new double[solicitarTamano()];
    double[] arr2 = new double[arr1.length];



        almacenar(arr1);



        for (int i=0; i<arr1.length; i++) {
            arr2[i] = arr1[i] * arr1[i];
        }

    
    
    
        imprimir(arr1,arr2);


    }
public static void imprimir(double[] arr1, double[] arr2){
    String m1 = "Areglo original\n";
    String m2="Arreglo cuadrado\n";



    for (int i = 0; i < arr1.length; i++) {
    m1+="posicion " + (i + 1)+ " "+arr1[i] + "\n";
    }




    for (int i = 0; i < arr2.length; i++) {
    m2+="posición " + (i + 1)+ " "+arr2[i] + "\n";
    }

    JOptionPane.showMessageDialog(null, m1 +"\n"+ m2);
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




//JOptionPane.showInputDialog("Ingresa el numero " + (posicion + 1) + ":"));