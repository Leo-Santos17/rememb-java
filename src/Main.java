import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you Student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();


        System.out.println("Hello "+name);
        System.out.println("You're "+age+" years old");
        System.out.println("Your gpa is: "+gpa);
        if(isStudent)
        {
            System.out.println("You are enrolled as a student");
        }
        else
        {
            System.out.println("You're NOT enrolled");
        }
        scanner.close();
    }
}