#Programa: ejemplo_perimetro.py
#Propóstio: Programa que calcula el perímetro de una circunferencia y lo muestra.
#
#Autor: Antonio
#
#Fecha: 09/10/2019
#
#Algoritmo:
#
#Variables a usar:
# *radio
# *perimetro
#
#  LEER radio
#  CALCULAR perímetro: 2*Pi*radio
#  IMPRIMIR perímetro

import math

print("Cálculo del perímetro de una circunferencia")
print("-----------------------------------------------\n")

#Petición de datos
try:
	radio = float(input("Inserte el radio de la circunferencia: "))
except:
	print("DEBES INTRODUCIR DATOS NUMÉRICOS")
	print("EJECUTE EL PROGRAMA DE NUEVO")
	exit(1)

#Cálculos
perimetro = 2*math.pi*radio

#Salida
print ("El perímetro es", perimetro)
