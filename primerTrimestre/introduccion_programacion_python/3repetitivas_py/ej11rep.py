# Programa: ej11rep.py
# Propósito: Suponiendo que hemos introducido una cadena por teclado que representa una frase (palabras separadas por espacios),
# realiza un programa que cuente cuantas palabras tiene.
#
# Autor: Antonio Quesada
# Fecha: 30/10/2019.
#
# Variables a usar:
#   * cadena
#   * contar
#   * palabras

#Pedimos que introduzca una cadena.
cadena = str(input("Introduce una cadena(frase):"))

#Bucle for y proceso.
#Inicializamos el contador.
contar = 0
    
#Utilizamos la funcion len para que nos devuelva la longitud de esa cadena de caracteres.
for i in range(1, len(cadena)):
    
  #Vamos recorriendo posiciones en la cadena para que lo cuente.   
  if cadena[i] == ' ' and cadena[i-1] != ' ':
    contar+=1
    palabras = contar + 1
    print ("La frase tiene", palabras, "palabras")
    
    
    
    

    






