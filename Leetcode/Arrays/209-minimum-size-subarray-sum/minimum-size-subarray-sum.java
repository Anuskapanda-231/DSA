class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int L=0 , R =0 , n= nums.length, sum =0 ;
        int minLen = Integer.MAX_VALUE;

        for(R=0 ;R<n ; R++){
            sum += nums[R];
        
              while (sum >= target) {
                minLen = Math.min(minLen, R - L + 1);
                sum -= nums[L];
                L++;
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
        
    }
}