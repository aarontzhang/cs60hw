package com.gradescope.hw6.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.gradescope.hw6.List;

/**
 * JUnit tests for the {@link List#merge(List)} method.
 * 
 * @see List
 * 
 * @author HMC CS 60 Instructors
 * @version Fall 2025
 */
@TestMethodOrder(OrderAnnotation.class)
public class List11MergeTests {
  /** Initializes these tests. */
  public List11MergeTests() {
  }

  /**
   * Tests the {@link List#merge(List)} method works correctly when called with
   * two empty lists.
   */
  @Test
  @Order(1)
  public void testMergeEmptyToEmpty() {
    String[] left = {};
    String[] right = {};
    String[] expected = {};

    List<String> actualLeft = List.asList(left); // actual left before merge
    List<String> actualRight = List.asList(right); // actual right before merge

    List<String> expectedLeft = List.asList(expected); // should have all items
    List<String> expectedRight = new List<String>(); // should be empty

    // trigger merge
    actualLeft.merge(actualRight);

    // make sure actual matches expected
    assertEquals(expectedLeft, actualLeft);
    assertEquals(expectedRight, actualRight);

    assertEquals(expectedLeft.size(), actualLeft.size());
    assertEquals(expectedRight.size(), actualRight.size());
  }

  /**
   * Tests the {@link List#merge(List)} method works correctly when called with
   * one empty list and one list with one element.
   */
  @Test
  @Order(2)
  public void testMergeEmptyToA() {
    String[] left = {};
    String[] right = { "A" };
    String[] expected = { "A" };

    List<String> actualLeft = List.asList(left); // actual left before merge
    List<String> actualRight = List.asList(right); // actual right before merge

    List<String> expectedLeft = List.asList(expected); // should have all items
    List<String> expectedRight = new List<String>(); // should be empty

    // trigger merge
    actualLeft.merge(actualRight);

    // make sure actual matches expected
    assertEquals(expectedLeft, actualLeft);
    assertEquals(expectedRight, actualRight);

    assertEquals(expectedLeft.size(), actualLeft.size());
    assertEquals(expectedRight.size(), actualRight.size());
  }

  /**
   * Tests the {@link List#merge(List)} method works correctly when called with
   * one empty list and one list with one element.
   */
  @Test
  @Order(3)
  public void testMergeAToEmpty() {
    String[] left = { "A" };
    String[] right = {};
    String[] expected = { "A" };

    List<String> actualLeft = List.asList(left); // actual left before merge
    List<String> actualRight = List.asList(right); // actual right before merge

    List<String> expectedLeft = List.asList(expected); // should have all items
    List<String> expectedRight = new List<String>(); // should be empty

    // trigger merge
    actualLeft.merge(actualRight);

    // make sure actual matches expected
    assertEquals(expectedLeft, actualLeft);
    assertEquals(expectedRight, actualRight);

    assertEquals(expectedLeft.size(), actualLeft.size());
    assertEquals(expectedRight.size(), actualRight.size());
  }

  /**
   * Tests the {@link List#merge(List)} method works correctly when called with
   * two lists with one element.
   */
  @Test
  @Order(4)
  public void testMergeAToB() {
    String[] left = { "A" };
    String[] right = { "B" };
    String[] expected = { "A", "B" };

    List<String> actualLeft = List.asList(left); // actual left before merge
    List<String> actualRight = List.asList(right); // actual right before merge

    List<String> expectedLeft = List.asList(expected); // should have all items
    List<String> expectedRight = new List<String>(); // should be empty

    // trigger merge
    actualLeft.merge(actualRight);

    // make sure actual matches expected
    assertEquals(expectedLeft, actualLeft);
    assertEquals(expectedRight, actualRight);

    assertEquals(expectedLeft.size(), actualLeft.size());
    assertEquals(expectedRight.size(), actualRight.size());
  }

  /**
   * Tests the {@link List#merge(List)} method works correctly when called with
   * two lists with one element.
   */
  @Test
  @Order(5)
  public void testMergeBToA() {
    String[] left = { "B" };
    String[] right = { "A" };
    String[] expected = { "A", "B" };

    List<String> actualLeft = List.asList(left); // actual left before merge
    List<String> actualRight = List.asList(right); // actual right before merge

    List<String> expectedLeft = List.asList(expected); // should have all items
    List<String> expectedRight = new List<String>(); // should be empty

    // trigger merge
    actualLeft.merge(actualRight);

    // make sure actual matches expected
    assertEquals(expectedLeft, actualLeft);
    assertEquals(expectedRight, actualRight);

    assertEquals(expectedLeft.size(), actualLeft.size());
    assertEquals(expectedRight.size(), actualRight.size());
  }

