import java.util.Random;

public class QuestionOne {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            int newValue;
            boolean foundDuplicate;
            
            do {
                foundDuplicate = false;
                newValue = random.nextInt(201) + 100;
                
                for (int j = 0; j < i; j++) {
                    if (array[j] == newValue) {
                        foundDuplicate = true;
                        break;
                    }
                }
            } while (foundDuplicate);
            
            array[i] = newValue;
        }
        
        int below200 = 0;
        int multiplesOf50 = 0;
        int[] largestNumbers = new int[3];

        for (int i = 0; i < largestNumbers.length; i++) {
            largestNumbers[i] = Integer.MIN_VALUE;
        }

        for (int num : array) {
            if (num < 200) {
                below200++;
            }
            if (num % 50 == 0) {
                multiplesOf50++;
            }
            for (int i = 0; i < largestNumbers.length; i++) {
                if (num > largestNumbers[i]) {
                    for (int j = largestNumbers.length - 1; j > i; j--) {
                        largestNumbers[j] = largestNumbers[j - 1];
                    }
                    largestNumbers[i] = num;
                    break;
                }
            }
        }
 
        System.out.println(below200 + " numbers are below 200");
        System.out.println(multiplesOf50 + " numbers are multiples of 50");
        System.out.println("The three largest numbers are: " +
                largestNumbers[0] + ", " + largestNumbers[1] + ", " + largestNumbers[2]);
    }
}
