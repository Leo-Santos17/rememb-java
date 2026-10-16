public class Main {
    public static void main(String[] args){
        // Polymorphism = "POLY" = "MANY"
        //                "POLY" = "SHAPE"
        //                Objects can identify as others objects
        //                Objects can be treated as objects of a common superclass.

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

//        car.go();
//        bike.go();
//        boat.go();

        // Car[] cars = {car, bike, boat}; // incompatype type
        // Bike[] bikes = {car, bike, boat}; // incompatype type
        // Boat[] boats = {car, bike, boat}; // incompatype type
        Vehicle[] vehicles = {car, bike, boat};

        for (Vehicle vehicle : vehicles)
        {
            vehicle.go();
        }

    }
}