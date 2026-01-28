# Ejercicio 5. Sistema de cobro en tienda departamental
#
# Una tienda solicita:
# • Monto total de compra
# • Tipo de cliente (1 = normal, 2 = miembro, 3 = empleado)
# • Forma de pago (1 = efectivo, 2 = tarjeta)
# Reglas:
# • Cliente miembro obtiene 10 % de descuento.
# • Empleado obtiene 20 % de descuento.
# • Pago en efectivo obtiene 5 % adicional.
# • Si el monto final supera los $5,000, se aplica un 8 % de impuesto.
# El programa debe:
# • Calcular descuentos según el tipo de cliente
# • Aplicar descuentos acumulables
# • Calcular impuestos si corresponde
# • Mostrar:
#   o Subtotal
#   o Descuentos aplicados
#   o Impuestos
#   o Total a pagar

monto = float(input("Ingrese el monto total de la compra: "))
tipoCliente = int(input("Tipo de cliente\n1 - Normal\n2 - Miembro\n3 - Empleado\n"))
formaPago = int(input("Forma de pago\n1 - Efectivo\n2 - Tarjeta\n"))

descuentoCliente = 0
descuentoPago = 0
impuestos = 0

if tipoCliente == 2:
    descuentoCliente = monto * 0.10
elif tipoCliente == 3:
    descuentoCliente = monto * 0.20

if formaPago == 1:
    descuentoPago = monto * 0.05

descuentoTotal = descuentoCliente + descuentoPago
subtotal = monto - descuentoTotal

if subtotal > 5000:
    impuestos = subtotal * 0.08

total = subtotal + impuestos

print("Subtotal:", subtotal)
print("Descuentos aplicados:", descuentoTotal)
print("Impuestos:", impuestos)
print("Total a pagar:", total)
