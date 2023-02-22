package Shapes;

public class Sphere implements Shape3D {
    private double radius;

    public Sphere(double r) {
        assert false;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double surfaceArea() throws IllegalArgumentException {
        return 0;
    }
    @Override
    public double volume() throws IllegalArgumentException {
        return 0;
    }
}
