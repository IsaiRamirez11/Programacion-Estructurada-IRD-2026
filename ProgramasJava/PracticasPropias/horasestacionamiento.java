package ProgramasJava.PracticasPropias;

import javax.swing.JOptionPane;

public class horasestacionamiento {
    public static void main(String[] args) {
      mostrarMenu();  
      
    }


public static void mostrarMenu(){
        String menu= "================ MENU ====================\n" +
        "1) multi\n" +
        "2) sumar\n"+
        "1) Elije una opcion\n"  ;

        String opcion;

         while(true){
         opcion = JOptionPane.showInputDialog(menu);
     
         switch (opcion) {
            case "1": multipicar(); break;
            case "2": sumar(); break;
            case "3": break;     
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida");
                break;
         }

         }

    }









    public static int pedirhoras(){
        
        int horas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa las horas"));
        return horas ;

    }
    public static int pedirdias(){
        
        int dias = Integer.parseInt(JOptionPane.showInputDialog("Ingresa las horas"));
        return dias ;

    }

    public static int multipicar(int h, int dias){

        int res= h*dias;
        return res;
    }

        public static int sumar(int h, int dias){

        int res= h+dias;
        return res;
    }

    public static void multipicar(){

     

        int dias=pedirdias();
        int horas=pedirhoras();


        int total=multipicar(horas,dias );

        JOptionPane.showMessageDialog(null, total);

    }

      public static void sumar(){

     

        int dias=pedirdias();
        int horas=pedirhoras();


        int total=sumar(horas,dias );

        JOptionPane.showMessageDialog(null, total);

    }






    
}
