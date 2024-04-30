package Coding10Tasks;

public class AlphaCharacters {

    // Find out how many alpha characters are present in a string?

    public static void main(String[] args) {

        String str = " Hih9898jhjh%%^$%^   oio   ";
        str = str.replaceAll("[^A-Za-z]", "");
        int number = str.length();
        System.out.println("Number of Alpha Characters = " + number);

        String myString = "Today is Wednesday and it is Java Class";
        String [] array = myString.split(" ");
        int words = array.length;
        System.out.println("Total Words in String: " + myString + " = " + words);
    }
}
