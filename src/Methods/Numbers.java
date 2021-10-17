package Methods;

public class Numbers {

    //lets write a non-static method to find sum of two integer numbers
    public int findSum(int a, int b) {
        return a + b;

    }
    //lets write a static method to find division of two number

    public static int findDivision(int a, int b) {
        return a / b;
    }

    //in the same class differences for static and non-static
    public static void main(String[] args) {
        //main method is a static  method so i should only be able to call
        //static methods or variables
        //findSum(4,5);
        //for to call findSum method we need to create an object inside the static method
        //this object below is a bridge for us to call non static find sum method

        Numbers numbers = new Numbers();
        numbers.findSum(4, 5);

        //can i call findDivision with numbers object?
        // if we are calling the static method in same class
        // we cant call by using object but we can call when we are outside of the class

        //since findDivision is a static method and i am in same class i can
        // call by using name
    }
}
