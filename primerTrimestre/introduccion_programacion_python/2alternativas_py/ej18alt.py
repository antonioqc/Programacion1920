# Programa: ej18alt.py
# Propósito: Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente.
# Si introducimos otro número nos da un error.
#
# Autor: Antonio Quesada
# Fecha: 23/10/2019.
#
# Variables a usar:
#   * dia
#
# Algoritmo:
#   Si el dia es 1 es lunes
#   Si el dia es 2 es martes
#   Si el dia es 3 es miercoles
#   Si el dia es 4 es jueves
#   Si el dia es 5 es viernes
#   Si el dia es 6 es sabado
#   Si el dia es 7 es domingo


#Petición de datos.
dia = int(input("Introduce el día de la semana (del 1 al 7): "))
print("--------------------------------------------------------------------")

#Proceso y salida.
if dia == 1:
    print("Es Lunes")

elif dia == 2:
    print("Es Martes")

elif dia == 3:
    print("Es Miércoles")

elif dia == 4:
    print("Es Jueves")

elif dia == 5:
    print("Es Viernes")

elif dia == 6:
    print("Es Sábado")

elif dia == 7:
    print("Es Domingo")

else:
    print("Numero de la semana incorrecto")
