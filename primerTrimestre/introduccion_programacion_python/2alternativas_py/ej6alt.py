# Programa: ej6alt.py
# Propósito: Programa que lea una cadena por teclado y compruebe si es una letra mayúscula.
# Autor: Antonio Quesada
# Fecha: 23/10/2019.
#
# Variables a usar:
#   * cadena
#
# Algoritmo:
# La cadena debe tener una longitud de uno para introducir una letra. 
# Compara si esta entre A y Z mayúscula y si no es el caso la letra es minúscula.

# Petición de datos
cadena = str(input("Introduce una cadena: "))
print("------------------------------------------")


# Proceso y Salida
if len(cadena) == 1 and cadena >= 'A' and cadena <= 'Z'or cadena == 'Á' or cadena == 'É' or cadena == 'Í' or cadena == 'Ó' or cadena == 'Ú': 
    print("Se trata de una letra mayúscula")
else: 
    print("No es una letra mayúscula, es minúscula")

