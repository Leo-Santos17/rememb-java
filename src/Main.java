public class Main {
    public static void main(String[] args){
        // Object = An entity that holds data (attributes)
        //          and can perform actions (methods)
        //          It is a reference data type

        Car car = new Car();

        System.out.println(car.make);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.model);
        System.out.println(car.isRunning);

        // Change attributes
        car.isRunning = true;
        System.out.println(car.isRunning);

        // Car Actions (Methods)
        car.stop();
        System.out.println(car.isRunning);
        car.start();
        System.out.println(car.isRunning);
        car.drive();
        car.brake();

        // Created new Car
        Car car1 = new Car();
        Car car2 = new Car();

        System.out.println(car1);
        System.out.println(car2);
    }
}