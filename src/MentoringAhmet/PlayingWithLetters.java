package MentoringAhmet;

import java.util.Scanner;

public class PlayingWithLetters {
    public static void main(String[] args) {
        //ask user to enter one string value with three word
        //1- print first letter of each word
        //2 - print last letter of each word
        //3- print the sum of last letter of each word's index number
        //4- print the sum of first letter of each word's index number
        //example: "Java String Test"
        //Output:
        //JST
        //agti
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter whatever you want");
        String words = scan.nextLine();
        String firstLetters= "";
        String lastLetters = "";
        firstLetters += words.charAt(0);
        for (int i = 0; i < words.length();i++){
            if(words.charAt(i)==' '){
                firstLetters += words.charAt(i+1);
                lastLetters += words.charAt(i-1);
            }
        }
        lastLetters+=words.charAt(words.length()-1);
        System.out.println(firstLetters);
        System.out.println(lastLetters);


    }
}
