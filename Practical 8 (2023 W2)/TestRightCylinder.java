public class TestRightCylinder {
    public static void main(String[] args) {
        // Create an Array to store RightCylinder objects
        RightCylinder[] rightCylinders = new RightCylinder[10];

        // Create ten random RightCylinder objects and add them to the list
        for (int i = 0; i < rightCylinders.length; i++) {
            double height = (Math.random() * 30) + 1;
            double radius = (Math.random() * 26) + 1;
            rightCylinders[i] = new RightCylinder(height, radius);
        }

        // Find the cylinder with the largest volume
        RightCylinder largestVolumeCylinder = getLargestVolume(rightCylinders);
        System.out.println("Shape with the largest volume: " + largestVolumeCylinder);
        System.out.println("Volume: " + largestVolumeCylinder.getVolume());

        // Find the cylinder with the smallest surface area
        RightCylinder smallestSurfaceAreaCylinder = getSmallestSurfaceArea(rightCylinders);
        System.out.println("Shape with the smallest surface area: " + smallestSurfaceAreaCylinder);
        System.out.println("Surface Area: " + smallestSurfaceAreaCylinder.getSurfaceArea());
    }

    // Method to find the cylinder with the largest volume
    public static RightCylinder getLargestVolume(RightCylinder[] cylinders) {
        RightCylinder largestVolumeCylinder = cylinders[0];
        for (RightCylinder cylinder : cylinders) {
            if (cylinder.getVolume() > largestVolumeCylinder.getVolume()) {
                largestVolumeCylinder = cylinder;
            }
        }
        return largestVolumeCylinder;
    }

    // Method to find the cylinder with the smallest surface area
    public static RightCylinder getSmallestSurfaceArea(RightCylinder[] cylinders) {
        RightCylinder smallestSurfaceAreaCylinder = cylinders[0];
        for (RightCylinder cylinder : cylinders) {
            if (cylinder.getSurfaceArea() < smallestSurfaceAreaCylinder.getSurfaceArea()) {
                smallestSurfaceAreaCylinder = cylinder;
            }
        }
        return smallestSurfaceAreaCylinder;
    }
}