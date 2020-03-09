# Programa: ej7sec.py
# Propósito: Realiza un programa que reciba una cantidad de minutos y muestre por pantalla a cuantas horas y minutos corresponde.
# Autor: Antonio Quesada
# Fecha: 13/10/2019.
#
# Variables a usar:
#   * num1
#   * num2
#   * num3
#
# Algoritmo:
#   LEER num1, num2, num3
#   media <-- (num1+num2+num3)/3
#   ESCRIBIR media


# Petición de datos
minutos = int(input("Inserte una cantidad de minutos: "))
minutos_res = int()
horas_res = int()
print("-------------------------------------------")

#Cálculos
horas_res = minutos//60
minutos_res = minutos%60

# Salida
print(horas_res, "horas y", minutos_res, "minutos.")



	
	

	






	
	

	
