package Array;

public class Example {
    public static void main(String[] args) {

        /*Computers
                Apple, Lenova, HP, DEll, Acer
        TVs
                Samsung, LG, Sony
        Speakers
                Alexa, Google, Logitec, JBL
        --------------
                Prices
        Computers
        Apple --2500, Lenova-1600, HP-1800, DEll-1900, Acer-1100

        TVs
        Samsung-2199, LG-1799, Sony-1599

        Speakers
        Alexa-79.99, Google-89.99, Logitec-64.99, JBL-55.99

// STORE Brand in a multidimensional array
// STORE Prices in a multidimensional array
// print out prices for each product as:
// "price for Apple is $2500"

         */

        String[][] departments = {{"Apple", "Lenova", "HP", "DEll", "Acer"}, {"Samsung", "LG", "Sony"}, {"Alexa", "Google", "Logitec", "JBL"}};

        double[][] prices = {{2500, 1600, 1800, 1900, 1100}, {2199, 1799, 1599}, {79.99, 89.99, 64.99, 55.99}};

        System.out.println("price for " + departments[0][0] + " is $" + prices[0][0]);
        System.out.println("price for " + departments[0][1] + " is $" + prices[0][1]);

       /* for (String[] brands : departments) {


            for (String device : brands) {
                System.out.println("price for " + device + " is $" );
            }
        }
        for (double[] priceArr : prices) {
            for (double price$ : priceArr) {

                System.out.println(price$);
            }
        }

        */

        //---------------------------------------------------

        String[][] departments1 = {{"Apple", "Lenova", "HP", "DEll", "Acer"}, {"Samsung", "LG", "Sony"}, {"Alexa", "Google", "Logitec", "JBL"}};

        double[][] prices1 = {{ 2500, 1600, 1800, 1900, 1100}, {2199, 1799, 1599}, {79.99, 89.99, 64.99, 55.99 }};
        for (int i = 0; i< departments.length; i++){

            for (int l =0; l < departments1[i].length; l++){

                System.out.println("Price for "+departments[i][l] + " is $" + prices[i][l]);

            }
        }
    }
}
