# Programa: ej13rep.py
# Propósito: Realizar un programa que lea una cadena por teclado y convierta
# las mayúsculas a minúsculas y viceversa.
#
# Autor: Antonio Quesada
# Fecha: 30/10/2019.
#
# Variables a usar:
#   * cadena

#Pedimos que introduzca una cadena.
cadena = str(input("Introduce una cadena:"))

for i in range (0,1):
  if cadena[i] == cadena.lower():
    print(cadena.upper())
  else:
    print(cadena.lower())
