""


numComputadoras=0
precio = 0.0, total = 0.0, descuento = 0.0, subtotal = 0.0, porcentaje = " "


numComputadoras = int(input("Ingrese el numero de computadoras"))
precio = float(input("Ingrese el precio de las computadoras"))


total = numComputadoras * precio

if numComputadoras <5:
    descuento = total * 0.10
    subtotal = total - descuento
    porcentaje = '10%'
elif numComputadoras >=5 and numComputadoras <10:
    descuento = total * 0.20
    subtotal = total - descuento
    porcentaje = '20%'
else:
    descuento = total * 0.40
    subtotal = total - descuento
    porcentaje = '40%'

salida = f'''
            ====TICKET===
            COMPUTADORAS: {numComputadoras}
            SUBTOTAL: {subtotal}
            DESCUENTO: {descuento}
            DESCUENTO: {descuento*100}
            TOTAL: {total}
         '''