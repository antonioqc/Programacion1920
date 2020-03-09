# Programa: ej17sec.py
# Propósito:  Un ciclista parte de una ciudad A a las HH horas, MM minutos y SS segundos.
# El tiempo de viaje hasta llegar a otra ciudad B es de T segundos. Escribir un algoritmo 
# que determine la hora de llegada a la ciudad B.
#
# Autor: Antonio Quesada
# Fecha: 13/10/2019.
#
# Variables a usar:
#   * h
#   * m
#   * s
#   * tiempo_tardado
#   * tiempo_inicial
#
# Algoritmo:
#   LEER h, m, s, tiempo
#   tiempo_inicial <-- h*3600+m*60+s
#   tiempo_final <-- tiempo_inicial + tiempo
#   ESCRIBIR h, m, s

# Petición de datos
h = int(input("Inserte la hora de partida: "))
m = int(input("Inserte el minuto de partida: "))
s = int(input("Inserte el segundo de partida: "))
tiempo_tardado = int(input("Inserte el tiempo en segundos que has tardado: "))
print("-------------------------------------------")

#Convierto las horas, minutos y segundos de partida a segundos.
tiempo_inicial = h*3600+m*60+s

#Sumo los segundos de partida de la ciudad A a el tiempo que ha tardado hasta la ciudad B.
tiempo_final = tiempo_inicial + tiempo_tardado

#Convierto el tiempo_final de segundos a horas, minutos y segundos.
h = int(tiempo_final/3600)
m = int((tiempo_final%3600)/60)
s = int((tiempo_final%3600)%60)

#Salida
print("La hora de llegada será a las", h,"horas", m,"minutos", s,"segundos")

  




	
	

	






	
	

	
