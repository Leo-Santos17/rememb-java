public class Main {
    public static void main(String[] args){
        Car car1 = new Car("Mustang", "Red");
        Car car2 = new Car("Corvette", "Blue");
        Car car3 = new Car("Charger", "Yellow");

        Car[] cars = {car1, car2, car3};

        for (Car car : cars)
        {
            car.drive();
        }

        Car[] cars1 = {new Car("Mustang", "Red"),
                       new Car("Corvette", "Blue"),
                       new Car("Charger", "Yellow")
        };
        for (Car car: cars1)
        {
            car.color = "black";
        }
        for (Car car: cars1)
        {
            car.drive();
        }
    }
}