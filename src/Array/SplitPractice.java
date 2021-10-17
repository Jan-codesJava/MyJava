package Array;

import java.util.Arrays;
import java.util.SplittableRandom;


//split()
// - it takes a parameter as String and it cuts the string from given parameter
// - it comes from String class
// - return is String array

public class SplitPractice {
    public static void main(String[] args) {

        String str = "The fall season is coming";

        //str.split(" "); //takes the space and cuts

        String[] words = str.split(" ");

        System.out.println(Arrays.toString(words));

        String [] words2 = str.split("a");
        System.out.println(Arrays.toString(words2));
    }
}
