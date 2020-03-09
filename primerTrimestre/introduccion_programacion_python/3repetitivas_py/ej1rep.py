# Programa: ej1rep.py
# Propósito: Crea una aplicación que permita adivinar un número. La aplicación genera un número aleatorio del 1 al 100.
# A continuación va pidiendo números y va respondiendo si el número a adivinar es mayor o menor que el introducido,a demás 
# de los intentos que te quedan (tienes 10 intentos para acertarlo). El programa termina cuando se acierta el número 
# además te dice en cuantos intentos lo has acertado), si se llega al limite de intentos te muestra el número que había generado.
#
# Autor: Antonio Quesada
# Fecha: 30/10/2019.
#
# Variables a usar:
#   *numero_aleatorio
#   *numero_introducido
#   *intentos
#

#Importamos el módulo random para después poder generar el número aleatorio.
import random

#Generamos el número aleatorio del 1 al 100.
numero_aleatorio = random.randint(1,100)

#Bucle para que no pase de los 10 intentos.
for i in range (1,11): #Más correcto con bucle while porque en for solo sabes el máximo.(while)
    print("Tienes", (11-i), "intentos")

#Introducimos un número para posteriormente comprobar si es igual al número aleatorio.

    numero_introducido = int(input("Introduce un número: "))
    
#Imprime si ha acertado el número o es mayor o menor al introducido.
    
    if numero_introducido == numero_aleatorio:
        print("Has acertado el número") #Fuera porque rompes el ciclo postcondicion.
        break
    elif numero_introducido > numero_aleatorio:
        print("El numero que has introducido es mayor que el aleatorio")
    elif numero_introducido < numero_aleatorio:
        print("El numero que has introducido es menor que el aleatorio")

#En el caso de que no se haya acertado el número y haya superado los 10 intentos,, el programa termina.    
    if i <= 10: 
        print("Has superado los 10 intentos. El número correcto era", numero_aleatorio)
        break
    
    
