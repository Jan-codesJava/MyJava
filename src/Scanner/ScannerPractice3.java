package Scanner;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your full name");

        String fullName = scanner.nextLine();

        System.out.println("you entered this value --> "+fullName);
        System.out.println("What is your state");
        System.out.println("Please enter your state");
        //char firstLetter = scanner.next.()chartAt(3); //indexing
        //Illinois -->Letter count is 8

        //char firstLetter = scanner.next().charAt(0);
        //System.out.println(firstLetter);

    }

}
