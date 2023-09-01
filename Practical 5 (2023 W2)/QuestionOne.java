public class QuestionOne {
    public static void main(String[] args) {
        int[][] matrix = {
            {5, 6, 8},
            {9, 2, 3},
            {6, 5, 3}
        };

        showMatrix(matrix);
        showColumnSums(matrix);
    }

    public static void showMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public static void showColumnSums(int[][] matrix) {
        int numColumns = matrix[0].length;

        for (int col = 0; col < numColumns; col++) {
            int sum = 0;

            for (int row = 0; row < matrix.length; row++) {
                sum += matrix[row][col];
            }

            System.out.println("Column sum " + (col + 1) + ": " + sum);
        }
    }
}
