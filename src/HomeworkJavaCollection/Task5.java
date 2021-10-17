package HomeworkJavaCollection;

import java.util.*;

public class Task5 {
/*
    Create one method takes String Arraylist with duplicate values,
    this method need to return array with descending order of unique element from arrayList.
    Input: [“java”, “python”, “javascript”, “c++”, “java”, “c++”]
    Returns new String[]—> {“python”, “javascript”, “java”, “c++”}
     */

    public static void listDescElementsUnique(ArrayList<String> list){
        Set<String> setUnique = new TreeSet<>(list);
//        for(String el:list){
//            setUnique.add(el);
//        }
        ArrayList<String> newList = new ArrayList<>();
        newList.addAll(setUnique);
        System.out.println(newList);
        setUnique.clear();
        Collections.reverse(newList);
        System.out.println(newList);
        String[] array = new String[newList.size()];
        array = newList.toArray(array);
        System.out.println(Arrays.toString(array));
    }


    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("python");
        list.add("javascript");
        list.add("c++");
        list.add("java");
        list.add("c++");
        listDescElementsUnique(list);
    }
}