  /**
   * Tests the {@link List#merge(List)} method works correctly when called with
   * two lists of different sizes.
   */
  @Test
  @Order(6)
  public void testMergeAToBC() {
    String[] left = { "A" };
    String[] right = { "B", "C" };
    String[] expected = { "A", "B", "C" };

    List<String> actualLeft = List.asList(left); // actual left before merge
    List<String> actualRight = List.asList(right); // actual right before merge

    List<String> expectedLeft = List.asList(expected); // should have all items
    List<String> expectedRight = new List<String>(); // should be empty

    // trigger merge
    actualLeft.merge(actualRight);

    // make sure actual matches expected
    assertEquals(expectedLeft, actualLeft);
    assertEquals(expectedRight, actualRight);

    assertEquals(expectedLeft.size(), actualLeft.size());
    assertEquals(expectedRight.size(), actualRight.size());
  }

  /**
   * Tests the {@link List#merge(List)} method works correctly when called with
   * two lists of different sizes.
   */
  @Test
  @Order(7)
  public void testMergeABToC() {
    String[] left = { "A", "B" };
    String[] right = { "C" };
    String[] expected = { "A", "B", "C" };

    List<String> actualLeft = List.asList(left); // actual left before merge
    List<String> actualRight = List.asList(right); // actual right before merge

    List<String> expectedLeft = List.asList(expected); // should have all items
    List<String> expectedRight = new List<String>(); // should be empty

    // trigger merge
    actualLeft.merge(actualRight);

    // make sure actual matches expected
    assertEquals(expectedLeft, actualLeft);
    assertEquals(expectedRight, actualRight);

    assertEquals(expectedLeft.size(), actualLeft.size());
    assertEquals(expectedRight.size(), actualRight.size());
  }

  /**
   * Tests the {@link List#merge(List)} method works correctly when called with
   * two lists of the same size.
   */
  @Test
  @Order(8)
  public void testMergeABToCD() {
    String[] left = { "A", "B" };
    String[] right = { "C", "D" };
    String[] expected = { "A", "B", "C", "D" };

    List<String> actualLeft = List.asList(left); // actual left before merge
    List<String> actualRight = List.asList(right); // actual right before merge

    List<String> expectedLeft = List.asList(expected); // should have all items
    List<String> expectedRight = new List<String>(); // should be empty

    // trigger merge
    actualLeft.merge(actualRight);

    // make sure actual matches expected
    assertEquals(expectedLeft, actualLeft);
    assertEquals(expectedRight, actualRight);

    assertEquals(expectedLeft.size(), actualLeft.size());
    assertEquals(expectedRight.size(), actualRight.size());
  }

  /**
   * Tests the {@link List#merge(List)} method works correctly when called with
   * two lists of the same size.
   */
  @Test
  @Order(9)
  public void testMergeCDToAB() {
    String[] left = { "C", "D" };
    String[] right = { "A", "B" };
    String[] expected = { "A", "B", "C", "D" };

    List<String> actualLeft = List.asList(left); // actual left before merge
    List<String> actualRight = List.asList(right); // actual right before merge

    List<String> expectedLeft = List.asList(expected); // should have all items
    List<String> expectedRight = new List<String>(); // should be empty

    // trigger merge
    actualLeft.merge(actualRight);

    // make sure actual matches expected
    assertEquals(expectedLeft, actualLeft);
    assertEquals(expectedRight, actualRight);

    assertEquals(expectedLeft.size(), actualLeft.size());
    assertEquals(expectedRight.size(), actualRight.size());
  }

  /**
   * Tests the {@link List#merge(List)} method works correctly when called with
   * two lists of the same size.
   */
  @Test
  @Order(10)
  public void testMergeACToBD() {
    String[] left = { "A", "C" };
    String[] right = { "B", "D" };
    String[] expected = { "A", "B", "C", "D" };

    List<String> actualLeft = List.asList(left); // actual left before merge
    List<String> actualRight = List.asList(right); // actual right before merge

    List<String> expectedLeft = List.asList(expected); // should have all items
    List<String> expectedRight = new List<String>(); // should be empty

    // trigger merge
    actualLeft.merge(actualRight);

    // make sure actual matches expected
    assertEquals(expectedLeft, actualLeft);
    assertEquals(expectedRight, actualRight);

    assertEquals(expectedLeft.size(), actualLeft.size());
    assertEquals(expectedRight.size(), actualRight.size());
  }

  /**
   * Tests the {@link List#merge(List)} method works correctly when called with
   * two lists of the same size.
   */
  @Test
  @Order(11)
  public void testMergeADToBC() {
    String[] left = { "A", "D" };
    String[] right = { "B", "C" };
    String[] expected = { "A", "B", "C", "D" };

    List<String> actualLeft = List.asList(left); // actual left before merge
    List<String> actualRight = List.asList(right); // actual right before merge

    List<String> expectedLeft = List.asList(expected); // should have all items
    List<String> expectedRight = new List<String>(); // should be empty

    // trigger merge
    actualLeft.merge(actualRight);

    // make sure actual matches expected
    assertEquals(expectedLeft, actualLeft);
    assertEquals(expectedRight, actualRight);

    assertEquals(expectedLeft.size(), actualLeft.size());
    assertEquals(expectedRight.size(), actualRight.size());
  }

