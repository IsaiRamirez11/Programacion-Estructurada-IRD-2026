import javax.swing.JOptionPane;

public class eje4 {
    public static void main(String[] args) {
        
/*Ejercicio 4. Evaluación para otorgamiento de crédito bancario
Un banco analiza solicitudes de crédito considerando:
• Ingreso mensual
• Antigüedad laboral (en años)
• Historial crediticio (1 = bueno, 2 = regular, 3 = malo)
Reglas:
• Crédito aprobado si:
o Ingreso ≥ $12,000
o Antigüedad ≥ 2 años
o Historial ≠ malo
• Crédito condicionado si:

o Ingreso ≥ $8,000
o Antigüedad ≥ 1 año
o Historial = regular
• En cualquier otro caso → crédito rechazado
Si el ingreso es mayor a $25,000, indicar:
“Cliente candidato a crédito premium”.
El sistema debe mostrar:
• Resultado de la evaluación
• Tipo de crédito asignado */

double ingreso, antiguedad, opcion;
String respuesta="",tipo="";;

ingreso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el ingreso menusal"));
antiguedad= Double.parseDouble(JOptionPane.showInputDialog("Ingrese la antiguedad"));
opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion - tipo de historial crediticio\n"+
        "1 - Bueno\n"+
        "2 - Regular\n"+
        "3 - Malo\n"));

if(opcion==1 && ingreso>=8000 && antiguedad >=1 ){
respuesta="Credito aprobado";
tipo="Normal";
}else if(opcion==2 && ingreso>=12000 && antiguedad >=2){
respuesta="Credito aprobado";
tipo="Condicionado";
}
else {
   respuesta=" Credito no aprobado";
   tipo="No aprobado";
}
JOptionPane.showMessageDialog(null,"El resultado de la evaluacion es: "+ respuesta + 
                                                 "Tipo de credito asignado: " + tipo);

}

}