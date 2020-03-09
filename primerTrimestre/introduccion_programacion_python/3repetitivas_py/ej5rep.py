# Programa: ej5rep.py
# Propósito: Escribe un programa que pida el limite inferior y superior de un intervalo. Si el límite inferior es mayor que el superior
# lo tiene que volver a pedir. 
# A continuación se van introduciendo números hasta que introduzcamos el 0. Cuando termine el programa dará las siguientes informaciones:
# La suma de los números que están dentro del intervalo (intervalo abierto).
# Cuantos números están fuera del intervalo.
# Informa si hemos introducido algún número igual a los límites del intervalo.
#
# Autor: Antonio Quesada
# Fecha: 30/10/2019.
#
# Variables a usar:
#   * suma
#   * igual
#   * fuera
#   * lim1 = limite inferior.
#   * lim2 = limite superior.

#Inicializamos las variables a 0.
suma = 0
igual = 0
fuera = 0

#Pedimos los limites
lim1 = int(input("Introduce el limite inferior:"))
lim2 = int(input("Introduce el limite superior:"))

#Si limite 1 es mayor que limite 2:
while lim1 > lim2: #ciclo precondición
    print("El limite inferior no puede ser mayor al superior")
    print("Vuelve a introducir los limites. \n")
    lim1 = int(input("Introduce el limite inferior:"))
    lim2 = int(input("Introduce el limite superior:"))

#Pedimos numeros y decimos cuantos van fuera, cuales son iguales y cuales estan dentro del intervalo.
while True:
  num = int(input("Introduce un numero (0 para salir): "))
  if num<lim2 and num>lim1: #El numero pertenecera al intervalo.
    suma+=num

  else: #No pertenece al intervalo.
      fuera+=1
  
      if num == lim1 or num==lim2: #Numero igual a algunos de los limites.
        igual+=1
  
  if num == 0: #Se introduce 0 para salir.
    break #Rompe la ejecucion.

#Muestra por pantalla
print("La suma de los numeros dentro del intervalo son:", suma)
print("La cantidad de numeros que están fuera del intervalo:", fuera)
print("Son iguales a los límites del intervalo:",igual)    



