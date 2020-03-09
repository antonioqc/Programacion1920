'''
1. Crea la clase Tiempo. Los objetos de la clase Tiempo son intervalos de tiempo y se crean de la forma:

t = Tiempo(1, 20, 30)

donde los parámetros que se le pasan al constructor son las horas, los minutos y los segundos respectivamente.

Crea métodos para:

Sumar y restar otro objeto de la clase Tiempo.
Sumar y restar segundos, minutos y/o horas.
Devolver una cadena con el tiempo almacenado, de forma que si lo que hay es (10 35 5) la cadena sea 10h 35m 5s.
Realiza un programa de prueba para comprobar que la clase funciona bien.
'''

# Creamos la clase tiempo

class Tiempo:

    def __init__(self, horas, minutos, segundos):
        """
        Constructor de la clase
        :param horas: horas
        :param minutos: minutos
        :param segundos: segundos

        """
        #Excepción para tiempo negativo.
        assert  horas>=0 and 0<=minutos<60 and 0<=segundos<60

        #Si estamos aquí se cumple lo anterior y los valores son correctas.
        self.__horas = horas
        self.__minutos = minutos
        self.__segundos = segundos

    # Propiedades.Getter y setter.

    @property
    def horas(self):
        return self.__horas

    """
    @horas.setter
    def horas(self, value_horas):
        self.horas = value_horas
    """

    @property
    def minutos(self):
        return self.__minutos

    """
    @minutos.setter
    def minutos(self, value_minutos):
        self.minutos = value_minutos
    """

    @property
    def segundos(self):
        return self.__segundos

    """
    @segundos.setter
    def segundos(self, value_segundos):
        self.segundos = value_segundos
    """

    # Método sobrecargado. Cuando quiera convertir a cadena este objeto llama a este método.

    def __str__(self):
        """
        :return: cadena que devuelva el tiempo en h,m y s.
        """

        return f"{self.__horas}h {self.__minutos}m {self.__segundos}s"

    # Otros métodos.

    def conversor(self, tiempo_total):
        """
        Con este método convertimos los segundos del tiempo total a horas, minutos y segundos.
        """
        self.__horas = tiempo_total // 3600
        self.__minutos = (tiempo_total % 3600) // 60
        self.__segundos = (tiempo_total % 3600) % 60

    def sumar_tiempo(self, otro):
        """
        Sumará otro tiempo insertado como parámetro
        """
        tiempo_total = self.__horas * 3600 + self.__minutos * 60 + self.__segundos + otro.__horas * 3600 + otro.__minutos * 60 + otro.__segundos
        self.conversor(tiempo_total)

    def restar_tiempo(self, otro):
        """
        Restará otro tiempo insertado como parámetro
        """
        tiempo_total = self.__horas * 3600 + self.__minutos * 60 + self.__segundos - otro.__horas * 3600 - otro.__minutos * 60 - otro.__segundos
        self.conversor(tiempo_total)

    # Sumamos y restamos horas.
    def sumar_horas(self, horas):
        assert self.horas + horas >= 0 #Si el resultado es negativo, lanza una excepción.
        self.__horas += horas

    def restar_horas(self, horas):
        assert self.horas - horas >= 0
        self.__horas -= horas

    # Sumamos y restamos minutos.
    def sumar_minutos(self, minutos):
        tiempo_total = self.__horas * 3600 + self.__minutos * 60 + self.__segundos + minutos * 60
        self.conversor(tiempo_total)

    def restar_minutos(self, minutos):
        tiempo_total = self.__horas * 3600 + self.__minutos * 60 + self.__segundos - minutos * 60
        self.conversor(tiempo_total)

    # Sumamos y restamos los segundos.
    def sumar_segundos(self, segundos):
        if segundos >= 0:
            tiempo_total = self.__horas * 3600 + self.__minutos * 60 + self.__segundos + segundos * 60
            self.conversor(tiempo_total)
        else:
            print("Parámetro erroneo")

    def restar_segundos(self, segundos):
        if segundos >= 0:
            tiempo_total = self.__horas * 3600 + self.__minutos * 60 + self.__segundos - segundos * 60
            self.conversor(tiempo_total)
        else:
            print("Parámetro erroneo")


if __name__ == "__main__":
    t1 = Tiempo(1, 20, 30)
    t2 = Tiempo(2, 30, 50)

    # mostramos tiempo 1 y 2.
    print("Mostramos tiempo1 y tiempo2: ")
    print(t1)
    print(t2)

    # sumamos el tiempo 1 al 2.
    print("Sumamos tiempo 1 a 2:")
    t1.sumar_tiempo(t2)
    print(t1)

    # restamos el tiempo 1 al 2.
    print("Restamos tiempo 1 a 2:")
    t1.restar_tiempo(t2)
    print(t1)

    print("----------------------------------")

    # Sumar y restar horas.
    print("Sumamos 3 horas a tiempo1: ")
    t1.sumar_horas(3)
    print(t1)

    print("Restamos 2 horas a tiempo1: ")
    t1.restar_horas(2)
    print(t1)

    print("----------------------------------")

    # Sumar y restar minutos.
    print("Sumamos 30 minutos a tiempo1: ")
    t1.sumar_minutos(30)
    print(t1)

    print("Restamos 30 minutos a tiempo1: ")
    t1.restar_minutos(30)
    print(t1)

    print("----------------------------------")

    # Sumar y restar segundos.
    print("Sumamos 30 segundos a tiempo1: ")
    t1.sumar_segundos(30)
    print(t1)

    print("Restamos 30 segundos a tiempo1: ")
    t1.restar_segundos(40)
    print(t1)
