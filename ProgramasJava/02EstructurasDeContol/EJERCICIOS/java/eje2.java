/*Ejercicio 2. Clasificación de consumo eléctrico residencial
Una compañía de energía eléctrica desea desarrollar un programa que permita calcular el monto a
pagar de un usuario doméstico.
El sistema debe solicitar:
• Consumo mensual en kilowatts-hora (kWh)
• Tipo de tarifa:

o 1 = Básica
o 2 = Intermedia
o 3 = Alta
Reglas de cálculo:
Tarifa básica
• Costo por kWh: $0.85
• Si el consumo es mayor a 250 kWh, aplicar un recargo del 12 %.
Tarifa intermedia
• Costo por kWh: $1.25
• Si el consumo está entre 300 y 500 kWh, aplicar recargo del 10 %.
• Si el consumo es mayor a 500 kWh, aplicar recargo del 18 %.
Tarifa alta
• Costo por kWh: $2.10
• Si el consumo es mayor a 400 kWh, aplicar recargo del 25 %.
Condiciones adicionales:
• Si el monto final supera los $1,500, mostrar el mensaje:
“Consumo elevado: se recomienda ahorro de energía”.
• Si el consumo es menor a 100 kWh, mostrar:
“Usuario con consumo eficiente”.

El programa deberá mostrar:
• Tipo de tarifa aplicada
• Consumo registrado
• Costo por kWh
• Recargos aplicados
• Total a pagar
• Mensajes adicionales si corresponden */

import javax.swing.JOptionPane;

public class eje2 {
    public static void main(String[] args) {
        
    int opcion;
    double kwh,costo=0.0,costoT=0.0, recargo=0.0, costopork=0.0;
    String tipo="";
    opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion - tipo de tarifa\n"+
        "1 - Basica\n"+
        "2 - Intermedia\n"+
        "3 - Alta\n"));
    kwh = Double.parseDouble(JOptionPane.showInputDialog("cuantos kwh tuvo de consumo"));
   
    switch (opcion) {
        case 1:
            tipo="Basica";
            costo=kwh*0.85;
            costopork=0.85;
            if(kwh>250){
              recargo=costo*0.12;
            }
            costoT=costo+recargo;
            break;
            case 2:
                tipo="Intermedia";
                costo=kwh*1.25;
                costopork=1.25;
                if(kwh>300 && kwh <500){
                recargo=costo*0.10;

               }else if (kwh>500){
               recargo=costo*0.18; 
               } 
                costoT=costo+recargo;
                break;

                case 3:
                    tipo="Alta";
                     costo=kwh*2.10;
                     costopork=2.10;
                     if(kwh>400){
                    recargo=costo*0.25;
                               }
                     costoT=costo+recargo;
                break;
    
        default:
            JOptionPane.showInputDialog(null, "Error");
            break;

            
            }
           

            JOptionPane.showMessageDialog(null, "El tipo de tarifa del usuario es: " + tipo+
                                                              "\n Su consumo registrado es de: "+ kwh+
                                                              "\n El costo por Kwh es de: " + costopork+
                                                              "\n Los recargos aplicados son de: "+ recargo+
                                                              "\n El costo total es de: "+ costoT);
            if (costoT>1500) {
            JOptionPane.showMessageDialog(null, "Su consumo es demasiado alto, se recomienda ahorrar energia");

            }else if (costoT<=100){
                JOptionPane.showMessageDialog(null, "Es un consumidor de excelecia");
            }
                                                        
            

    }

    }
    

