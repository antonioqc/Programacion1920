# Programa: ej8alt.py
# Propósito: Algoritmo que pida dos números ‘nota’ y ‘edad’ y un carácter ‘sexo’ y muestre el 
# mensaje ‘ACEPTADA’ si la nota es mayor o igual a cinco, la edad es mayor o igual a 
# dieciocho y el sexo es ‘F’. En caso de que se cumpla lo mismo, pero el sexo sea ‘M’, debe 
# imprimir ‘POSIBLE’. Si no se cumplen dichas condiciones se debe mostrar ‘NO ACEPTADA’.
# Autor: Antonio Quesada
# Fecha: 23/10/2019.
#
# Variables a usar:
#   * nota
#   * edad
#   * sexo
#
# Algoritmo:
#   Leemos y pedimos la nota, la edad y el sexo.
#   Si la nota es mayor o igual a 5 y la edad es mayor o igual a 18 y el sexo es femenino 'F' será aceptada.
#   Si la nota es mayor o igual a 5 y la edad es mayor o igual a 16 y el sexo es masculino 'M' será posible. 
#   Sino no será aceptada.

#Petición de datos
sexo = str(input("Introduce cual es su sexo: "))
nota = float(input("Introduce la nota: "))
edad = int(input("Introduce su edad: ")


#Salida
if nota>=5 and edad>=18:
    if sexo == F:
        print("ACEPTADA")

elif nota>=5 and edad >= 16:
    if sexo == M:
        print("POSIBLE")

else:
    print("NO ACEPTADA")
		

