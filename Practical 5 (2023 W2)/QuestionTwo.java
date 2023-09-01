public class QuestionTwo {
    public static void main(String[] args) {
        int[][] matrix = {
            {4, 3, 4},
            {5, 4, 7},
            {9, 9, 7}
        };

        System.out.println("Original matrix:");
        showMatrix(matrix);

        int[][] transposedMatrix = transpose(matrix);

        System.out.println("\nTranspose of matrix:");
        showMatrix(transposedMatrix);
    }

    public static void showMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int[][] matrix) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;

        int[][] transposedMatrix = new int[numCols][numRows];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        return transposedMatrix;
    }
}
