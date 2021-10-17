package Constructor;

public class ComputerClass {

        /*create a computer class
        -have instance field of prize of the computer
                -create a calculate method to find the total price of 4 computers
                - this method will take an array as a parameter which represents prices of those 4 computers
                - this method will return the total price

        ------
                - create two constructor
        - one with no args
                - one with one args to init the instance variable

        override the toString method to show price of the computer

         */

    double price;

    public ComputerClass() {
        System.out.println("This NO argument Constructor");
    }

    public ComputerClass (double price){
        this.price = price;
        System.out.println("This NO argument Constructor");
        }

    public static double calculate (double[] pricesOfComputers) {
        double totalPrice = 0;
        for (double price : pricesOfComputers) {
            totalPrice += price;
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "" + price;
    }

    public static void main(String[] args) {
        double[] array = {1.2, 2.3, 4.5, 8.6};

        double total = calculate(array);
        System.out.println(total);
        ComputerClass c1 = new ComputerClass();
        System.out.println(c1);
    }

    }


