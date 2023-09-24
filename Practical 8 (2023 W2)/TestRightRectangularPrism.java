import java.util.ArrayList;
import java.util.Random;

public class TestRightRectangularPrism {
    public static void main(String[] args) {
        // Create an ArrayList to store 3D shape objects
        ArrayList<RightRectangularPrism> prismList = new ArrayList<>();

        // Create ten random RightRectangularPrism objects and add them to the list
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            double length = random.nextDouble() * 10 + 1; // Random length between 1 and 11
            double width = random.nextDouble() * 5 + 1;  // Random width between 1 and 6
            double height = random.nextDouble() * 5 + 1; // Random height between 1 and 6
            prismList.add(new RightRectangularPrism(length, width, height));
        }

        // Find the 3D shape with the largest volume
        RightRectangularPrism largestVolumePrism = getLargestVolume(prismList);
        System.out.println("Prism with the largest volume: " + largestVolumePrism);
        System.out.println("Volume: " + largestVolumePrism.getVolume());

        // Find the 3D shape with the smallest surface area
        RightRectangularPrism smallestSurfaceAreaPrism = getSmallestSurfaceArea(prismList);
        System.out.println("Prism with the smallest surface area: " + smallestSurfaceAreaPrism);
        System.out.println("Surface Area: " + smallestSurfaceAreaPrism.getSurfaceArea());
    }

    // Method to find the 3D shape with the largest volume
    public static RightRectangularPrism getLargestVolume(ArrayList<RightRectangularPrism> shapes) {
        if (shapes.isEmpty()) {
            return null;
        }

        RightRectangularPrism largestVolumeShape = shapes.get(0);
        for (RightRectangularPrism shape : shapes) {
            if (shape.getVolume() > largestVolumeShape.getVolume()) {
                largestVolumeShape = shape;
            }
        }
        return largestVolumeShape;
    }

    // Method to find the 3D shape with the smallest surface area
    public static RightRectangularPrism getSmallestSurfaceArea(ArrayList<RightRectangularPrism> shapes) {
        if (shapes.isEmpty()) {
            return null;
        }

        RightRectangularPrism smallestSurfaceAreaShape = shapes.get(0);
        for (RightRectangularPrism shape : shapes) {
            if (shape.getSurfaceArea() < smallestSurfaceAreaShape.getSurfaceArea()) {
                smallestSurfaceAreaShape = shape;
            }
        }
        return smallestSurfaceAreaShape;
    }
}

