# Programa: ej13sec.py
# Propósito: Realizar un algoritmos que lea un número y que muestre su raíz cuadrada y su raíz cúbica.
# Python no tiene ninguna función predefinida que permita calcular la raíz cúbica, ¿cómo se puede calcular?
#
# Autor: Antonio Quesada
# Fecha: 13/10/2019.
#
# Variables a usar:
#   * num
#   * raiz_cuadrada
#   * raiz_cubica
#
# Algoritmo:
#   LEER num
#   raiz_cuadrada = num^1/2
#   raiz_cubica = num^1/3
#   ESCRIBIR raiz_cuadrada
#   ESCRIBIR raiz_cubica

import math

# Petición de datos
num = float(input("Inserte un número: "))
print("---------------------------------------------------------------")

#Cálculos
raiz_cuadrada = math.sqrt(num)
raiz_cubica = num**(1/3)

#Cálculos y Salida
print ("La raíz cuadrada de", num, "es", raiz_cuadrada)
print ("La raíz cúbica de", num, "es", raiz_cubica)





	
	

	






	
	

	
