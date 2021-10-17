package Homework;

public class Homework6 {
    public static void main(String[] args) {



       /* Using scanner ask user to enter to String value and concatenate them together then print the result.
        If both String length is not same then omit chars from the longer string so it is the same length as
         the shorter string.After making both string same length then concatenate it.
                EXAMPLE-1:
        String 1: "Cell"
        String 2: "Phone"
        Output: "CellPhone"
        EXAMPLE-2:
        String 1: "Cable"
        String 2: "Mic"
        Output: "CabMic"
        */

       /* String str1, str2;
        Scanner word = new Scanner(System.in);
        System.out.println("Please enter the first string");
        str1 = word.nextLine();
        System.out.println("Please enter the second string");
        str2 = word.nextLine();
        System.out.println("Concatenated String is ");
        System.out.println(str1.concat(str2));

        //(str1.length() == str2.length());


        */




        /*
        Using scanner ask user to enter any String value.
        If this String has the color like red or blue with lower case print the red or blue.

EXAMPLE-1:
Input: "xxredyy"
Output: red
EXAMPLE-2:
Input: "xbxltue"
Output: blue
         */


       /* Scanner object = new Scanner(System.in);
        System.out.println("Please enter a String value");
        String value = object.nextLine();

            String string = "xxredyy";
            string.toLowerCase();


            string = string.toLowerCase();
            String a = "" + string.charAt(2);
            String b = "" + string.charAt(3);
            String c = "" + string.charAt(4);
            System.out.println(a + b + c);

        */

       /* String string = "xbxltue";
        string.toLowerCase();

        string = string.toLowerCase();
        String a = "" + string.charAt(1);
        String b = "" + string.charAt(3);
        String c = "" + string.charAt(5);
        String d = "" + string.charAt(6);

        System.out.println(a + b + c + d);

        */




        /*Given a string, if one or both of the first 2 chars is 'x',
        print the string without those 'x' chars,
        and otherwise print the string unchanged.

"xHi" → "Hi"
"Hxi" → "Hi"
"Tesxt" → "Testxt"

         */

      /*  String count = "Word";
        for (int i = 0; i < count.length() - 1; i++) {
            if (count.substring(i, i + 2).equals("hi"))
                count++;
        }else{
            return count;
        }
    }
}

       */




        /*
        Given a string, if a length 2 substring appears at both its beginning and end,
         print a string without the substring at the beginning, so "HelloHe" yields "lloHe".
         The substring may overlap with itself, so "Hi" yields "". Otherwise, print the original string unchanged.
Example:
"TestTe" --> print stTe
"TestTi" --> print TestTi
         */

        /*String str = "TestTe";

        String part1 = str.substring(2);
        System.out.println(part1);

        String part2 = str.substring(0, 6);
        System.out.println(part2);


/*


        /*
        Write a Java program that takes a year from user and print whether that year is a leap year or not.
Input the year: 2016
Output :2016 is a leap year
         */
/*
        int year;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any Year:");
        year = scan.nextInt();
        scan.close();
        boolean isLeap = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            }
            else
                isLeap = true;
        }
        else {
            isLeap = false;
        }

        if(isLeap==true)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");



 */


    }
}




