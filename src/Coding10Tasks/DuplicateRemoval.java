package Coding10Tasks;

import java.util.ArrayList;
import java.util.List;

public class DuplicateRemoval {

    // How can you remove all duplicates from ArrayList?

        public static void main(String[] args) {
            List<String> listWithDuplicates = new ArrayList<>();
            listWithDuplicates.add("apple");
            listWithDuplicates.add("banana");
            listWithDuplicates.add("apple");
            listWithDuplicates.add("orange");
            listWithDuplicates.add("banana");
            listWithDuplicates.add("apple");

            List<String> listWithoutDuplicates = new ArrayList<>();

            for(String element : listWithDuplicates) {
                if(!listWithoutDuplicates.contains(element)) {
                    listWithoutDuplicates.add(element);
                }
            }

            System.out.println("List With Duplicates: " + listWithDuplicates);
            System.out.println("List Without Duplicates: " + listWithoutDuplicates);
        }
}
