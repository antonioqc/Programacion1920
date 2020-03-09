# Programa: ej3alt.py
# Propósito: Escribe un programa que lea un número e indique si es par o impar.
# Autor: Antonio Quesada
# Fecha: 23/10/2019.
#
# Variables a usar:
#   * num
#
# Algoritmo:
#   Leemos y pedimos el num..
#   Si el resto de la división del número entre 2 es igual a 0 es par.
#   Si no es impar.

# Petición de datos
num = float(input("Introduce un número: "))
print("------------------------------------------")

# Salida
if num%2 == 0:
    print("El número", num,"es par")
else:
     print("El número", num,"es impar")
