package OOP.Interface1;

import Methods.Numbers;

public class Square implements Shape{

    @Override
    public Integer area(int side){
        return side*side;
    }

    public Double perimeter(){

        return 10.5;
    }

}