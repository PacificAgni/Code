class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
                int rows = matrix.length;
        int cols = matrix[0].length;

        int i;
        for (i = 0; i < rows - 1; i++) {
            if (target >= matrix[i][0] && target < matrix[i + 1][0]) {
                break;
            }
        }

        // Check the last row separately
        if (i == rows - 1 && target >= matrix[i][0] && target <= matrix[i][cols - 1]) {
            return binarySearch(matrix[i], target);
        }

        return binarySearch(matrix[i], target);
    }

    private boolean binarySearch(int[] row, int target) {
        int left = 0, right = row.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (row[mid] == target) {
                return true;
            } else if (row[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}
