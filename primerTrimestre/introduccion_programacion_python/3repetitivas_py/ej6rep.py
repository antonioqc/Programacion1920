# Programa: ej6rep.py
# Propósito: Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente), 
# saque por pantalla el resultado de la potencia. No se puede utilizar el operador de potencia.
#
# Autor: Antonio Quesada
# Fecha: 30/10/2019.
#
# Variables a usar:
#   *base
#   *exponente

#Pedimos la base.
base = float(input("Introduce la base de la potencia:"))

#Ciclo while.
while True:
    
    #Pedimos el exponente.
    exponente = int(input("Introduce el exponente de la potencia:"))
    
    #Si el exponente es negativo decimos que imprima debe ser positivo.
    if exponente<0:
        print("El exponente tiene que ser positivo")
        
    #Si el exponente es 0 o positivo calculamos la potencia. 
    if exponente>=0: break
    
    #Iniciamos el contador potencia a 1.
potencia = 1
    
    #Ciclo for para calcular la potencia.
for i in range(1,exponente+1):
    potencia = potencia*base
print("El resultado de la potencia es",potencia)



