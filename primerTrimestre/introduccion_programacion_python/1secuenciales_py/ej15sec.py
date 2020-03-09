# Programa: ej15sec.py
# Propósito: Dadas dos variables numéricas A y B, que el usuario debe teclear, se pide realizar un algoritmo
# que intercambie los valores de ambas variables y muestre cuanto valen al final las dos variables.
#
# Autor: Antonio Quesada
# Fecha: 13/10/2019.
#
# Variables a usar:
#   * a
#   * b
#   * aux
#
# Algoritmo:
#   LEER a, b, aux
#   aux = a
#   a = b
#   b = aux
#   ESCRIBIR a
#   ESCRIBIR b

# Petición de datos
a = float(input("Introduce el valor de la variable a: "))
b = float(input("Introduce el valor de la variable b: "))
print("-------------------------------------------")

#Proceso
aux = a
a = b
b = aux

#Salida
print("El nuevo valor de a es", a)
print("El nuevo valor de b es", b)
  




	
	

	






	
	

	
