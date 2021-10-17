package OOP.Interface1;

public class Triangle implements Shape{

    //(base * height)/2
    int height;

    @Override
    public Integer area(int side) {
        return 12;
    }

    @Override
    public Integer perimeter() {
        return 11;
    }

    public void info(){
        System.out.println("I am info from triangle");
    }
}
