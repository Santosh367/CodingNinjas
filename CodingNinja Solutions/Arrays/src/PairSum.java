public class PairSum {
    public static int pairSum(int arr[], int x) {
        //Your code goes here

        int count = 0;

        for(int i=0;i<arr.length;i++){
            int temp=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(temp+arr[j]==x){
                    count=count+1;

                }
            }

        }
        return count;


    }
}
