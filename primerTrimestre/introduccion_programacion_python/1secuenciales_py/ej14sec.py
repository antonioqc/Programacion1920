# Programa: ej14sec.py
# Propósito: Dado un número de dos cifras, diseñe un algoritmo que permita obtener el número invertido.
#
# Autor: Antonio Quesada
# Fecha: 13/10/2019.
#
# Variables a usar:
#   * decenas
#   * unidades
#   * num
#   * invertido
#
# Algoritmo:
#   LEER decenas, unidades, num
#   decenas <-- num/10
#   unidades <-- num%10
#   invertido = 10*unidades+decenas
#   ESCRIBIR invertido


# Petición de datos
num = int(input("Inserte un número de dos cifras: "))
print("---------------------------------------------------------------")

#Cálculos
decenas = num/10
unidades = num%10
invertido = unidades*10+decenas

#Cálculos y Salida. num[::-1]
print ("El número invertido es", invertido)





	
	

	






	
	

	
