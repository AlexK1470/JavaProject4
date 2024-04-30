package Coding10Tasks;

public class ReverseString {

    public static void main(String[] args) {

        /*   Reverse a String: Write a function to reverse a given string. For example,
             given the input "Hello", the output should be "olleH". */

        // Using Reverse Function

        String a  = "Hello Syntax";

        StringBuffer sb = new StringBuffer(a);
        System.out.println(sb.reverse());

        // Using CharAt()

        String toReverse = "Hello World";
        String reversed = "";
        for(int i = toReverse.length() - 1; i > 0; i--) {
            reversed = reversed + toReverse.charAt(i);
        }
        System.out.println("Reversed String is: " + reversed);

        // Using charArray()

        String reversed1 = "";
        char [] array = toReverse.toCharArray();
        for(int i = array.length - 1; i >= 0; i--) {
            reversed1 = reversed1 + array[i];
        }
        System.out.println("Reversed String is: " + reversed1);

        // Using Reverse String Word for Word

        String str = "Today is Sunday";
        StringBuilder reversed3 = new StringBuilder();
        String [] array1 = str.split(" ");
        for(int i = array1.length - 1; i >= 0; i--) {
            reversed3.append(array1[i]).append(" ");
        }
        System.out.println(reversed3);



    }
}
