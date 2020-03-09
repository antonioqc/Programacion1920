# Programa: ej10sec.py
# Propósito: Un alumno desea saber cual será su calificación final en la materia de Algoritmos. 
#Dicha calificación se compone de los siguientes porcentajes:
#55% del promedio de sus tres calificaciones parciales.
#30% de la calificación del examen final.
#15% de la calificación de un trabajo final.
#
# Autor: Antonio Quesada
# Fecha: 13/10/2019.
#
# Variables a usar:
#   * parcial1
#   * parcial2
#   * parcial3
#   * examen_final
#   * trabajo
#
# Algoritmo:
#   LEER parcial1, parcial2, parcial3, examen_final, trabajo
#   nota_final <-- ((parcial1+parcial2+parcial3)/3)*0.55+0.3*examen_final+0.15*trabajo)
#   ESCRIBIR nota_final


# Petición de datos
parcial1 = float(input("Inserte la calificación del primer parcial: "))
parcial2 = float(input("Inserte la calificación del segundo parcial: "))
parcial3 = float(input("Inserte la calificación del tercer parcial: "))
examen_final = float(input("Inserte la calificación del examen final: "))
trabajo = float(input("Inserte la calificación del trabajo: "))
print("---------------------------------------------------------------")

#Cálculos
nota_final = ((parcial1+parcial2+parcial3)/3)*0.55+0.3*examen_final+0.15*trabajo

#Cálculos y Salida
print ("Su calificación final será de", nota_final)





	
	

	






	
	

	
