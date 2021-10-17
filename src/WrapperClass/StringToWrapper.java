package WrapperClass;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class StringToWrapper {
    public static void main(String[] args) {
        //text to primitive

     String str1 = "54321";

     Integer i1 = Integer.valueOf(str1);   //value gives object type
        System.out.println(i1);

     String str2 = "5.9f";

        Float fl1 =  Float.valueOf(str2);
        System.out.println(fl1);


        String str3 = "False";
        Boolean bl1 = Boolean.valueOf(str3);
       // System.out.println(bl1 == false); //true
        System.out.println(bl1); //false

        String str4 = ""+'c';

       // Character.valueOf(str4); compile time error you can not convert string to Character object


    }


}
