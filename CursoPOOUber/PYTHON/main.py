from car import Car
from account import Account
if __name__ == '__main__':
    print("Hola mundo")
    """car = Car()
    car.license = "XAED09D"
    car.driver = "Lionel Messi"
    #con este print de abajo me trae los datos dentro de un diccionario
    #print(vars(car).values())
    print(vars(car))

    #Nueva instancia de la clase Car

    car_two = Car()
    car_two.license = "YVJ03D"
    car_two.driver = "CR7"
    #Con los print de abajo me trae los datos normal, es decir, en string
    print(car_two.license)
    print(car_two.driver)
    #Con el print de abajo puedo decirle que me imprima todas las variables de la instancia y los trae en un diccionario
    #print(vars(car_two))"""

    car_three = Car("AMS234", Account("Kilyan Mbappe", "7Francés"))
    print(vars(car_three))
    print(vars(car_three.driver))