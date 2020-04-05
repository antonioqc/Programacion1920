'''
3. Haz un programa que reciba como parámetro un fichero encriptado con el método César y y almacene el resultado en otro, que también pasamos como parámetro, de manera que:

Si el programa no recibe dos parámetros termina con un error 1.
Si el programa recibe un solo parámetro guardará la información encriptada en el mismo archivo del que lee, pero antes advertirá al usuario de que machacará el archivo origen, dando opción a que la operación no se haga.
Si el fichero origen no existe (da error al abrirlo como lectura) el programa termina con un mensaje de error y código 2.
Si en el fichero destino no se puede escribir da error al abrirlo como lectura) el programa termina con un mensaje de error y código 2.
Para desencriptar necesitas una clave que debes pedir al usuario.
¿Se te ocurre alguna forma de desencriptar este archivo sin pedir clave? Coméntala, y si te atreves... ¡impleméntala!
'''

import string
import sys


def desencripta_cesar(linea, desplazamiento):
    letras = string.ascii_letters + "áéíóúüñÁÉÍÓÚÜÑ"
    cadena_desencriptada = ""
    for caracter in linea:
        # si el carácter es alfabético, encriptamos
        if caracter in letras:
            posicion_donde_esta = letras.index(caracter)
            posicion_caracter_desencriptado = (posicion_donde_esta - desplazamiento) % len(letras)
            if posicion_caracter_desencriptado < 0:
                posicion_caracter_desencriptado = len(letras) + posicion_caracter_desencriptado
            caracter = letras[posicion_caracter_desencriptado]
        # añadimos a la cadena encriptada
        cadena_desencriptada += caracter
    return cadena_desencriptada


if __name__ == '_main_':

    # si el programa no recibe dos parámetros termina con error 1
    if len(sys.argv) < 2 or len(sys.argv) > 3:
        print("Error al introducir los parámetros")
        exit(1)
    # Si el programa recibe un solo parámetro guardará la información encriptada en el mismo archivo del que lee,
    # pero antes advertirá al usuario de que machacará el archivo origen, dando opción a que la operación que no se
    # haga.
    fichero_origen = sys.argv[1]
    if len(sys.argv) == 2:
        fichero_destino = fichero_origen
        while True:
            print("Esta operación machaca archivo de origen.")
            resp = input("Pulse S o N: ").upper()
            if resp == "S":
                break
            if resp == "N":
                exit(1)
    else:
        fichero_destino = sys.argv[2]

    # Si el fichero origen no existe (da error al abrirlo como lectura) el programa termina con un mensaje de error y
    # código 2.
    try:
        fichero = open(fichero_origen, "r")
    except FileNotFoundError:
        print("No se ha podido abrir el fichero")
        exit(2)



    # Para encriptar usa el método César, necesitarás una clave que debes pedir al usuario.
    while True:
        try:
            desplazamiento = int(input("Introduce el número de desplazamientos para la encriptación: "))
        except ValueError:
            print("Introduce número entero.")
        else:
            break

    origen = fichero.readlines()
    fichero.close()

    #Abre y escribe el fichero.
    try:
        fichero = open(fichero_destino, "w")
    except PermissionError or FileNotFoundError:
        print("No se puede  escribir el fichero.")
        exit(2)

    for linea in origen:
        fichero.write(desencripta_cesar(linea, desplazamiento))
    fichero.close()