# Programa: ej20alt.py
# Propósito: Una compañía de transporte internacional tiene servicio en algunos países de 
# América del Norte, América Central, América del Sur, Europa y Asia. El costo por el servicio 
# de transporte se basa en el peso del paquete y la zona a la que va dirigido. Lo anterior se muestra en la tabla:
#
# ZONA	UBICACIÓN	COSTO/GRAMO
# 1	América del Norte	24.00 euros
# 2	América Central	20.00 euros
# 3	América del Sur	21.00 euros
# 4	Europa	10.00 euros
# 5	Asia	18.00 euros
#
# Parte de su política implica que los paquetes con un peso superior a 5 kg no son transportados, esto por cuestiones de logística y de seguridad. 
# Realice un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo de la entrega.
#
# Autor: Antonio Quesada
# Fecha: 23/10/2019.
#
# Variables a usar:
#   * zona
#   * peso
# Algoritmo:
# Leemos el peso.
# Si el peso es mayor a 5Kg mostramos que no puede ser transportado o si no no ha introducido un valor correcto.
# Realizo un menú de usuario para mostrar los datos.
# Cuando se escoge la opcion. Si la opcion es la elegida muestra el peso en gramos por su precio en gramos
# Si no la respuesta introducida no es correcta.


#Petición de datos.
peso = int(input("Introduce el peso en gramos del paquete: "))

#Muestra por pantalla que no se pueda introducir un valor mayor a 5000 gramos.
if peso > 5000:
    print("El paquete supera los 5 Kilos. No puede ser transportado")
else:
    print("No has introducido un valor correcto")

#Menú.
print("Escoge una opción")
print("a) Cálculo del cobro para América del Norte.")
print("b) Cálculo del cobro para América del Central.")
print("c) Cálculo del cobro para América del Sur.")
print("d) Cálculo del cobro para Europa.")
print("e) Cálculo del cobro para Asia.")
opcion = input("Teclea a,b,c,d,e: ")
print("--------------------------------------------------------------------")

#Proceso y salida.
if opcion == 'a':
    print("El precio para América del Norte es", 24.00*peso)
elif opcion == 'b':
    print("El precio para América Central es",20.00*peso)
elif opcion == 'c':
    print("El precio para América del Sur es",21.00*peso)
elif opcion == 'd':
    print("El precio para Europa es",10.00*peso)
elif opcion == 'e':
    print("El precio para Asia es",18.00*peso)
else:
    print("Has introducido una opcion incorrecta")

