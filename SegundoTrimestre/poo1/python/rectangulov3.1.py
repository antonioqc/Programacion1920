class Rectangulov3:
    """
    Versión 3.1.
    Esta clase representa objetos de tipo rectángulo.
    Acciones: cálculo del perímetro, área, dibujar, comparar.
    Mejoras respecto a la versión 2:
    - Quitamos getters y setters estilo Java y los sustituimos por propiedades.
    - Usaremos métodos privados y estáticos.
    - Usaremos variables de instancia de clase.

    Añadimos el DESTRUCTOR y SOBRECARGA de OPERADORES.
    """
    lado_maximo = 10        # lado máximo del rectángulo
    __num_creados = 0   # contador de rectángulos creados

    def __init__(self, base, altura):
        """
        Constructor de la clase.
        :param base: base del rectángulo.
        :param altura: altura del rectángulo.
        """
        self.__base = 1
        self.__altura = 1
        Rectangulov3.__num_creados += 1
        # por si hubiera errores en los parámetros hemos dado valor inicial
        self.base = base
        self.altura = altura

    def __del__(self):
        """
        Destructor de la clase. Borrar objetos.
        """
        Rectangulov3.__num_creados -= 1

    #propiedades
    @property
    def base(self):
        return self.__base

    @base.setter
    def base(self, value):
        if self.es_lado_correcto(value):
            self.__base = value
        else:
            # Mucho mejor sería lanzar una excepción
            print("ERROR. Base incorrecta")

    @property
    def altura(self):
        return self.__altura

    @altura.setter
    def altura(self, value):
        if Rectangulov3.es_lado_correcto(value):
            self.__altura = value
        else:
            # Mucho mejor sería lanzar una excepción
            print("ERROR. Altura incorrecta")

    # resto métodos

    @staticmethod
    def num_rectangulos():
        return Rectangulov3.__num_creados

    @staticmethod
    def es_lado_correcto(value):
        return type(value) == type(1) and 0 < value <= Rectangulov3.lado_maximo

    def perimetro(self):
        """
        :return: perímetro del rectángulo.
        """
        return 2 * (self.base + self.altura)

    def area(self):
        """
        :return: área del rectángulo.
        """
        return self.base * self.altura

    def compara(self, otro):
        """
        Compara nuestro rectángulo con otro.
        :param otro: objeto con el que comparamos el actual.
        :return: >0 si mayor, 0 si igual, <0 si menor.
        """
        return self.area() - otro.area()

    def es_gemelo(self, otro):
        """
        Comprueba si el objeto pasado es el mismo rectángulo, o sea,
        tiene la misma base y altura.
        :param otro: objeto con el que comparamos el actual.
        :return: True o False
        """
        return self.base == otro.base and self.altura == otro.altura

    def muestra(self):
        """
        Muestra en pantalla el rectángulo.
        """
        print(self)

    # métodos sobrecargados

    def __str__(self):
        str = ""
        for i in range(self.altura):
            str += "*" * self.base
            str += "\n"
        str = str[:-1]
        return str

    def __mul__(self, other):
        """
        Multiplica la base si no se pasa del lado máximo en ese caso lo hace con la altura
        """
        assert type(other)==type(1) and other>0 #operando sea correcto.
        assert self.base*other<=Rectangulov3.lado_maximo or self.altura*other<=Rectangulov3.lado_maximo
        if self.base*other <= Rectangulov3.lado_maximo:
            return Rectangulov3(self.base * other, self.altura)
        else:
            return Rectangulov3(self.base, self.altura*other)

    def __rmul__(self, other):
        return self * other #llama a la anterior funcion.
    
    def __lt__(self, other): #Rectangulo menor que otro cuando su area sea menor que otra.
        assert isinstance(other,Rectangulov3)
        return self.area() < other.area()

    def __le__(self, other): #Rectangulo menor o igual que otro.
        assert isinstance(other,Rectangulov3)
        return self.area() <= other.area()

    def __eq__(self, other): #Rectangulo igual que otro.
        assert isinstance(other,Rectangulov3)
        return self.area() == other.area()


if __name__ == "__main__":
    r1 = Rectangulov3(-5, -3)
    r2 = Rectangulov3(10, 6)
    print(f"Probamos clase rectángulo con r1: ({r1.base},{r1.altura}) y "
          f"r2: ({r2.base},{r2.altura})\n")
    # mostramos
    r1.muestra()
    print()
    r2.muestra()
    # comparamos
    print("Resultado de comparar r1 con r2:", r1.compara(r2))
    print("¿Son gemelos?", r1.es_gemelo(r2))
    # magnitudes
    print("Área r1:", r1.area(), "Perímetro r1:", r1.perimetro())
    print("Área r2:", r2.area(), "Perímetro r2:", r2.perimetro())
    # accedemos a variables de instancia de clase
    print("Rectángulos creados", Rectangulov3.num_rectangulos())