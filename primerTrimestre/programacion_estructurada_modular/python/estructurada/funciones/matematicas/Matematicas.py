'''
Crea una biblioteca de funciones matemáticas que contenga las siguientes
funciones. Recuerda que puedes usar unas dentro de otras si es necesario.
Observa bien lo que hace cada función ya que, si las implementas en el orden
adecuado, te puedes ahorrar mucho trabajo. Por ejemplo, la función esCapicua
resulta trivial teniendo voltea y la función siguientePrimo también es muy fácil de
implementar teniendo esPrimo.

autor: Antonio Quesada
'''

'''
Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso
en caso contrario.
'''

def esCapicua(num):
    inversa = 0
    num_aux = num
    while num!=0:
        cifra = num%10
        inversa = cifra+inversa*10
        num/=10
    if num_aux == inversa:
        return True
    else:
        return False

'''
Devuelve verdadero si el número que se pasa como parámetro es primo y falso
en caso contrario.
'''

def esPrimo(num):
    restos_no_nulos = 0
    for divisor in range(2,num):
        if num%divisor != 0:
            restos_no_nulos+=1
    return restos_no_nulos == num-2
'''
Devuelve el menor primo que es mayor al número que se pasa como parámetro.
'''

def siguientePrimo(num):
    candidato = num+1
    while esPrimo(candidato):
        candidato+1
    return candidato

'''
Dada una base y un exponente devuelve la potencia.
'''

def potencia(base,exponente):
    potencia = 1

    if exponente < 0:
        print("El exponente debe ser positivo.")
    else:
        for i in range(1,exponente+1):
            potencia = potencia*base
    return potencia

'''
Cuenta el número de dígitos de un número entero.
'''

def digitos(num):
    cifras = 0
    while num != 0:
        num = num/10
        cifras+1
    return cifras

'''
Le da la vuelta a un número.
'''

def voltea(num):
    cifra = 0
    inverso = 0
    while num != 0:
        cifra = num % 10
        inverso = cifra + inverso * 10
        num //= 10
    return inverso


'''
Devuelve el dígito que está en la posición n de un número entero. Se empieza
contando por el 0 y de izquierda a derecha.
'''

def digitoN(num):
    posN = 4
    digito = str(num)[posN-1]
    return digito

'''
Le quita a un número n dígitos por detrás (por la derecha).
'''

def quitaPorDetras(num):
    cifra = num%10
    return (str(num)[0:cifra-1])

'''
 Le quita a un número n dígitos por delante (por la izquierda).
'''

def quitaPorDelante(num):
    quitarNum = (str(num)[0:1])
    reemplazado = (str(num).replace(quitarNum,""))
    return reemplazado

'''
Añade un dígito a un número por detrás.
'''

def pegaPorDetras(num1,num2):
    return (str(num1) + str(num2))

'''
Añade un dígito a un número por delante.
'''

def pegaPorDelante(num1,num2):
    return (str(num2) + str(num1))

'''
Toma como parámetros las posiciones inicial y final dentro de un número y
devuelve el trozo correspondiente.
'''

def trozoDeNumero(num):
    posInicial = (str(num)[0:1])
    posFinal = num%10
    return (str(posInicial) + str(posFinal))
'''
Pega dos números para formar uno.
'''

def juntaNumeros(num1,num2):
    return (str(num1) + str(num2))

if __name__ == "__main__":
    print("¿El número 125 es capicua?", esCapicua(125))
    print("¿El número 73 es primo?", esPrimo(73))
    print("¿El número 8 es primo?", esPrimo(8))
    print("El siguiente primo mayor a 7 es", siguientePrimo(7))
    print("La potencia de 2 elevado a 4 es", potencia(2,4))
    print("El numero 1234 tiene", digitos(1234), "digitos")
    print("El volteo de 1234 es", voltea(1234))
    print("El digito que se encuentra en la posicion 4 de 123456 es", digitoN(123456))
    print("El numero 12345 si le quitas 1 digito por la derecha es", quitaPorDetras(12345))
    print("El numero 12345 si le quitas 1 digito por la izquierda es", quitaPorDelante(12345))
    print("El numero 12, con el 5 pegado por detrás", pegaPorDetras(12,5))
    print("El numero 13, con el 5 pegado por delante es", pegaPorDelante(13,5))
    print("Del numero 3175, si juntamos el primer digito y el ultimo forma", trozoDeNumero(3175))
    print("El numero 10 y 20 si lo juntas forman", juntaNumeros(10,20))
