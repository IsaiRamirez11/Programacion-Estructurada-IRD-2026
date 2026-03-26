package Asesorias;

import javax.swing.JOptionPane;

public class PromedioAlumno {

    public static double pedirYCalcularPromedio(int n) {
        double suma = 0;

        for (int i = 1; i <= n; i++) {
            boolean valido = false;
            double calificacion = 0;

            while (!valido) {
                try {
                    String input = JOptionPane.showInputDialog("Calificación " + i + ":");
                    calificacion = Double.parseDouble(input);
                    valido = true;

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error: ingresa solo números.");
                }
            }

            suma += calificacion;
        }

        return suma / n;
    }

    public static void main(String[] args) {
        double promedio = pedirYCalcularPromedio(3);

        JOptionPane.showMessageDialog(null, "Promedio: " + promedio);
    }
}