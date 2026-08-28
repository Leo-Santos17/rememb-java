public class Main {
    public static void main(String[] args)
    {
        // Primitives
        int age = 21;
        int year = 2025;
        int quantity = 1;

        double price = 19.99;
        double gpa = 3.5;
        double temperature = -12.5;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        boolean isStudent = false;
        boolean forSale = false;
        boolean isOnline = true;

        // References
        String name = "Bro Code";
        String food = "pizza";
        String email = "fake123@gmail.com";
        String car = "Mustang";
        String color = "red";

        // Stdout
        System.out.println("Your choice is a " + color + " " + " " + year + " " + car);
        System.out.println("The price is: " + currency + price);

        // Conditions
        if(isStudent)
        {
            System.out.println("You are Student");
        }
        else
        {
            System.out.println("You're not student");
        }
        if(forSale)
        {
            System.out.println("There is a "+car+" for sale");
        }
        else
        {
            System.out.println("There is a "+car+" is not for sale");
        }
    }
}
