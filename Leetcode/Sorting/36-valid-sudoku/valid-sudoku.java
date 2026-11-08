class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[][] row = new int[9][9];
        int[][] col= new int[9][9];
        int[][] box = new int[9][9];

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                int val = board[i][j]-'1';
                if(row[i][val]==1){
                    return false;
                }
                row[i][val]=1;
                if(col[j][val]==1){
                    return false;
                }
                col[j][val]=1;

                int idx = 3*(i/3)+(j/3);
                if(box[idx][val]==1){
                    return false;
                }
                box[idx][val]=1;

            }
            
        }

        return true;
    }
}