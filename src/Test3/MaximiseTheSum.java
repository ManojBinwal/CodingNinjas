package Test3;

public class MaximiseTheSum {
    public static long maximumSumPath(int[] input1, int[] input2) {

        long maxSum = 0;
        if(input1.length ==0 && input2.length==0){
            return maxSum; //in case both arrays are empty
        }
        long sum1 = 0;
        long sum2 = 0;
        int i=0, j=0;
        //taking sum of the elements between intersection.
        //sum1 keeps track of sum of all elements before intersection in array and sum 2 does the same in array 2
        while(i<input1.length && j<input2.length){
            //compare the elements at before intersection and add lesser one to sum
            //this ensures that you will reach common elements in both the arrays.
            if(input1[i]<input2[j]){
                sum1 += input1[i];
                i++;
            }else if(input2[j]<input1[i]){
                sum2 += input2[j];
                j++;
            //in case you reach the common element - add the common element to both the sums
            }else if(input1[i]==input2[j]){ //intersection point
                sum1 += input1[i];
                sum2 += input2[j];
                //Then compare the sum and take the maximum of the two.
                maxSum += Math.max(sum1, sum2);
                //reset both the sums
                sum1=0; //reinitialize both sums and start again
                sum2=0;
                i++;
                j++;
            }
        }
        //add all the leftover elements to both sum1 and sum 2
        while(i<input1.length){
            sum1 += input1[i];
            i++;

        }
        //System.out.println(sum1);
        while(j<input2.length){//in case there are still elements in 1st array
            sum2 += input2[j];
            j++;
        }
        //take the max of lefovers and add that to the maxsum
        // maxsum = max of ((max of sum between common elements) + (leftover elements))
        maxSum += Math.max(sum1, sum2);
        return maxSum;

    }

    public static void main(String[] args) {
       int arr1[] = {1,5,10,15,20,25};
       int arr2[] = {2,4,5,9,15};
       System.out.println(maximumSumPath(arr1,arr2));
    }
}
