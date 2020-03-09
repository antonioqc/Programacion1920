# Programa: ej12sec.py
# Propósito: Pide al usuario dos pares de números x1,y2 y x2,y2, que representen dos puntos en el plano. 
# Calcula y muestra la distancia entre ellos.
#
# Autor: Antonio Quesada
# Fecha: 13/10/2019.
#
# Variables a usar:
#   * x1
#   * y1
#   * x2
#   * y2
#
# Algoritmo:
#   LEER x1, y1, x2, y2
#   distancia <-- 1/2*((x2-x1)^2+(y2-y1)^2)
#   ESCRIBIR distancia

import math

# Petición de datos
print("Inserte las coordenadas del primer punto:")
x1 = float(input("x1: "))
y1 = float(input("y1: "))
print("Inserte las coordenadas del segundo punto:")
x2 = float(input("x2: "))
y2 = float(input("y2: "))
print("---------------------------------------------------------------")

#Cálculos
distancia = math.sqrt((x2-x1)**2+(y2-y1)**2)

#Cálculos y Salida
print ()





	
	

	






	
	

	
