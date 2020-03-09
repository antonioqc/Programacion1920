# Programa: ej7alt.py
# Propósito: Realiza un algoritmo que calcule la potencia, para ello pide por teclado la base y el exponente. Pueden ocurrir tres cosas:
# El exponente sea positivo, sólo tienes que imprimir la potencia.
# El exponente sea 0, el resultado es 1.
# El exponente sea negativo, el resultado es 1/potencia con el exponente positivo.
# Autor: Antonio Quesada
# Fecha: 23/10/2019.
#
# Variables a usar:
#   * base
#   * exponente
#
# Algoritmo:
#   Leemos y pedimos la base y el exponente
#   Si el exponente es mayor a 0 será un número positivo y se muestra su resultado.
#   Si el exponente es igual a 0 sera uno ya que toda base elevada a 0 siempre será 1. 
#   Sino el exponente es menor a 0 será un número negativo y se muestra su inversa 1/potencia.

import math

# Petición de datos
base = int(input("Introduce la base: "))
exponente = int(input("Introduce el exponente: "))
print("----------------------------------------------")

# Salida
if exponente > 0:
    print("El resultado de la potencia es", math.pow(base,exponente))
elif exponente == 0: 
    print("El resultado de la potencia es 1")
else:
    print("El resultado de la potencia es", 1/(math.pow(base,abs(exponente))))
    
