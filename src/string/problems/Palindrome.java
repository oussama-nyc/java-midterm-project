package string.problems;

import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
      String isPalindromeOrNot=  isPalindrome("MADAM");
        System.out.println(isPalindromeOrNot);
    }

    public static String isPalindrome(String str) {
        String reverse = "";
        for (int i = 0; i < str.length(); i++) {
            reverse = str.toLowerCase().charAt(i) + reverse;
        }
        if (str.toLowerCase().equals(reverse)) {
            return "is a Palindrome";
        } else
            return "is not a Palindrome";
    }
}
