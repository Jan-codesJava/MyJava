package Loops;

public class Practice6 {
    public static void main(String[] args) {
        // Summer --> print out every single letter from this word one by one
        // S,u,m,m,e,r

        String text = "Summer";

        int index = 0;

        while (index<text.length()){

            System.out.println(text.charAt(index) + ", "); //S, u, m, m, e, r,

            index++;
        }
    }
}
