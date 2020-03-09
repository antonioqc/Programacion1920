# Programa: ej10rep.py
# Propósito: Pide una cadena y un carácter por teclado y muestra cuantas
# veces aparece el carácter en la cadena.
#
# Autor: Antonio Quesada
# Fecha: 30/10/2019.
#
# Variables a usar:
#   * caracter
#   * cadena

#Pedimos que introduzca una cadena.
cadena = str(input("Introduce una cadena:"))

#Bucle while.
while True:
    
    #Introduce el caracter que debe contar en la cadena.
    caracter = input("Introduce un carácter:")
    
    if len(caracter)==1: break
    
    #Inicializamos el contador a 0.
cont = 0

    #Bucle for. Usamos la funcion len que devuelve la longitud de la cadena de caracter.
for posicion in range(len(cadena)):
    
    #Realizo una lista para que en la cadena encuentre el caracter.
    if cadena[posicion-1:posicion]==caracter:
        
        #Contador para el número de veces que se repite el carácter.
        cont = cont+1
print("Aparece",cont," veces el carácter ",caracter)
    





