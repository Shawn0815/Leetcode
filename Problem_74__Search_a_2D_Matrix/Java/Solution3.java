package Problem_74__Search_a_2D_Matrix.Java;

public class Solution3 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowN = matrix.length;
        int colN = matrix[0].length;

        int top = 0, bottom = rowN - 1;

        // 第一個 Binary Search：找尋 target 所屬 row
        while (top <= bottom) {
            int rMiddle = (top + bottom) / 2;

            // 1. target > matrix[row][last] => row 太小，往下找
            if (target > matrix[rMiddle][colN - 1]) {
                top = rMiddle + 1;
            }
            // 2. target < matrix[row][0] => row 太大，往上找
            else if (target < matrix[rMiddle][0]) {
                bottom = rMiddle - 1;
            }
            // 3. 其餘：找到 target 所屬的 row
            else {
                break;
            }
        }

        // 若跳出迴圈 top > bottom，代表 target 超出任何 row 範圍
        if (top > bottom) {
            return false;
        }

        int row = (top + bottom) / 2;

        int left = 0, right = colN - 1;

        // 第二個 Binary Search：從該 row 裡尋找 target
        while (left <= right) {
            int cMiddle = (left + right) / 2;

            if (target == matrix[row][cMiddle]) {
                return true;
            }

            if (target < matrix[row][cMiddle]) {
                right = cMiddle - 1;
            }
            else {
                left = cMiddle + 1;
            }
        }

        return false;
    }
}
