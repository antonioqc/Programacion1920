# Programa: ej12alt.py
# Propósito: Escribir un programa que lea un año indicar si es bisiesto. 
# Nota: un año es bisiesto si es un número divisible por 4, pero no si es divisible por 100, excepto que también sea divisible por 400.
#
# Autor: Antonio Quesada
# Fecha: 23/10/2019.
#
# Variables a usar:
#   * año 
#
# Algoritmo:
# Leemos año
# Si es divisible por 4 pero no por 100 es bisiesto pero si tambien por 400 lo es.
# Si no se trata de un año bisiesto.

import math

#Petición de datos.
año = int(input("Introduce un año para saber si es bisiesto: "))
print("--------------------------------------------------------------------")

#Proceso y salida.
if año%4==0 and año%100!=0 or año%400==0:
    print("Es un año bisiesto.")
else: 
    print("No es un año bisiesto.")
    


