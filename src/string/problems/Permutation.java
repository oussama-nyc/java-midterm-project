package string.problems;

import java.util.HashSet;

public class Permutation {

    public static void main(String[] args) {

        /*
        Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
        Write Java program to compute all permutations of any given String
         */
        String st = "morning";
        findAllPermutations(st);
        System.out.println(findAllPermutations(st));

    }
    public static HashSet<String> findAllPermutations(String str) {
        // Create a hash set to prevent any duplicate entries
        HashSet<String> allPermutations = new HashSet<String>();

        if (str == null || str.length() == 0) {
            allPermutations.add("");
            return allPermutations;
        }

        char first = str.charAt(0);
        String remainingString = str.substring(1);
        HashSet<String> string = findAllPermutations(remainingString);
        for (String word : string) {
            for (int i = 0; i <= word.length(); i++) {
                String prefix = word.substring(0, i);
                String suffix = word.substring(i);
                allPermutations.add(prefix + first + suffix);
            }
        }
        return allPermutations;

    }
}
