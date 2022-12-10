package Arrays;
import java.util.Arrays;
public class PushZeroToEnd {

/*
Time Complexity - O(N)
space - O(1)
 */
    public static void pushZeroAtEnd(int arr[]){
        int i=0;
        int j=1;
        int n = arr.length;
        while(i<n && j<n){
            if (arr[i] == 0 && arr[j] != 0) {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
            else if(arr[i]!=0){
                i++;
            }
            j++;
        }
    }

    public static void main(String[] args) {
        int arr1[] = {2, 0, 4, 0, 6, 0, 0, 9, 8, 10};
//        int arr2[]={1,3,5,7,9};
        pushZeroAtEnd(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
