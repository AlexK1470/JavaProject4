package Coding10Tasks;

public class SwapNumbers {

    // Write a program to swap 2 String without a temporary variable?

    public static void main(String[] args) {

        // Swapping Numbers

        int a = 10;
        int b = 20;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);

        // Swapping Strings

        String x = "Hello";
        String y = "Welcome";
        x = x + y;
        y = x.substring(0, (x).length() - y.length());
        x = x.substring(y.length());
        System.out.println(x);
        System.out.println(y);

    }
}
