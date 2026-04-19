package Arreglos;

import javax.swing.JOptionPane;

public class eje2 {

    public static void main(String[] args) {
        inicio();
    }


    public static void iniciar(){
        int [] v2;
        int tam = solicitarTamano();
         int [] v1 = new int[tam];
         v2 = new int [v1.length];

    }  
    
     public static int solicitarTam(){
        int tamano=0;
        while (true) {
            try{
                tamano=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de calificaciones."));

                if(tamano<=0){
                    JOptionPane.showMessageDialog(null, "Solo numeros positivos");
                }else{
                    return tamano;
                }
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
    }

    
   public static llenarcalif(double [] arr){
    for(int i=0; i<arr.length; i++){
        arr[i]=solicitarCalif();
    }
   }

    public static double solicitarCalif(){
        double valor=0.0;
        while (true) {
            try{
            valor = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion"));
            if(valor>=0 && valor <=10){
                return valor;
            
            }else{
                JOptionPane.showMessageDialog(null, "Calificacion no valida");
            }
            }catch(NumberFormatException ex) {
             JOptionPane.showMessageDialog(null, "Solo numeros");
            }
        }
        }
    
}
