package Topic;

import com.sun.codemodel.internal.JMethod;

public class Theory {

   /* class - building block
    object - representation of building block
    method - behavior of object
    method overloading , it has to be in same class
    return types -->determine what type of data we want to get: void, others (primitives, String, Object)
    access modifiers  --> public, private, default, protected
    instance variables - they are out of methods, they are out of any blocks?
    local variables
    default -- one of access modifier
    default -- value for instance variables
    *static
    calling methods - triggering accessing the method work
    */


    /*
    Static key word

    --static key word can be used for methods and instance variables
    --static key word make methods and variables belong to that class
    -each object will be sharing static variables and methods
    -local variables can not be static
    -static methods can be called without objects
    -inside of a static method only static methods can be called without object
    -inside of non-static method both(static and non-static) methods can be called without object.
    -return typer of the method should be right before the name of the method as a syntax rule

		-method signature
			--> int age(){} --> it will work
			--> static int age(){}  --> it will work
			X-> int static age(){}  --> it will not work
     */
}



/*
Method calling Practice
Static Practice
Constructor
Garbage Collector
Equals and == for objects
Overriding
 */


/*===================================

Constructor


-  you need constructor to be able to create object
 - you need constructor to initialize instance variables

public class Student{

    String name = "David";
    int age;

    ways to initialize instance variables:
    - give default value
    - create object and initialize
            - with the help of JMethod
    - with the help of constructor
}


--------------Syntax of constructor----------

public Student (){
}

- constructor has to have same name as class name
- constructor can not be static, synchronized or abstract
- constructor can NOT HAVE a return type
- constructor can have access modifier


=============================

create a cup class

with the instance fields of:
size, isClean, liquidAmount

create a constructor to initialize all of these instance fields
create a test class and create few objects to test your code
 */


/*
Method Overriding -
- when you override a method:
method signature stays the same but implementation of the method changes
method overriding happens in different classes, changing the behavior , different parameter
- there should be parent-child relationship between those two classes

Method Overloading - happens in  same class


==========================

Garbage Collector belongs to system itself

==========================

What we learnt today

- calling non-static method
- calling static method
-constructor
creating the object
initialize instance variables
- method overriding    : toString, finalize
-gc():
this.  - referring to the current class
equality
wrapper classes



============================

create a car with instance field of brand of the car
create one move method to simply print out " car is moving"
create a constructor to initialize instance e variables
create a test class to test this car class
inside of the test class create multiple objects
send some of the genius to garbage
call garbage collector
make sure gc() is working


==============================

Why we need Wrapper Classes?

We need wrapper classes when we want to convert primitive data type to object
We need to convert primitive data types to object when we want to store them into the arraylist

===================================

create a computer class
-have instance field of prize of the computer
-create a calculate method to find the total price of 4 computers
- this method will take an array as a parameter which represents prices of those 4 computers
- this method will return the total price

------
- create two constructor
- one with no args
- one with one args to init the instance variable

override the toString method to show price of the computer




what is method overloading vs method overriding?
what is static?
how can you call a method with out object?
what is constructor?
differences between constructor and method?
this, this() --> super, super()
==============

wrapper class?

convert primitives to object
- autoboxing --> primitives to object
- unboxing --> object to primitives

========================

Collections

list - interface
- ArrayList - class
- LinkedList - class

set
-hashset
-treset
-linkedhashset

map
hashmap
tremap
linkedhashmap
 */



/*========================================
add
set
get
remove
addAll
removeAll
clear
size
StringMethods

ArrayList <String> names = new Array:ist();


//Task:

create practice2 class

create an ArrayList to Store 5 colors
store 5 different colors in that arraylist
 use traditional for loop to print out each element from the arraylist
 */





/*
Object
....
Collection

List
-ArrayList
-LinkedList

Set
-Hashset
-TreeSet
-LinkedHashset


Queue

Map
-HashMap
-TreeMap
-LinkedHashmap
 */

//====================================
/*
arraylist
-size is dynamic
-has methods
-stores objects
-has indexing
-you can store duplicates
-to use it, import is needed
- has insertion order
-array to arrayList
-arrayList to array

* once you add an element in a certain index, rest of the elements will be pushed to the next indexes

array
- size is fixed]
- has no methods
- has index
- store primitives and objects
- you can store duplicates
- you can sort array by using sort() method
 */

