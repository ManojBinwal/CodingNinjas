package Test3;

public class MinimumLengthWord {
    public static String minLengthWord(String input){

        int minStart = -1;
        int minLength = Integer.MAX_VALUE;
        int currentStart = 0;
        int i=0; //value of i will be needed outside the loop

        //find words using space and find current length using i
        for(;i<input.length();i++)
        {
            if(input.charAt(i)==' '){
                int currentLength = i-currentStart;
                if(currentLength<minLength){
                    minStart=currentStart;
                    minLength = currentLength;
                }
                currentStart= i+1;
            }
        }
        //come out of for loop
        if(minStart == -1){  //empty or one word
            return input;
        }else{  //check for the last word
            //i = length of string
            int currentLength = i - currentStart;
            if(currentLength<minLength){
                minStart= currentStart;
                minLength=currentLength;
            }
            //return min substring
            return input.substring(minStart, minStart+minLength);
        }
    }

    public static void main(String[] args) {
        String str = "This is a word game";
        String min = minLengthWord(str);
        System.out.println(min);
    }
}
