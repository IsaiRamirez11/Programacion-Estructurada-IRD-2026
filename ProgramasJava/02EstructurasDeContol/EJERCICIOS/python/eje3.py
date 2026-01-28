


anio = int(input("Ingrese el año del vehículo: "))


if anio < 2005:
    print("Advertencia: Vehículo antiguo, requiere revisión especial")


print("\nIngrese el tipo de vehículo")
print("1 - Particular")
print("2 - Carga")
print("3 - Público")
opcion = int(input("Opción: "))


emision = float(input("Ingrese el nivel de emisiones contaminantes: "))

resultado = ""


if opcion == 1:
    if emision <= 50:
        resultado = "Verificación aprobada"
    else:
        resultado = "Verificación rechazada"

elif opcion == 2:
    if emision <= 70:
        resultado = "Verificación aprobada"
    else:
        resultado = "Verificación rechazada"

elif opcion == 3:
    if emision <= 60:
        resultado = "Verificación aprobada"
    else:
        resultado = "Verificación rechazada"

else:
    print("Tipo de vehículo inválido")
    exit()

print("\nResultado de la verificación:", resultado)
