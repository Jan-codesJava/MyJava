package Object;

public class Animal {

    String name = "Jerry"; //instance variables
    int age;
    double  weight;
    int legNumber;
    double energy;



public              void           run               (String destination){
//access modifier  return type   name of method       you can pass parameter(s)

    energy -=10;

    System.out.println(name+ " is running" + destination);
}

//create a sleep method and print>> " ... is sleeping"
    //make every animal sleep
//make your cat sleep to recharge energy
    public void sleep(){
    energy = 100;
    System.out.println(name+ " is sleeping");

    }

    // create 'printInfo() method to print out all information
    //about the animal

    public void printInfo(){
        System.out.println("name is: "+ name+ " age is " +age + " weight is : " + weight
                + " legNumber is: "+ legNumber + " Energy is: "+energy);



    }
    }

