# Programa: ej15alt.py
# Propósito: El director de una escuela está organizando un viaje de estudios, y requiere determinar 
# cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma 
# de cobrar es la siguiente: si son 100 alumnos o más, el costo por cada alumno es de 65 euros; de 50 a 99
# alumnos, el costo es de 70 euros, de 30 a 49, de 95 euros, y si son menos de 30, el costo de la renta 
# del autobús es de 4000 euros, sin importar el número de alumnos. 
# Realice un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe pagar cada alumno por el viaje.
#
# Autor: Antonio Quesada
# Fecha: 23/10/2019.
#
# Variables a usar:
#   * alumnos
#
# Algoritmo:
#  Si los alumnos son menos de 0 es una cifra inexistente por lo que es incorrecto.
#  En el caso de que dicha sentencia sea falsa se ejcuta lo siguiente:
#  Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
#  Si son entre 50 a 99 alumnos, el costo es de 70 euros.
#  Si son entre 30 a 49 alumnos, el costo es de 95 euros.
#  Si son menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros.


#Petición de datos.
alumnos = int(input("¿Cuántos alumnos van?\n"))
print("--------------------------------------------------------------------")

#Proceso y salida.
if alumnos < 0:
    print("El dato introducido no es correcto")
else:
    if alumnos >=100:
        print("El costo por cada alumno es de 65 euros")
        
    elif alumnos >=50 and alumnos <=99:
        print("El costo es de 70 euros")
        
    elif alumnos >=30 and alumnos <=49:
        print("El costo es de 95 euros")
        
    elif alumnos <30:
        print("El costo de la renta del autobus es de 4000 euros")

    



