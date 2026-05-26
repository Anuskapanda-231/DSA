class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {

            // Target found
            if (matrix[row][col] == target) {
                return true;
            }

            // Move left
            else if (matrix[row][col] > target) {
                col--;
            }

            // Move down
            else {
                row++;
            }
        }

        return false;
    }
}