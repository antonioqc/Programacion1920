# Programa: ej1alt.py
# Propósito: Algoritmo que pida dos números e indique si el primero es mayor que el segundo o no.
# Autor: Antonio Quesada
# Fecha: 23/10/2019.
#
# Variables a usar:
#   * num1
#   * num2
#
# Algoritmo:
#   Leemos y pedimos el numero1 y numero2.
#   Si num1 es mayor que num2, mostramos que es mayor.
#   Si no escribimos que es menor.

# Petición de datos
num1 = float(input("Introduce un número: "))
num2 = float(input("Introduce otro número: "))
print("------------------------------------------")

# Salida
if num1 > num2:
    print("El número", num1,"es mayor que", num2)
else:
     print("El número", num1,"es menor que", num2)
