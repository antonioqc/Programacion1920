# Programa: ej19sec.py
# Propósito: Escribir un algoritmo para calcular la nota final de un estudiante, considerando que por cada
# respuesta correcta 5 puntos, por una incorrecta -1 y por respuestas en blanco 0. Imprime el resultado obtenido por el estudiante.
#
# Autor: Antonio Quesada
# Fecha: 13/10/2019.
#
# Variables a usar:
#   * correcta
#   * incorrecta
#   * puntos
#
# Algoritmo:
#   LEER correcta, incorrecta
#   puntos = correcta*5+incorrecta*(-1)
#   ESCRIBIR puntos

# Petición de datos
correcta = int(input("Introduce cuántas respuestas correctas has obtenido: "))
incorrecta = int(input("Introduce cuántas respuestas incorrectas has obtenido: "))
print("-----------------------------------------------------------------------------")

#Proceso
puntos = correcta*5+incorrecta*(-1)

#Salida
print("Los puntos que obtiene el estudiante son", puntos)




	
	

	






	
	

	

