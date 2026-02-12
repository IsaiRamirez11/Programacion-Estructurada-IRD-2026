import javax.swing.JOptionPane;

public class factorial {
    public static void main(String[] args) {
        int fact = 1, n=0, res=1, i;

    n = Integer.parseInt(  JOptionPane.showInputDialog("Ingrese el numero a calcular"));
   if (n>=0){
      for(i = 1;i<=n; i++){
          res=res*i;
}

   }else{
        JOptionPane.showMessageDialog(null, "Error");
   }

   JOptionPane.showMessageDialog(null, "El factorial de: " + n + " es:"+res);




    }
}
