package Coding10Tasks;

public class Palindrome {

    /*      Check if a String is Palindrome: Determine whether a given string is a
            palindrome, which means it reads the same forwards and backward. For
            example, "madam" is a palindrome.                                         */

    public static void main(String[] args) {

        String original = "racecar";
        String reverse = "";
        for(int i = original.length() - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }

        if(original.equals(reverse)) {
            System.out.println("Given String is Palindrome");
        } else {
            System.out.println("Given String is NOT Palindrome");
        }
    }
}
