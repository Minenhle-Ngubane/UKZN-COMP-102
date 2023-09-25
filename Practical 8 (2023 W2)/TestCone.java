public class TestCone {
    public static void main(String[] args) {
        // Create an Array to store Cone objects
        Cone[] coneList = new Cone[10];

        // Create ten random Cone objects and add them to the list
        for (int i = 0; i < coneList.length; i++) {
            double height = Math.random() * 30;
            double radius = Math.random() * 26;
            coneList[i] = new Cone(height, radius);
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
    public static Cone getLargestVolume(Cone[] cones) {
        Cone largestVolumeCone = cones[0];
        for (Cone cone : cones) {
            if (cone.getVolume() > largestVolumeCone.getVolume()) {
                largestVolumeCone = cone;
            }
        }
        return largestVolumeCone;
    }

    // Method to find the Cone with the smallest surface area
    public static Cone getSmallestSurfaceArea(Cone[] cones) {
        Cone smallestSurfaceAreaCone = cones[0];
        for (Cone cone : cones) {
            if (cone.getSurfaceArea() < smallestSurfaceAreaCone.getSurfaceArea()) {
                smallestSurfaceAreaCone = cone;
            }
        }
        return smallestSurfaceAreaCone;
    }
}