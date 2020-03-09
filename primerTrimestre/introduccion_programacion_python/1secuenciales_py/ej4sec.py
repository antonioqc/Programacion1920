# Programa: ej4sec.py
# Propósito: Dados dos números, mostrar la suma, resta, división y multiplicación de ambos.
# Autor: Antonio Quesada
# Fecha: 13/10/2019.
#
# Variables a usar:
#   * numero1
#   * numero2
#   * suma: num1+num2
#   * resta: num1-num2
#   * multiplicación: num1*num2
#   * división: num1/num2
#
# Algoritmo:
#   LEER numero1, numero2
#   suma <-- numero1 + numero2
#   resta <-- numero1 - numero2
#   multiplicación <-- numero1 * numero2
#   división <-- numero1 / numero2
#   ESCRIBIR suma
#   ESCRIBIR resta
#   ESCRIBIR multiplicacion
#   ESCRIBIR division


# Petición de datos
numero1 = float(input("Introduce el numero1: "))
numero2 = float(input("Introduce el numero2: "))
print("-------------------------------------------")

#Cálculos
suma = (numero1+numero2)
resta = (numero1-numero2)
multiplicacion = (numero1*numero2)
division = (numero1 / numero2)

# Salida
print("La suma de ambos numeros es", suma)
print("La resta de ambos numeros es", resta)
print("La multiplicación de ambos numeros es", multiplicacion)
print("La división de ambos numeros es", division)




