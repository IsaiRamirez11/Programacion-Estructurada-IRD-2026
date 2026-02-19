import javax.swing.JOptionPane;

public class Metodos2 {
    public static void main(String[] args) {
        
      Metodos2.saludar();



    }




public static void saludar (){

JOptionPane.showMessageDialog(null, "Hola Mundo");

}

public static void saludar (String nombre){

JOptionPane.showMessageDialog(null, "Hola"+nombre);

}
}