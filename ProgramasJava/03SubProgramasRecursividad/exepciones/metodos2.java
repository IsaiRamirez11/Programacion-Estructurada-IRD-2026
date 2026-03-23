import javax.swing.JOptionPane;

public class metodos2 {
    public static void saludar(){
        JOptionPane.showMessageDialog(null, "saludar");
    }

    public static void saludar(String nombre) {
        JOptionPane.showMessageDialog(null, "saludar");
    }

    public static int sumar (int a, int b){
        int suma = a + b;
        return suma;
    }

    public static boolean autenticar(){
        String usuario = "vane";
        String password = "vane123";

        if( usuario.toUpperCase().equals(usuario) && password.equals(password)){
        }
        return false ;
    }
}