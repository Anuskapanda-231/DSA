class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       HashMap<Integer,Integer>  map = new HashMap<>();

       for(int i=1;i<=nums.length;i++){
        map.put(i,0);
       } 
       for(int num:nums){
        map.put(num,map.get(num)+1);
       } 
       
       List<Integer> result =new ArrayList<>();
       
       for(int i=1;i<=nums.length;i++){
        if (map.get(i)==0){
            result.add(i);
        
        }
       }
       return result ;
    }
}