package HomeworkJavaCollection;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Task4 {

    /*
    Create one method takes one String Array
    and needs to return ArrayList with unique elements with ascending from String Array.
    Input: [“java”, “python”, “javascript”, “c++”, “java”, “c++”]
    Returns new ArrayList —> [“c++”,“java”, “javascript”,“python”]
     */

    public static ArrayList<String> uniqueElementsList(String[] array) {
        Set<String> setUnique = new TreeSet<>();
        for (String element : array) {
            setUnique.add(element);
        }
        ArrayList<String> listUnique = new ArrayList<>();
        //*
        for(String elementToList:setUnique){
            listUnique.add(elementToList);
        }
        return listUnique;

    }

    public static void main(String[] args) {
        String[] array = {"java","python","java", "javascript","c++","java","c++"};
        System.out.println( uniqueElementsList(array));
    }
}


