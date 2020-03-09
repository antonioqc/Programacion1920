# Programa: ej14alt.py
# Propósito: La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, 
# la cual se clasifica en tipos A y B, y además en tamaños 1 y 2. Cuando se realiza la venta del producto,
# ésta es de un solo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que entrega 
# en un embarque, considerando lo siguiente: si es de tipo A, se le cargan 20 céntimos al precio inicial 
# cuando es de tamaño 1; y 30 céntimos si es de tamaño 2. Si es de tipo B, se rebajan 30 céntimos cuando 
# es de tamaño 1, y 50 céntimos cuando es de tamaño 2. Realice un algoritmo para determinar la ganancia obtenida.
#
# Autor: Antonio Quesada
# Fecha: 23/10/2019.
#
# Variables a usar:
#   * precio_inicial
#   * tipo(cadena) sólo puede introducir A o B
#   * tamaño 
#
# Algoritmo:
#   Si el tipo es a y el tamaño es 1 se le cargan 20 céntimos al precio inicial.
#   Si el tipo es a y el tamaño es 2 se le cargan 30 céntimos al precio inicial.
#   Si el tipo es b y el tamaño es 1 se le rebajan 30 céntimos al precio inicial.
#   Si el tipo es b y el tamaño es 2 se le rebajan 50 céntimos al precio inicial.


#Petición de datos.
precio_inicial = float(input("Inserte cuál es el precio inicial al kilo de uva: "))
tipo = str(input("Inserte cuál es el tipo(A o B): "))
tamaño = float(input("Inserte cuál es el tamaño(1 o 2): "))
print("--------------------------------------------------------------------")

#Proceso y salida.

if tipo == 'A' and tamaño == 1:
    print("La ganancia obtenida", 0.20+precio_inicial, "al precio inicial")
    
elif tipo == 'A' and tamaño == 2:
    print("La ganancia obtenida", 0.30+precio_inicial, "al precio inicial")
    
elif tipo == 'B' and tamaño == 1:
    print("La ganancia obtenida", 0.30-precio_inicial, "al precio inicial")
    
elif tipo == 'B' and tamaño == 2:
    print("La ganancia obtenida", 0.50-precio_inicial, "al precio inicial")
    


