


c1 = float(input("Ingrese la calificación del primer parcial (10-100): "))
c2 = float(input("Ingrese la calificación del segundo parcial (10-100): "))
c3 = float(input("Ingrese la calificación del tercer parcial (10-100): "))
proyecto = float(input("Ingrese la calificación del proyecto (10-100): "))


promedio = (c1 + c2 + c3) / 3

estatus = ""


if promedio >= 70 and proyecto >= 60:
    estatus = "Aprobado"
    if promedio >= 95:
        print("Alumno con excelencia académica")
elif 50 <= promedio <= 69:
    estatus = "Extraordinario"
else:
    estatus = "Reprobado"

print("Promedio final:", promedio)
print("Estatus académico:", estatus)
