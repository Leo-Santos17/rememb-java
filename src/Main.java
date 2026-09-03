import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
//        String[] foods = new String[3];
//
//        foods[0] = "pizza";
//        System.out.println(foods.length);
//        writeArray(foods);
//        foods[1] = "taco";
//        writeArray(foods);
//        foods[2] = "Hamburguer";
        // foods[3] = "Pineapple"; // Error
//        String[] foods = new String[4]; // Define specify # of index

        String[] foods;
        int size;

        System.out.print("What # of food do you want?: ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size]; // Number of indexes

        for(int i = 0; i < foods.length; i++)
        {
            System.out.println("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        writeArray(foods);

        scanner.close();
    }

    static void writeArray(String[] content)
    {
        System.out.println("------------------");
        for(String item: content)
        {
            System.out.println(item);
        }
        System.out.println("------------------");
    }

}