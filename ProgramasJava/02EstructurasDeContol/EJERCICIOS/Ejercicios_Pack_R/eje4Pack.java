import javax.swing.JOptionPane;

public class eje4Pack {
  public static void main(String[] args) {

        int numAlumnos,presentes = 0,ausentes = 0;
         
         
        String asistencia;
        double porcentaje;

        numAlumnos = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de alumnos:"));

        for(int i = 1; i <= numAlumnos; i++) {

            do {
                asistencia = JOptionPane.showInputDialog("Alumno " + i + "  P (Presente) o A (Ausente)").toUpperCase();

                if(!asistencia.equals("P") && !asistencia.equals("A")) {
                    JOptionPane.showMessageDialog(null, "Ingresa solo P o A");
                }

            } while(!asistencia.equals("P") && !asistencia.equals("A"));

            if(asistencia.equals("P")) {
                presentes++;
            } else {
                ausentes++;
            }
        }

        porcentaje = (presentes * 100.0) / numAlumnos;

        JOptionPane.showMessageDialog(null, "Presentes: " + presentes + 
        "\nAusentes: " + ausentes + "\nPorcentaje de asistencia: " + porcentaje );
    }  
}
