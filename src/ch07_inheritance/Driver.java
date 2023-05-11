package ch07_inheritance;


public class Driver {

    //field
    public void drive(Vehicle vehicle){
        vehicle.run();
    }

    //매게변수 다형성 - 사용방법은 동일하지만, 수행결과가 다르게나옴.
    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.drive(new Vehicle());
        driver.drive(new Taxi());
        driver.drive(new Bus());
    }

}
