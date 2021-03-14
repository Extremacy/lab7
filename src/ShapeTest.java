import org.junit.Test;

import java.security.InvalidParameterException;

import static org.junit.Assert.*;

/**
 * Author: PJ Duimstra
 * Date: 13/3/21
 * Tester Class for Shape interface and its' implementations.
 */

public class ShapeTest {
    Rectangle rectangle = null;
    Triangle triangle = null;

    /**
     * Tester method for .getArea()
     * 1. Tests that rectangle objects return the expected area (l * w).
     * 2. Tests that triangle objects return the expected area (0.5 * l * w).
     */
    @Test
    public void testGetArea() {
        rectangle = new Rectangle(0, 0, 4, 5);
        triangle = new Triangle(4, 5);
        assertTrue(rectangle.getArea() == 20);
        assertTrue(triangle.getArea() == 10);
    }

    /**
     * Tester method for .scale()
     * 1. Tests that both Rectangle and Triangle objects throw
     *    correct exceptions for invalid scale inputs.
     * 2. Tests that valid scale inputs are correctly applied
     *    and stored in objects' instance variables.
     */
    @Test(expected = InvalidParameterException.class)
    public void testScale() {
        rectangle = new Rectangle(0, 0, 4, 5);
        triangle = new Triangle(4, 5);
        // Throws exceptions here.
        rectangle.scale(-1);
        triangle.scale(-1);

        // Checks that values were correctly changed after valid
        // scaling is applied.
        rectangle.scale(2);
        triangle.scale(2);
        assertTrue(rectangle.getBase() == 8);
        assertTrue(rectangle.getHeight() == 10);
        assertTrue(triangle.getBase() == 8);
        assertTrue(triangle.getHeight() == 10);
    }

    /**
     * Tester method for .equals() override
     * 1. Tests that two objects that are equal return correct boolean expression.
     * 2. Tests that two objects that aren't equal return correct boolean expression.
     */
    @Test
    public void testEquals() {
        rectangle = new Rectangle(0, 0, 4, 5);
        triangle = new Triangle(4, 5);
        Rectangle rectangleDup = new Rectangle(0, 0, 4, 5);
        Triangle triangleDup = new Triangle (4, 5);
        assertTrue(rectangle.equals(rectangleDup));
        assertTrue(triangle.equals(triangleDup));
        triangle.setBase(8);
        rectangle.setBase(8);
        assertFalse(rectangle.equals(rectangleDup));
        assertFalse(triangle.equals(triangleDup));
    }

    /**
     * Tester class for .toString override
     * 1. Tests an expected output and compares it to the actual output for the toString in Rectangle.java.
     * 2. Tests an expected output and compares it to the actual output for the toString in Triangle.java.
     */
    @Test
    public void testToString() {
        rectangle = new Rectangle(0, 0, 4, 5);
        triangle = new Triangle(4, 5);
        assertEquals("Rectangle: [x=0, y=0, length=4.0, width=5.0]", rectangle.toString());
        assertEquals("Triangle [base=4.0, height=5.0]", triangle.toString());
    }
}