package Asesorias;

import javax.swing.JOptionPane;

public class c1 {
    public static void main(String[] args) {
      inicio();  
    }

    public static void inicio(){
   
        int n = ncalificaciones();
        double suma = pedir(n);
        // double resulltado = promedio(suma, n);

        JOptionPane.showMessageDialog(null, "Promedio es " + suma);
        



    }

    public static int ncalificaciones(){
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de calificaciones que desea ingresar "));
        return n;
    }

    public static double pedir(double n){
     double suma = 0.0;
        

         for( int i=1; i<=n; i++){

          boolean valido = false;
          double calificacion = 0;
             while(!valido){
                try{

                    calificacion=Double.parseDouble(JOptionPane.showInputDialog("Ingresa la calificacion "+ i));
                    valido=true;
                }catch(Exception e){

                    JOptionPane.showMessageDialog(null, "Solo numeros");
                }
             }

             suma+=calificacion;

         }
      return  suma/n;
    }

/* 
    public static double promedio(double suma, int n){

      double resultado = suma/n;

      return resultado;

    }
*/
}
