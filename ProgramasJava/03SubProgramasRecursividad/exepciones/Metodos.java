import javax.swing.JOptionPane;
public class Metodos {
    public static void main (String[] args){
        //DECLARACION DE VARIABLES
        int num1 = 0, num2 = 0, suma = 0;
        saludar();
        num1 = solicitarNumeros();
        num2 = solicitarNumeros();
        suma = sumar(num1, num2 );

    }

    public static void saludar(){
        JOptionPane.showMessageDialog(null, "Bienvenido a las funciones en java");
    }

    public static int solicitarNumeros (){
        return Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero"));
    }

    public  static int sumar (int a, int b){
        return a +b;
    }
}