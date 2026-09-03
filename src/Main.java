import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        // Array = a collection of values of the same data type
        //         * think of it as a variable that can store more than 1 value *
        String[] fruits = {"apple", "orange", "banana", "coconut"};
        System.out.println(fruits[0]);

//        fruits[0] = "pineapple";
//        System.out.println(fruits[0]);

//        int numOfFruits = fruits.length;
//        System.out.println(numOfFruits);

//        for(int i = 0; i < fruits.length; i++)
//        {
//            System.out.print(fruits[i]+"; ");
//        }

//        for(String fruit : fruits)
//        {
//            System.out.println(fruit);
//        }

//        Arrays.sort(fruits);
        Arrays.fill(fruits, "pineapple");
        for(String fruit:fruits)
        {
            System.out.println(fruit);
        }
    }

}