# Programa: ej7rep.py
# Propósito: Una persona adquirió un producto para pagar en 20 meses. El primer mes pagó 10 €, el segundo 20 €, el tercero 40 €
# y así sucesivamente. Realizar un programa para determinar cuánto debe pagar mensualmente y el total de lo que pagará después de los 20 meses.
#
# Autor: Antonio Quesada
# Fecha: 30/10/2019.
#
# Variables a usar:
#   * pago
#   * acumulado
#
# Algoritmo:
# Iniciamos las variables pago a 10 que es lo que paga en el primer mes y el acumulado a 0.
# Ciclo for: Rango de meses de 1 a 20 de los 20 meses.
# Acumulamos el pago y doblamos el pago.
# Imprimimos el pago.

# Inicializamos las variables.
pago = 10
acumulado = 0

# Ciclo for y salida.
for i in range(1,20+1):
    acumulado += pago
    pago *= 2
       
print("Pagará después de los 20 meses", acumulado)




