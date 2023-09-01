public class QuestionFour {
    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 9, 8},
            {1, 7, 9},
            {5, 3, 9}
        };

        System.out.println("Matrix 1:");
        showMatrix(matrix1);

        findDlaminiNumbers(matrix1);

        int[][] matrix2 = {
            {8, 4, 5},
            {1, 1, 1},
            {9, 0, 1}
        };

        System.out.println("\nMatrix 2:");
        showMatrix(matrix2);

        findDlaminiNumbers(matrix2);

        int[][] matrix3 = {
            {3, 2, 2, 8},
            {7, 3, 2, 2},
            {2, 7, 8, 7},
            {2, 1, 1, 0}
        };

        System.out.println("\nMatrix 3:");
        showMatrix(matrix3);

        findDlaminiNumbers(matrix3);
    }

    public static void showMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public static void findDlaminiNumbers(int[][] matrix) {
        boolean[] isDlamini = new boolean[10];

        for (int i = 0; i < isDlamini.length; i++) {
            isDlamini[i] = true;
        }

        for (int row = 0; row < matrix.length; row++) {
            boolean[] rowHasNumber = new boolean[10];
            for (int col = 0; col < matrix[row].length; col++) {
                int number = matrix[row][col];
                rowHasNumber[number] = true;
            }

            for (int i = 0; i < isDlamini.length; i++) {
                isDlamini[i] = isDlamini[i] && rowHasNumber[i];
            }
        }

        System.out.println("Dlamini number(s):");

        boolean foundDlamini = false;

        for (int i = 0; i < isDlamini.length; i++) {
            if (isDlamini[i]) {
                System.out.print(i + " ");
                foundDlamini = true;
            }
        }

        if (!foundDlamini) {
            System.out.println("There is no Dlamini number");
        } else {
            System.out.println();
        }
    }
}
