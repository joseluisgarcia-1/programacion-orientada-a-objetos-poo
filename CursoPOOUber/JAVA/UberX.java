/*super hace referencia a los atributos o propiedades de la super clase o clase padre y this hace referencia
 a los atributos de la clase hija o la clase de donde estoy ubicado */
/*class UberX extends Car {
    String brand;
    String model;

    public UberX(String license, Account driver, String brand, String model){
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }
}*/

class UberX extends Car {
    String brand;
    String model;

    public UberX(String license, Account driver, String brand, String model){
        super(license, driver);
        this.brand = brand;
        this.model = model;

    }

    @Override
    void printDataCar() {
        super.printDataCar();
        System.out.println("Modelo: " + model + " Brand: " + brand);
    }
}