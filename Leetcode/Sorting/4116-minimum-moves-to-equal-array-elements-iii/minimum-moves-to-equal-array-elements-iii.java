class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int num :nums){
            if(num>max){
                max=num;
            }
        }
        int count=0;
        for(int num:nums){
            if(num<max){
                count+= max-num;
            }
        }
        return count;
    }
}