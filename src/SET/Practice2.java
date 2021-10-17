package SET;

import java.util.*;

public class Practice2 {
    public static void main(String[] args) {

        HashSet <Integer> hashSet = new HashSet<>();

        LinkedHashSet <Integer> LinkedHashSet= new LinkedHashSet<>();

        TreeSet <Integer> treeSet = new TreeSet<>();

        //null, random order
        hashSet.add(11);
        hashSet.add(12);
        hashSet.add(13);
        hashSet.add(14);
        hashSet.add(null);
        System.out.println(hashSet);

        System.out.println("*********************");

//null, insertion order
        LinkedHashSet.add(21);
        LinkedHashSet.add(22);
        LinkedHashSet.add(23);
        LinkedHashSet.add(24);
        LinkedHashSet.add(null);
        System.out.println(LinkedHashSet);
        System.out.println("*******");

       // no null, ascending
        treeSet.add(31);
        treeSet.add(32);
        treeSet.add(33);
        treeSet.add(34);
       // treeSet.add(null);
        System.out.println(treeSet);
        System.out.println("*****");

        for( Integer number: treeSet ){

            boolean b = number.toString().equalsIgnoreCase("35");
            System.out.println(b);
            String str = number == 35 ? "I found 35" : "Could not find 35";
            System.out.println(str);
        }

        //[null, 99, 55, 12,14]
        Iterator iterator = treeSet.iterator();

           // iterator.hasNext(); //checks the next element
            while (iterator.hasNext()){

                System.out.println(iterator.next());
            }

        Iterator iterator1 = hashSet.iterator();


        while (iterator1.hasNext()){

            System.out.println(iterator1.next());
        }

        ArrayList <String> veggies = new ArrayList<>();
        veggies.add("tomato");
        veggies.add("lettuce");
        veggies.add("carrot");

        //looping over arraylist by using iterator
        Iterator iterator2 = veggies.iterator();


        while (iterator2.hasNext()){

            System.out.println(iterator2.next());
        }

        //sorting collection via sort() method
        Collections.sort(veggies);
        System.out.println(veggies);

        //convert arraylist to set

        HashSet set1 = new HashSet(veggies);
        System.out.println("this is list to set: "+set1);

        //set to Arraylist
        ArrayList list1 = new ArrayList(set1);

        System.out.println("this is new ArrayList from set "+list1);

        list1.add("tomato");
        System.out.println("after adding tomato once again: "+list1);
        System.out.println(list1.get(1));

            }
        }

