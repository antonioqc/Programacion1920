"""
2. Haz un programa en Python que añada películas a un archivo de texto con el siguiente formato:
• Una línea por cada película.
• <TÍTULO>|<TÍTULO ORIGINAL>|<POPULARIDAD>|<VALORACIÓN>|<FECHA DE
ESTRENO>
Este programa recibe como parámetro el nombre de una película (ponlo entre comillas para que
Python sepa que es un único parámetro) y el fichero de texto donde añadirla.
Si el fichero no existe lo crea, si no puede da error.
Si el número de parámetros es incorrecto el programa da un error.
Busca la película mediante API REST en https://developers.themoviedb.org/3/search/search-movies
La búsqueda será exitosa si solo se devuelve un resultado, si no se devuelve ninguno o se devuelve
más de uno consideramos que ha habido un error al enviar el título.
Si la película no está en el fichero la añade, si está muestra un mensaje diciendo que ya está en el
archivo y no la añade.
En cualquier caso muestra por la pantalla el argumento de la película
"""
import sys
import requests

# Comprobamos los parámetros.Si los parametros no son dos (pelicula,fichero) salta el error y acaba el programa con
# exit.
if len(sys.argv) != 3:
    print("Parámetros incorrectos.Deben ser 2", file=sys.stderr)
    exit(1)

# Definimos los argumentos en este caso el nombre de la pelicula y del fichero.
pelicula = sys.argv[1]  # primer argumento
fichero = sys.argv[2]  # segundo argumento

# Recibe como parámetro el nombre de una película, la api_key y como lenguaje español.
api_key = '5f21175a704694f2f5caf1ded27d8577'
url = "https://api.themoviedb.org/3/search/movie"
parametros = {'api_key': api_key, 'language': 'es', 'query': pelicula}

# Hacemos la petición GET
response = requests.get(url=url, params=parametros)

# Sacamos un diccionario con los datos de la peticion. Nos devuelve la información en formato json.
datos = response.json()

# Comprobamos el estado de la petición. Si no es 200 mostrará petición incorrecta.
if response.status_code != 200:
    print("Petición incorrecta")
    exit(2)

# Si hay 0 resultados o más de uno, está mal.
if datos['total_results'] == 0 or datos['total_results'] > 1:
    print("La película", pelicula, "no se ha encontrado o hay más de una película con esa información.", file=sys.stderr)
    exit(3)  # Acaba el programa al no tener datos correctos.

# Mostramos los resultados de la película pasada como parámetro.
print("Resultados:")
titulo = datos['results'][0]['title']
titulo_original = datos['results'][0]['original_title']
popularidad = datos['results'][0]['popularity']
valoracion = datos['results'][0]['vote_average']
fecha_de_estreno = datos['results'][0]['release_date']
argumento_pelicula = datos['results'][0]['overview']

# Mostramos resultados por consola para comprobar el resultado.
print(f"<{titulo}> / <{titulo_original}> / <{popularidad}> / <{valoracion}> / <{fecha_de_estreno}>""\n")

# En cualquier caso muestra por la pantalla el argumento de la película.
print("Argumento de la pelicula,", titulo, ":")
print(argumento_pelicula)

# ¿Está ya la película en el archivo? Leemos el archivo.
try:
    archivo = open(fichero, 'r')  # Abro el archivo en modo lectura.
    contenido = archivo.readlines()  # leemos todo el archivo con readlines.
    linea = 0  # inicio contador
    for linea in contenido:  # lee linea a linea el contenido del archivo.
        # si el titulo de la pelicula ya está en el archivo muestra error.
        if titulo and titulo_original in linea:
            print("La película ya se encuentra en el fichero. No se puede añadir.", file=sys.stderr)
            # Cierra el archivo y acaba.
            archivo.close()
            exit(4)

    # Si no esta la película añade la información al fichero.
    fichero_escritura = open(fichero, "a")
    fichero_escritura.write(f"<{titulo}> / <{titulo_original}> / <{popularidad}> / <{valoracion}> / <{fecha_de_estreno}>")  # escribimos la información en el fichero
    fichero_escritura.close()  # cerramos el fichero.

except FileNotFoundError:
    fichero_escritura = open(fichero, "w")  # Si el fichero no existe lo crea, si no puede da error.
    fichero_escritura.write(
        f"<{titulo}> / <{titulo_original}> / <{popularidad}> / <{valoracion}> / <{fecha_de_estreno}>")
    fichero_escritura.close()
