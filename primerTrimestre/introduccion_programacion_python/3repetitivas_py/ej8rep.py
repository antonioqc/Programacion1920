# Programa: ej8rep.py
# Propósito: Hacer un programa que muestre un cronometro, indicando las horas, minutos y segundos.
# Para hacer una espera en Python podemos usar el método sleep del módulo time.
#
# Autor: Antonio Quesada
# Fecha: 30/10/2019.
#
# 
#


import time

# Inicializamos las variables.
horas = 0
minutos = 0
segundos = 0

# Proceso.
# Ciclo infinito y esperamos un segundo cada iteración.
 
while True:
    print(horas,":",minutos,":",segundos)
    time.sleep(1)
    
    # pasar al siguiente segundo.
    if segundos < 59:
        segundos+=1
    else:
        segundos=0
        if minutos < 59:
            minutos+=1
        else:
            minutos=0
            horas+=1
            
            
    #ponemos el cursor al principio de la linea.
            
    print()        
    



