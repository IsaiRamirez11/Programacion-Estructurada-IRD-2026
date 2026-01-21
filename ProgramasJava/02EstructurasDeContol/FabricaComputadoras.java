import javax.swing.JOptionPane;

public class FabricaComputadoras {
    public static void main(String[] args) {

        /*Se planea ofrecer a los clinetes un descuento que dependera del numero de computadoras.
          si las compudadoras son menos de 5 se les dara un descuenro del 10% sobre el total de 
          la compra si el numero de computadoras es mayor o igual a 5 pero menos de 10 se le otorga
          el 20% de descuento y si son mas de 10 se les otorga un 40% de descuento */

          int Ncomputadoras=0;
          double precio=11000, total, desscuento;


          Ncomputadoras = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las computadoras que llevara "));

          if (Ncomputadoras<5){
             total=Ncomputadoras*0.90;
            JOptionPane.showMessageDialog(null, "Obtiene un decuento del 10%");
           
          }
          else if (Ncomputadoras>=5 && Ncomputadoras <10){
             total=Ncomputadoras*0.80;
             JOptionPane.showMessageDialog(null, "Obtiene un decuento del 20%" + " el total a pagar es de: $" + total);
          }
          else{
             total=Ncomputadoras*0.60;
            JOptionPane.showMessageDialog(null, "Obtiene un decuento del 40%" + " el total a pagar es de: $" + total);

          }
    }
}
