package com.gradescope.hw5;

/**
 * Represents a complex number and includes methods for performing basic
 * operations with complex numbers.
 * 
 * @author HMC CS 60 Instructors
 * @version Fall 2025
 */
public class Complex {
  /**
   * The real component. When written as {@code a + bi}, this is the {@code a}
   * component.
   */
  private double real;

  /**
   * The imaginary component. When written as {@code a + bi}, this is the
   * {@code b} component.
   */
  private double imaginary;

  /**
   * The difference at which numbers are considered equal.
   */
  public final static double EPSILON = 0.000001;

  /**
   * Initializes a new complex number at the origin.
   */
  public Complex() {
    this(0.0, 0.0); // calls generalized constructor
  }

  /**
   * Initializes a new complex number.
   * 
   * @param real      the real component
   * @param imaginary the imaginary component
   */
  public Complex(double real, double imaginary) {
    this.real = real;
    this.imaginary = imaginary;
  }

  /**
   * Returns the real component of this complex number. When written as
   * {@code a + bi}, this is the {@code a} component.
   * 
   * @return the real component
   */
  public double getReal() {
    return this.real;
  }

  /**
   * Sets the real component of this complex number. When written as
   * {@code a + bi}, this is the {@code a} component.
   * 
   * @param real the real component
   */
  public void setReal(double real) {
    this.real = real;
  }

  /**
   * Returns the imaginary component of this complex number. When written as
   * {@code a + bi}, this is the {@code b} component.
   * 
   * @return the imaginary component
   */
  public double getImaginary() {
    return this.imaginary;
  }

  /**
   * Sets the imaginary component of this complex number. When written as
   * {@code a + bi}, this is the {@code b} component.
   * 
   * @param imaginary the imaginary component
   */
  public void setImaginary(double imaginary) {
    this.imaginary = imaginary;
  }

  /**
   * Returns a string representation of this object.
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "Complex [real=" + this.real + ", imaginary=" + this.imaginary + "]";
  }

  /**
   * Compares this complex number to the specified object. The result is
   * {@code true} if and only if this {@code Complex} object represents the same
   * complex number as the specified object, up to an error margin
   * ({@link #EPSILON}).
   * 
   * @param obj the object to compare this {@code Complex} object against
   * @return {@code true} if the two {@code Complex} objects represent the same
   *         complex number, up to an error margin
   * 
   * @see #EPSILON
   */
  @Override
  public boolean equals(Object obj) {
    // See Point.equals(obj) for more details.
    if (this == obj) {
      return true;
    }

    if (obj == null) {
      return false;
    }

    if (this.getClass() != obj.getClass()) {
      return false;
    }

    Complex other = (Complex) obj;

    if (Math.abs(this.real - other.real) >= EPSILON) {
      return false;
    }

    if (Math.abs(this.imaginary - other.imaginary) >= EPSILON) {
      return false;
    }

    return true;
  }

  /**
   * Computes the magnitude of this complex number. To compute the magnitude
   * complex number:
   * 
   * <pre>
   * mag(a + bi) = square_root(a * a + b * b)
   * </pre>
   * 
   * (via the Pythagorean Theorem)
   * 
   * @return the magnitude of this complex number
   */
  public double magnitude() {
    return Math.sqrt(this.real * this.real + this.imaginary * this.imaginary);
  }

  /**
   * Negates this complex number. To negate a complex number, compute its
   * additive inverse:
   * 
   * <pre>
   * neg(a + bi) = -a - bi
   * </pre>
   * 
   * @return a new {@Code Complex} object that is the negation of this complex
   *         number
   */
  public Complex negate() {
    return new Complex(-this.real, -this.imaginary);
  }

  /**
   * Destructively negates this complex number.
   * 
   * @see #negate()
   */
  public void negateThis() {
    this.real = -this.real;
    this.imaginary = -this.imaginary;
    
  }

  /**
   * Conjugates this complex number. To conjugate complex number:
   * 
   * <pre>
   * conj(a + bi) = a - bi
   * </pre>
   * 
   * @return a new {@code Complex} object that is the conjugate of this complex
   *         number
   */
  public Complex conjugate() {
    return new Complex(this.real, -this.imaginary);
  }

  /**
   * Destructively conjugates this complex number.
   * 
   * @see #conjugate()
   */
  public void conjugateThis() {
    this.imaginary = -this.imaginary;
  }

  /**
   * Adds this complex number and another complex number. To add two complex
   * numbers:
   * 
   * <pre>
   * (a + bi) + (c + di) = (a + c) + (b + d)i
   * </pre>
   * 
   * @param other the other {@code Complex} object
   * @return a new {@code Complex} object that is the sum of this complex number
   *         and the other complex number
   */
  public Complex add(Complex other) {
    return new Complex(this.real + other.real, this.imaginary + other.imaginary);
  }

  /**
   * Destructively adds another complex number to this one. The other object
   * does not change.
   * 
   * @param other the other {@code Complex} object
   * 
   * @see #add(Complex)
   */
  public void addThis(Complex other) {
    this.real += other.real; 
    this.imaginary += other.imaginary;
  }

  /**
   * Multiples this complex number and another complex number. To multiply two
   * complex numbers:
   * 
   * <pre>
   * (a + bi) * (c + di) = ac + adi + bci + bd(i^2) = (ac - bd) + (ad + bc)i
   * </pre>
   *
   * @param other the other {@code Complex} object
   * @return a new {@code Complex} object that is the product of this complex
   *         number and the other complex number
   */
  public Complex multiply(Complex other) {
    return new Complex(this.real * other.real - this.imaginary * other.imaginary, 
        this.real * other.imaginary + this.imaginary * other.real);
  }

  /**
   * Divides this complex number by another complex number.
   * 
   * If {@code other == 0}, returns {@code Double.NaN + Double.NaN * i}.
   * 
   * To compute the quotient of two complex numbers, use the conjugate of the
   * denominator, and simplifies like so:
   * 
   * <pre>
   * a + bi
   * ------
   * c + di
   * 
   *   a + bi   c - di
   * = ------ . ------
   *   c + di   c - di
   * 
   *   ac - adi + bci - bdii
   * = ---------------------
   *         cc - ddii
   *
   *   (ac + bd) + (bc - ad)i
   * = ----------------------
   *          cc + dd
   * 
   *   (ac + bd)   (bc - ad)
   * = --------- + --------- i
   *    cc + dd     cc + dd
   * </pre>
   * 
   * @param other the other {@code Complex} object
   * @return a new {@code Complex} object that is the quotient of this number
   *         and the other complex number
   */
  public Complex divide(Complex other) {
    if (other.real == 0 && other.imaginary == 0) {
        return new Complex(Double.NaN, Double.NaN);
    }
    return new Complex(
        (this.real * other.real + this.imaginary * other.imaginary) / 
            (other.real * other.real + other.imaginary * other.imaginary),
        (this.imaginary * other.real - this.real * other.imaginary) / 
            (other.real * other.real + other.imaginary * other.imaginary)
    );
}
}
