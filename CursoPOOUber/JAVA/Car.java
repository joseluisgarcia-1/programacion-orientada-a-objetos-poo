class Car {
    Integer id;
    Integer passegenger;
    String license;
    Account driver;
    /*String driver;*/
    /* metodo constructor de java, Car es el nombre de la clase, dentro de los parentesis van los parametros y además de esto, el tipo de parametro o dato
    ejemplo: String license, 
    además de eso hacemos el metodo de herencia en la clase, cambiamos el String driver, y heredamos Account driver que es la clase ya definida
    */
    public Car(String, license, Account diver){
        this.license = license;
        this.driver = driver;
    }
    void printDataCar() {
        System.out.println("License: " + license + "Driver: " + driver.name);
    }
}
