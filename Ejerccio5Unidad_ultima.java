//Diseñar un programa que lea dos vectores A y B de n elementos llenados aleatoriamente con
// números enteros, y multiplicar el primer elemento del arreglo A con el último elemento de 
// B y luego el segundo elemento de A por el penúltimo elemento de B y así sucesivamente hasta multiplicar el ultimo elemento del vector A por el primer elemento del Vector B, el resultado de cada multiplicación almacenarlo en un vector C. Imprimir los tres vectores A, B y C

import javax.swing.JOptionPane;

public class Ejerccio5Unidad_ultima {
    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar() {
        int tamano=solicitarTamano();

        int[]V1=new int[tamano],V2=new int[tamano],V3=new int[tamano];
        

        llenarAleatorio(V1);
        llenarAleatorio(V2);

        

        
        for (int i = 0; i < tamano; i++) {
            V3[i] = V1[i] * V2[tamano-1-i];
        }

        imprimir(V1,V2,V3);
    }









    public static void llenarAleatorio(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] =(int)(Math.random()*100)+1;
        }
    }












    public static void imprimir(int[] V1, int[] V2, int[] V3) {
        
        String m = "vector A\n";


    for (int i = 0; i < V1.length; i++) {
            m += "  posicion " + (i + 1) + ": " + V1[i] + "\n";
                                             }


        m += "\nvector B\n";
    for (int i = 0; i < V2.length; i++) {
            m += "  posicion " + (i + 1) + ": " + V2[i] + "\n";
                                       }

        m += "\nvector C \n";
    for (int i = 0; i < V3.length; i++) {


            m += "A[" + (i + 1) +"]*B["+(V2.length-i)+"]=" + V1[i] + " * " + V2[V2.length - 1 - i] + " = " + V3[i] + "\n";
                
                                       }

        JOptionPane.showMessageDialog(null, m);


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
}