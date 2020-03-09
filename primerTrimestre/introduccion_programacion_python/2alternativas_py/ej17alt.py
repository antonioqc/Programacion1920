# Programa: ej17alt.py
# Propósito: Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de seis caras
# y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado obtenido.
# Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
# Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje: “ERROR: número incorrecto.”.
#
# Autor: Antonio Quesada
# Fecha: 23/10/2019.
#
# Variables a usar:
#   * alumnos
#
# Algoritmo:
#  Si el número es 1 en la cara opuesta está el seis.
#  Si el número es 2 en la cara opuesta está el cinco.
#  Si el número es 3 en la cara opuesta está el cuatro.
#  Si el número es 4 en la cara opuesta está el tres.
#  Si el número es 5 en la cara opuesta está el dos.
#  Si el número es 6 en la cara opuesta está el uno.
#  Si no ha insertado un valor incorrecto..


#Petición de datos.
num = int(input("Inserte un número(1-6): "))
print("--------------------------------------------------------------------")

#Proceso y salida.
if num == 1:
    print("En la cara opuesta está el seis")

elif num == 2:
    print("En la cara opuesta está el cinco")
    
elif num == 3:
    print("En la cara opuesta está el cuatro")

elif num == 4:
    print("En la cara opuesta está el tres")

elif num == 5:
    print("En la cara opuesta está el dos")

elif num == 6:
    print("En la cara opuesta está el uno")
      
else:
    print("Ha insertado un número incorrecto")
            

    




