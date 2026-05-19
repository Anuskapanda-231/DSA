class Solution {
    public int[] sortedSquares(int[] arr) {
        
        int n = arr.length;
        int i=0;
        int j =n-1;
        int pos = n-1;
        int[] res = new int[n];
        
        while(i<=j){
            if(Math.abs(arr[i])> Math.abs(arr[j])){
                res[pos--] = arr[i]*arr[i];
                i++;
                
            }
           else{
               res[pos--] = arr[j]*arr[j];
               j--;
               
           }
        }
        
        return res ;
        
        
    }
}