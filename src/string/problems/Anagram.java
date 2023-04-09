package string.problems;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

       isAnagram("CAT","ACT");
       isAnagram("ARMY","MaRy");
       isAnagram("Dad","oDd");


    }

    public static boolean isAnagram(String str1, String str2) {
         boolean result = true;
        //first we have to check if they have the same length
        if (str1.length() != str2.length()) {
            result = false;
        } else {
            //we want to make sure they are either in lowercase or uppercase and covert them to char array
            str1 = str1.toUpperCase();
            str2 = str2.toUpperCase();
            char[] array1 = str1.toCharArray();
            char[] array2 = str2.toCharArray();

            //sort both the arrays
            Arrays.sort(array1);
            Arrays.sort(array2);

            result = Arrays.equals(array1, array2);
        }
        if (result == true) {
            System.out.println(str1 + " and " + str2 + " : Anagrams");

        } else {
            System.out.println(str1 + " and " + str2 + " : Not Anagrams");


        }
        return result;
    }
}
