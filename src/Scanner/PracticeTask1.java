package Scanner;

import java.util.Scanner;

public class PracticeTask1 {
    public static void main(String[] args) {
        /*
        David wants to deposit his money into his bank account
-he already got $200 in his account
-he got three different paychecks ($480, $600 and $350)
-he can only deposit one paycheck at a time
-after he got his money in the account
- he bought a phone for $599 and headphone for $299
- calculate his final money in his account
open a new class under scanner package and name it as "MoneyTransaction"

         */

       /* Scanner input = new Scanner(System.in);

        double account$ = 200;

        System.out.println("How much do you want deposit?");
        double deposit1 = input.nextInt();
        System.out.println("How much do you want deposit?");
        double deposit2 = input.nextInt();
        System.out.println("How much do you want deposit?");
        double deposit3 = input.nextInt();
        double total$ = (account$+deposit1+deposit2+deposit3);

        System.out.println("You have "+ total$+ account$);

        double phone$ = 599;
        double headphone$ = 299;

        double remainder$ =(total$+ account$);
        System.out.println("Your current balance is ");

        double money = (remainder$-phone$-headphone$);
        System.out.println(money);

        */


        Scanner scanner = new Scanner(System.in);

        double balance = 200;
        System.out.println("How much do you want to deposit?");
        double firstCheck = scanner.nextDouble();
        balance += firstCheck;
        System.out.println("your current balance is: "+balance);

        System.out.println("How much do you want to deposit?");
        double secondCheck = scanner.nextDouble();
        balance += secondCheck;
        System.out.println("your current balance is: "+balance);

        System.out.println("How much do you want to deposit?");
        double thirdCheck = scanner.nextDouble();
        balance += thirdCheck;
        System.out.println("your current balance is: "+balance);

        System.out.println("What is the phone price?");
        double phonePrice = scanner.nextDouble();
        balance -= phonePrice;
        System.out.println("your current balance is: "+balance);

        System.out.println("What is the headphone price?");
        double headphonePrice = scanner.nextDouble();
        balance -= headphonePrice;
        System.out.println("your current balance is: "+balance);
    }
}
