import javax.swing.JOptionPane;

public static void main(String[] args) {

        String nombreTrab, salida;
        double precioHora, horasExtra = 0,precioHoraExtra, sueldoTotal;
        int  horasTraba;

  
        nombreTrab = JOptionPane.showInputDialog("Introduce el Nombre del Trabajador:");
        horasTraba = Integer.parseInt(JOptionPane.showInputDialog("Introduce las Horas Trabajadas:"));
        precioHora = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio por hora:"));

        if (horasTraba <= 40) {
            sueldoTotal = horasTraba * precioHora;
        } else {
            horasExtra = horasTraba - 40;
            precioHoraExtra = precioHora * 2;
            sueldoTotal = (40 * precioHora) + (horasExtra * precioHoraExtra);
        }

        salida = "Nombre del Trabajador: " + nombreTrab +
                "\nHoras Trabajadas: " + horasTraba +
                "\nHoras Extra: " + horasExtra +
                "\nTotal a Pagar: $" + sueldoTotal;

        JOptionPane.showMessageDialog(null, salida);
 }