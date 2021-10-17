package Primitives;

public class RemainderPractice2 {
    public static void main(String[] args) {
        //find the product (multiplication) of digits from a four given number
        //print the result as following:
        //The product is ...

        int number = 2222;

        int firstDigit = number%10; //this is d1 -->2

        number = number/10; //this is my new number -->143

        int secondDigit = number%10; //this is d2 --> 3

        number = number / 10; //this is my new number --> 14

        int thirdDigit = number%10; //this is d3 -->4

        number = number / 10; //this is my new number --> 1

        int fourthDigit = number%10; //this is d4 -->1

        int product = firstDigit*secondDigit*thirdDigit*fourthDigit;


        System.out.println("This is the product of digits: "+ firstDigit*secondDigit*thirdDigit*fourthDigit);
    }
}
