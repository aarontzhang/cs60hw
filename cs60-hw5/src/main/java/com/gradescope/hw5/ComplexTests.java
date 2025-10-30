package com.gradescope.hw5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Timeout;

/**
 * Tests the {@link Complex} class.
 * 
 * @see Complex
 * 
 * @author HMC CS 60 Instructors
 * @version Fall 2025
 */
@Timeout(5)
@TestMethodOrder(OrderAnnotation.class)
public class ComplexTests {
  /**
   * Initializes this test class.
   */
  public ComplexTests() {

  }

  /*-------------------
   * constructors
   *-------------------*/

  /**
   * Tests the {@link Complex#Complex(double, double)} constructor given two
   * arguments does not throw any unexpected exceptions.
   * 
   * @see Complex#Complex(double, double)
   */
  @Test
  public void testComplex2Args() {
    new Complex(42.0, 60.0);
  }

  /**
   * Tests the {@link Complex#Complex()} default constructor does not throw any
   * unexpected exceptions.
   * 
   * @see Complex#Complex()
   */
  @Test
  public void testComplex0Args() {
    new Complex();
  }

  /*-------------------
   * getters
   *-------------------*/

  /**
   * Tests the get methods for {@code Complex} objects works as expected.
   * 
   * @see Complex#getReal()
   * @see Complex#getImaginary()
   */
  @Test
  public void testGetters() {
    Complex c1 = new Complex(42.0, 60.0);
    assertEquals(42.0, c1.getReal(), Complex.EPSILON);
    assertEquals(60.0, c1.getImaginary(), Complex.EPSILON);

    Complex c2 = new Complex();
    assertEquals(0.0, c2.getReal(), Complex.EPSILON);
    assertEquals(0.0, c2.getImaginary(), Complex.EPSILON);
  }

  /*-------------------
   * methods
   *-------------------*/

  /**
   * Tests the {@link Complex#magnitude()} method works as expected.
   * 
   * @see Complex#magnitude()
   */
  @Test
  public void testMagnitude() {
    Complex c = new Complex(3.0, 4.0);
    assertEquals(5.0, c.magnitude(), Complex.EPSILON);
  }

  /**
   * Tests the {@link Complex#negate()} method works as expected.
   * 
   * @see Complex#negate()
   */
  @Test
  public void testNegate() {
    Complex original = new Complex(2.0, 3.0);
    Complex expected = new Complex(-2.0, -3.0);
    assertEquals(expected, original.negate()); // uses c2.equals(...)
  }

  /**
   * Tests the {@link Complex#negateThis()} method works as expected.
   * 
   * @see Complex#negateThis()
   */
  @Test
  public void testNegateThis() {
    Complex original = new Complex(2.0, 3.0);
    Complex expected = new Complex(-2.0, -3.0);
    original.negateThis();
    assertEquals(expected, original); // uses c2.equals(...)
  }

  /**
   * Tests the {@link Complex#conjugate()} method works as expected.
   * 
   * @see Complex#conjugate()
   */
  @Test
  public void testConjugate() {
    Complex original = new Complex(2.0, 3.0);
    Complex expected = new Complex(2.0, -3.0);
    assertEquals(expected, original.conjugate()); // uses c2.equals(...)
  }

  /**
   * Tests the {@link Complex#conjugateThis()} method works as expected.
   * 
   * @see Complex#conjugateThis()
   */
  @Test
  public void testConjugateThis() {
    Complex original = new Complex(2.0, 3.0);
    Complex expected = new Complex(2.0, -3.0);
    original.conjugateThis();
    assertEquals(expected, original); // uses c2.equals(...)
  }

  /**
   * Tests the {@link Complex#add(Complex)} method works as expected.
   * 
   * @see Complex#add(Complex)
   */
  @Test
  public void testAdd() {
    Complex c1 = new Complex(2.0, 3.0);
    Complex c2 = new Complex(1.0, 1.0);
    Complex actual = c1.add(c2);

    // test add worked as expected
    assertEquals(3.0, actual.getReal(), Complex.EPSILON);
    assertEquals(4.0, actual.getImaginary(), Complex.EPSILON);

    // makes sure original objects are unchanged
    assertEquals(new Complex(2.0, 3.0), c1);
    assertEquals(new Complex(1.0, 1.0), c2);
  }

  /**
   * Tests the {@link Complex#addThis(Complex)} method works as expected.
   * 
   * @see Complex#addThis(Complex)
   */
  @Test
  public void testAddThis() {
    Complex c1 = new Complex(2.0, 3.0);
    Complex c2 = new Complex(1.0, 1.0);
    c1.addThis(c2);

    // test add worked as expected
    assertEquals(new Complex(3.0, 4.0), c1);
    assertEquals(3.0, c1.getReal(), Complex.EPSILON);
    assertEquals(4.0, c1.getImaginary(), Complex.EPSILON);

    // make sure second object is unchanged
    assertEquals(new Complex(1.0, 1.0), c2);
  }

  /**
   * Tests the {@link Complex#multiply(Complex)} method works as expected.
   * 
   * @see Complex#multiply(Complex)
   */
  @Test
  public void testMultiply() {
    Complex c1 = new Complex(14.64, 0.48);
    Complex c2 = new Complex(3.0, 4.0);
    Complex expected = new Complex(42.0, 60.0);
    assertEquals(expected, c1.multiply(c2)); // uses c3.equals(...)
  }

  /**
   * Tests the {@link Complex#divide(Complex)} method works as expected.
   * 
   * @see Complex#divide(Complex)
   */
  @Test
  public void testDivide() {
    Complex c1 = new Complex(42.0, 60.0);
    Complex c2 = new Complex(14.64, 0.48);
    Complex expected = new Complex(3.0, 4.0);
    assertEquals(expected, c1.divide(c2)); // uses c3.equals(...)
  }

  /**
   * Tests the {@link Complex#divide(Complex)} works as expected with
   * {@link Double#NaN} values.
   */
  @Test
  public void testDivideNaN() {
    Complex c1 = new Complex(42.0, 60.0);
    Complex c2 = new Complex(0, 0);
    Complex expected = new Complex(Double.NaN, Double.NaN);
    assertEquals(expected, c1.divide(c2)); // uses c3.equals(...)
  }
}
