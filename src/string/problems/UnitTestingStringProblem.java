package string.problems;

import java.util.HashSet;
import java.util.Map;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.


        //*******************( Unit Testing of Permutation Class )*********************************8
        System.out.println(":::::: Unit Testing of Permutation Class :::::::");

        HashSet<String> allPermutations = Permutation.findAllPermutations("morning");
        System.out.println(allPermutations);

        //::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::://

        // ****************( Unit testing of Palindrome Class )*********************************
        System.out.println("::::::::Unit testing of Palindrome Class:::::::::::");

        String isPalindromeOrNot = Palindrome.isPalindrome("MADAM");
        System.out.println(isPalindromeOrNot);

        //::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::://

        // **************************( Unit testing of DuplicateWord Class )***************************
        System.out.println(":::::::::Unit testing of DuplicateWord Class::::::::::");

        String str = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        DuplicateWord.findDuplicateWords(str);

        //::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::://

        //**************( Unit testing of DetermineLargestWord Class )**************************8
        System.out.println(":::::::::Unit testing of DetermineLargestWord Class::::::::::");

        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = DetermineLargestWord.findTheLargestWord(s);
        int longLength = 0;
        for (Integer length : wordNLength.keySet())
            if (length > longLength)
                longLength = length;
        System.out.println(longLength + " " + wordNLength.get(longLength));

        //::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::://

         //*********************( Unit testing of Anagram Class )*************************************
        System.out.println(":::::::::::::Unit testing of Anagram Class:::::::::::::");

        Anagram.isAnagram("CAT","ACT");
        Anagram.isAnagram("ARMY","MaRy");
        Anagram.isAnagram("Dad","Dod");



    }
}
