package Test3;

public class FindLeadersInArray {
    public static void leaders(int[] input) {

        int max = Integer.MIN_VALUE;
        for(int i=input.length-1;i>=0;i--){
            if(input[i]>=max){
                System.out.print(input[i]+ " ");
                max = input[i];
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {13,17,5,4,6};
        leaders(arr);
    }
}
