# Programa: ej4rep.py
# Propósito: Escribir un programa que imprima todos los números pares entre dos números que se le pidan al usuario.
# Autor: Antonio Quesada
# Fecha: 30/10/2019.
#
# Variables a usar:
#   * num1
#   * num2
#
# Algoritmo:
# Pedimos dos números al usuario
# Bucle: para num si está entre el numero1 y numero2 se va incrementando.
# Si es así y el número es par (%) imprimirá todos los números que se encuentre
# entre ambos números.

# Petición de datos.
num1 = int(input("Introduce un número: "))
num2 = int(input("Introduce otro número: "))

# Ciclo for. Imprime todos los números pares.
for num in range(num1,num2+1):
    if num%2==0:
        print (num)



