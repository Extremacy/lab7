import java.security.InvalidParameterException;

/**
 * Author: PJ Duimstra
 * Date: 13/3/21
 * Class that creates the Rectangle object, implementation of Shape interface.
 */

public class Rectangle implements Shape{
    private int x, y;
    private double base, height;

    /**
     * Workhorse constructor for a Rectangle object.
     *
     * @param x the x coordinate for the top left corner of the rectangle.
     * @param y the y coordinate for the top left corner of the rectangle.
     * @param base the base of the rectangle.
     * @param height the height of the rectangle.
     */
    public Rectangle(int x, int y, double base, double height) {
        this.setX(x);
        this.setY(y);
        this.setBase(base);
        this.setHeight(height);
    }

    /**
     * Getter method for the x-coordinate of a given rectangle.
     *
     * @return the x-coordinate of the upper left hand corner of the rectangle.
     */
    public int getX() {
        return x;
    }

    /**
     * Setter method for the x-coordinate of a given rectangle.
     *
     * @param x the x-coordinate of the upper left corner of the rectangle.
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Getter method for the y-coordinate of a given rectangle.
     *
     * @return the y-coordinate of the upper left hand corner of the rectangle.
     */
    public int getY() {
        return y;
    }

    /**
     * Setter method for the y-coordinate of a given rectangle.
     *
     * @param y the y-coordinate of the upper left hand corner of the rectangle.
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Getter method for the base of a given rectangle.
     *
     * @return the base of the rectangle.
     */
    public double getBase() {
        return base;
    }

    /**
     * Setter method for the base of a given rectangle.
     * (Only accepts positive values for the base)
     *
     * @param base the base of the rectangle to be set.
     */
    public void setBase(double base) {
        if (base >= 0) {
            this.base = base;
        } else {
            throw new InvalidParameterException("The base entered is invalid (" + base + ")");
        }
    }

    /**
     * Getter method for the height of a given rectangle.
     *
     * @return the height of the rectangle.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Setter method for the height of a given rectangle.
     * (Only accepts positive values for the height)
     *
     * @param height the height of the rectangle.
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
        return base * height;
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
        if (!(o instanceof Rectangle)) {
            return false;
        }

        Rectangle r = (Rectangle) o;
        return r.getHeight() == height &&
               r.getBase() == base;
    }

    /**
     * toString() override method.
     *
     * @return a formatted string displaying the information held in a given Rectangle object.
     */
    @Override
    public String toString() {
        return String.format("Rectangle [x=%d, y=%d, length=%.1f, width=%.1f]", x, y, base, height);
    }
}
