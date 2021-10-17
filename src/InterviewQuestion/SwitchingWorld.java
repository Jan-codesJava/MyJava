package InterviewQuestion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SwitchingWorld {
    public static void main(String[] args) {

        //switch the pairs

        String[] array = {"four", "flowers", "sun", "eleven", "cloud", "better", "git"};

        for (int i = 0; i < array.length - 1; i++) {
            String temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
            i++;
        }
        System.out.println(Arrays.toString(array));
        String[] array3 = {"2", "1", "4", "3", "6", "5", "7"};
//1234567
        for (int j = 0; j < array3.length - 1; j+=2) {
            String temp2 = array3 [j] ;
            array3[j] = array3[j + 1];
            array3[j + 1] = temp2;
        }
        System.out.println(Arrays.toString(array3));
    }
}