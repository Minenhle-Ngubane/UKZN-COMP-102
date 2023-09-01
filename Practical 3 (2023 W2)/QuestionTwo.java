import java.util.Random;

public class QuestionTwo {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[4];
        
        Random random = new Random();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(101);
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(101);
        }
        
        int mergedLength = array1.length + array2.length;
        int[] mergedArray = new int[mergedLength];
        
        for (int i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            mergedArray[array1.length + i] = array2[i];
        }
        
        System.out.print("Array 1: ");
        for (int num : array1) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        System.out.print("Array 2: ");
        for (int num : array2) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        System.out.print("Merged array: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
