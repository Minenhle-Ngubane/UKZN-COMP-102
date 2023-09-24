import java.util.ArrayList;
import java.util.Random;

public class TestCone {
    public static void main(String[] args) {
        // Create an ArrayList to store Cone objects
        ArrayList<Cone> coneList = new ArrayList<>();

        // Create ten random Cone objects and add them to the list
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            double height = random.nextDouble() * 10 + 1; // Random height between 1 and 11
            double radius = random.nextDouble() * 5 + 1;  // Random radius between 1 and 6
            coneList.add(new Cone(height, radius));
        }

        // Find the Cone with the largest volume
        Cone largestVolumeCone = getLargestVolume(coneList);
        System.out.println("Cone with the largest volume: " + largestVolumeCone);
        System.out.println("Volume: " + largestVolumeCone.getVolume());

        // Find the Cone with the smallest surface area
        Cone smallestSurfaceAreaCone = getSmallestSurfaceArea(coneList);
        System.out.println("Cone with the smallest surface area: " + smallestSurfaceAreaCone);
        System.out.println("Surface Area: " + smallestSurfaceAreaCone.getSurfaceArea());
    }

    // Method to find the Cone with the largest volume
    public static Cone getLargestVolume(ArrayList<Cone> cones) {
        if (cones.isEmpty()) {
            return null;
        }

        Cone largestVolumeCone = cones.get(0);
        for (Cone cone : cones) {
            if (cone.getVolume() > largestVolumeCone.getVolume()) {
                largestVolumeCone = cone;
            }
        }
        return largestVolumeCone;
    }

    // Method to find the Cone with the smallest surface area
    public static Cone getSmallestSurfaceArea(ArrayList<Cone> cones) {
        if (cones.isEmpty()) {
            return null;
        }

        Cone smallestSurfaceAreaCone = cones.get(0);
        for (Cone cone : cones) {
            if (cone.getSurfaceArea() < smallestSurfaceAreaCone.getSurfaceArea()) {
                smallestSurfaceAreaCone = cone;
            }
        }
        return smallestSurfaceAreaCone;
    }
}

