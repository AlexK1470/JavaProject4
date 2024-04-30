package Coding10Tasks;

public class WordCounter {

    /*     Count the Number of Words in a String: Write a function to count the
           number of words in a given string. Words are separated by spaces or
           punctuation. For example, the input "Hello, world!" should return 2.    */

    public static void main(String[] args) {

        String input = "Hello, World";
        int wordCount = countWords(input);

        System.out.println("The number of words in " + input + " is: " + wordCount);
    }

    public static int countWords(String s) {
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }

        String[] words = s.split("[\\s\\p{Punct}]+");
        return words.length;


    }
}
