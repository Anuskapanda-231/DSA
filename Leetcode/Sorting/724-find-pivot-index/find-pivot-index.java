class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int lsm=0;
        int rsm=0;

        for(int num:nums){
            rsm+=num;
        }
        int i=0;
        while(i<n){
              rsm-=nums[i];
            if(lsm==rsm){
               return i;
               
            }
            
            lsm+=nums[i];
            i++;
        }
        return -1;
    }
}