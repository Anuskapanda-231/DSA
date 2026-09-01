class Solution {
    public int heightChecker(int[] heights) {
        
        int i=0, count =0;
        
        int [] expected = heights.clone();
        Arrays.sort(expected);
        
      while ( i< heights.length){
           if( heights[i]!=expected[i])
               count++;

        i++;   
        }
        
        return count;
        
    }
}