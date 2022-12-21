package LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveConsequitiveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Integer arr1[]={1,1,1,1,1,1,1,1,2,2,2,3,3,4,4,5,6,7,7};
        arr.addAll(Arrays.asList(arr1));

        //removeDuplicatesUsingSet(arr);
        //removeDuplicatesUsingRecursion(arr);
        removeDuplicatesUsingIteration(arr);
        System.out.println(arr);

    }

    private static void removeDuplicatesUsingIteration(ArrayList<Integer> arr) {
    if(arr.isEmpty()){
        return;
    }
    ArrayList<Integer> rdup= new ArrayList<>();
    for(int i=0; i<arr.size(); i++) {
        int current = arr.get(i);
        if(!rdup.contains(current)){
            rdup.add(current);
        }
      }
    arr.clear();
    arr.addAll(rdup);
    
    }

    private static void removeDuplicatesUsingRecursion(ArrayList<Integer> arr) {
        if(arr.isEmpty()){   //if the list is empty then return
            return;
        }
        int element = arr.get(0); //keeps track of elements in the stack
        arr.remove(0);   //remove all the elements at 0 till the list is empty

        removeDuplicatesUsingRecursion(arr);  //recursive call to remove elements and keep track of element
        /*
        *when the recursive call ends it will start executing below if statement from the top of the stack
        * [1,1,2,2,3,3] - for example if this was the list to remove duplicates then -
        *   from the top three was removed last so element contains 3 and the list is empty so 3 is add to list
        *   at position 0.
        *   then the stack is popped and it moves down. next element contains 2 and it is added to the list at position 0
        *   similarly for 1 and we get the final list as [1,2,3]
         */
        if(!arr.contains(element)){
            arr.add(0,element);
        }

    }

    private static void removeDuplicatesUsingSet(ArrayList<Integer> arr) {
        // Remove duplicates using a Set
        Set<Integer> set = new HashSet<>(arr);
        ArrayList<Integer> uniqueList = new ArrayList<>(set);
        arr.clear();
        arr.addAll(uniqueList);
    }
}
