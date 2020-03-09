# Programa: ej9rep.py
# Propósito: Mostrar en pantalla los N primero número primos. Se pide por
# teclado la cantidad de números primos que queremos mostrar.
# Autor: Antonio Quesada
# Fecha: 30/10/2019.
#
# Variables a usar:
#   * cantidad
#    
#
# Petición de datos.
cantidad = int(input("Introduce la cantidad de números primos que quieres mostrar: "))

#Ciclo for y salida.
#Debe mostrar con un bucle for una x cantidad de numeros a partir de 2 que es el primer número primo.
for primo in range(2,cantidad+cantidad):
    
    #Si el numero primo es divisible por el mismo o por 1, se cumple que es primo y lo imprime.
    if (primo%2!=0 or primo==2) and (primo%3!=0 or primo==3) and (primo%5!=0 or primo==5) and (primo%7!=0 or primo==7):
        print(primo)  
