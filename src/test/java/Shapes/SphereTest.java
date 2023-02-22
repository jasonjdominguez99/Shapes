package Shapes;

import org.junit.jupiter.api.Test;

import static java.lang.Math.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SphereTest {
    @Test
    void testInitializeSphereWithValidRadius() {
        double radius = 4.4;
        Sphere sphere = new Sphere(radius);
        assertEquals(sphere.getRadius(), radius);
    }
    @Test
    void testInitializeSphereWithNegativeRadius() {
        double radius = -4.4;
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> {
            Sphere sphere = new Sphere(radius);
        });
        assertEquals(
                "Invalid sphere radius, cannot have a sphere with a negative radius",
                e.getMessage()
        );
    }
    @Test
    void testInitializeSphereWithZeroRadius() {
        double radius = 0;
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> {
            Sphere sphere = new Sphere(radius);
        });
        assertEquals(
                "Invalid sphere radius, cannot have a sphere with radius 0",
                e.getMessage()
        );
    }
    @Test
    void testInitializeSphereWithTooLargeRadius() {
        double radius = 801;
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> {
            Sphere sphere = new Sphere(radius);
        });
        assertEquals(
                String.format("Invalid sphere radius, radius %f is too large, much be < 800", radius),
                e.getMessage()
        );
    }

    @Test
    void testCalculatingSurfaceArea() {
        double radius = 19.5f;
        double expectedSurfaceArea = 4*PI*pow(radius, 2);

        Sphere sphere = new Sphere(radius);

        assertEquals(sphere.surfaceArea(), expectedSurfaceArea);
    }

    @Test
    void testCalculatingVolume() {
        double radius = 19.5f;
        double expectedVolume = (4f/3)*PI*pow(radius, 3);

        Sphere sphere = new Sphere(radius);

        assertEquals(sphere.volume(), expectedVolume);
    }
}
