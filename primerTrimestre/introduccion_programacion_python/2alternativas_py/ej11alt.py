# Programa: ej11alt.py
# Propósito: Programa que lea 3 datos de entrada A, B y C. Estos corresponden a las dimensiones de los lados de un triángulo.
# El programa debe determinar que tipo de triangulo es, teniendo en cuenta los siguiente:
# Si se cumple Pitágoras entonces es triángulo rectángulo.
# Si sólo dos lados del triángulo son iguales entonces es isósceles.
# Si los 3 lados son iguales entonces es equilátero.
# Si no se cumple ninguna de las condiciones anteriores, es escaleno.
#
# Autor: Antonio Quesada
# Fecha: 23/10/2019.
#
# Variables a usar:
#   * a
#   * b    
#   * c    
#
# Algoritmo:
# Leemos los tres lados del triángulo; a,b,c.
# Si cumple el teorema de pitagoras se trata de un triangulo rectángulo: H^2 = C^2+C^2
# Si a,b,c son iguales es equilátero.
# Si dos lados son iguales es isósceles, es decir; a=b o a=c o b=c.
# Si no se cumple ninguna sentencia es un triángulo escaleno (lados desiguales).

import math

#Petición de datos.
a = float(input("Introduce el lado A del triángulo: "))
b = float(input("Introduce el lado B del triángulo: "))
c = float(input("Introduce el lado C del triángulo: "))
print("--------------------------------------------------------------------")

#Proceso y salida.
#Comprobamos is es equilatero, en este caso es excluyente.
if a==b and b==c:
    print("Se trata de un triángulo equilátero")
    
else:
    #Comprobamos si es rectángulo (puede ser rectangulo y isóceles o escaleno)
    if c == math.sqrt(a**2+b**2) or a == math.sqrt(b**2+c**2) or b == math.sqrt(a**2+c**2):
        print("Se trata de un triángulo rectángulo")
        
    #Comprobamos si es isósceles o escaleno.
    if a==b or a==c or b==c:
        print("Se trata de un triángulo isósceles")
    else:
        print("Se trata de un triángulo escaleno")
    

