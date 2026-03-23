import javax.swing.JOptionPane;

public class practicaexamen{
   static double total=0.0;

    //Una empresa necesita que calcule el sueldo final de un empleado con base en su salario
    //El programa de be mostrar le menu las siguientes opciones:
    // 
    public static void main(String[] args) {
     iniciar(); 

    }

    //-----------------------------------------------------
    public static void iniciar(){
        
    mostrarMenu();
    
}

    //-----------------------------------------------------
    public static void mostrarMenu(){
        String menu= "================ MENU ====================\n" +
        "1) Calcular sueldo\n" +
        "2) Salir\n"+
        "1) Elije una opcion\n"  ;

        String opcion;

         while(true){
         opcion = JOptionPane.showInputDialog(menu);
     
         switch (opcion) {
            case "1": ejecutarCalculo(); break;
            case "2": System.exit(0); break;
            case "3": break;     
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida");
                break;
         }

         }

    }
    //------------------------------------------------------------------------

    public static double SolicitarSueldoBase(){
     double SueldoBase=0.0;
      while (true) {
            try {
                SueldoBase= Integer.parseInt(JOptionPane.showInputDialog("Introduce el sueldo base"));
 
                if(SueldoBase>0 ) {
                    return SueldoBase;
                }
                JOptionPane.showMessageDialog(null, "El sueldo base debe ser mayor a 0");

                   } catch (NumberFormatException ex) {
                   JOptionPane.showMessageDialog(null, "Solo puede ingresar numeros");
        }
      }

    }

    //-------------------------------------------------------------------------
    public static int SolicitarHorasExtra(){
     int HorasExtra=0;
      while (true) {
            try {
                HorasExtra= Integer.parseInt(JOptionPane.showInputDialog("Introduce las horas extra"));
 
                if(HorasExtra>0 && HorasExtra<=50) {
                    return HorasExtra;
                }
                JOptionPane.showMessageDialog(null, "Las horas extra deben ser mayor a 0 y menor a 50");

                   } catch (NumberFormatException ex) {
                   JOptionPane.showMessageDialog(null, "Solo puede ingresar numeros  ");
        }
      }

    }

    public static double calcularHorasExtra(int HorasExtra){


       return HorasExtra*100;
    }

    public static double calcularBono(double salarioBase){
        return (salarioBase >5000)?salarioBase*0.10:salarioBase*0.05;
    }

    public static double CalcularSueldoFinal(double SueldoBase, double HorasExtra, double bono){

        return SueldoBase + HorasExtra+bono;
    }

    public static void MostraDesglose(double SueldoBase, double HorasExtra, double bono, double totalPagar){
        JOptionPane.showMessageDialog(null, 
        "Desglose\n" +
        "\nSueldo base:" + SueldoBase + 
        "\nHoras extra:" + HorasExtra + 
        "\nBono:" + bono + 
        "\nToral a pagar:" + totalPagar) ;
    }

    public static void ejecutarCalculo(){

        double salarioBase= SolicitarSueldoBase();
        int horasextra= SolicitarHorasExtra();
        double pagoHoraextra=calcularHorasExtra(horasextra);
        double bono = calcularBono(salarioBase);
        double sueldofinal=CalcularSueldoFinal(salarioBase, pagoHoraextra, bono);
        total+=sueldofinal;
        MostraDesglose(salarioBase, horasextra, bono, sueldofinal);
    }

}