# Programa: ej2rep.py
# Propósito: Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de números a introducir). 
# El programa debe informar de cuantos números introducidos son mayores que 0, menores que 0 e iguales a 0.
#
# Autor: Antonio Quesada
# Fecha: 30/10/2019.
#
# Variables a usar:
#   * cantidad
#   * numero_introducido

#Petición de datos donde se introduce las veces repeticiones de los números.
cantidad = int(input("Introduce un número de repeticiones que vas a introducir: "));
contadorpos=0
contadorneg=0
contadorigu=0

#Bucle for con las repeticiones que ha indicado el usuario.
for x in range(1,cantidad+1): #Ciclo determinado.
  numero = int(input("Introduce un número: "));
  
  #Comprobamos que sea mayor, igual o menor y lo imprime por pantalla.
  if numero == 0:
    contadorigu+=1
  elif numero > 0:
    contadorneg+=1
  else:
    contadorpos+=1
    
    #Imprimimos los numeros.

print("Hay",contadorpos, "numeros positivos")
print("Hay",contadorneg, "numeros negativos")
print("Hay",contadorigu, "numeros iguales a 0")
