public class Main {
    public static void main(String[] args)
    {
        // printf() = is a method used to format output

        // %[flags][width][.precision][specifier-character]

        // [flags]
        // + = output a plus
        // , = comma grouping separator
        // ( =  negative numbers are enclosed in ().
        // space = display a minus if negative, space if positive

        // [width]
        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        String name = "Spongebob"; // s
        char firstLetter = 'S'; // c
        int age = 30; // d
        double height = 60.5; // f
        boolean isEmployed = true; // b
        double price1 = 9.99;
        double price2 = 11100.15;
        double price3 = -54.01;
        double price4 = 321;
        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with a %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("%s is %d years old\n",name, age);

        // Flags
        System.out.printf("% .1f\n", price1);
        System.out.printf("%,.2f\n", price2);
        System.out.printf("%+.3f\n", price3);
        System.out.printf("%(.3f\n", price4);

        // Width
        System.out.printf("%40d\n", id1);
        System.out.printf("%40d\n", id2);
        System.out.printf("%40d\n", id3);
        System.out.printf("%40d\n", id4);

    }
}