package com.gradescope.hw6.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.gradescope.hw6.List;

/**
 * JUnit tests for the {@link List#split()} method.
 * 
 * @see List
 * 
 * @author HMC CS 60 Instructors
 * @version Fall 2025
 */
@TestMethodOrder(OrderAnnotation.class)
public class List10SplitTests {
  /** Initializes these tests. */
  public List10SplitTests() {
  }

  /**
   * Tests the {@link List#split()} method works correctly when called on a list
   * with 5 non-null items.
   */
  @Test
  @Order(1)
  public void testSplitEmpty() {
    List<String> actualLeft = new List<String>(); // actual left of split

    List<String> expectedLeft = new List<String>(); // expected left of split
    List<String> expectedRight = new List<String>(); // expected right of split

    // split actual list into left and right
    List<String> actualRight = actualLeft.split();

    // make sure actual matches expected
    assertEquals(expectedLeft, actualLeft);
    assertEquals(expectedRight, actualRight);

    assertEquals(expectedLeft.size(), actualLeft.size());
    assertEquals(expectedRight.size(), actualRight.size());
  }

  /**
   * Tests the {@link List#split()} method works correctly when called on a list
   * with 5 non-null items.
   */
  @Test
  @Order(2)
  public void testSplit1Item() {
    List<String> actualLeft = new List<String>(); // actual left of split

    List<String> expectedLeft = new List<String>(); // expected left of split
    List<String> expectedRight = new List<String>(); // expected right of split

    // setup starting list
    actualLeft.addFirst("Z");

    // setup expected lists
    expectedLeft.addFirst("Z");

    // split actual list into left and right
    List<String> actualRight = actualLeft.split();

    // make sure actual matches expected
    assertEquals(expectedLeft, actualLeft);
    assertEquals(expectedRight, actualRight);

    assertEquals(expectedLeft.size(), actualLeft.size());
    assertEquals(expectedRight.size(), actualRight.size());
  }

  /**
   * Tests the {@link List#split()} method works correctly when called on a list
   * with 2 non-null items.
   */
  @Test
  @Order(3)
  public void testSplit2Items() {
    List<String> actualLeft = new List<String>(); // actual left of split

    List<String> expectedLeft = new List<String>(); // expected left of split
    List<String> expectedRight = new List<String>(); // expected right of split

    // setup starting list
    actualLeft.addFirst("Z");
    actualLeft.addFirst("Y");

    // setup expected lists
    expectedRight.addFirst("Z");
    expectedLeft.addFirst("Y");

    // split actual list into left and right
    List<String> actualRight = actualLeft.split();

    // make sure actual matches expected
    assertEquals(expectedLeft, actualLeft);
    assertEquals(expectedRight, actualRight);

    assertEquals(expectedLeft.size(), actualLeft.size());
    assertEquals(expectedRight.size(), actualRight.size());
  }

  /**
   * Tests the {@link List#split()} method works correctly when called on a
   * list with 5 non-null items.
   */
  @Test
  @Order(4)
  public void testSplit5Items() {
    List<String> actualLeft = new List<String>(); // actual left of split

    List<String> expectedLeft = new List<String>(); // expected left of split
    List<String> expectedRight = new List<String>(); // expected right of split

    // setup starting list
    actualLeft.addFirst("Z");
    actualLeft.addFirst("Y");
    actualLeft.addFirst("X");
    actualLeft.addFirst("W");
    actualLeft.addFirst("V");

    // setup expected lists
    expectedRight.addFirst("Z");
    expectedRight.addFirst("Y");

    expectedLeft.addFirst("X");
    expectedLeft.addFirst("W");
    expectedLeft.addFirst("V");

    // split actual list into left and right
    List<String> actualRight = actualLeft.split();

    // make sure actual matches expected
    assertEquals(expectedLeft, actualLeft);
    assertEquals(expectedRight, actualRight);

    assertEquals(expectedLeft.size(), actualLeft.size());
    assertEquals(expectedRight.size(), actualRight.size());
  }

  /**
   * Tests the {@link List#split()} method works correctly when called on a list
   * with 5 non-null items.
   */
  @Test
  @Order(5)
  public void testSplit6Items() {
    List<String> actualLeft = new List<String>(); // actual left of split

    List<String> expectedLeft = new List<String>(); // expected left of split
    List<String> expectedRight = new List<String>(); // expected right of split

    // setup starting list
    actualLeft.addFirst("Z");
    actualLeft.addFirst("Y");
    actualLeft.addFirst("X");
    actualLeft.addFirst("W");
    actualLeft.addFirst("V");
    actualLeft.addFirst("U");

    // setup expected lists
    expectedRight.addFirst("Z");
    expectedRight.addFirst("Y");
    expectedRight.addFirst("X");

    expectedLeft.addFirst("W");
    expectedLeft.addFirst("V");
    expectedLeft.addFirst("U");

    // split actual list into left and right
    List<String> actualRight = actualLeft.split();

    // make sure actual matches expected
    assertEquals(expectedLeft, actualLeft);
    assertEquals(expectedRight, actualRight);

    assertEquals(expectedLeft.size(), actualLeft.size());
    assertEquals(expectedRight.size(), actualRight.size());
  }

  /**
   * Tests the {@link List#split()} method works correctly when called on a list
   * with 2 null items.
   */
  @Test
  @Order(6)
  public void testSplit2Nulls() {
    List<String> actualLeft = new List<String>(); // actual left of split

    List<String> expectedLeft = new List<String>(); // expected left of split
    List<String> expectedRight = new List<String>(); // expected right of split

    // setup starting list
    actualLeft.addFirst(null);
    actualLeft.addFirst(null);

    // setup expected lists
    expectedLeft.addFirst(null);
    expectedRight.addFirst(null);

    // split actual list into left and right
    List<String> actualRight = actualLeft.split();

    // make sure actual matches expected
    assertEquals(expectedLeft, actualLeft);
    assertEquals(expectedRight, actualRight);

    assertEquals(expectedLeft.size(), actualLeft.size());
    assertEquals(expectedRight.size(), actualRight.size());
  }
}