/* =======================

ArrayList x = new ArrayList();
ArrayList<Integer> x = new ArrayList();
List<Integer> x = new ArrayList();
 */

/* LinkedList

x @1234  y @2345   z @3456      t@5678

@2345      @3456      @5678       @7890

- adding and removing is faster
- reaching to element is slower

==================================
SET - *** you can not store duplicate element

HashSet  -- no order, stores null value
LinkedHashSet  -- insertion order, stores null value
TreeSet -- ascending order, no null values
===============================
HashSet

-does not keep orders
-there is no get();
-unique elements

===================================

MAP

-HashMap
-TreeMap
-LinkedHashMap


 */
/*==================

What is Map?
    Data structure type that we can store our key and value pairs?
    Only allows us to store object values and keys
    For primitive storage we need to use equivalent wrapper class for primitive data types.
     Key and Value pairs called an entry for the map
    put() : With this method we can add entries in the map.
    Map capitalCities= new HashMap(); // This will compile
                                      // Data type would be an object
    // For declaration of the map we don't need to use diamond brackets
    // but using diamond brackets is always the best practice.
         Map<String,String> capitalCities= new HashMap();
         // Brackets on the right side of equavilant is not required after java 8
          capitalCities.put("Norway","Oslo");
          System.out.println(capitalCities);
    // Output of this printing is on the below line.
      [Norway=Oslo]
          capitalCities.put("Norway","Amsterdam");
             System.out.println(capitalCities);
       A [Norway=Oslo]
       B [Norway=Oslo,Norway=Amsterdam]
    //   C [Norway=Amsterdam]
    // When put method is used for already existing key it doesn't throw an error or any
    compile time problem . It updates the value for the key.
        capitalCities.put(null,"Ankara");
        Compile time error
        Run time exception
     //   Works fine
       // Inside the map we can have one null key.
        capitalCities.put("US",null);
        capitalCities.put("Turkey",null);
  Compile time error
  Run time exception
  // Works fine
   // Even though map only allows one null key we can have as many null value as we want.
// In which class or interface put method comes from ?
// Put method comes from Map interface
// String is immutable but map is mutable
 // What is the maximum entry number for HashMap?
  capitalCities.size();
  size() method returns an integer value so limitation for entry in a map would be
  maximum integer number from Java.
 There is one method that makes the size long and we can go upto highest long value.
 // If you want to find max value for int or long use wrapper class and call Max_Value instance
 How can we acces item from a map?
 We need to use our key as a parameter and with get method we can call value for the key.
 capitalCities.get("Norway"); -> Amsterdam  // output
 You want to access all values from the map but you don't know the keys?
  Set<String> keys= capitalCities.keySet();
  for(String key:keys){
 System.out.println(capitalcities.get(key));
 // This line will print all the values from map
  }
// Print out all the keys that has a value of empty string
// Store in the arraylist all the keys  that has a value of empty string
 Set<String> keys= capitalCities.keySet();
List<String> emptyKeys= new ArrayList();
for(String key:keys){
 if(capitalCities.get(key).equals("")){
  System.out.println( key );
   emptyKeys.add(key);
 }
  }
How do we remove items from map?
 with remove() method.
 remove method takes key as a parameter and removes the entry.



 */

/*

1)
 Blocks:
 {}
- static blocks
It runs as first thing in the class || executing only one time
You can initialize static variables in the static blocks

- instance blocks
It runs for every object
It runs as many time as you created object
You can initialize variables in the instance blocks

==================================
2)  Access Modifiers:
- can not use them for local variables
- can use them for instance and static variables and methods
- should come before data types

1. - Public:
- anywhere in the project
2. - Private:
- only in the same class
3. - Protected:
- same package and sub-classes
4. - Default:
- there is no key word as 'default', if you dont specify access modifier it is default.
- only in the same package

====================================

encapsulation:

hiding data
- need setters and getters methods
setters are setting the values
getters are getting the values
 */

/*immutable class
- when you have a class which has only getters not setters, those type of classes are called "Immutable' classes

* all fields will be private

stringBuilder

--OOPs------
-Inheritance
 */

/*
members of a class : variables, constructors
 */

