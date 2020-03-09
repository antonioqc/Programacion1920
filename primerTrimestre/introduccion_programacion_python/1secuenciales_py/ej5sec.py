# Programa: ej5sec.py
# Propósito: Escribir un programa que convierta un valor dado en grados Fahrenheit a grados Celsius.
# Autor: Antonio Quesada
# Fecha: 13/10/2019.
#
# Variables a usar:
#   * fahrenheit
#   * celsius
#
# Algoritmo:
#   LEER fahrenheit
#   celsius <-- (fahrenheit-32)*5/9
#   ESCRIBIR celsius


# Petición de datos
fahrenheit = float(input("Introduce un valor en grados Fahrenheit: "))
print("-------------------------------------------")

#Cálculos
celsius = (fahrenheit-32)*5/9

# Salida
print("El valor en celsius es", celsius)





