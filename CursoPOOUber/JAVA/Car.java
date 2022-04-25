/*vamos a colocar el atributo Integer passegenger como privado y queda así private Integer passegenger 
se debe tener en cuenta que ese atributo no es visible para la clase Main pero para la clase Car si lo es
por ejemplo en la línea 20 lo estoy imprimiendo y si lo puedo ver en consola
*/

class Car {
    private Integer id;
    private Integer passegenger;
    private String license;
    private Account driver;
    /*String driver;*/
    /* metodo constructor de java, Car es el nombre de la clase, dentro de los parentesis van los parametros y además de esto, el tipo de parametro o dato
    ejemplo: String license, 
    además de eso hacemos el metodo de herencia en la clase, cambiamos el String driver, y heredamos Account driver que es la clase ya definida
    */
    public Car(String, license, Account diver){
        this.license = license;
        this.driver = driver;
        passegenger = 3
        System.out.println("passenger: " + passegenger)
    }
    void printDataCar() {
        if(passegenger != null){
            System.out.println("License: " + license + "Driver: " + driver.name);
        }
    }

    /*Getters y setters 
    este nos sirve para accederlo y modificarlo pero únicamente dentro de esa clase y es así:
    */

    public Integer getPassenger(){
        return passegenger
    }

    public void setPassenger(Integer passegenger) {
        if(passegenger == 4){
            this.passegenger = passegenger;
        }else{
            System.out.println("Necesitas 4 pasajeros")
        }
        
    }
    
}