  /**
   * Tests the {@link List#merge(List)} method works correctly when called with
   * two lists of the same size.
   */
  @Test
  @Order(12)
  public void testMergeBCToAD() {
    String[] left = { "B", "C" };
    String[] right = { "A", "D" };
    String[] expected = { "A", "B", "C", "D" };

    List<String> actualLeft = List.asList(left); // actual left before merge
    List<String> actualRight = List.asList(right); // actual right before merge

    List<String> expectedLeft = List.asList(expected); // should have all items
    List<String> expectedRight = new List<String>(); // should be empty

    // trigger merge
    actualLeft.merge(actualRight);

    // make sure actual matches expected
    assertEquals(expectedLeft, actualLeft);
    assertEquals(expectedRight, actualRight);

    assertEquals(expectedLeft.size(), actualLeft.size());
    assertEquals(expectedRight.size(), actualRight.size());
  }

  /**
   * Tests the {@link List#merge(List)} method works correctly when called with
   * two lists of the same size.
   */
  @Test
  @Order(13)
  public void testMergeBDToAC() {
    String[] left = { "B", "D" };
    String[] right = { "A", "C" };
    String[] expected = { "A", "B", "C", "D" };

    List<String> actualLeft = List.asList(left); // actual left before merge
    List<String> actualRight = List.asList(right); // actual right before merge

    List<String> expectedLeft = List.asList(expected); // should have all items
    List<String> expectedRight = new List<String>(); // should be empty

    // trigger merge
    actualLeft.merge(actualRight);

    // make sure actual matches expected
    assertEquals(expectedLeft, actualLeft);
    assertEquals(expectedRight, actualRight);

    assertEquals(expectedLeft.size(), actualLeft.size());
    assertEquals(expectedRight.size(), actualRight.size());
  }

  /**
   * Tests the {@link List#merge(List)} method works correctly when called with
   * interleaved lists of different sizes and elements.
   */
  @Test
  @Order(14)
  public void testMergeInterleave() {
    String[] left = { "A", "C", "E", "G", "H", "J" };
    String[] right = { "B", "D", "F", "I" };
    String[] expected = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J" };

    List<String> actualLeft = List.asList(left); // actual left before merge
    List<String> actualRight = List.asList(right); // actual right before merge

    List<String> expectedLeft = List.asList(expected); // should have all items
    List<String> expectedRight = new List<String>(); // should be empty

    // trigger merge
    actualLeft.merge(actualRight);

    // make sure actual matches expected
    assertEquals(expectedLeft, actualLeft);
    assertEquals(expectedRight, actualRight);

    assertEquals(expectedLeft.size(), actualLeft.size());
    assertEquals(expectedRight.size(), actualRight.size());
  }

  /**
   * Tests the {@link List#merge(List)} method works correctly when called with
   * two lists with different sizes but the same element repeated.
   */
  @Test
  @Order(15)
  public void testMergeAAToAAA() {
    String[] left = { "A", "A" };
    String[] right = { "A", "A", "A" };
    String[] expected = { "A", "A", "A", "A", "A" };

    List<String> actualLeft = List.asList(left); // actual left before merge
    List<String> actualRight = List.asList(right); // actual right before merge

    List<String> expectedLeft = List.asList(expected); // should have all items
    List<String> expectedRight = new List<String>(); // should be empty

    // trigger merge
    actualLeft.merge(actualRight);

    // make sure actual matches expected
    assertEquals(expectedLeft, actualLeft);
    assertEquals(expectedRight, actualRight);

    assertEquals(expectedLeft.size(), actualLeft.size());
    assertEquals(expectedRight.size(), actualRight.size());
  }

  /**
   * Tests the {@link List#merge(List)} method works correctly when called with
   * one empty list and one list with one element. This SHOULD cause an
   * exception!
   */
  @Test
  @Order(16)
  public void testMergeAToNull() {
    String[] left = { "A" };
    String[] right = { null };

    List<String> actualLeft = List.asList(left); // actual left before merge
    List<String> actualRight = List.asList(right); // actual right before merge

    // trigger merge
    // this should trigger an exception!
    assertThrows(NullPointerException.class, // type of expected exception
        () -> actualLeft.merge(actualRight));
  }

  /**
   * Tests the {@link List#merge(List)} method works correctly when called with
   * one empty list and one list with one element. This SHOULD cause an
   * exception!
   */
  @Test
  @Order(17)
  public void testMergeNullToA() {
    String[] left = { null };
    String[] right = { "A" };

    List<String> actualLeft = List.asList(left); // actual left before merge
    List<String> actualRight = List.asList(right); // actual right before merge

    // trigger merge
    // this should trigger an exception!
    assertThrows(NullPointerException.class, // type of expected exception
        () -> actualLeft.merge(actualRight));
  }
}
