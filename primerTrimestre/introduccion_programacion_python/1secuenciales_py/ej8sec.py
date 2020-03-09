# Programa: ej8sec.py
# Propósito: Un vendedor recibe un sueldo base mas un 10% extra por comisión de sus ventas,
# el vendedor desea saber cuanto dinero obtendrá por concepto de comisiones por las tres ventas 
# que realiza en el mes y el total que recibirá en el mes tomando en cuenta su sueldo base y comisiones.
# Autor: Antonio Quesada
# Fecha: 13/10/2019.
#
# Variables a usar:
#   * base
#   * comision
#   * sueldo
#   * venta1
#   * venta2
#   * venta3
#
# Algoritmo:
#   LEER base, venta1, venta2, venta3
#   comision <-- 10/100
#   sueldo <-- base + comision *(venta1+venta2+venta3)
#   ESCRIBIR sueldo


# Petición de datos
base = float (input("Introduce cual es el salario base: "))
venta1 = float (input("Introduce el precio de la primera venta: "))
venta2 = float (input("Introduce el precio de la segunda venta: "))
venta3 = float (input("Introduce el precio de la tercera venta: "))
print("-----------------------------------------------------------")

#Cálculos
comision = 10/100
sueldo = base + comision *(venta1+venta2+venta3)

# Salida
print ("El sueldo total que recibirá al mes será de", sueldo, "euros")





	
	

	






	
	

	
