import java.security.InvalidParameterException;

/**
 * Author: PJ Duimstra
 * Date: 13/3/21
 * Class that creates the Triangle object, implementation of Shape interface.
 */

public class Triangle implements Shape{

    private double base, height;

    /**
     * Workhorse constructor for the Triangle object.
     *
     * @param base the value to be stored as the base of the triangle.
     * @param height the value to be stored as the height of the triangle.
     */
    public Triangle(double base, double height) {
        this.setBase(base);
        this.setHeight(height);
    }

    /**
     * Getter method for the base instance variable.
     *
     * @return the base of the given Triangle object.
     */
    public double getBase() {
        return base;
    }

    /**
     * Setter method for the base instance variable.
     *
     * @param base the base of the given Triangle object.
     */
    public void setBase(double base) {
        if (base >= 0) {
            this.base = base;
        } else {
            throw new InvalidParameterException("The base entered is invalid (" + base + ")");
        }
    }

    /**
     * Getter method for the height instance variable.
     *
     * @return the height of the given Triangle object.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Setter method for the height instance variable.
     *
     * @param height the height of the given Triangle object.
     */
    public void setHeight(double height) {
        if (height >= 0) {
            this.height = height;
        } else {
            throw new InvalidParameterException("The height entered is invalid (" + height + ")");
        }
    }

    /**
     * Calculates the area of a given shape.
     *
     * @return the calculated area of the shape
     */
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    /**
     * Scales a given shape by a given factor
     *
     * @param factor the factor to scale the shape by
     */
    @Override
    public void scale(double factor) {
        if (factor > 0) {
            this.setBase(factor * base);
            this.setHeight(factor * height);
        } else {
            throw new InvalidParameterException("The factor entered to scale by is invalid (" + factor + ")");
        }
    }

    /**
     * equals() override method.
     *
     * @param o the object that is being compared.
     * @return the boolean expression comparing the two objects.
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Triangle)) {
            return false;
        }
        Triangle tri = (Triangle) o;
        return tri.getBase() == base &&
               tri.getHeight() == height;
    }

    /**
     * toString() override method.
     *
     * @return a formatted string displaying the information held in a given Triangle object.
     */
    @Override
    public String toString() {
        return String.format("Triangle [base=%.1f, height=%.1f]", base, height);
    }
}
