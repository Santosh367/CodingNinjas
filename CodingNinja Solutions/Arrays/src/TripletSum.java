public class TripletSum {
    public static int findTriplet(int[] arr, int x) {
        //Your code goes here
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k] == x){
                        count=count+1;
                    }
                }
            }
        }
        return count;
    }
}
