public class Main {
    public static void main(String[] args) throws InterruptedException {

        // overloaded methods = methods that share the same name,
        //                      but different parameters
        //                      signature = name + parameters


        String pizza = bakePizza("flat bread");

        add(1,2,3);
        add(1,2);

    }
    static String bakePizza(String bread)
    {
        return bread + " pizza";
    }
    static String bakePizza(String bread, String chesse)
    {
        return chesse + " " + bread + " pizza";
    }
    static String bakePizza(String bread, String chesse, String topping)
    {
        return topping + " " + chesse + " " + bread + " pizza";
    }



    static double add(double a, double b)
    {
        return a+b;
    }
    static double add(double a, double b, double c)
    {
        return a+b+c;
    }
    static double add(double a, double b, double c, double d)
    {
        return a+b+c+d;
    }

}