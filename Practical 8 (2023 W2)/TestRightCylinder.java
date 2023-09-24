import java.util.ArrayList;
import java.util.Random;

public class TestRightCylinder {
    public static void main(String[] args) {
        // Create an ArrayList to store 3D shape objects
        ArrayList<RightCylinder> rightCylinders = new ArrayList<>();

        // Create ten random RightCylinder objects and add them to the list
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            double height = random.nextDouble() * 10 + 1; // Random height between 1 and 11
            double radius = random.nextDouble() * 5 + 1; // Random radius between 1 and 6
            rightCylinders.add(new RightCylinder(height, radius));
        }

        // Find the 3D shape with the largest volume
        RightCylinder largestVolumeShape = getLargestVolume(rightCylinders);
        System.out.println("Shape with the largest volume: " + largestVolumeShape);
        System.out.println("Volume: " + largestVolumeShape.getVolume());

        // Find the 3D shape with the smallest surface area
        RightCylinder smallestSurfaceAreaShape = getSmallestSurfaceArea(rightCylinders);
        System.out.println("Shape with the smallest surface area: " + smallestSurfaceAreaShape);
        System.out.println("Surface Area: " + smallestSurfaceAreaShape.getSurfaceArea());
    }

    // Method to find the 3D shape with the largest volume
    public static RightCylinder getLargestVolume(ArrayList<RightCylinder> shapes) {
        if (shapes.isEmpty()) {
            return null;
        }

        RightCylinder largestVolumeShape = shapes.get(0);
        for (RightCylinder shape : shapes) {
            if (shape.getVolume() > largestVolumeShape.getVolume()) {
                largestVolumeShape = shape;
            }
        }
        return largestVolumeShape;
    }

    // Method to find the 3D shape with the smallest surface area
    public static RightCylinder getSmallestSurfaceArea(ArrayList<RightCylinder> shapes) {
        if (shapes.isEmpty()) {
            return null;
        }

        RightCylinder smallestSurfaceAreaShape = shapes.get(0);
        for (RightCylinder shape : shapes) {
            if (shape.getSurfaceArea() < smallestSurfaceAreaShape.getSurfaceArea()) {
                smallestSurfaceAreaShape = shape;
            }
        }
        return smallestSurfaceAreaShape;
    }
}

