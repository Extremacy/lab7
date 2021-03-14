/**
 * Author: PJ Duimstra
 * Date: 13/3/21
 * Shape interface for Lab 7
 */

public interface Shape {
    /**
     * Calculates the area of a given shape.
     *
     * @return the calculated area of the shape
     */

    public double getArea();

    /**
     * Scales a given shape by a given factor
     *
     * @param factor the factor to scale the shape by
     */

    public void scale(double factor);
}
