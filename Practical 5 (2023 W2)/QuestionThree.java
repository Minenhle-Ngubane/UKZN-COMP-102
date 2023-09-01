public class QuestionThree {
    public static void main(String[] args) {
        int[][] matrix = {
            {3, 3, 7},
            {7, 8, 1},
            {0, 0, 4}
        };

        System.out.println("Matrix:");
        showMatrix(matrix);

        int[] result = findLargestRowSum(matrix);

        System.out.println("\nLargest row sum: " + result[0] + " (row " + (result[1] + 1) + ")");
    }

    public static void showMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public static int[] findLargestRowSum(int[][] matrix) {
        int largestSum = Integer.MIN_VALUE;
        int rowIndex = -1;

        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum > largestSum) {
                largestSum = rowSum;
                rowIndex = i;
            }
        }

        return new int[]{largestSum, rowIndex};
    }
}
