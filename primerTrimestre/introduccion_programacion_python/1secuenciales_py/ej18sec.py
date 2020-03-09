# Programa: ej18sec.py
# Propósito: Pedir el nombre y los dos apellidos de una persona y mostrar las iniciales.
# Autor: Antonio Quesada
# Fecha: 13/10/2019.
#
# Variables a usar:
#   * nombre
#   * apellido1
#   * apellido2
#   * inicial_nombre
#   * inicial_apellido1
#   * inicial_apellido2
#
# Algoritmo:
#   LEER nombre, apellido1, apellido2
#   inicial_nombre <- nombre[0]
#   inicial_apellido1 <- apellido1[0]
#   inicial_apellido2 <- apellido2[0]
#   ESCRIBIR inicial_nombre, inicial_apellido1, inicial_apellido2

# Petición de datos
nombre = str(input("Inserte su nombre: "))
apellido1 = str(input("Inserte su primer apellido: "))
apellido2 = str(input("Inserte su segundo apellido: "))
print("-------------------------------------------")

#A través del [0] selecciona el primer carácter de la cadena introducida por el usuario.
inicial_nombre = nombre[0]
inicial_apellido1 = apellido1[0]
inicial_apellido2 = apellido2[0]

#Salida
print("La inicial de tu nombre es", inicial_nombre.upper(),",de tu primer apellido", inicial_apellido1.upper(),"y de tu segundo apellido", inicial_apellido2.upper())

  




	
	

	






	
	

	
