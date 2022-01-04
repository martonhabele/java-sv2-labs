package interfaces.figure;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AreaTest {
    @Test
    void testTriangleParams() {
        Triangle triangle = new Triangle(3, 4);
        assertEquals(3, triangle.getLengthOfSide());
        assertEquals(4, triangle.getHeight());
        assertEquals(6, triangle.getArea());
    }

    @Test
    void testRectangleParams() {
        Rectangle rectangle = new Rectangle(2, 3);
        assertEquals(2, rectangle.getSideA());
        assertEquals(3, rectangle.getSideB());
        assertEquals(6, rectangle.getArea());
    }

    @Test
    void testCircleParams() {
        Circle circle = new Circle(1);
        assertEquals(1, circle.getRadius());
        assertEquals(Math.PI, circle.getArea());
    }
}