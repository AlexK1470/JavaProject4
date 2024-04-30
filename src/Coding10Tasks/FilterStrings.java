package Coding10Tasks;

import java.util.ArrayList;
import java.util.List;

public class FilterStrings {

    /*     You have a list of strings and you want to keep only those that start with
             “A” and you want to return them in lower case".                                 */

        public static void main(String[] args) {
            List<String> strings = List.of("Apple", "Banana", "Apricot", "Avocado", "Peach");
            List<String> filteredStrings = new ArrayList<>();

            for(String str : strings) {
                if(str.startsWith("A")) {
                    filteredStrings.add(str.toLowerCase());
                }
            }
            System.out.println("Filtered Strings: " + filteredStrings);
        }
}
