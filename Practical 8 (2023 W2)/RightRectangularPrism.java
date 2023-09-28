class RightRectangularPrism {
    private double length;
    private double width;
    private double height;

    // Constructor
    public RightRectangularPrism(double length, double width, double height) {
        if (length > 0 && width > 0 && height > 0) {
            this.length = length;
            this.width = width;
            this.height = height;
        } else {
            System.out.println("Error: Length, width, and height must be greater than 0.");
            System.exit(1);
        }
    }

    // Getters and setters
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Error: Length must be greater than 0.");
            System.exit(1);
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Error: Width must be greater than 0.");
            System.exit(1);
        }
    }

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

    // Calculate the volume of the rectangular prism
    public double getVolume() {
        return length * width * height;
    }

    // Calculate the surface area of the rectangular prism
    public double getSurfaceArea() {
        double lw = length * width;
        double wh = width * height;
        double hl = height * length;
        return 2 * (lw + wh + hl);
    }

    // Calculate the area of the base (rectangle)
    public double getBaseArea() {
        return length * width;
    }

    public String toString() {
        return "RightRectangularPrism [length=" + length + ", width=" + width + ", height=" + height + "]";
    }
}