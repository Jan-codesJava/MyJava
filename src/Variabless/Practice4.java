package Variabless;

public class Practice4 {

    public static void main(String[] args){

        /*
        in a farm,
        there are 12 cows and 23 chickens
        each chicken's cost is 10$
        each cow's cost is 500
        1- calculate the total number of legs of the animals in this farm
        2- calculate the total cost of animals in the farm
         */

        int cows = 12;
        int cowsPrice = 500;

        int chickens = 23;
        int chickensPrice = 10;

        int cowsLegs = 4;
        int chickensLegs = 2;

        int totalCowsLegs = cows*cowsLegs;
        int totalChickensLegs = chickens*chickensLegs;

        int totalLegs = totalCowsLegs+totalChickensLegs;

         System.out.println("total number of legs of the animals in this farm is "+ (totalLegs));

         System.out.println("total cost of animals in the farm is "+ (cows*cowsPrice + chickens*chickensPrice));
    }
}
