
import javax.swing.*;
import java.util.jar.JarOutputStream;


public class Ventas {
    private static String solicitarNombreDeCliente (){
        return JOptionPane.showInputDialog("Nombre del Cliente:");
    }
public static void iniciar(){
        String nombre = solicitarNombreCliente();
        int cantidad = validarEnteroPositivo("INGRESA LA CANTIDAD DE PRODUCTOS");
        double total = calcularTotal(cantidad);
        double totalConDescuento = aplicarDescuento(total);
    }
    
    private static void imprimir(String nombre, double total, double totalConDescuento){
        
    }

    private static String solicitarNombreCliente(){

        String nombre = "";
        while(true){
            nombre = JOptionPane.showInputDialog("INTRODUCE EL NOMBRE: ");

            if (nombre != null){
                nombre = nombre.trim().toUpperCase();

                if( !nombre.equals("") ){
                    if ( nombre.length() >0 && nombre.length()<=10){
                        if( validarNumerosNombre(nombre)){
                            JOptionPane.showMessageDialog(null, "EL NOMBRE NO PUEDE CONTENER");
                        }else{
                            return nombre;
                        }
                    }

                }else{
                    JOptionPane.showMessageDialog(null,"VACIO");
                }
            }else{
                JOptionPane.showMessageDialog(null, "EL NOMBRE NO PUEDE SER NULO ");
            }

        }
    }

    private static boolean validarNumerosNombre(String nombre){
        for (int i = 0; i<nombre.length(); i++){
            if ( Character.isDigit( nombre.charAt(i) )){
                return  true;
            }
        }
        return  false;
    }

    private static int validarEnteroPositivo(String mensaje){
        int numero = 0;
        while(true){
            try{
                numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
                if(numero > 0){ // si es mayor a 0, osea positivo, retorna el numero
                    return  numero;
                }else{// y si no, hasta que lo agrege positivo saldra esta alerta
                    JOptionPane.showMessageDialog(null,"DEBE SER MAYOR A CERO ");
                }
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "DATO INVALIDO");

            }
        }
    }

    private static double validarDoublePositivo(String mensaje){
        double numero = 0.0;
        while(true){
            try {
                /** ERRORES de varios tipos, este solo es para excepciones,
                 * si pasa algo lo lleva a cathc, permite que no se trabe**/
                numero = Double.parseDouble(JOptionPane.showInputDialog(mensaje));
                if (numero > 0) {
                    return numero;
                } else{
                    JOptionPane.showMessageDialog(null, "DEBE DE SER MAYOR A 0");
                }

            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "DATO INVALIDO");
            }
        }
    }

    private static double calcularTotal(int cantidad){
     double total = 0.0, precio = 0.0;
     for(int i = 0; i <= cantidad; i++){
         precio = validarDoublePositivo("PRECIO DEL PRODUCTO " + i +":");
         total+=precio;
     }
     return total;
    }

    public static double aplicarDescuento(double total){
        //TODO: DESARROLLAR EL MÉTODO
        if ( total > 1000){
            return total * 0.90;
        }else if ( total > 500){
            return total * 0.9;
        }else{
            return total;
        }
    }
}// CIERRE VENTAS