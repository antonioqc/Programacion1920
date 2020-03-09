# Programa: ej10alt.py
# Propósito: Algoritmo que pida los puntos centrales x1,y1,x2,y2 y los radios r1,r2 de dos 
# circunferencias y las clasifique en uno de estos estados:
# *exteriores
# *tangentes exteriores
# *secantes
# *tangentes interiores
# *interiores
# *concéntricas
#
# Autor: Antonio Quesada
# Fecha: 23/10/2019.
#
# Variables a usar:
#   * x1
#   * y1    * r1
#   * x2    * r2
#   * y2
#
# Algoritmo:
#   Exteriores: La distancia entre los centros es mayor que la suma de los radios. Las circunferencias no tienen puntos en común.
#   Secantes: La distancia es menor que la suma de los radios y mayor que su diferencia. Tienen dos puntos en común.
#   Interiores: La distancia entre los centros es mayor que cero y menor que la diferencia entre los radios.Una circunferencia está 
#   dentro de la otra, y por tanto no tienen puntos en común.
#   Tangentes exteriores: La distancia entre los centros es igual a la suma de los radios. El centro de cada circunferencia es exterior a la otra 
#   y tienen un punto en común, punto de tangencia.
#   Tangentes interiores: La distancia entre los centros es igual a la diferencia entre los radios. El centro de una de las
#   circunferencias está dentro de la otra. Tienen un punto en común.
#   Concéntricas: Tienen el mismo centro entonces la distancia=0. 

import math

#Petición de datos.
x1 = float(input("Introduce el punto x1 de la primera circunferencia: "))
y1 = float(input("Introduce el punto y1 de la primera circunferencia: "))
x2 = float(input("Introduce el punto x2 de la segunda circunferencia: "))
y2 = float(input("Introduce el punto y2 de la segunda circunferencia: "))
r1 = float(input("Introduce el radio de la primera circunferencia: "))
r2 = float(input("Introduce el radio de la segunda circunferencia: "))
print("--------------------------------------------------------------------")

#Proceso y salida.
# Para saber la posición relativa de dos circunferencias calculamos la distancia entre sus dos centros.
distancia = math.sqrt((x2-x1)**2+(y2-y1)**2)

if distancia > (r1+r2):
    print("Las circunferencias son exteriores")

elif distancia < (r1+r2) and distancia > (r1-r2):
    print("Las circunferencias son secantes")
    
elif distancia > 0 and distancia < (r1-r2):
    print("Las circunferencias son interiores")
    
elif distancia == (r1+r2):
    print("Las circunferencias son tangentes exteriores")
    
elif distancia == (r1-r2):
    print("Las circunferencias son tangentes interiores")
    
elif distancia == 0:
    print("Las circunferencias son concéntricas")

