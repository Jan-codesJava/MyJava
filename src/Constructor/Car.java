package Constructor;

public class Car {

   /* create a car with instance field of brand of the car
    create one move method to simply print out " car is moving"
    create a constructor to initialize instance e variables
    create a test class to test this car class
    inside of the test class create multiple objects
            send some of the genius to garbage
            call garbage collector
            make sure gc() is working
    */

    String brand;

    public void move(){
    System.out.println("Car is moving");

}
public  Car() {
}

    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "the brand of the car is: "+brand;
    }

    @Override
    protected void finalize(){
        System.out.println("car is going to garbage");

    }
}




