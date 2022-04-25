/*para crear el método constructor lo que hago es colocar lo que quiero poner no es necesario colocar el tipo de dato y ya automáticamente  
lo toma como si fuera su método constructor*/
function Car(license, driver) {
    this.id;
    this.license = license;
    this.driver = driver;
    this.passenger;
}
/*Si quiero crear un método como el que acabamos de hacer es así */

Car.prototype.printDataCar = function () {
    console.log(this.driver)
    console.log(this.driver.name)
    console.log(this.driver.document)
}

/*Clase Car con el nuevo estandar EcmaScript 6 */

/*class Car {
    constructor(license, driver){
        this.id;
        this.license = license;
        this.driver = driver;
        this.passenger;
    }

    printDataCar() {
        console.log(this.driver)
        console.log(this.driver.name)
        console.log(this.driver.document)
    }
}
*/