class Main {

    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Car car = new Car();
        car.license = "YVJ03D";
        car.driver = "Lionel Messi";
        car.passegenger = 4;
        car.printDataCar();

        Car car2 = new Car();
        car2.license = "XDE09D";
        car2.driver = "CR";
        car2.passegenger = 3;
        car.printDataCar();
    }
}