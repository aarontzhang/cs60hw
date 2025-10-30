package com.gradescope.hw5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Tests for the {@link Point} class.
 * 
 * @see Point
 * 
 * @author HMC CS 60 Instructors
 * @version Fall 2025
 */
public class PointTests {
  /**
   * Initializes this test class.
   */
  public PointTests() {

  }
  
  /**
   * Tests the {@link Point#Point(double, double)} constructor given two
   * arguments works as expected.
   * 
   * @see Point#Point(double, double)
   * @see Assertions#assertEquals(double, double, double)
   */
  @Test
  public void testPoint2Args() {
    Point p = new Point(42.0, 60.0);
    assertEquals(42.0, p.getX(), Point.EPSILON);
    assertEquals(60.0, p.getY(), Point.EPSILON);
  }

  /**
   * Tests the {@link Point#Point()} default constructor works as expected.
   * 
   * @see Point#Point()
   * @see Assertions#assertEquals(double, double, double)
   */
  @Test
  public void testPoint0Args() {
    Point p = new Point();
    assertEquals(0.0, p.getX(), Point.EPSILON);
    assertEquals(0.0, p.getY(), Point.EPSILON);
  }

  /**
   * Tests the {@link Point#equals(Object)} method works as expected.
   * 
   * @see Point#equals(Object)
   * @see Assertions#assertEquals(Object, Object)
   */
  @Test
  public void testEquals() {
    Point p1 = new Point(2.0, 3.0);
    Point p2 = new Point(2, 3);
    assertEquals(p1, p2);
  }

  /**
   * Tests the {@link Point#magnitude()} method works as expected.
   * 
   * @see Point#magnitude()
   * @see Assertions#assertEquals(double, double, double)
   */
  @Test
  public void testMagnitude() {
    Point p = new Point(2.0, 3.0);
    assertEquals(3.605551275463989, p.magnitude(), Point.EPSILON);
  }

  /**
   * Tests the {@link Point#scale(double)} method works as expected.
   * 
   * @see Point#scale(double)
   * @see Assertions#assertEquals(Object, Object)
   */
  @Test
  public void testScale() {
    double factor = 10.0;
    Point original = new Point(2.0, 3.0);
    Point actual = original.scale(factor);
    Point expected = new Point(20.0, 30.0);
    assertEquals(expected, actual); // uses c3.equals(...)
  }

  /**
   * Tests the {@link Point#add(Point)} method works as expected.
   * 
   * @see Point#add(Point)
   * @see Assertions#assertEquals(double, double, double)
   */
  @Test
  public void testAdd() {
    Point p1 = new Point(2.0, 3.0);
    Point p2 = new Point(1.0, 1.0);
    Point actual = p1.add(p2);
    assertEquals(3.0, actual.getX(), Point.EPSILON);
    assertEquals(4.0, actual.getY(), Point.EPSILON);
  }

  /**
   * Tests the {@link Point#isSmaller(Point)} method works as expected.
   * 
   * @see Point#isSmaller(Point)
   * @see Assertions#assertTrue(boolean)
   * @see Assertions#assertFalse(boolean)
   */
  @Test
  public void testIsSmaller() {
    Point p1 = new Point(2.0, 3.0);
    Point p2 = new Point(20.0, 30.0);
    assertTrue(p1.isSmaller(p2));
    assertFalse(p2.isSmaller(p1));
  }
}