class Solution {
    public int dominantIndex(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE,maxIndex=0;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
                maxIndex=i;
            }
        }
        int i=0;
        while(i<n){
            if(i==maxIndex||max>=2*nums[i]){
                i++;
            }
            else{
                return -1;
            }
        }
        return maxIndex;
    }
}