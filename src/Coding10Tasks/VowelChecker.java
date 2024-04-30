package Coding10Tasks;

public class VowelChecker {

    // Create a method to count how many vowels are present in a string “documentation”

    public static void main(String[] args) {

        String word = "documentation";
        int vowelCount = countVowels(word);

        System.out.println("The number of vowels in " + word + " is: " + vowelCount);
    }

    public static int countVowels(String word) {
        int count = 0;
        for(int i = 0; i < word.length(); i++) {
            char ch = Character.toLowerCase(word.charAt(i));
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}
