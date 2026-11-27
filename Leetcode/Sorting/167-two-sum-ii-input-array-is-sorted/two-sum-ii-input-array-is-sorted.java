class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
      HashMap<Integer,Integer> map = new HashMap<>();

      for(int i=0;i<numbers.length;i++){
        map.put(numbers[i],i);
      }
      for(int i=0;i<numbers.length;i++){
        int lookup = target-numbers[i];

        if(map.containsKey(lookup)&& map.get(lookup)!=i){
            return new int[] {
              i+1,map.get(lookup)+1
            };
        }
      }
      return new int[] {-1,-1};
    }
}