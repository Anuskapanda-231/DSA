class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int n= nums.length, sum =0, j=0;
        int minlen=Integer.MAX_VALUE;
        
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            
            while(sum>=target){
              minlen=Math.min(minlen,i-j+1);
              sum-=nums[j];
              j++;
          }
        
        }  
        return  minlen==Integer.MAX_VALUE? 0:minlen; 
        
    }
}