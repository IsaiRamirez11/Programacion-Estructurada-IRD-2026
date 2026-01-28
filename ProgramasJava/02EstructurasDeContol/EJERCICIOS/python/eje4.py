# Ejercicio 4. Evaluación para otorgamiento de crédito bancario
# Un banco analiza solicitudes de crédito considerando:
# • Ingreso mensual
# • Antigüedad laboral (en años)
# • Historial crediticio (1 = bueno, 2 = regular, 3 = malo)
# Reglas:
# • Crédito aprobado si:
#   o Ingreso ≥ $12,000
#   o Antigüedad ≥ 2 años
#   o Historial ≠ malo
# • Crédito condicionado si:
#   o Ingreso ≥ $8,000
#   o Antigüedad ≥ 1 año
#   o Historial = regular
# • En cualquier otro caso → crédito rechazado
# Si el ingreso es mayor a $25,000, indicar:
# “Cliente candidato a crédito premium”.
# El sistema debe mostrar:
# • Resultado de la evaluación
# • Tipo de crédito asignado

ingreso = float(input("Ingrese el ingreso mensual: "))
antiguedad = float(input("Ingrese la antiguedad laboral: "))
opcion = int(input("Ingrese una opcion - tipo de historial crediticio\n1 - Bueno\n2 - Regular\n3 - Malo\n"))

respuesta = ""
tipo = ""

if opcion == 1 and ingreso >= 12000 and antiguedad >= 2:
    respuesta = "Credito aprobado"
    tipo = "Normal"
elif opcion == 2 and ingreso >= 8000 and antiguedad >= 1:
    respuesta = "Credito aprobado"
    tipo = "Condicionado"
else:
    respuesta = "Credito no aprobado"
    tipo = "No aprobado"

if ingreso > 25000:
    print("Cliente candidato a credito premium")

print("Resultado de la evaluacion:", respuesta)
print("Tipo de credito asignado:", tipo)
