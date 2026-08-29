import java.util.Random;

public class Main {
    public static void main(String[] args)
    {

        Random random = new Random();

        int number, number2, number3;
        double number_d,number_d2,number_d3;
        boolean isHeads;

        // Integer
        number = random.nextInt();
        number2 = random.nextInt(1,5);
        number3 = random.nextInt(6,10);
        // Double
        number_d = random.nextDouble();
        number_d2 = random.nextDouble(1,2);
        number_d3 = random.nextDouble(2,3);
        // Boolean
        isHeads = random.nextBoolean();

        if(isHeads)
        {
            System.out.println("HEADS");
        }
        else
        {
            System.out.println("TAILS");
        }


    }
}