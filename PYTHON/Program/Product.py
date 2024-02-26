# membuat class product
class Product:
    __idProduct = ""
    __name = ""
    __brand = ""
    __price = ""

    def __init__(self, idProduct="", name="", brand="", price=""):
        self.__idProduct = idProduct
        self.__name = name
        self.__brand = brand
        self.__price = price

    # Fungsi get
    def get_idProduct(self):
        return self.__idProduct

    def get_name(self):
        return self.__name

    def get_brand(self):
        return self.__brand

    def get_price(self):
        return self.__price

    # Fungsi set
    def set_idProduct(self, idProduct):
        self.__idProduct = idProduct

    def set_name(self, name):
        self.__name = name

    def set_brand(self, brand):
        self.__brand = brand

    def set_price(self, price):
        self.__price = price

