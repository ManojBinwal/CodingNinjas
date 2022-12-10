package Arrays;
/*
TC - O(N)
space - O(1)
 */
public class CheckArrayRotation {
    public static int arrayRotateCheck(int[] arr){

        int n = arr.length;
        if(n==0) {return 0;} //no array no rotation
        int min =arr[0];    //take first element to be the minimum
        for(int i=0;i<n;i++) {  //find the smallest element in the array
            if(arr[i]<min) {
                min=arr[i];

            }
        }
        //System.out.println(min);
        int i = 0; //count
        //count till you find the smallest element from the start
        while(min!=arr[i]) {
            i++;
        }
        return i;

    }

    public static void main(String[] args) {
        int[] arr = {6,7,8,9,1,2,3,4,5};
        int degree = arrayRotateCheck(arr);
        System.out.println(degree);
    }
}
