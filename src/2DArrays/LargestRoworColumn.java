class LargestRoworColumnn {

	public static void findLargest(int arr[][]){
        int maxS = Integer.MIN_VALUE;
        int maxI = 0;
        String maxRc ="row";
         if(arr.length==0 ) {
            System.out.print(maxRc + " " + maxI +" " +maxS);
         return;}
        int r = arr.length;
        int c = arr[0].length;


        for( int i=0; i<r; i++){
            int sum = 0;
            for(int j=0; j<c; j++) {
                sum = sum + arr[i][j];
                }
            if(maxS < sum ) {
                maxS = sum;
                maxI = i;
                maxRc = "row";
                }}
        for(int j = 0; j<c; j++){
            int sum = 0;
            for(int i = 0; i<r; i++ ) {
                sum = sum + arr[i][j];
                }
            if(sum>maxS) {
                maxS = sum;
                maxI = j;
                maxRc = "column";
                }
            }
        System.out.print (maxRc + " " + maxI +" " + maxS);
		//Your code goes here
	}

}