# Programa: ej16sec.py
# Propósito: Dos vehículos viajan a diferentes velocidades (v1 y v2) y están distanciados por
# una distancia d. El que está detrás viaja a una velocidad mayor. Se pide hacer un algoritmo
# para ingresar la distancia entre los dos vehículos (km) y sus respectivas velocidades (km/h) 
# y con esto determinar y mostrar en que tiempo (minutos) alcanzará el vehículo más rápido al otro.
#
# Autor: Antonio Quesada
# Fecha: 13/10/2019.
#
# Variables a usar:
#   * v1
#   * v2
#   * distancia
#   * tiempo
#
# Algoritmo:
#   LEER v1, v2, distancia
#   tiempo <-- (distancia/(v1-v2))*60
#   ESCRIBIR b

# Petición de datos
v1 = float(input("Inserte la velocidad en Km/h del coche 1: "))
v2 = float(input("Inserte la velocidad en Km/h del coche 2: "))
distancia = float(input("Inserte la distancia en Km entre los dos coches: "))
print("-------------------------------------------")

#Cálculamos el tiempo sabiendo que v = s/t.
#Multiplicamos por 60 para convertir el tiempo a minutos.
tiempo = (distancia/(v1-v2))*60

#Salida
print("Tardará en alcanzarlo", tiempo,"minutos")

  




	
	

	






	
	

	
