package Constructor;

public class Cup {

   /* create a cup class

    with the instance fields of:
    size, isClean, liquidAmount

    create a constructor to initialize all of these instance fields
    create a test class and create few objects to test your code

    */

    int size;
    boolean isClean;
    double liquidAmount;


    //there are 2 constructor. By its name CUP
    public Cup(int inputSize, boolean inputClean, double inputLiquidAmount){
        this();
        this.size = inputSize;
        this.isClean = inputClean;
        this.liquidAmount = inputLiquidAmount;

    }

    public Cup(int newSize, boolean newClean){

        this.size = newSize;
        this.isClean = newClean;
        System.out.println("This is two argument constructor");

    }

    public Cup(){
        this(33,true);

        System.out.println("This is NO argument constructor");
    }
    public void info(){  //1method

        System.out.println("Size: "+size+" isClean: "+isClean
        +" Liquid amount is: "+liquidAmount);
    }
@Override
    public String toString(){ //2method
        return "Size: "+size+" isClean: "+isClean
                +" Liquid amount is: "+liquidAmount;
    }
@Override
    protected void finalize(){

        System.out.println("Now one object went to the garbage");
    }

}
