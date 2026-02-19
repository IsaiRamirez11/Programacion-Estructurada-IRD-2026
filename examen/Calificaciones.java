import javax.swing.JOptionPane;

public class Calificaciones {

    public static void main(String[] args) {

        double calif, suma = 0;
        String dato;
        boolean valido;

        for (int i = 1; i <= 3; i++) {

            do {

                valido = true;

                try {

                    dato = JOptionPane.showInputDialog("Ingresa la calificación " + i);

                    if (dato == null || dato.equals("")) {

                        JOptionPane.showMessageDialog(null,"No se puede dejar vacío");
                        valido = false;

                        continue;
                    }

                    calif = Double.parseDouble(dato);
            
                    if (calif < 0 || calif > 10) {
                        JOptionPane.showMessageDialog(null,"Debe ser de 0 a 10" );
                        valido = false;
                        continue;
                    }

                    suma += calif;

                } catch (NumberFormatException e) {

                    JOptionPane.showMessageDialog(null,"Solo números");
                    valido = false;
                }

            } while (!valido);
        }

        double promedio = suma / 3;

        JOptionPane.showMessageDialog(null,"Promedio: " + promedio);
    }
}
