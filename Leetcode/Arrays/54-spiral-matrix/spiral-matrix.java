class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int minr=0;
        int minc=0;
        int maxr= matrix.length-1;
        int maxc= matrix[0].length-1;
        int cnt=0 ;
        int tln= matrix.length * matrix[0].length ;
        List<Integer> ans = new ArrayList<>();
        while(cnt<tln){
            for(int i= minr,  j=minc ;j<=maxc&&cnt<tln; j++){
                ans.add(matrix[i][j]);
                cnt++;
            }minr++;

            for(int i= minr,  j=maxc ;i<=maxr && cnt<tln; i++){
                ans.add(matrix[i][j]);
                cnt++;
            }maxc--;

           

            for(int i= maxr,  j=maxc ;j>=minc && cnt<tln;j--){
                ans.add(matrix[i][j]);
                cnt++;
            }maxr--;

            for(int i= maxr,  j=minc ;i>=minr && cnt<tln;i--){
                ans.add(matrix[i][j]);
                cnt++;
            }minc++;
        }
        return ans ;
    }
}