import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        // .substring() = A method used to extract a portion of a string
        //               .substring(start, end)

        Scanner scanner = new Scanner(System.in);

//        String email = "Bro123@gmail.com";
//        String username = email.substring(0,6);
//        String domain = email.substring(7, 16);

//        domain = email.substring(6);

//        username = email.substring(0, email.indexOf("@"));
//        domain = email.substring(email.indexOf("@")+1);

        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");

        email = scanner.nextLine();

        if(email.contains("@"))
        {
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@")+1);

            System.out.println(username);
            System.out.println(domain);
        }
        else
        {
            System.out.println("Email must contain @");
        }

        scanner.close();


    }
}