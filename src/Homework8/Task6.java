package Homework8;

public class Task6 {
    public static void main(String[] args) {

        String str = "CIVIC";

        int start = 0;
        int end = str.length() - 1;

        boolean isPalindrome = true;

        while (start < end) {

            if (str.charAt(start) != str.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(" is Palindrome");

        } else {
            System.out.println(" is NOT a Palindrome");
        }


    }
}
