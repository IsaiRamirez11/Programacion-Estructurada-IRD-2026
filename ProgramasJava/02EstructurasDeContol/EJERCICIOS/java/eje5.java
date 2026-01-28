/*Ejercicio 5. Sistema de cobro en tienda departamental

Una tienda solicita:
• Monto total de compra
• Tipo de cliente (1 = normal, 2 = miembro, 3 = empleado)
• Forma de pago (1 = efectivo, 2 = tarjeta)
Reglas:
• Cliente miembro obtiene 10 % de descuento.
• Empleado obtiene 20 % de descuento.
• Pago en efectivo obtiene 5 % adicional.
• Si el monto final supera los $5,000, se aplica un 8 % de impuesto.
El programa debe:
• Calcular descuentos según el tipo de cliente
• Aplicar descuentos acumulables
• Calcular impuestos si corresponde
• Mostrar:
o Subtotal
o Descuentos aplicados
o Impuestos

o Total a pagar */

import javax.swing.JOptionPane;

public class eje5 {
    public static void main(String[] args) {

        double monto, subtotal, descuentoCliente = 0, descuentoPago = 0;
        double descuentoTotal, impuestos = 0, total;
        int tipoCliente, formaPago;

       
        monto = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el monto total de la compra")
        );

        tipoCliente = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingrese el tipo de cliente:\n" +
                        "1 - Normal\n" +
                        "2 - Miembro\n" +
                        "3 - Empleado"
                )
        );

        formaPago = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Ingrese la forma de pago:\n" +
                        "1 - Efectivo\n" +
                        "2 - Tarjeta"
                )
        );

        
        if (tipoCliente == 2) {
            descuentoCliente = monto * 0.10; 
        } else if (tipoCliente == 3) {
            descuentoCliente = monto * 0.20; 
        }

        
        if (formaPago == 1) {
            descuentoPago = monto * 0.05; 
        }

        
        descuentoTotal = descuentoCliente + descuentoPago;

        
        subtotal = monto - descuentoTotal;

        
        if (subtotal > 5000) {
            impuestos = subtotal * 0.08; 
        }

        
        total = subtotal + impuestos;

        
        JOptionPane.showMessageDialog(
                null,
                "Subtotal: $" + subtotal +
                "\nDescuentos aplicados: $" + descuentoTotal +
                "\nImpuestos: $" + impuestos +
                "\nTotal a pagar: $" + total
        );
    }
}
