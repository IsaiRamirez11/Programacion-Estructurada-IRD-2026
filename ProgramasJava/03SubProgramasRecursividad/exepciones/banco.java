import javax.swing.*;
public class banco {



   private static double saldo = 0.0;

   public static void iniciar(){

   }

   private static void menu(){

       String menu = "", opcion = "";
       boolean salir = true;

       menu = "==== MENU ====\n" +
       "1) Consultar saldo\n" +
       "2) Depositar\n" +
       "3) Retirar\n" +
       "4) Salir\n" +
       "Elegir opcion";


       while (salir){

           opcion = JOptionPane.showInputDialog(menu).toUpperCase();

           switch (opcion){
               case "1":
               case "C":
                   JOptionPane.showMessageDialog(null, "Tu saldo es: "+ consultarSaldo());
                   break;
               case "2":
               case "D":
                   break;
               case "3":
               case "R":
                   break;
               case "4":
               case "S":
                   //Caso salir
                   salir = false;
                   break;
               default:
                   JOptionPane.showMessageDialog(null, "Elegir una opcion valida");
           }

       }

   }//Cierra el metodo Menu

    private static double consultarSaldo(){
       return saldo;
    }

}