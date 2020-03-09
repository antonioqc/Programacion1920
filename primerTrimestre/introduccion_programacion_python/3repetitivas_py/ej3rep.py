# Programa: ej3rep.py
# Propósito: Algoritmo que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO VOCAL’ en caso contrario,
# el programa termina cuando se introduce un espacio.
#
# Autor: Antonio Quesada
# Fecha: 30/10/2019.
#
# Variables a usar:
#   * caracter
#
# Algoritmo:
# Pedimos dato al usuario
# Mientras el caracter sea igualo distinto a a,e,i,o,u es una vocal.
# Si no es una consonante.

# Petición de datos.
caracter = str(input("Introduce un carácter: "))

# Ciclo while y salida.
while caracter!=" ":
    if caracter=="a" or caracter=="e" or caracter=="i" or caracter=="o" or caracter=="u" or caracter=="A" or caracter=="E" or caracter=="I" or caracter=="O" or caracter=="U":
        print ("Es una vocal") 
        break
    else:
        print ("No es una vocal")
        break
    



