package HomeworkJavaCollection;

import java.util.HashMap;
import java.util.Map;

public class Task6 {
    /*
    A bigram is any two adjacent words in the text disregarding case and punctuation.
    A histogram is the count of how many times that particular bigram occurred in the text.
    Write the method will take String and it will return the map with count of particular bigram occurred in the text.
    Example:
    Given the text:
    “The quick brown fox and the quick blue hare.” The bigrams with their counts would be.
     Output:
    “the quick” 2
    “quick brown” 1
    “brown fox” 1
    “fox and” 1
    “and the” 1
    “quick blue” 1
    “blue hare” 1
     */

    public static Map<String, Integer> bigramFind(String str) {
        str = str.toLowerCase();
        HashMap<String, Integer> map = new HashMap<>();

        String[] words = str.split(" ");
        String[] twoWords = new String[words.length-1];

        //System.out.println(Arrays.toString(words));

        for (int i = 0; i < words.length - 1; i++) {
            twoWords[i] = words[i] + " " + words[i + 1];
            if (!map.containsKey(twoWords[i])) {
                map.put(twoWords[i], 1);
            } else {
                map.put(twoWords[i],map.get(twoWords[i]) + 1);
            }

        }

        return map;
    }

    public static void main(String[] args) {
        String str = "The quick brown fox and the quick blue hare.";
        System.out.println(bigramFind(str));

    }
}



