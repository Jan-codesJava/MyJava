package HomeworkJavaCollection;

import java.util.HashSet;
import java.util.Set;

public class Task3 {
    /*
    Create one method takes one String array.
    This method needs to return how many unique element you have in array.
    Input: [“java”, “python”, “javascript”, “c++”, “java”, “c++”]
    Output: 4
     */

    public static void countUniqueElements(String[] array){
        Set<String> set = new HashSet<>();
        for(String e:array){
            set.add(e);
        }

        System.out.println(set.size());
    }

    public static void main(String[] args) {
        String [] array  = {"Java", "python", "javascript", "python", "c++","Java"};
        countUniqueElements(array);
    }
}

