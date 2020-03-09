# Programa: ej14rep.py
# Propósito: Realizar un programa que compruebe si una cadena contiene una subcadena. 
# Las dos cadenas se introducen por teclado.
#
# Autor: Antonio Quesada
# Fecha: 30/10/2019.
#
# Variables a usar:
#   * cadena
#   * subcadena
# subcadena = cadena[i:i+len(cadena)]:


#Petición de datos.
cadena = input("Introduce una cadena: ")
subcadena = input("Introduce de nuevo otra cadena: ")

#Bucle for con un rango de 1.
for i in range(0,1):
    #Funcion contains para ver si la cadena contiene a la subcadena.
    if(cadena.__contains__(subcadena)):
        print("La cadena contiene la subcadena.")
        
    #En el caso de que no la contenga lo imprime por pantalla.
    else:
        print("La cadena no contiene la subcadena.")
        