public class Main {
    public static void main(String[] args)
    {
        // String Methods
        String name = "  Bro Code    ";

        int length = name.length();
        char letter = name.charAt(2);
        int index = name.indexOf("o");
        int lastIndex = name.lastIndexOf("o");

//        name = name.toUpperCase();
//        name = name.toLowerCase();
//        name = name.trim();
//        name = name.replace("o", "a");
//        System.out.println(name.isEmpty());
        // Contains
        if(name.contains(" "))
        {
            System.out.println("Your name contains a space");
        }
        else
        {
            System.out.println("Your name DOESN'T contain any spaces");
        }

        // Equals
        if(name.equals("password")) // equalsIgnoreCase
        {
            System.out.println("Your name can't be a password");
        }
        else
        {
            System.out.printf("Hello %s", name);
        }
    }
}