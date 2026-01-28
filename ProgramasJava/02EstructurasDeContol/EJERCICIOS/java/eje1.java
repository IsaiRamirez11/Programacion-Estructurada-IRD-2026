/*Ejercicio 1. Evaluación académica con reglas institucionales

Una universidad evalúa a sus alumnos considerando los siguientes datos:
• Calificación del primer parcial
• Calificación del segundo parcial
• Calificación del proyecto final
El sistema debe:
• Calcular el promedio final.
• Determinar el estatus del alumno según las reglas:
o Aprobado: promedio ≥ 70 y proyecto ≥ 60
o Extraordinario: promedio entre 50 y 69
o Reprobado: promedio < 50

Además:
• Si el promedio es mayor o igual a 95, mostrar el mensaje “Alumno con excelencia
académica”.
El programa deberá mostrar:
• Promedio final
• Estatus académico
• Mensaje adicional si aplica */

import javax.swing.JOptionPane;

public class eje1 {

    public static void main(String[] args) {
        

        double c1,c2,c3,promedio,proyecto;
        String estatus="";

        c1 =  Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificacion del primer parcial 10-100"));
        c2 =  Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificacion del segundo parcial 10-100"));
        c3 =  Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificacion del tercer parcial 10-100"));
        proyecto =  Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificacion del proyecto 10-100"));
        
        promedio=(c1+c2+c3)/3;

        if(promedio >= 7 && proyecto>=60){
            if (promedio>95){
                JOptionPane.showMessageDialog(null, "El alumno esta con exelencia");
                  }else{
                    estatus="El alumno esta aprobado";
                       }
            
        }else if (promedio >=50 && promedio<=69){
            estatus="El alumno esta en extraudinario" ;
        }else{
            estatus= "El alumno esta reporbado";
      
        }

        JOptionPane.showMessageDialog(null, "El promedio final del alumno es de: "+ promedio + 
                                                            "\nEl estatus del alumno es de: "+ estatus
        );

    
}
}