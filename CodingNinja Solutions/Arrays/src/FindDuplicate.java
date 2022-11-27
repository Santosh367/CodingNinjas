public class FindDuplicate {
    public static int duplicateNumber(int arr[]) {
        //Your code goes here
        int k=0;
        int c=0;
        for(int i=0;i<arr.length;i++){
            int temp=arr[i];
            if(c==0){
                for(int j=i+1;j<arr.length;j++){
                    if(temp==arr[j]){
                        c=c+1;
                        k=arr[i];
                        break;
                    }
                }
            }
        }
        return k;
    }
}
