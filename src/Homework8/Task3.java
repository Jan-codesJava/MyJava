package Homework8;

public class Task3 {
    public static void main(String[] args) {


        int num = 153;
        int temp = num;
        int r, sum = 0;

        while (num > 0) {
            r = num % 10;
            num = num / 10;
            sum = sum + r * r * r;
        }

        if (temp == sum)
            System.out.println("It is an ArmStrong number");
        else
            System.out.println("It is not an Armstrong number");


    }
}
