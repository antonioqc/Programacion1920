# Programa: ej12rep.py
# Propósito: Pide una cadena y dos caracteres por teclado (valida que sea un carácter), 
# sustituye la aparición del primer carácter en la cadena por el segundo carácter.
#
# Autor: Antonio Quesada
# Fecha: 30/10/2019.
#
# Variables a usar:
#   * cadena
#   * caracter1
#   * caracter2

#Pedimos que introduzca una cadena.
cadena = str(input("Introduce una cadena:"))
caracter1 = str(input("Introduce el primer carácter de la cadena:"))
caracter2 = str(input("Introduce otro carácter:"))

for i in range(0,1):
    if len(caracter1) == 1 and len(caracter2) == 1:
        print (cadena[0].replace(caracter1,caracter2)+cadena)

