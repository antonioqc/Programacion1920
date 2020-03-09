# Programa: ej19alt.py
# Propósito: Escribe un programa que pida un número entero entre uno y doce e 
# imprima el número de días que tiene el mes correspondiente.
#
# Autor: Antonio Quesada
# Fecha: 23/10/2019.
#
# Variables a usar:
#   * num
#
# Algoritmo:
# Leer numero de mes como entero
# Si es el 1,3,5,7,8,10,12 el mes tiene 31 días
# Si es el 2 el mes tiene 28 o 29 días
# Si es el 4,6,9,11 el mes tiene 31 días
# Si no mostrará un mensaje de error ("Mes incorrecto")


#Petición de datos.
num = int(input("Introduce un número entre uno y doce que corresponda a un mes del año: "))
print("------------------------------------------------------------------------------------")

#Proceso y salida.
if num == 1 or num == 3 or num == 5 or num == 7 or num == 8 or num == 10 or num == 12:
    print("El mes tiene 31 días")
elif num == 4 or num == 6 or num == 9 or num == 11:
    print("El mes tiene 30 días")
elif num == 2:
    print("El mes tiene 28 o 29 días")
else:
    print("Mes incorrecto")
