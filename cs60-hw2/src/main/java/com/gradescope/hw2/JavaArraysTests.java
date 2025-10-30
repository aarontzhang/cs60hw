package com.gradescope.hw2;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * JUnit tests for the {@link JavaArrays} class.
 * 
 * @see JavaArrays
 * 
 * @author HMC CS 60 Instructors
 * @version Fall 2025
 */
@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class JavaArraysTests {
  /**
   * Initializes this class.
   */
  public JavaArraysTests() {
  }

  /**
   * Tests the {@link JavaArrays#arrayCount9(int[])} method.
   * 
   * @param nums     the test case
   * @param expected the expected value
   */
  @Order(1)
  @ParameterizedTest(name = "[{index}] {arguments}")
  @MethodSource("testArrayCount9")
  public void testArrayCount9(int[] nums, int expected) {
    assertEquals(expected, JavaArrays.arrayCount9(nums));
  }

  /**
   * Returns arguments to for the {@link #testArrayCount9(int[], int)} method.
   * 
   * @return test arguments
   */
  public static Stream<Arguments> testArrayCount9() {
    // @formatter:off
    return Stream.of(
      of(new int[] { 1, 2, 9 }, 1), 
      of(new int[] { 1, 9, 9 }, 2),
      of(new int[] { 1, 9, 9, 3, 9 }, 3),
      of(new int[] { 1, 2, 3 }, 0),
      of(new int[] {}, 0),
      of(new int[] { 4, 2, 4, 3, 1 }, 0),
      of(new int[] { 9, 2, 4, 3, 1 }, 1)
    );
    // @formatter:on
  }

  /**
   * Tests the {@link JavaArrays#arrayFront9(int[])} method.
   * 
   * @param nums     the test case
   * @param expected the expected value
   */
  @Order(2)
  @ParameterizedTest(name = "[{index}] {arguments}")
  @MethodSource("testArrayFront9")
  public void testArrayFront9(int[] nums, boolean expected) {
    assertEquals(expected, JavaArrays.arrayFront9(nums));
  }

  /**
   * Returns arguments to for the {@link #testArrayFront9(int[], boolean)}
   * method.
   * 
   * @return test arguments
   */
  public static Stream<Arguments> testArrayFront9() {
    // @formatter:off
    return Stream.of(
        of(new int[] { 1, 2, 9, 3, 4 }, true),
        of(new int[] { 9, 2, 3 }, true),
        of(new int[] { 1, 9, 9 }, true),
        of(new int[] { 1, 9 }, true),
        of(new int[] { 9 }, true),
        of(new int[] { 3, 9, 2, 3, 3 }, true),
        of(new int[] { 5, 5 }, false),
        of(new int[] { 2 }, false),
        of(new int[] { 1, 2, 3, 4, 9 }, false),
        of(new int[] { 1, 2, 3, 4, 5 }, false),
        of(new int[] { 1, 2, 3 }, false),
        of(new int[] {}, false)
    );
    // @formatter:on
  }

  /**
   * Tests the {@link JavaArrays#array123(int[])} method.
   * 
   * @param nums     the test case
   * @param expected the expected value
   */
  @Order(3)
  @ParameterizedTest(name = "[{index}] {arguments}")
  @MethodSource("testArray123")
  public void testArray123(int[] nums, boolean expected) {
    assertEquals(expected, JavaArrays.array123(nums));
  }

  /**
   * Returns arguments to for the {@link #testArray123(int[], boolean)} method.
   * 
   * @return test arguments
   */
  public static Stream<Arguments> testArray123() {
    // @formatter:off
    return Stream.of(
        of(new int[] { 1, 1, 2, 3, 1 }, true),
        of(new int[] { 1, 1, 2, 1, 2, 3 }, true),
        of(new int[] { 1, 2, 3, 1, 2, 3 }, true),
        of(new int[] { 1, 2, 3 }, true),
        of(new int[] { 1, 1, 2, 4, 1 }, false),
        of(new int[] { 1, 1, 2, 1, 2, 1 }, false),
        of(new int[] { 1, 1, 1 }, false),
        of(new int[] { 1, 2 }, false),
        of(new int[] { 1 }, false),
        of(new int[] {}, false)
    );
    // @formatter:on
  }

  /**
   * Tests the {@link JavaArrays#array667(int[])} method.
   * 
   * @param nums     the test case
   * @param expected the expected value
   */
  @Order(4)
  @ParameterizedTest(name = "[{index}] {arguments}")
  @MethodSource("testArray667")
  public void testArray667(int[] nums, int expected) {
    assertEquals(expected, JavaArrays.array667(nums));
  }

  /**
   * Returns arguments to for the {@link #testArray667(int[], int)} method.
   * 
   * @return test arguments
   */
  public static Stream<Arguments> testArray667() {
    // @formatter:off
    return Stream.of(
        of(new int[] { 1, 6, 3 }, 0),
        of(new int[] { 6, 1 }, 0),
        of(new int[] {}, 0),
        of(new int[] { 1, 2, 3, 5, 6 }, 0),
        of(new int[] { 6, 6, 2 }, 1),
        of(new int[] { 6, 6, 2, 6 }, 1),
        of(new int[] { 6, 7, 2, 6 }, 1),
        of(new int[] { 3, 6, 7, 6 }, 1),
        of(new int[] { 6, 3, 6, 6 }, 1),
        of(new int[] { 1, 2, 3, 6, 6 }, 1),
        of(new int[] { 6, 6, 2, 6, 7 }, 2),
        of(new int[] { 3, 6, 6, 7 }, 2),
        of(new int[] { 6, 7, 6, 6 }, 2)
    );
    // @formatter:on
  }

  /**
   * Tests the {@link JavaArrays#noTriples(int[])} method.
   * 
   * @param nums     the test case
   * @param expected the expected value
   */
  @Order(5)
  @ParameterizedTest(name = "[{index}] {arguments}")
  @MethodSource("testNoTriples")
  public void testNoTriples(int[] nums, boolean expected) {
    assertEquals(expected, JavaArrays.noTriples(nums));
  }

  /**
   * Returns arguments to for the {@link #testNoTriples(int[], boolean)} method.
   * 
   * @return test arguments
   */
  public static Stream<Arguments> testNoTriples() {
    // @formatter:off
    return Stream.of(
        of(new int[] { 1, 1, 2, 2, 1 }, true),
        of(new int[] { 1, 1, 2, 2, 1, 2, 1 }, true),
        of(new int[] { 1, 2, 1 }, true),
        of(new int[] { 1, 1 }, true),
        of(new int[] { 1 }, true),
        of(new int[] {}, true),
        of(new int[] { 1, 1, 2, 2, 2, 1 }, false),
        of(new int[] { 1, 1, 1, 2, 2, 2, 1 }, false),
        of(new int[] { 1, 1, 1 }, false)
    );
    // @formatter:on
  }

  /**
   * Tests the {@link JavaArrays#firstLast6(int[])} method.
   * 
   * @param nums     the test case
   * @param expected the expected value
   */
  @Order(6)
  @ParameterizedTest(name = "[{index}] {arguments}")
  @MethodSource("testFirstLast6")
  public void testFirstLast6(int[] nums, boolean expected) {
    assertEquals(expected, JavaArrays.firstLast6(nums));
  }

  /**
   * Returns arguments to for the {@link #testFirstLast6(int[], boolean)}
   * method.
   * 
   * @return test arguments
   */
  public static Stream<Arguments> testFirstLast6() {
    // @formatter:off
    return Stream.of(
        of(new int[] { 1, 2, 6 }, true),
        of(new int[] { 6, 1, 2, 3 }, true),
        of(new int[] { 13, 6, 1, 2, 6 }, true),
        of(new int[] { 3, 6 }, true),
        of(new int[] { 6 }, true),
        of(new int[] { 5, 6 }, true),
        of(new int[] { 1, 2, 3, 4, 6 }, true),
        of(new int[] { 13, 6, 1, 2, 3 }, false),
        of(new int[] { 3, 2, 1 }, false),
        of(new int[] { 3, 6, 1 }, false),
        of(new int[] { 3 }, false),
        of(new int[] { 5, 5 }, false),
        of(new int[] { 1, 2, 3, 4 }, false)
    );
    // @formatter:on
  }

  /**
   * Tests the {@link JavaArrays#sameFirstLast(int[])} method.
   * 
   * @param nums     the test case
   * @param expected the expected value
   */
  @Order(7)
  @ParameterizedTest(name = "[{index}] {arguments}")
  @MethodSource("testSameFirstLast")
  public void testSameFirstLast(int[] nums, boolean expected) {
    assertEquals(expected, JavaArrays.sameFirstLast(nums));
  }

  /**
   * Returns arguments to for the {@link #testSameFirstLast(int[], boolean)}
   * method.
   * 
   * @return test arguments
   */
  public static Stream<Arguments> testSameFirstLast() {
    // @formatter:off
    return Stream.of(
        of(new int[] { 1, 2, 3 }, false),
        of(new int[] {}, false),
        of(new int[] { 1, 2, 3, 4, 5, 13 }, false),
        of(new int[] { 1, 2, 3, 1 }, true),
        of(new int[] { 1, 2, 1 }, true),
        of(new int[] { 7 }, true),
        of(new int[] { 1, 2, 3, 4, 5, 1 }, true),
        of(new int[] { 13, 2, 3, 4, 5, 13 }, true),
        of(new int[] { 7, 7 }, true)
    );
    // @formatter:on
  }

  /**
   * Tests the {@link JavaArrays#makePi()} method.
   */
  @Order(8)
  @Test
  public void testMakePi() {
    int[] expected = { 3, 1, 4 };
    int[] actual = JavaArrays.makePi();
    assertEquals(Arrays.toString(expected), Arrays.toString(actual));
  }

  /**
   * Tests the {@link JavaArrays#commonEnd(int[], int[])} method.
   * 
   * @param a        the first test case array
   * @param b        the second test case array
   * @param expected the expected value
   */
  @Order(9)
  @ParameterizedTest(name = "[{index}] {arguments}")
  @MethodSource("testCommonEnd")
  public void testCommonEnd(int[] a, int[] b, boolean expected) {
    assertEquals(expected, JavaArrays.commonEnd(a, b));
  }

  /**
   * Returns arguments to for the {@link #testCommonEnd(int[], int[], boolean)}
   * method.
   * 
   * @return test arguments
   */
  public static Stream<Arguments> testCommonEnd() {
    // @formatter:off
    return Stream.of(
        of(new int[] { 1, 2, 3 }, new int[] { 7, 3 }, true),
        of(new int[] { 1, 2, 3 }, new int[] { 1, 3 }, true),
        of(new int[] { 1, 2, 3 }, new int[] { 1 }, true),
        of(new int[] { 1, 2, 3 }, new int[] { 7, 3, 2 }, false),
        of(new int[] { 1, 2, 3 }, new int[] { 2 }, false)
    );
    // @formatter:on
  }

  /**
   * Tests the {@link JavaArrays#sum3(int[])} method.
   * 
   * @param nums     the test case
   * @param expected the expected value
   */
  @Order(10)
  @ParameterizedTest(name = "[{index}] {arguments}")
  @MethodSource("testSum3")
  public void testSum3(int[] nums, int expected) {
    assertEquals(expected, JavaArrays.sum3(nums));
  }

  /**
   * Returns arguments to for the {@link #testSum3(int[], int)} method.
   * 
   * @return test arguments
   */
  public static Stream<Arguments> testSum3() {
    // @formatter:off
    return Stream.of(
        of(new int[] { 1, 2, 3 }, 6),
        of(new int[] { 5, 11, 2 }, 18),
        of(new int[] { 7, 0, 0 }, 7),
        of(new int[] { 1, 2, 1 }, 4),
        of(new int[] { 1, 1, 1 }, 3),
        of(new int[] { 2, 7, 2 }, 11)
    );
    // @formatter:on
  }

  /**
   * Tests the {@link JavaArrays#rotateLeft3(int[])} method.
   * 
   * @param nums     the test case
   * @param expected the expected value
   */
  @Order(11)
  @ParameterizedTest(name = "[{index}] {arguments}")
  @MethodSource("testRotateLeft3")
  public void testRotateLeft3(int[] nums, int[] expected) {
    int[] actual = JavaArrays.rotateLeft3(nums);
    assertEquals(Arrays.toString(expected), Arrays.toString(actual));
  }

  /**
   * Returns arguments to for the {@link #testRotateLeft3(int[], int[])} method.
   * 
   * @return test arguments
   */
  public static Stream<Arguments> testRotateLeft3() {
    // @formatter:off
    return Stream.of(
      of(new int[] { 1, 2, 3 }, new int[] { 2, 3, 1 }),
      of(new int[] { 5, 11, 9 }, new int[] { 11, 9, 5 }),
      of(new int[] { 7, 0, 0 }, new int[] { 0, 0, 7 }),
      of(new int[] { 1, 2, 1 }, new int[] { 2, 1, 1 }),
      of(new int[] { 0, 0, 1 }, new int[] { 0, 1, 0 })
    );
    // @formatter:on
  }

  /**
   * Tests the {@link JavaArrays#countEvens(int[])} method.
   * 
   * @param nums     the test case
   * @param expected the expected value
   */
  @Order(12)
  @ParameterizedTest(name = "[{index}] {arguments}")
  @MethodSource("testCountEvens")
  public void testCountEvens(int[] nums, int expected) {
    assertEquals(expected, JavaArrays.countEvens(nums));
  }

  /**
   * Returns arguments to for the {@link #testCountEvens(int[], int)} method.
   * 
   * @return test arguments
   */
  public static Stream<Arguments> testCountEvens() {
    // @formatter:off
    return Stream.of(
        of(new int[] { 2, 1, 2, 3, 4 }, 3),
        of(new int[] { 2, 2, 0 }, 3),
        of(new int[] { 1, 3, 5 }, 0),
        of(new int[] {}, 0),
        of(new int[] { 11, 9, 0, 1 }, 1),
        of(new int[] { 2, 11, 9, 0 }, 2),
        of(new int[] { 2 }, 1),
        of(new int[] { 2, 5, 12 }, 2)
    );
    // @formatter:on
  }

  /**
   * Tests the {@link JavaArrays#bigDiff(int[])} method.
   * 
   * @param nums     the test case
   * @param expected the expected value
   */
  @Order(13)
  @ParameterizedTest(name = "[{index}] {arguments}")
  @MethodSource("testBigDiff")
  public void testBigDiff(int[] nums, int expected) {
    assertEquals(expected, JavaArrays.bigDiff(nums));
  }

  /**
   * Returns arguments to for the {@link #testBigDiff(int[], int)} method.
   * 
   * @return test arguments
   */
  public static Stream<Arguments> testBigDiff() {
    // @formatter:off
    return Stream.of(
        of(new int[] { 10, 3, 5, 6 }, 7),
        of(new int[] { 7, 2, 10, 9 }, 8),
        of(new int[] { 2, 10, 7, 2 }, 8),
        of(new int[] { 2, 10 }, 8),
        of(new int[] { 10, 2 }, 8),
        of(new int[] { 10, 0 }, 10),
        of(new int[] { 2, 3 }, 1),
        of(new int[] { 7, 7, 6, 8, 5, 5, 6 }, 3),
        of(new int[] { 2, 2 }, 0),
        of(new int[] { 5, 1, 6, 1, 9, 9 }, 8),
        of(new int[] { 7, 6, 8, 5 }, 3)
    );
    // @formatter:on
  }

  /**
   * Tests the {@link JavaArrays#centeredAverage(int[])} method.
   * 
   * @param nums     the test case
   * @param expected the expected value
   */
  @Order(14)
  @ParameterizedTest(name = "[{index}] {arguments}")
  @MethodSource("testCenteredAverage")
  public void testCenteredAverage(int[] nums, int expected) {
    assertEquals(expected, JavaArrays.centeredAverage(nums));
  }

  /**
   * Returns arguments to for the {@link #testCenteredAverage(int[], int)}
   * method.
   * 
   * @return test arguments
   */
  public static Stream<Arguments> testCenteredAverage() {
    // @formatter:off
    return Stream.of(
        of(new int[] { -10, -4, -2, -4, -2, 0 }, -3),
        of(new int[] { 1, 1, 5, 5, 10, 8, 7 }, 5),
        of(new int[] { 5, 3, 4, 6, 2 }, 4),
        of(new int[] { 5, 3, 4, 0, 100 }, 4),
        of(new int[] { 100, 0, 5, 3, 4 }, 4),
        of(new int[] { 4, 0, 100 }, 4),
        of(new int[] { 0, 2, 3, 4, 100 }, 3),
        of(new int[] { 1, 1, 100 }, 1),
        of(new int[] { 7, 7, 7 }, 7),
        of(new int[] { 1, 7, 8 }, 7),
        of(new int[] { 1, 1, 99, 99 }, 50),
        of(new int[] { 1000, 0, 1, 99 }, 50),
        of(new int[] { 4, 4, 4, 4, 5 }, 4),
        of(new int[] { 4, 4, 4, 1, 5 }, 4),
        of(new int[] { 6, 4, 8, 12, 3 }, 6),
        of(new int[] { 1, 2, 3, 4, 100 }, 3)
    );
    // @formatter:on
  }
}
