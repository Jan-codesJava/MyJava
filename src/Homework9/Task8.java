package Homework9;

public class Task8 {
    public static void main(String[] args) {

        /*
        Create the following array size of 7 and store the following number {1, 1, 2, 2, 3, 4, 4 }.
        Print only the first unique value from this array.
        Output:
           3
           NOTE: Test your code with different array values.
         */


        int[] array = {1, 1, 2, 2, 3, 4, 4};

        String repeatedNums = "";

        for (int i = 0; i < array.length; i++) {


            INNER:
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {

                    repeatedNums += array[i];
                    break INNER;
                }

            }
            if (!repeatedNums.contains(array[i] + "")) {
                System.out.println("unique value is " + array[i]);
            }
        }
    }
}



