class Solution {
    public int findNumbers(int[] arr) {
        int counts=0;
         
        
        for (int i=0; i<arr.length;i++){
               int num=arr[i];
               int digits=0 ;
            
            while(num>0){
                num = num /10 ;
                digits++ ;
            }
           if(digits % 2 ==0){
                counts++ ;
           } 
        }
        
        return counts ;
    }
}