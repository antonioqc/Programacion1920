'''
Realiza los siguientes programas en Python:

1. Usando esta API de OpenWeather que nos da el pronóstico del tiempo para una ciudad que se le pide al usuario de los
siguientes cinco días, mostrar:

Temperatura media, mínima y máxima (en grados Celsius) para cada día y global.
Tened en cuenta que las respuestas de esta api referentes a los días y horas usan el tiempo en formato UNIX (UTC).
'''
import os

import requests

# datos para hacer la petición GET.

url = "https://api.openweathermap.org/data/2.5/forecast"
params = {'q': 'Cordoba,es', 'units': 'metric', 'APPID': 'd8752aa8491c10d15d43021004f8265b'} #os.environ["OPEN_WEATHER_KEY"]

# petición
response = requests.get(url, params=params)
if response.status_code != 200:
    print("Error al hacer la petición")
    exit(1)
datos = response.json()

# cálculos
dias = dict()  # diccionario con clave el día y valor la lista de mediciones del día
totales = {"temp": [], "temp_min": [], "temp_max": []}  # lista de mediciones de todos los días

for medicion in datos["list"]:
    # fecha y temperatura de la medición
    dia = medicion["dt_txt"][:10]
    temp = float(medicion["main"]["temp"])
    temp_min = float(medicion["main"]["temp_min"])
    temp_max = float(medicion["main"]["temp_max"])

    # si no tenemos datos de ese día creamos una nueva entrada en el diccionario
    if not dias.get(dia):
        dias[dia] = {"temp": [], "temp_min": [], "temp_max": []}
    # añadimos medición
    dias[dia]["temp"].append(temp)
    dias[dia]["temp_min"].append(temp_min)
    dias[dia]["temp_max"].append(temp_max)
    totales["temp"].append(temp)
    totales["temp_min"].append(temp_min)
    totales["temp_max"].append(temp_max)

# resultados
print()
for dia, temps in dias.items():
    # diario
    temp_med = sum(temps['temp']) / len(temps['temp'])
    temp_min = min(temps['temp_min'])
    temp_max = max(temps['temp_max'])
    print(f"Día {dia[8:]}-{dia[5:7]}-{dia[0:4]}:\t"
          f"Temperatura media: {temp_med:.2f}º, "
          f"mínima: {temp_min}º y máxima: {temp_max}º. "
          f"Mediciones: {len(temps['temp'])}")
print()

# global
temp_med = sum(totales['temp']) / len(totales['temp'])
temp_min = min(totales['temp_min'])
temp_max = max(totales['temp_max'])
print(f"TOTALES:\t\tTemperatura media: {temp_med:.2f}º, "
      f"mínima: {temp_min}º y máxima: {temp_max}º")
