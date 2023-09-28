public class RightCylinder {
    private double height;
    private double radius;

    // Constructor
    public RightCylinder(double height, double radius) {
        if (height > 0 && radius > 0) {
            this.height = height;
            this.radius = radius;
        } else {
            System.out.println("Error: Height and radius must be greater than 0.");
            System.exit(1);
        }
    }

    // Getters and setters
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Error: Height must be greater than 0.");
            System.exit(1);
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Error: Radius must be greater than 0.");
            System.exit(1);
        }
    }

    // Calculate the volume of the cylinder
    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    // Calculate the surface area of the cylinder
    public double getSurfaceArea() {
        double baseArea = getBaseArea();
        double lateralArea = 2 * Math.PI * radius * height;
        return 2 * baseArea + lateralArea;
    }

    // Calculate the area of the base (circle)
    public double getBaseArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public String toString() {
        return "RightCylinder [height=" + height + ", radius=" + radius + "]";
    }
}