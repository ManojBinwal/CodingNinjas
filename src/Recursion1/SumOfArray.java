package Recursion1;
/*
same as find x just add all the elements and return the sum
 */
public class SumOfArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int sum = sumOfArray(arr);
        System.out.println(sum);
    }

    public static int sumOfArray(int arr[]){
        if(arr.length==1){
            return arr[0];
        }
        int sArr[]=new int[arr.length-1];
        for(int i=0; i<sArr.length;i++){
            sArr[i]=arr[i];
        }
        return arr[arr.length-1]+ sumOfArray(sArr);
    }
}
