# Programa: ej4alt.py
# Propósito: Crea un programa que pida al usuario dos números y muestre su división si el segundo no es cero, 
# o un mensaje de aviso en caso contrario.
# Autor: Antonio Quesada
# Fecha: 23/10/2019.
#
# Variables a usar:
#   * num1
#   * num2
#
# Algoritmo:
#   Leemos y pedimos el numero1 y numero2.
#   Si num1 es igual a 0 decimos que el valor de la división es indefinido.
#   Si no escribimos el resultado de la división.

# Petición de datos
num1 = float(input("Introduce un número: "))
num2 = float(input("Introduce otro número: "))
print("------------------------------------------")


# Salida
if num2 == 0:
    print("Valor indefinido. No puedes dividir entre 0")
else:
    print("La división de", num1,"y", num2, "es", num1/num2)
    