/*

String builder:
its mutable

StringBuilder name = "Sam"; //not will not compile
---> StringBuilder name1 = new StringBuilder("Samuel");

StringBuilder name2 = new StringBuilder();
 */

/*
OOP
-Encapsulation - hiding data
-Inheritance - parent-child relationship

-can has multi-level inheritance
-can inherit multiple times from same parent
- cannot inherit from child
- single-level of inheritance

-Polymorphism - understanding object
-Abstraction:  - making things invisible
-Abstract classes
-Interfaces

=================
-Exception
 */

/*
=======================Method Overriding====================
-method overriding has to happen in parent-child relationship
-access modifiers has to be same or more accessible
- return type has to be same or co-variant of the types

* when you change the implementation of a method in a child class(es) by keeping
same name and same parameters it is called 'Method Overriding'.

=======================Method Overloading -vs- Method Overriding================

-overloading happens in the same classes
-overloading keeps the same name of the method but changing the parameters
-access modifiers and return types does not effect method overloading
      but it does for overriding
 */

/*
What can be static?
=======static keyword===============
- Instance variables , methods and blocks
* if a method is static method, you cannot override
 */


/*
============ 'final' key word ---------------

Final key word can be used for:
classes, instance variables, methods
it will create constant values

final variables:
they can not re-assign new values
-name of final variables are declared by using UpperCase letters

=========final methods:==============
you can not override but you can overload

final classes:

you can not extend final classes

 */

/*
Abstraction===
- Abstract classes
- Interface
 */

/*
============ABSTRACTION========
the purpose of 'abstraction' is to reduce complexity and increase efficiency.
two ways to achieve abstraction which are by creating:
- Abstract Classes
- Interfaces
------------Abstract Classes ----------------:
-  Abstract classes defines the method but implementation of
    the method will be in child class based on the need of development
- must be created by using 'Abstract' keyword
- methods should be defined with 'Abstract' keyword and first extending class(first child class)
  should implement the abstract methods
  * that regular child class is called 'Concrete' class

- Abstract classes can be extended by Abstract classes and non-abstract classes
- Abstract class can have abstract and non-abstract methods
- Can not define method body for abstract methods
- Abstract methods can not be private, static or final
 */
/*

abstract class Morning{
 int hello ();

 public int bye(){
 //code
 }
 }

 public class AM extends Morning{

 public abstract int hello(){
 //code
 }
 }

 public abstract class PM extends Morning{
 }
 */


/*
Interface:


reference               object
Set <String> set1 = new HashSet();

- you are going to use interface keyword to create an interface
- you cannot have private, protected, and final in interface
- * you cannot create an object from interface
- * Interface methods are public and abstract by default
* - methods can not be private, protected or final
- Variables in the interface are public and final

** Exceptions about methods:
- you can declare default methods
- * default is not the access modifier in that case
- you need to provide body for that default method
- you can override default methods

- you can implement more than one Interfaces
- you must  implement methods in to the child class when you extended from interface


==========================

access modifiers

public
protected
default
private


==================

interface Example{

// no access modifier means by default it is public
void sum();

void multiply();
}

///=========================

// ** you can implement more than one Interfaces but you can extend only one class by a child class

// ** an interface can extend another interface but not implements
 */



/*
Abstract classes:
-extends
Interface:
-implements
-default
 */

//Polymorphism:
/*================================

Polymorphism:

to be able to have Polymorphism you need to have parent child relation

HashSet<> set1 = new HashSet<>();

Set<> set1 = new HashSet<>(); --> no order

Set<> set1 = new LinkedHashSet<>(); ---> insertion

Set<> set1 = new TreeSet<>(); --> ascending

1- Reference and data type of the object can be same
HashSet<> set1 = new HashSet<>();
2. Reference can be interface
Set<> set2 = new HashSet<>();
3. Reference can be parent (super)
Vehicle car = new Car();

-----------------------------------------------------

ATM

Branches

Bank

=====================

Dynamic Polymorphism : when you override method java decides which method to call at run time.
This is Dynamic Polymorphism

Static Polymorphism: when you overload method java determines which method to call at compile time.
This is Static Polymorphism
 */


/*
========================================

Exceptions:

- you can handle exceptions by using try and catch blocks

try{

//code -- your implementation

} catch (TypeOfException name){

//you can implement any informal coding

}

void sum(int num1, int num2){

num1+num2
}
 */