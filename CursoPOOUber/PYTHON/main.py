from car import Car
if __name__ == '__main__':
    print("Hola mundo")
    car = Car()
    car.license = "XAED09D"
    car.driver = "Lionel Messi"
    print(vars(car))

    #Nueva instancia de la clase Car

    car_two = Car()
    car_two.license = "YVJ03D"
    car_two.driver = "CR7"
    print(vars(car_two))