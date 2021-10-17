package Homework8;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        int num, i, s=0, sum=0;
        System.out.println("Enter number of terms");
        num=new Scanner(System.in).nextInt();
        for(i = 1; i<=num; i ++){
            s=s*10+1;
            System.out.println(s+" ");
            sum=sum+s;
        }
        System.out.println("The Sum of the Series ="+sum);


    }
}
