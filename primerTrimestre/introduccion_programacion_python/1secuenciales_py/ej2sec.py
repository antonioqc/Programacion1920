# Programa: ej2sec.py
# Propósito: Calcular el perí­metro y área de un rectángulo dada su base y su altura.
# Autor: Antonio Quesada
# Fecha: 13/10/2019.
#
# Variables a usar:
#   * perímetro: 2*(b+h)
#   * base
#   * altura
#   * área: b*h
#
# Algoritmo:
#   LEER base, altura
#   perimetro <-- 2*(b+h)
#   area <-- b*h
#   ESCRIBIR perimetro, area.


# Petición de datos
base = float(input("Inserte la base del rectángulo: "))
altura = float(input("Inserte la altura del rectángulo: "))
print("-------------------------------------------")

#Cálculos
perimetro = 2*(base+altura)
area = base*altura

# Salida
print("El perímetro del rectángulo es", perimetro)
print("El área del rectángulo es", area)
