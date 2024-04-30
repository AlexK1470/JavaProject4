package Coding10Tasks;

public class AnagramCheck {

    /*      Check if Two Strings are Anagrams: Given two strings, determine if they
             are anagrams, meaning they contain the same characters in a different order.
             For example, "listen" and "silent" are anagrams.                                  */

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        boolean areAnagrams = checkAnagrams(str1, str2);

        System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are anagrams? " + areAnagrams);
    }

    public static boolean checkAnagrams(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }
        char [] charArray1 = str1.toCharArray();
        char [] charArray2 = str2.toCharArray();

        java.util.Arrays.sort(charArray1);
        java.util.Arrays.sort(charArray2);

        return java.util.Arrays.equals(charArray1, charArray2);
    }
}
