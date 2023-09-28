public class TestRightRectangularPrism {
    public static void main(String[] args) {
        // Create an Array to store RightRectangularPrism objects
        RightRectangularPrism[] prismList = new RightRectangularPrism[10];

        // Create ten random RightRectangularPrism objects and add them to the list
        for (int i = 0; i < prismList.length; i++) {
            double length = (Math.random() * 30) + 1;
            double width = (Math.random() * 26) + 1;  
            double height = (Math.random() * 26) + 1; 
            prismList[i] = new RightRectangularPrism(length, width, height);
        }

        // Find the prism with the largest volume
        RightRectangularPrism largestVolumePrism = getLargestVolume(prismList);
        System.out.println("Prism with the largest volume: " + largestVolumePrism);
        System.out.println("Volume: " + largestVolumePrism.getVolume());

        // Find the prism with the smallest surface area
        RightRectangularPrism smallestSurfaceAreaPrism = getSmallestSurfaceArea(prismList);
        System.out.println("Prism with the smallest surface area: " + smallestSurfaceAreaPrism);
        System.out.println("Surface Area: " + smallestSurfaceAreaPrism.getSurfaceArea());
    }

    // Method to find the prism with the largest volume
    public static RightRectangularPrism getLargestVolume(RightRectangularPrism[] prisms) {
        RightRectangularPrism largestVolumePrism = prisms[0];
        for (RightRectangularPrism prism : prisms) {
            if (prism.getVolume() > largestVolumePrism.getVolume()) {
                largestVolumePrism = prism;
            }
        }
        return largestVolumePrism;
    }

    // Method to find the prism with the smallest surface area
    public static RightRectangularPrism getSmallestSurfaceArea(RightRectangularPrism[] prisms) {
        RightRectangularPrism smallestSurfaceAreaPrism = prisms[0];
        for (RightRectangularPrism prism : prisms) {
            if (prism.getSurfaceArea() < smallestSurfaceAreaPrism.getSurfaceArea()) {
                smallestSurfaceAreaPrism = prism;
            }
        }
        return smallestSurfaceAreaPrism;
    }
}