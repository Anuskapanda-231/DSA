class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i =0;i<matrix.length;i++){
           int le=0;
           int re= matrix[i].length-1;
            while(le<re){
                int temp = matrix[i][le];
                matrix[i][le]=matrix[i][re];
                matrix[i][re]=temp;
                le++;
                re--;
            }
        }
    }
}