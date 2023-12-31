class Cone {
    private double height;
    private double radius;

    
    public Cone(double height, double radius) {
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

    // Calculate the volume of the cone
    public double getVolume() {
        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    }

    // Calculate the surface area of the cone
    public double getSurfaceArea() {
        double slantHeight = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        return Math.PI * radius * (radius + slantHeight);
    }

    // Calculate the area of the base (circle)
    public double getBaseArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public String toString() {
        return "Cone [height=" + height + ", radius=" + radius + "]";
    }
}
