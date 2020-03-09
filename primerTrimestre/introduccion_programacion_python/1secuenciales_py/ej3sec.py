# Programa: ej3sec.py
# Propósito: Dados los catetos de un triángulo rectángulo, calcular su hipotenusa.
# Autor: Antonio Quesada
# Fecha: 13/10/2019.
#
# Variables a usar:
#   * cateto1
#   * cateto2
#   * hipotenusa: hipotenusa^2 = cateto1^2+cateto2^2
#
# Algoritmo:
#   LEER cateto1, cateto2
#   hipotenusa^2 <-- cateto1^2+cateto2^2
#   ESCRIBIR hipotenusa

import math
#from math import sqrt

# Petición de datos
cateto1 = float(input("Introduce el cateto 1: "))
cateto2 = float(input("Introduce el cateto 2: "))
print("-------------------------------------------")

#Cálculos. Teorema de pitágoras.
hipotenusa = round(math.sqrt(cateto1**2+cateto2**2),4)

# Salida
print("La hipotenusa del triángulo es", hipotenusa)

