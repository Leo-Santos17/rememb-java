public class Main {
    public static void main(String[] args){

        // inheritance = One class inherits the attributes and methods
        //               from another class
        //               Child <- Parent <- Grandparent

        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);

        dog.eat();
        cat.eat();

        dog.speak();
        cat.speak();

        // Post Organism Class
        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);

        Plant plant = new Plant();
        System.out.println(plant.isAlive);
        plant.photosynthesize();

        // plant.photosynthesize(); // Error but method not exists

    }
}