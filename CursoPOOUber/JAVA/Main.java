/*class Main {

    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Car car = new Car("YVJ03D", new Account("Lionel Messi", "AND12"));
        car.passegenger = 4;
        car.printDataCar();
    }
}*/

class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        UberX uberX = new UberX("AMQ123", new Account("Andres Herrera", "AND123"), "Chevrolet", "Sonic");
        uberX.setPassenger(2);
        uberX.printDataCar();

        /* instanciando un nuevo objeto
        Car car2 = new Car("XDE09D", new Account("CR","ANDA866"));
        car2.passegenger = 3;
        car.printDataCar();*/
    }
}