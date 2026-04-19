

import javax.swing.JOptionPane;

public class Arreglos {
    
    public static void main(String[] args) {
        inicio();
    }
    public static void inicio(){

        int tam = solicitarTamano();
         int [] v1 = new int[tam];
    //    int [] v2,v4,v5;


     //   v2 = new int[solicitarTamano()];
     //   int [] v3 = {1,2,3,4};
      //  v4 = new int [v3.length];
      //  v5 = v3;
     llenarArreglo(v1);
     imprimir1(v1);
     System.out.println();
     impprimir2(v1);

        
    }

    public static void llenarArreglo (int [] arr){
        int i = 0;

        while (i<arr.length) {
            arr[i] = solicitarValores(i);
        }
    }



   public static int solicitarValores(int posision){
    return Integer.parseInt("Introduce en valor del arreglo posision" +  posision);
   }


    public static int solicitarTamano(){
    return Integer.parseInt((JOptionPane.showInputDialog("Introduce el tamaño")));
    }

    public static void imprimir1(int [] arr){
        
        String salida = "";
        for (int i =0; i< arr.length; i++){

            System.out.println("[ " + arr[i] + ",");
        }
        System.out.println("]");
}

public static void impprimir2 (int  [] arr ){


for(int item:arr){
    System.out.println(item);
}
}

}