import java.text.DecimalFormat;

class Sphere {
    private double diameter;

    public Sphere(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double calculateVolume() {
        double radius = diameter / 2.0;
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public double calculateSurfaceArea() {
        double radius = diameter / 2.0;
        return 4.0 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("#.##");
        return "Sphere with diameter " + format.format(diameter) + ", Volume: " +
                format.format(calculateVolume()) + ", Surface Area: " +
                format.format(calculateSurfaceArea());
    }
}

public class MultiSphere {
    public static void main(String[] args) {
        Sphere sphere1 = new Sphere(5.0);
        Sphere sphere2 = new Sphere(3.5);

        System.out.println("Initial Information:");
        System.out.println("Sphere 1: " + sphere1);
        System.out.println("Sphere 2: " + sphere2);

        sphere1.setDiameter(8.0);
        sphere2.setDiameter(4.2);

        System.out.println("\nUpdated Information:");
        System.out.println("Sphere 1: " + sphere1);
        System.out.println("Sphere 2: " + sphere2);
    }
}
