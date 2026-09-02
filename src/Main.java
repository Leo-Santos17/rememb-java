public class Main {
    static int x = 3; // Class

    public static void main(String[] args){
        // variable scope = where a variable can be accessed
        int x = 1; // Local

        System.out.println(x);
        doSomething();
        writeX();
    }
    static void doSomething()
    {
        int x = 2; // Local
        System.out.println(x);
    }
    static void writeX()
    {
        System.out.println(x);
    }

}