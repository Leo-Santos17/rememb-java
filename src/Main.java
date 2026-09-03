public class Main {
    public static void main(String[] args){

        // varargs = allow a method to accept a varying # of arguments
        //           makes methods more flexible, no need for overloaded methods
        //           java will pack the arguments into an array
        //           ... (ellipsis)

        //System.out.println(add(1,2,3)); // Error: Over parameters to add() method
        System.out.println(sum(1,2,3,4,5));
        System.out.println(average(1,2,3,4));

    }

    static double add(int a, int b)
    {
        return a+b;
    }
    static int sum(int... numbers)
    {
        int sum = 0;

        for(int number: numbers)
        {
            sum+=number;
        }

        return sum;
    }
    static double average(double... numbers)
    {
        double sum = 0;

        for(double number: numbers)
        {
            sum += number;
        }

        return sum/numbers.length;
    }
}