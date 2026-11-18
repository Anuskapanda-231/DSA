class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
      
       for(int i=0;i<nums.length;i++){
           int currentnum = Math.abs(nums[i]);

           int idx = currentnum-1;

           if(nums[idx]<0){
            continue;
           }
           else{
           nums[idx]=-1*nums[idx];
           }
       } 

       List<Integer> result =new ArrayList<>();
       for(int i=0;i<nums.length;i++){
        if(nums[i]>0){
            result.add(i+1);
        }
       } 
       
    
       return result ;
    }
}