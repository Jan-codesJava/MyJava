package Project;

public class Task1 {
    public static void main(String[] args) {
        //What is method in JAVA?
        //Scope means between curly braces
        /*Scope of codes with the name and it can create the logic and implement and it will only run when you call
         */

        //How we do we create a method?

      /*  Access modifier (we will define if it is going to be static) -->
                return type --> name of method'
                parenthesis (we can write parameters)
                --> curly braces
                --> if our return type is not void we have to return data that we defined

                Access Modifiers
                public --> Accessible from everywhere in framework

                protected --> It is only accessible in same package unless  you call from child class

                default --> It is only accessible in same package

                private --> It is only accessible in same class



                Static and Non-static methods

                Static means it belongs to class and has same value for every object.
                When we are calling methods from outside of the class we dont need to create and object
                We can call by using class name.

                Non-static means it changes for every object/ For non-static means we can only call by creating an object

                Inside static method we cannot call non static or variables

                If you are calling non-static method from a static method
                you can only call static methods unless
                you create an object on the static method

                if you are calling static method from a static method
                (if you are in same class we can call by just name)
                we can just use class name




                Summary
                Access modifier - return type - name (Parameter){
                }
                How many access modifier
                4
                public private default protected

                accessible
                public protected default private

                Static and Non-static

                Static belong to class
                Non-static changes for every object

                Difference in calling static and non-static method
                For non-static we have to create an object
                For static methods we can use class name or object (At the time which one is more convenient)

                Calling non-static methods or variables from static method

                We should create an object even we are in same class

                Calling static method from a static method
                1. if we are in same class -> just method name
                2. if we are in different class --> class name

                calling static or non static variables and methods from a non static method
                1. we are in same class -->
                2. we are in different class -->

                if you are calling static use a class name to call
                if you are calling a non-static create an
       */
    }
}
