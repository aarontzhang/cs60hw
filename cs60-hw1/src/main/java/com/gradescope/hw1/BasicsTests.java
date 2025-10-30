package com.gradescope.hw1;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Tests for the {@link Basics} class.
 * 
 * @author HMC CS 60 Instructors
 * @version Fall 2025
 * 
 * @see edu.hmc.cs60
 * @see Basics
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BasicsTests {
  /**
   * Tests the {@link Basics#sleepIn(boolean, boolean)} method.
   * 
   * @param expected the expected result
   * @param weekday  the weekday to test
   * @param vacation the vacation to test
   */
  @Order(1)
  @ParameterizedTest(name = "[{index}] {arguments}")
  @CsvSource(useHeadersInDisplayName = true, textBlock = """
      expected, weekday, vacation
      true, false, false
      false, true, false
      true, false, true
      true, true, true
      """)
  public void testSleepIn(boolean expected, boolean weekday, boolean vacation) {
    boolean actual = Basics.sleepIn(weekday, vacation);
    Assertions.assertEquals(expected, actual);
  }

  /**
   * Tests the {@link Basics#makes10(int, int)} method.
   * 
   * @param expected the expected result
   * @param a        the first integer to test
   * @param b        the second integer to test
   */
  @Order(2)
  @ParameterizedTest(name = "[{index}] {arguments}")
  @CsvSource(useHeadersInDisplayName = true, textBlock = """
      expected, a, b
      true, 9, 10
      true, 1, 9
      true, 10, 1
      true, 10, 10
      true, 8, 2
      true, 10, 42
      true, 12, -2
      false, 9, 9
      false, 8, 3
      """)
  public void testMakes10(boolean expected, int a, int b) {
    boolean actual = Basics.makes10(a, b);
    Assertions.assertEquals(expected, actual);
  }

  /**
   * Tests the {@link Basics#monkeyTrouble(boolean, boolean)} method.
   * 
   * @param expected the expected result
   * @param aSmile   whether the first monkey is smiling
   * @param bSmile   whether the second monkey is smiling
   */
  @Order(3)
  @ParameterizedTest(name = "[{index}] {arguments}")
  @CsvSource(useHeadersInDisplayName = true, textBlock = """
      expected, aSmile, bSmile
      true, true, true
      true, false, false
      false, true, false
      false, false, true
      """)
  public void testMonkeyTrouble(boolean expected, boolean aSmile,
      boolean bSmile) {
    boolean actual = Basics.monkeyTrouble(aSmile, bSmile);
    Assertions.assertEquals(expected, actual);
  }

  /**
   * Tests the {@link Basics#in10to20(int, int)} method.
   * 
   * @param expected the expected result
   * @param a        the first integer
   * @param b        the second integer
   */
  @Order(4)
  @ParameterizedTest(name = "[{index}] {arguments}")
  @CsvSource(useHeadersInDisplayName = true, textBlock = """
      expected, a, b
      true, 12, 99
      true, 21, 12
      true, 99, 10
      true, 20, 20
      false, 8, 99
      false, 21, 21
      false, 9, 9
      """)
  public void testIn10to20(boolean expected, int a, int b) {
    boolean actual = Basics.in10to20(a, b);
    Assertions.assertEquals(expected, actual);
  }

  /**
   * Tests the {@link Basics#isIcyHot(int, int)} method.
   * 
   * @param expected the expected result
   * @param temp1    the first temperature
   * @param temp2    the second temperature
   */
  @Order(5)
  @ParameterizedTest(name = "[{index}] {arguments}")
  @CsvSource(useHeadersInDisplayName = true, textBlock = """
      expected, temp1, temp2
      true, 120, -1
      true, -1, 120
      false, 2, 120
      false, -1, 100
      false, -2, -2
      false, 120, 120
      """)
  public void testIsIcyHot(boolean expected, int temp1, int temp2) {
    boolean actual = Basics.isIcyHot(temp1, temp2);
    Assertions.assertEquals(expected, actual);
  }

  /**
   * Tests the {@link Basics#hasTeen(int, int, int)} method.
   * 
   * @param expected the expected result
   * @param a        the first integer
   * @param b        the second integer
   * @param c        the third integer
   */
  @Order(6)
  @ParameterizedTest(name = "[{index}] {arguments}")
  @CsvSource(useHeadersInDisplayName = true, textBlock = """
      expected, a, b, c
      true, 13, 20, 10
      true, 20, 19, 10
      true, 20, 10, 13
      true, 19, 20, 12
      true, 12, 20, 19
      true, 12, 18, 20
      true, 14, 2, 20
      false, 1, 20, 12
      false, 12, 9, 20
      false, 4, 2, 20
      false, 11, 22, 22
      """)
  public void testHasTeen(boolean expected, int a, int b, int c) {
    boolean actual = Basics.hasTeen(a, b, c);
    Assertions.assertEquals(expected, actual);
  }

  /**
   * Tests the {@link Basics#sameLastDigit(int, int)} method.
   * 
   * @param expected the expected result
   * @param a        the first integer
   * @param b        the second integer
   */
  @Order(7)
  @ParameterizedTest(name = "[{index}] {arguments}")
  @CsvSource(useHeadersInDisplayName = true, textBlock = """
      expected, a, b
      true, 7, 17
      true, 3, 113
      true, 114, 4
      true, 10, 0
      false, 114, 113
      false, 6, 17
      false, 11, 0
      """)
  public void testSameLastDigit(boolean expected, int a, int b) {
    boolean actual = Basics.sameLastDigit(a, b);
    Assertions.assertEquals(expected, actual);
  }

  /**
   * Tests the {@link Basics#isPositiveOrNegative(int, int, boolean)} method.
   * 
   * @param expected the expected result
   * @param a        the first integer
   * @param b        the second integer
   * @param negative toggles whether to test for only negative values
   */
  @Order(8)
  @ParameterizedTest(name = "[{index}] {arguments}")
  @CsvSource(useHeadersInDisplayName = true, textBlock = """
      expected, a, b, negative
      true, 1, -1, false
      true, -1, 1, false
      true, -4, -5, true
      true, -4, 5, false
      true, -1, -1, true
      true, 5, -5, false
      true, -6, 6, false
      true, -5, -5, true
      false, -4, -5, false
      false, -4, 5, true
      false, 1, 1, false
      false, -1, -1, false
      false, 1, -1, true
      false, -1, 1, true
      false, 1, 1, true
      false, -5, -6, false
      false, -2, -1, false
      false, 1, 2, false
      false, -5, 6, true
      """)
  public void testIsPositiveOrNegative(boolean expected, int a, int b,
      boolean negative) {
    boolean actual = Basics.isPositiveOrNegative(a, b, negative);
    Assertions.assertEquals(expected, actual);
  }

  /**
   * Tests the {@link Basics#calculateMax(int, int)} method.
   * 
   * @param expected the expected result
   * @param a        the first integer
   * @param b        the second integer
   */
  @Order(9)
  @ParameterizedTest(name = "[{index}] {arguments}")
  @CsvSource(useHeadersInDisplayName = true, textBlock = """
      expected, a, b
      2, 1, 2
      2, 2, 1
      23, -1, 23
      2, 2, -1
      """)
  public void testCalculateMaxTwo(int expected, int a, int b) {
    int actual = Basics.calculateMax(a, b);
    Assertions.assertEquals(expected, actual);
  }

  /**
   * Tests the {@link Basics#calculateMax(int, int, int, int)} method.
   * 
   * @param expected the expected result
   * @param a        the first integer
   * @param b        the second integer
   * @param c        the third integer
   * @param d        the fourth integer
   */
  @Order(10)
  @ParameterizedTest(name = "[{index}] {arguments}")
  @CsvSource(useHeadersInDisplayName = true, textBlock = """
      expected, a, b, c, d
      7, 7, 2, 3, 4
      4, 1, 2, 3, 4
      13, 1, 2, 13, 4
      12, 1, 12, 3, 4
      4, -11, -22, -33, 4
      7, 7, 2, 3, -4
      4, 1, -2, -13, 4
      12, 1, 12, -3, 4
      """)
  public void testCalculateMaxFour(int expected, int a, int b, int c, int d) {
    int actual = Basics.calculateMax(a, b, c, d);
    Assertions.assertEquals(expected, actual);
  }

  /**
   * Tests the {@link Basics#calculateAbsoluteMax(int, int)} method.
   * 
   * @param expected the expected result
   * @param a        the first integer
   * @param b        the second integer
   */
  @Order(11)
  @ParameterizedTest(name = "[{index}] {arguments}")
  @CsvSource(useHeadersInDisplayName = true, textBlock = """
      expected, a, b
      2, 1, 2
      2, 2, 1
      23, -1, 23
      2, 2, -1
      -2, -2, -1
      -2, -2, 1
      """)
  public void testCalculateAbsoluteMax(int expected, int a, int b) {
    int actual = Basics.calculateAbsoluteMax(a, b);
    Assertions.assertEquals(expected, actual);
  }

  /**
   * Tests the {@link Basics#calculatePerimeter(double)} method.
   * 
   * @param expected the expected result
   * @param radius   the circle radius
   */
  @Order(12)
  @ParameterizedTest(name = "[{index}] {arguments}")
  @MethodSource("perimeterProvider")
  public void testCalculatePerimeter(double expected, double radius) {
    double actual = Basics.calculatePerimeter(radius);
    Assertions.assertEquals(expected, actual);
  }

  /**
   * Returns arguments to for the
   * {@link #testCalculatePerimeter(double, double)} method.
   * 
   * @return test arguments
   */
  public static Stream<Arguments> perimeterProvider() {
    return Stream.of(Arguments.arguments(Math.PI, 0.5, 0),
        Arguments.arguments(2 * Math.PI, 1, 0));
  }
}
