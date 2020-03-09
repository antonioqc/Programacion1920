3# Programa: ej20sec.py
# Propósito: Diseñar un algoritmo que nos diga el dinero que tenemos (en euros y céntimos) después
# de pedirnos cuantas monedas tenemos de 2e, 1e, 50 céntimos, 20 céntimos o 10 céntimos).
#
# Autor: Antonio Quesada
# Fecha: 13/10/2019.
#
# Variables a usar:
#   * euros
#   * centimos
#   * dos_euros
#   * un_euro
#   * cincuenta_centimos
#   * veinte_centimos
#   * diez_centimos
#

# Petición de datos
dos_euros = int(input("Introduce cuántas monedas de 2 euros tienes: "))
un_euro = int(input("Introduce cuántas monedas de 1 euros tienes: "))
cincuenta_centimos = int(input("Introduce cuántas monedas de 50 céntimos tienes: "))
veinte_centimos = int(input("Introduce cuántas monedas de 20 céntimos tienes: "))
diez_centimos = int(input("Introduce cuántas monedas de 10 céntimos tienes: "))
print("-----------------------------------------------------------------------------")

#Calculamos el total de euros.
euros = 2*dos_euros + 1*un_euro

#Calculamos el total de céntimos.
centimos = 50*cincuenta_centimos + 20*veinte_centimos + 10*diez_centimos

#Convertimos 
euros = euros + (centimos/100)

#Salida
print("Tienes", euros,"euros")




	
	

	




	
	

	

