package string.problems;
import java.util.HashMap;
import java.util.Map;


public class DuplicateWord {

    public static void main(String[] args) {

        /*
         Write a java program to find the duplicate words and their number of occurrences in the string.
            Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        DuplicateWord.findDuplicateWords(st);
    }

        public static void findDuplicateWords(String inputString){
          Map<String, Integer> duplicateWord = new HashMap<>();
        String st1 = inputString.toLowerCase();
        String[] stringWords = st1.split(" +");

        for (String str : stringWords) {
            if (duplicateWord.containsKey(str)) {
                duplicateWord.put(str, duplicateWord.get(str) + 1);
            } else
                duplicateWord.put(str, 1);
        }

        duplicateWord.forEach((k, v) -> System.out.println("The word "
                + "(" + k + ")" + " found " + v + " time(s)"));

        //the duplicate words
        for (String str : duplicateWord.keySet()) {
            if (duplicateWord.get(str) > 1) {
                System.out.println( "(" + str + ")"  + " found " + duplicateWord.get(str) + " time(s)");
            }
        }
        int count = 0;
        for (Integer n : duplicateWord.values()) {
            count = count + 1;
        }

        double average = inputString.length() / count;
        System.out.println("average length" + " " + average);
    }

}
