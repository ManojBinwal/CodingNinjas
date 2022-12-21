package LinkedList;
import java.util.Arrays;
public class DynamicArray {
    public static void main(String[] args) {
        // Create an array with initial capacity 10
        String[] names = new String[10];

        // Add some elements to the array
        names[0] = "Alice";
        names[1] = "Bob";
        names[2] = "Charlie";
        names[3] = "David";
        names[4] = "Eve";

        // Access an element at a specific index
        String name = names[2]; // name will be "Charlie"

        // Iterate through the array
        for (String n : names) {
            if (n != null) {
                System.out.println(n);
            }
        }

        // Check if the array is empty
        boolean isEmpty = names[0] == null; // isEmpty will be false

        // Resize the array to a larger size
        int newSize = names.length*2;
        names = resizeArray(names, newSize);
        System.out.println(Arrays.toString(names));
    }

    // Method to resize an array
    public static String[] resizeArray(String[] oldArray, int newSize) {
        String[] newArray = new String[newSize];
        int length = Math.min(oldArray.length, newSize);
        System.arraycopy(oldArray, 0, newArray, 0, length);
        return newArray;
    }
}