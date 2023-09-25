class RightRegularPentagonalPrism {
    private double sideLength;
    private double height;

    // Constructor
    public RightRegularPentagonalPrism(double sideLength, double height) {
        if (sideLength > 0 && height > 0) {
            this.sideLength = sideLength;
            this.height = height;
        } else {
            throw new IllegalArgumentException("Side length and height must be greater than 0.");
        }
    }

    // Getters and setters
    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        if (sideLength > 0) {
            this.sideLength = sideLength;
        } else {
            throw new IllegalArgumentException("Side length must be greater than 0.");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("Height must be greater than 0.");
        }
    }

    // Calculate the area of the base (pentagon)
    public double getBaseArea() {
        double apothem = 0.5 * sideLength / Math.tan(Math.PI / 5);
        double basePerimeter = 5 * sideLength; 
        return 0.5 * basePerimeter * apothem;
    }

    // Calculate the volume of the pentagonal prism
    public double getVolume() {
        return getBaseArea() * height;
    }

    // Calculate the surface area of the pentagonal prism
    public double getSurfaceArea() {
        double baseArea = getBaseArea();
        double lateralArea = 5 * sideLength * height;
        return 2 * baseArea + lateralArea;
    }

    public String toString() {
        return "RightRegularPentagonalPrism [sideLength=" + sideLength + ", height=" + height + "]";
    }
}
