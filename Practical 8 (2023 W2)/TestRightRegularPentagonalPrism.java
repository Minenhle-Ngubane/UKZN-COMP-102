public class TestRightRegularPentagonalPrism {
    public static void main(String[] args) {
        // Create an Array to store RightRegularPentagonalPrism objects
        RightRegularPentagonalPrism[] prismList = new RightRegularPentagonalPrism[10];

        // Create ten random RightRegularPentagonalPrism objects and add them to the list
        for (int i = 0; i < prismList.length; i++) {
            double sideLength = (Math.random() * 30) + 1;
            double height = (Math.random() * 26) + 1;   
            prismList[i] = new RightRegularPentagonalPrism(sideLength, height);
        }

        // Find the prism with the largest volume
        RightRegularPentagonalPrism largestVolumePrism = getLargestVolume(prismList);
        System.out.println("Prism with the largest volume: " + largestVolumePrism);
        System.out.println("Volume: " + largestVolumePrism.getVolume());

        // Find the prism with the smallest surface area
        RightRegularPentagonalPrism smallestSurfaceAreaPrism = getSmallestSurfaceArea(prismList);
        System.out.println("Prism with the smallest surface area: " + smallestSurfaceAreaPrism);
        System.out.println("Surface Area: " + smallestSurfaceAreaPrism.getSurfaceArea());
    }

    // Method to find the prism with the largest volume
    public static RightRegularPentagonalPrism getLargestVolume(RightRegularPentagonalPrism[] prisms) {
        RightRegularPentagonalPrism largestVolumePrism = prisms[0];
        for (RightRegularPentagonalPrism prism : prisms) {
            if (prism.getVolume() > largestVolumePrism.getVolume()) {
                largestVolumePrism = prism;
            }
        }
        return largestVolumePrism;
    }

    // Method to find the prism with the smallest surface area
    public static RightRegularPentagonalPrism getSmallestSurfaceArea(RightRegularPentagonalPrism[] prisms) {
        RightRegularPentagonalPrism smallestSurfaceAreaPrism = prisms[0];
        for (RightRegularPentagonalPrism prism : prisms) {
            if (prism.getSurfaceArea() < smallestSurfaceAreaPrism.getSurfaceArea()) {
                smallestSurfaceAreaPrism = prism;
            }
        }
        return smallestSurfaceAreaPrism;
    }
}