class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
    int left =0;
    int right=numbers.length-1;
    
    while(left<right){
        int lookup = numbers[left]+numbers[right];
        if(lookup==target){
            return new int[]{left+1,right+1};
        }
        else if(lookup>target){
            right--;
        }
        else if(lookup<target){
            left++;
        }
    }
    return new int[]{-1,-1};
    }
}