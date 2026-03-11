package Problem_74__Search_a_2D_Matrix.Java;

public class Solution2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowN = matrix.length;
        int colN = matrix[0].length;

        int[] arr = new int[rowN * colN];
        int index = 0;

        // 將二維矩陣轉成一維陣列
        for (int i = 0; i < rowN; i++) {
            for (int j = 0; j < colN; j++) {
                arr[index++] = matrix[i][j];
            }
        }

        int left = 0, right = arr.length - 1;

        // 針對一維陣列做 Binary Search
        while (left <= right) {
            int middle = (left + right) / 2;

            if (target == arr[middle]) {
                return true;
            }
            
            if (target < arr[middle]) {
                right = middle - 1;
            }
            else {
                left = middle + 1;
            }
        }

        return false;
    }
}
