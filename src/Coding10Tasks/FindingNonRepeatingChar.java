package Coding10Tasks;

public class FindingNonRepeatingChar {

    /*    Find the First Non-Repeating Character in a String: Given a string, find and
          return the first non-repeating character. For example, in the string
          "abracadabra", the first non-repeating character is 'c'.                         */

    public static void main(String[] args) {

        String input = "abracadabra";
        char result = findFirstNoneRepeatingCharacter(input);
        System.out.println("The first non-repeating character in " + input + " is " + result);
    }

    public static char findFirstNoneRepeatingCharacter(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(str.indexOf(ch) == str.lastIndexOf(ch)) {
                return ch;
            }
        }
        return '\0';
    }
}
