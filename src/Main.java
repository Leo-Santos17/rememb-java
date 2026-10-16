public class Main {
    public static void main(String[] args){
        // .toString() = method inherited from the Object class.
        //               Used to return a string representation of an object.
        //               by default, it returns a hash code as a unique identifier.
        //               It can be overridden to provide meaningful details.

        Car car = new Car("Ford", "Mustang", 2024, "Red");

        System.out.println(car);
    }
}