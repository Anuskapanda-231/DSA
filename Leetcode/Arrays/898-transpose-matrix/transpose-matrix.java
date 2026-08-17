class Solution {
    public int[][] transpose(int[][] matrix) {
         int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] ans = new int[cols][rows];
        
        for(int i=0;i<=rows-1;i++){
            for(int j=0;j<=cols-1;j++){
               ans[j][i]=matrix[i][j];
            }
        }
        return ans;
    }
}