import java.util.Random;

public class QuestionFour {
    public static void main(String[] args) {
        int[] array = new int[15];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        System.out.print("Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        boolean[] seen = new boolean[10];
        boolean[] isUnique = new boolean[10];

        for (int num : array) {
            if (!seen[num]) {
                seen[num] = true;
                isUnique[num] = true;
            } else {
                isUnique[num] = false;
            }
        }

        System.out.print("Unique integers: ");
        for (int i = 0; i < isUnique.length; i++) {
            if (isUnique[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
