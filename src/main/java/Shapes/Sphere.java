package Shapes;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Sphere implements Shape3D {
    private final double radius;

    public Sphere(double r) throws IllegalArgumentException {
        if (r == 0) {
            throw new IllegalArgumentException(
                    "Invalid sphere radius, cannot have a sphere with radius 0"
            );
        }
        if (r < 0) {
            throw new IllegalArgumentException(
                    "Invalid sphere radius, cannot have a sphere with a negative radius"
            );
        }
        if (r > 800) {
            throw new IllegalArgumentException(
                    String.format(
                            "Invalid sphere radius, radius %f is too large, much be < 800",
                            r)
            );
        }

        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double surfaceArea() throws IllegalArgumentException {
        return 4*PI*pow(radius, 2);
    }
    @Override
    public double volume() throws IllegalArgumentException {
        return (4f/3)*PI*pow(radius, 3);
    }
}
