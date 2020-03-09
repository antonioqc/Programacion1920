# Programa: ej16alt.py
# Propósito: La política de cobro de una compañía telefónica es: cuando se realiza una llamada, 
# el cobro es por el tiempo que ésta dura, de tal forma que los primeros cinco minutos cuestan 1 euro, 
# los siguientes tres, 80 céntimos, los siguientes dos minutos, 70 céntimos, y a partir del décimo minuto, 50 céntimos. 
# Además, se carga un impuesto de 3 % cuando es domingo, y si es otro día, en turno de mañana, 15 %,
# y en turno de tarde, 10 %. Realice un algoritmo para determinar cuánto debe pagar por cada concepto una persona que realiza una llamada.
#
# Autor: Antonio Quesada
# Fecha: 23/10/2019.
#
# Variables a usar:
#   * tiempo
#   * pago
#
# Algoritmo:
# Leer tiempo
# Leer dia
# Leer el turno (Mañana o Tarde) si el dia no es domingo.
# Si tiempo 0 a 5min = 1 euro
# Si tiempo de 5 a 8 = 0,8 euro+1euro
# Si 8 a 10 = 0,7 euro+0,8euro+1euro
# A partir de 10 = 0,5 euro+0,7 euro+0,8euro+1euro
# Si la llamada es en domingo  = pago*0,03
# Si la llamada es otro día por la mañana  = pago*0,15
# Si la llamada es otro día por la mañana  = pago*0,10
# Mostrar coste final en euros

#Petición de datos.
tiempo = float(input("¿Cuántos minutos dura la llamada telefónica?")) 
dia = str(input("¿Se ha realizado la llamada en Domingo? Responda 'si' o 'no'."))
if dia!= 'no':
    turno = str(input("¿El turno es de mañana(M) o tarde(T)?"))
print("--------------------------------------------------------------------")

#Proceso. Tiempo de llamada y pago.

if tiempo >=0 and tiempo <=5:
    pago = 100
elif tiempo <=8:
   pago = 100+0.8
elif tiempo <=10:
    pago = 100+0.8+0.7
elif tiempo >10:
    pago = 100+0.8+0.7+0.5 
else:
    print("No has introducido un valor correcto")
    
#Impuesto. 
if dia = 'si':
    print("Se ha cargado al coste", (pago//100)*0.03)  
elif turno == 'M':
    print("Se ha cargado al coste", (pago//100)*0.15)
    
else:
    print("Se ha cargado al coste", (pago//100)*0.10)

 
