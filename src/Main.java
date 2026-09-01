import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // break = break out of a loop (STOP)
        // continue = skip current iteration of a loop (SKIP)

        for(int i = 0; i < 10; i++)
        {
            if(i == 5)
            {
                continue;
            }
            if(i == 9)
            {
                break;
            }

            System.out.println(i + " ");
        }
    }
}