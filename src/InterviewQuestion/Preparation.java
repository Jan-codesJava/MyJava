package InterviewQuestion;

public class Preparation {

    /*

    Vowels are a,e,

    For example

    If given string is "oouuaaTech"
    Output should be a appears 2 times o appears 2 times u appears 2 times.

    If given string is "ieTcd"
    Output should be e appears 1 time i appears 1 time


    public class Problem{
    public static void solution(String str){

    // First we need to find count of every vowel
    // then from those counts we need to find maximum count
    // Last step we should print all the vowels which have maximum count

    String vowels ="aeiou";
    Map <String, Integer> countMap =  new TreeMap();
    for( int i = 0; i< str.length; i++){
       String currentLetter = str.charAt(i)+"";
       if(vowels.contains(currentLetter)){
       //It means this letter is vowel
       if(!countMap .containsKey(currentLetter)){
       map.put(currentLetter,1);
       }else{
       //First we need to find count of this vowel from map and
       //increase by one
       int count = countMap.get(currentLetter)+1;
       map.put(currentLetter, count);
       }
       }
    } // i will have map vowels and count of every vowel

    // ["a:1", "e:2"]
    //How can we find maximum count from map?
    //We can find in one line
    // Return type of values method is collection
    int maximumCount = Collections.max(countMap.values

     // Last step we should print all the vowels which have maximum count
     Set<String> keys = countMap.keySet();
     for(String key: keys){
     if(maximumCount==1){
     // if the key has maximum
     //e appears 1 time i appears 1 time
     system.out.println(key+" appears" +maximumCount+" time");
     }
     }
     }

    public static void main (String[] args){

     */
/*
Vowels are a,e,i,o,u.
  You can assume every string is having vowel .
  Create a function to find most common vowels and print out the apperances of vowels from given String. If vowel counts are tied print out counts in alphabetical order.
  For example: If given string is "ComeHere"
  Output should be e appears 3 times.
 If given string is "oouuaaTech"
 output should be a appears 2 times o appears 2 times u appears 2 times
 If given string is "ieTcd"
 Output should be e appears 1 time i appears 1 time






 */
    // First we need to find count of every vowel
    // Then from those counts we need to find maximum count
    // Last step we should print all the vowels which have maximum count
 /*   String vowels= "aeiou";
    Map<String,Integer> countMap= new TreeMap();
        for(int i=0; i<str.length();i++){
        String currentLetter = str.charAt(i)+"";
        if(vowels.contains(currentLetter)){
            // It means this letter is vowel
            if(!countMap.containsKey(currentLetter)){
                countMap.put(currentLetter,1);
            }else{
                // First we need to find count of this vowel from map and
                // increase by one
                int count = countMap.get(currentLetter)+1;
                countMap.put(currentLetter, count);
            }

 }
  */


    } //  i will have map vowels and count of every vowel
    // ["a:3","e:2"]
    // How can we find maximum count from map?
    // We can find in one line
    // Return type of values method is collection
   /* int maximumCount=  Collections.max(countMap.values());

    // Last step we should print all the vowels which have maximum count
    Set<String> keys = countMap.keySet();
        for(String key: keys){
        if(maximumCount==1){
            // If the key has maximum value
            if(countMap.get(key)==maximumCount){
                System.out.println(key+" appears"+maximumCount+" time");}
        }

        else{
            if(countMap.get(key)==maximumCount){
                System.out.println(key+" appears"+maximumCount+" times");}
        }

    }

}
}
    */



/*

Example String[] logs= new String[]{
  "A:1"
  "C:2"
  "B:3"
  "A:3"
  "C:1"
  "A:2"
  "A:1"
  "B:2"
  "B:3"
  "C:2"
  }
 In this array numbers represent the user ids and letters represent the inputs from user. Write function to find when users three consequences input makes
 ABC. For example, in this case we just need to print out 2 because if we check the inputs from user, only user 2's input contains ABC.


public static void findInputs(String[] logs) {
    Map<String, String> map = new HashMap();

    for (int i = 0; i < logs.length; i++) {
        // logs[i]  "A:2"
        String[] idInput = logs[i].split(":");
        // idInput[0]="A" idInput[1]="2"
        // First element from this string is input second string from
        // this array is id
        if (!map.containsKey(idInput[1])) {
            map.put(idInput[1], idInput[0]);

        } else { String previousInput = map.get(idInput);
            map.put(idInput[1], previousInput + idInput[0]);


        }
    }
    System.out.println(map);
}
 */
