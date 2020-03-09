# Programa: ej15rep.py
# Propósito: Introducir una cadena de caracteres e indicar si es un palíndromo.
# Una palabra palíndroma es aquella que se lee igual adelante que atrás.
#
# Autor: Antonio Quesada
# Fecha: 30/10/2019.
#
# Variables a usar:
#   * cadena 
#   * aux

#Inicializamos las variables a 0.
aux = 0
igual = 0

#Petición de datos.
cadena = str(input("Introduce una cadena:"))

#Uso la funcion reversed() que recibe un rango, obteniendo con la funcion len la longitud de la palabra.
for i in reversed(range(0, len(cadena))):
    
   #Evalua si el texto en i de la variable cadena es igual al auxiliar. 
  if cadena[i] == cadena[aux]:
    igual += 1
  aux += 1
  
#Si ambos son iguales se incrementa la variable igual en 1.
if len(cadena) == igual:
  print("La cadena es palindroma")
else:
  print("La cadena no es palindroma")
