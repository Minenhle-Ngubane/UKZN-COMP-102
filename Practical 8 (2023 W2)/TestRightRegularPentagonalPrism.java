import java.util.ArrayList;
import java.util.Random;

public class TestRightRegularPentagonalPrism {
    public static void main(String[] args) {
        // Create an ArrayList to store RightRegularPentagonalPrism objects
        ArrayList<RightRegularPentagonalPrism> prismList = new ArrayList<>();

        // Create ten random RightRegularPentagonalPrism objects and add them to the list
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            double sideLength = random.nextDouble() * 10 + 1; // Random side length between 1 and 11
            double height = random.nextDouble() * 5 + 1;     // Random height between 1 and 6
            prismList.add(new RightRegularPentagonalPrism(sideLength, height));
        }

        // Find the object with the largest volume
        RightRegularPentagonalPrism largestVolumePrism = getLargestVolume(prismList);
        System.out.println("Prism with the largest volume: " + largestVolumePrism);
        System.out.println("Volume: " + largestVolumePrism.getVolume());

        // Find the object with the smallest surface area
        RightRegularPentagonalPrism smallestSurfaceAreaPrism = getSmallestSurfaceArea(prismList);
        System.out.println("Prism with the smallest surface area: " + smallestSurfaceAreaPrism);
        System.out.println("Surface Area: " + smallestSurfaceAreaPrism.getSurfaceArea());
    }

    // Method to find the object with the largest volume
    public static RightRegularPentagonalPrism getLargestVolume(ArrayList<RightRegularPentagonalPrism> prisms) {
        if (prisms.isEmpty()) {
            return null;
        }

        RightRegularPentagonalPrism largestVolumePrism = prisms.get(0);
        for (RightRegularPentagonalPrism prism : prisms) {
            if (prism.getVolume() > largestVolumePrism.getVolume()) {
                largestVolumePrism = prism;
            }
        }
        return largestVolumePrism;
    }

    // Method to find the object with the smallest surface area
    public static RightRegularPentagonalPrism getSmallestSurfaceArea(ArrayList<RightRegularPentagonalPrism> prisms) {
        if (prisms.isEmpty()) {
            return null;
        }

        RightRegularPentagonalPrism smallestSurfaceAreaPrism = prisms.get(0);
        for (RightRegularPentagonalPrism prism : prisms) {
            if (prism.getSurfaceArea() < smallestSurfaceAreaPrism.getSurfaceArea()) {
                smallestSurfaceAreaPrism = prism;
            }
        }
        return smallestSurfaceAreaPrism;
    }
}

