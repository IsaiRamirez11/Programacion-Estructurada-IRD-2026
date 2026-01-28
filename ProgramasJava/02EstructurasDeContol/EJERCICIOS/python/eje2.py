
print("Ingrese una opción - tipo de tarifa")
print("1 - Básica")
print("2 - Intermedia")
print("3 - Alta")
opcion = int(input("Opción: "))

kwh = float(input("Ingrese el consumo mensual en kWh: "))


costo = 0.0
costo_total = 0.0
recargo = 0.0
costo_por_kwh = 0.0
tipo = ""


if opcion == 1:
    tipo = "Básica"
    costo_por_kwh = 0.85
    costo = kwh * costo_por_kwh
    if kwh > 250:
        recargo = costo * 0.12
    costo_total = costo + recargo

elif opcion == 2:
    tipo = "Intermedia"
    costo_por_kwh = 1.25
    costo = kwh * costo_por_kwh
    if 300 < kwh <= 500:
        recargo = costo * 0.10
    elif kwh > 500:
        recargo = costo * 0.18
    costo_total = costo + recargo

elif opcion == 3:
    tipo = "Alta"
    costo_por_kwh = 2.10
    costo = kwh * costo_por_kwh
    if kwh > 400:
        recargo = costo * 0.25
    costo_total = costo + recargo

else:
    print("Opción inválida")
    exit()


print("\n--- Detalle del consumo ---")
print("Tipo de tarifa aplicada:", tipo)
print("Consumo registrado (kWh):", kwh)
print("Costo por kWh:", costo_por_kwh)
print("Recargos aplicados:", recargo)
print("Total a pagar:", costo_total)

if costo_total > 1500:
    print("Consumo elevado: se recomienda ahorro de energía")

if kwh < 100:
    print("Usuario con consumo eficiente")
