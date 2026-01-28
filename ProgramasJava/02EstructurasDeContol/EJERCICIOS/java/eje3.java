/*Ejercicio 3. Clasificación de vehículos para verificación
El sistema de verificación vehicular solicita:
• Año del vehículo
• Tipo de vehículo (1 = particular, 2 = carga, 3 = público)
• Nivel de emisiones contaminantes
Reglas:
• Si el vehículo es particular y tiene emisiones ≤ 50 → Verificación aprobada
• Si es carga y emisiones ≤ 70 → Verificación aprobada
• Si es público y emisiones ≤ 60 → Verificación aprobada
• En cualquier otro caso → Verificación rechazada
Además:
• Si el año del vehículo es menor a 2005, mostrar advertencia:
“Vehículo antiguo, requiere revisión especial”
El programa debe mostrar:
• Resultado de la verificación
• Advertencias si existen */

import javax.swing.JOptionPane;

public class eje3 {
    public static void main(String[] args) {
         int opcion,años;
    double emision;
    String tipo="",respuesta="";
    años =Integer.parseInt(JOptionPane.showInputDialog("Ingresa el año del carro"));
    if(años<=2005){
       JOptionPane.showMessageDialog(null, "Advertencia su auto es antiguo requiere una evaluacion especial");
    }else{
    opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion - tipo de veiculo\n"+
        "1 - Particular\n"+
        "2 - Carga\n"+
        "3 - Publico\n"));
    emision = Double.parseDouble(JOptionPane.showInputDialog("cuantas emisiones tuvo"));
   
    switch (opcion) {
        case 1:
            tipo="Particular";
          
            if(emision<=50){
              respuesta="Verificacion aprobada";
            }else{
                respuesta="Verificaacion rechazada";
            }
            
            break;
            case 2:
                tipo="Carga";
            
            if(emision<=70){
              respuesta="Verificacion aprobada";
            }else{
                respuesta="Verificaacion rechazada";
            }
              
                break;

                case 3:
                    tipo="Alta";
                    
            if(emision<=60){
              respuesta="Verificacion aprobada";
            }else{
                respuesta="Verificaacion rechazada";
            }
                break;
    
        default:
            JOptionPane.showInputDialog(null, "Error");
            break;

        }   
         JOptionPane.showMessageDialog(null, "Estatus de la verificacion: " + respuesta);
        
            }
    }
    
}
