class Fraccion:

    """
    Crea una clase Fraccion (Python) de forma que podamos hacer las siguientes operaciones:

    Construir un objeto Fraccion pasándole el numerador y el denominador.
    Obtener la fracción como cadena de caracteres.
    Obtener y modificar numerador y denominador. No se puede dividir por cero.
    Obtener resultado de la fracción (número real).
    Multiplicar la fracción por un número.
    Multiplicar, sumar y restar fracciones.
    Simplificar la fracción.
    """

    def __init__(self, numerador, denominador):

        """
        Constructor de la clase.
        :param numerador: numerador de la fracción.
        :param denominador: denominador de la fracción.
        """

        self.__numerador = numerador
        self.__denominador = denominador


    #Propiedades. Getter y setter.
    @property
    def numerador(self):
        return self.__numerador
    
    @numerador.setter
    def numerador(self, value_numerador):
        self.__numerador = value_numerador
        
    @property
    def denominador(self):
        return self.__denominador

    @denominador.setter
    def denominador(self, value_denominador):
        if value_denominador != 0:
            self.__denominador = value_denominador
        else:
            print("ERROR, el denominador no puede ser 0")

    #Método sobrecargado.
    def __str__(self):
        """
        :return: cadena con la hora
        """

        return f"{self.__numerador} / {self.__denominador}"

    #Mínimo común múltiplo para calcular la suma y resta de las fracciones.
    def mcm(self, otra):
        maximo = max(self.__denominador, otra.denominador)

        while True:
            if maximo % otra.denominador == 0 and maximo % self.__denominador == 0:
                return maximo
            maximo += 1

    #Resultado de ambas fracciones.
    def resultado(self):
        """
        Obtener el resultado de la fracción real.
        :return resultado: división real de la fracción.
        """
        return self.__numerador / self.__denominador

    #Suma de fracciones.
    def suma(self, otra):
        self.__numerador = (self.__numerador*otra.denominador)+(otra.numerador*self.__denominador)
        self.__denominador = (self.__denominador*otra.denominador)

    #Resta de fracciones.
    def resta(self, otra):
        self.__numerador = (self.__numerador*otra.denominador)-(otra.numerador*self.__denominador)
        self.__denominador = (self.__denominador*otra.denominador)

    #Multiplicación de fracciones.
    def multiplica(self, otra):
        return (self.__numerador * otra.__numerador), "/", (self.__denominador * otra.__denominador)

    #Máximo común divisor para calcular posteriormente el método simplifica.

    def __mcd(self):
        dividendo = self.__numerador
        divisor = self.__denominador
        resto = dividendo%divisor

        while resto !=0:
            dividendo = divisor
            divisor = resto
            resto = dividendo%divisor
            mcd = divisor
        return mcd

    def simplifica(self):
        """
        Simplifica la fracción partiendo del mcd.
        """
        mcd = self.__mcd()
        self.__numerador //= mcd
        self.__denominador //= mcd

    """
    def mcd(self):
        resto = self.__numerador%self.__denominador

        if (resto == self.__denominador):
            mcd = self.__denominador
            return mcd
    """


if __name__ == "__main__":
    f1 = Fraccion(10, 7)
    f2 = Fraccion(4, 6)

    #mostramos fracción 1 y 2.
    print("Mostramos fracción 1 y fracción 2: ")
    print(f1)
    print(f2)
    print("-------------------------------")

    # mostramos el resultado de la fraccion 1 y 2.
    print("Resultado fracción 1:", round(f1.resultado(), 3))
    print("Resultado fracción 2:", round(f2.resultado(), 3))
    print("-------------------------------")

    #Suma fracciones.
    print("Suma de la fracción 1 y 2:")
    f1.suma(f2)
    print(f1)
    print("-------------------------------")

    # Resta fracciones.
    print("Resta de la fracción 1 y 2:")
    f1.resta(f2)
    print(f1)
    print("-------------------------------")

    # Multiplicación de ambas fracciones.
    print("Multiplicación de la fracción 1 y 2:")
    f1.multiplica(f2)
    print(f1)
    print("-------------------------------")

    #Simplifica la fraccion 1
    print("Simplificación de la fracción 1:")
    f2.simplifica()
    print(f2)
    print("-------------------------------")






