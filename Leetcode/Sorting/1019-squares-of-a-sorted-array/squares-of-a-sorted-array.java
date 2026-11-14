class Solution {
    public int[] sortedSquares(int[] arr) {
        
       int n= arr.length;
       int i=0;
       int j=n-1;
       int[] res =new int[n];
       int k=n-1;
       while(i<=j){
        if(Math.abs(arr[i])<Math.abs(arr[j])){
           res[k]=arr[j]*arr[j];
           k--;
           j--;
        }
        else{
            res[k]=arr[i]*arr[i];
            k--;
            i++;
        }
       }
        return res;
        
    }
}