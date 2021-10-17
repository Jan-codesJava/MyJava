package Homework7;

public class Task2 {
    public static void main(String[] args) {

        /* Using a scanner ask the user to provide starting and ending numbers.
       Print the numbers divisible by 3 and 5 between given number AND print count of those numbers which is divisible by 3 and 5.
        EXAMPLE:
        First number: 5
        Second number: 65
        Output:
        15
        30
        45
        60
        Total number that divisible by 3 and 5 is 4.

        */



        String divisibleByThreeAndFive="";
        for(int i= 1; i<=100;++i ){
            if(i%5==0 && i%3==0){
                divisibleByThreeAndFive = divisibleByThreeAndFive + i +" , ";
            }
        }
        System.out.println(" Divisible by 3 and 5: \n"+ divisibleByThreeAndFive);



    }
}
