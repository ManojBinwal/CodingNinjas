package LinkedList;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo<T> {



    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(34);
        arr.add(33);
        arr.add(43);
        arr.add(99);

//        System.out.println(arr);
//        System.out.println(arr.size());
//        System.out.println(arr.get(3));
//        System.out.println(arr.get(0)+arr.get(2));
        int sum = sumOfArrayList(arr);
        int Rsum =sumofArrayList(arr,0);
        System.out.println(sum);
        System.out.println(Rsum);
        System.out.println(arr);

        //addAll method of arraylist class-
        // Create two ArrayLists of Strings
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        // Add elements to list1
        list1.add("Hello");
        list1.add("World");

        // Add elements to list2
        list2.add("there");
        list2.add("everyone");

        // Add the elements of list2 to list1
        list1.addAll(list2);

        // Print the combined list
        System.out.println(list1);  // Output: [Hello, World, there, everyone]

        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Mary");
        names.add(1, "Mike"); // add "Mike" at index 1
        names.clear(); // removes all elements

        names.add("John");
        names.add("Mary");

        boolean containsMike = names.contains("Mike"); // returns false
        boolean containsMary = names.contains("Mary"); // returns true

        String secondName = names.get(1); // returns "Mary"

        int index = names.indexOf("John"); // returns 0

        int index1 = names.lastIndexOf("John"); // returns 2

        names.remove(0); // removes "John"

        names.add(0,"John");
        int size = names.size(); // returns 2
        System.out.println(size);

        Object[] namesArray = names.toArray(); //returns an array containing all the elements in the list in the correct order.

        names.trimToSize(); //trims the capacity of the list to be the list's current size.

        names.ensureCapacity(10); // increases the capacity to at least 10 elements

        names.add("Mike");
        names.add("Ben");
        List<String> subList = names.subList(1, 3); // returns [Mary, Mike]
        System.out.println(names);
        System.out.println(subList);

        //iterator() - returns an iterator over the elements in the list in proper sequence.
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String name = it.next();
            System.out.print(name+" ");

        }
        System.out.println();

        //listIterator() - returns a list iterator over the elements in the list (in proper sequence).
        ListIterator<String> it1 = names.listIterator();
        while (it1.hasNext()) {
            String name = it1.next();
            System.out.print(name +" ");

        }
        System.out.println();

        //listIterator(int index) - returns a list iterator over the elements in the list (in proper sequence), starting at the specified position in the list.

        ListIterator<String> it2 = names.listIterator(1); // start at index 1
        while (it2.hasNext()) {
            String name = it2.next();
            System.out.print(name+" ");
        }
        System.out.println();
        System.out.println(names);

        //remove(Object o) - removes the first occurrence of the specified element from the list, if it is present.
        names.remove("Mike"); // removes the first occurrence of "Mike"
        System.out.println(names);

        //removeAll(Collection<?> c) - removes from the list all of its elements that are contained in the specified collection.
        names.add(2,"Mike");
        List<String> toRemove = Arrays.asList("Mike", "Ben");
        names.removeAll(toRemove); // removes "Mike" and "Ben" from the list
        System.out.println(names);

        //retainAll(Collection<?> c) - retains only the elements in the list that are contained in the specified collection.
        names.clear();
        names.add("John");
        names.add("Mary");
        names.add("Mike");
        names.add("Ben");
        List<String> toRetain = Arrays.asList("John", "Mary");
        names.retainAll(toRetain); // removes "Mike" and "Ben" from the list

        System.out.println(names);

        //sort(Comparator<? super E> c): Sorts the elements in the list using the specified comparator.

        names.clear();
        names.add("Johnny");
        names.add("Maryl");
        names.add("Mikelanjelo");
        names.add("Ben");

        // Sort the list using the default natural ordering
        names.sort(null);
        System.out.println(names);


        // Sort the list in descending order
        names.sort((s1, s2) -> -s1.compareTo(s2));
        System.out.println(names);

        // Sort the list in ascending order by length of the string
        names.sort((s1, s2) -> s1.length() - s2.length());
        System.out.println(names);

        //Compares two strings lexicographically, ignoring case differences.
        names.sort(String::compareToIgnoreCase);
        System.out.println(names);

        //clone(): Returns a shallow copy of this ArrayList instance. The elements themselves are not cloned.
        ArrayList<String> namesCopy = (ArrayList<String>) names.clone();
        System.out.println(namesCopy);

        //equals(Object o): Compares the specified object with this list for equality.
        boolean areEqual = names.equals(namesCopy);
        System.out.println(areEqual);

        //toString(): Returns a string representation of the list.
        String namesString = names.toString();
        System.out.println(namesString);







    }

    private static int sumofArrayList(ArrayList<Integer> arr, int start) {
        if(start == arr.size()){   //arr.size return the number of elements in the array list and not the size of the arraylist
            return 0;
        }
        return arr.get(start) + sumofArrayList(arr,start+1);
    }

    private static int sumOfArrayList(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i:arr){
           sum+=i;
        }
        return sum;
    }
}

