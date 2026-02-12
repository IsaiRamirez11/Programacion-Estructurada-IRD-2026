import javax.swing.JOptionPane;
public class metodos {


public static void main(String[] args) {
        String opcion = "";
        boolean sentinel = true;
        do {
            opcion = JOptionPane.showInputDialog(null, obtenerMenu());

            switch (opcion.toUpperCase()) {
                case "1":
                case "A":
                    calcularD();
                    break;
                case "2":
                case "B":
                    JOptionPane.showMessageDialog(null, "Opción 2");
                    break;
                case "3":
                case "C":
                    JOptionPane.showMessageDialog(null, "Opción 3");
                    break;
                case "4":
                case "S":
                    JOptionPane.showMessageDialog(null, "Salir");
                    sentinel = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no valida");

            }
        }while (sentinel);
    }
    public static String obtenerMenu(){


        return " MENÚ GENERAL " +
                "\n1-A Descuento bolitas" +
                "\n2-B)Opción 2" +
                "\n3-C)Opción 3" +
                "\n4-S)Salir" +
                "\nElegir opción: ";
    }
    public static String obtenerBolita(){
        String menu = "";
        String opcion = "";
        boolean sentinel = true;

        menu = "===== Toma una bolita =====" +
                "\n1) Roja" +
                "\n2) Amarilla" +
                "\n3) Blanca" +
                "\nElegir opcion";

        do{  
            sentinel= false;      
        opcion = JOptionPane.showInputDialog(menu);
        switch (opcion) {
            case  "1":{
           opcion = "1";
           break;
            }
           case "2":{
            opcion = "2";
            break;
           }
             case "3":{
            opcion = "3";
            break;
           }
           default:{
            JOptionPane.showMessageDialog(null, "Error");
            sentinel=true;
           }
        }
        }while(sentinel);
        
        return opcion;
    }
    public static String calcularD(){
        String opcion = "";
        boolean sentinel = true;
        double importe = 0.0, descuento =0.0, total, descuentoDia=0.0, totalDia=0.0;
        

        do{
        importe = Double.parseDouble(JOptionPane.showInputDialog("Introduce el importe"));

        }while(importe <= 0.0 && importe != -1);

       if(importe!=-1){
        obtenerBolita();
       }
        
             
        return "";

}
}
   // importe <= 0 && importe != -1