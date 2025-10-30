package com.gradescope.hw6.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.gradescope.hw6.List;

/**
 * JUnit tests for the {@link List#mergeSort()} method.
 * 
 * @see List
 * 
 * @author HMC CS 60 Instructors
 * @version Fall 2025
 */
@TestMethodOrder(OrderAnnotation.class)
public class List12MergeSortTests {
  /** Initializes these tests. */
  public List12MergeSortTests() {
  }

  /**
   * Tests the {@link List#mergeSort()} method works correctly when called on a
   * list with no elements.
   */
  @Test
  @Order(1)
  public void testSortEmpty() {
    String[] unsorted = {};
    String[] sorted = {};

    List<String> actual = List.asList(unsorted); // actual list before sort
    List<String> expected = List.asList(sorted); // expected sorted list

    // trigger sort
    actual.mergeSort();

    // make sure actual matches expected
    assertEquals(expected, actual);
    assertEquals(expected.size(), actual.size());
  }

  /**
   * Tests the {@link List#mergeSort()} method works correctly when called on a
   * list with 1 unique element in sorted order.
   */
  @Test
  @Order(2)
  public void testSortA() {
    String[] unsorted = { "A" };
    String[] sorted = { "A" };

    List<String> actual = List.asList(unsorted); // actual list before sort
    List<String> expected = List.asList(sorted); // expected sorted list

    // trigger sort
    actual.mergeSort();

    // make sure actual matches expected
    assertEquals(expected, actual);
    assertEquals(expected.size(), actual.size());
  }

  /**
   * Tests the {@link List#mergeSort()} method works correctly when called on a
   * list with 2 unique elements in sorted order.
   */
  @Test
  @Order(3)
  public void testSortAB() {
    String[] unsorted = { "A", "B" };
    String[] sorted = { "A", "B" };

    List<String> actual = List.asList(unsorted); // actual list before sort
    List<String> expected = List.asList(sorted); // expected sorted list

    // trigger sort
    actual.mergeSort();

    // make sure actual matches expected
    assertEquals(expected, actual);
    assertEquals(expected.size(), actual.size());
  }

  /**
   * Tests the {@link List#mergeSort()} method works correctly when called on a
   * list with 2 unique elements in unsorted order.
   */
  @Test
  @Order(4)
  public void testSortBA() {
    String[] unsorted = { "B", "A" };
    String[] sorted = { "A", "B" };

    List<String> actual = List.asList(unsorted); // actual list before sort
    List<String> expected = List.asList(sorted); // expected sorted list

    // trigger sort
    actual.mergeSort();

    // make sure actual matches expected
    assertEquals(expected, actual);
    assertEquals(expected.size(), actual.size());
  }

  /**
   * Tests the {@link List#mergeSort()} method works correctly when called on a
   * list with 2 of the same element in sorted order.
   */
  @Test
  @Order(5)
  public void testSortAA() {
    String[] unsorted = { "A", "A" };
    String[] sorted = { "A", "A" };

    List<String> actual = List.asList(unsorted); // actual list before sort
    List<String> expected = List.asList(sorted); // expected sorted list

    // trigger sort
    actual.mergeSort();

    // make sure actual matches expected
    assertEquals(expected, actual);
    assertEquals(expected.size(), actual.size());
  }

  /**
   * Tests the {@link List#mergeSort()} method works correctly when called on a
   * list with 5 unique elements in sorted order.
   */
  @Test
  @Order(6)
  public void testSortABCDE() {
    String[] unsorted = { "A", "B", "C", "D", "E" };
    String[] sorted = { "A", "B", "C", "D", "E" };

    List<String> actual = List.asList(unsorted); // actual list before sort
    List<String> expected = List.asList(sorted); // expected sorted list

    // trigger sort
    actual.mergeSort();

    // make sure actual matches expected
    assertEquals(expected, actual);
    assertEquals(expected.size(), actual.size());
  }

  /**
   * Tests the {@link List#mergeSort()} method works correctly when called on a
   * list with 5 unique elements in reverse sorted order.
   */
  @Test
  @Order(7)
  public void testSortEDCBA() {
    String[] unsorted = { "E", "D", "C", "B", "A" };
    String[] sorted = { "A", "B", "C", "D", "E" };

    List<String> actual = List.asList(unsorted); // actual list before sort
    List<String> expected = List.asList(sorted); // expected sorted list

    // trigger sort
    actual.mergeSort();

    // make sure actual matches expected
    assertEquals(expected, actual);
    assertEquals(expected.size(), actual.size());
  }

  /**
   * Tests the {@link List#mergeSort()} method works correctly when called on a
   * list with 5 unique elements in unsorted order.
   */
  @Test
  @Order(8)
  public void testSortABCED() {
    String[] unsorted = { "A", "B", "C", "E", "D" };
    String[] sorted = { "A", "B", "C", "D", "E" };

    List<String> actual = List.asList(unsorted); // actual list before sort
    List<String> expected = List.asList(sorted); // expected sorted list

    // trigger sort
    actual.mergeSort();

    // make sure actual matches expected
    assertEquals(expected, actual);
    assertEquals(expected.size(), actual.size());
  }

  /**
   * Tests the {@link List#mergeSort()} method works correctly when called on a
   * list with 5 unique elements in unsorted order.
   */
  @Test
  @Order(9)
  public void testSortCADEB() {
    String[] unsorted = { "C", "A", "D", "E", "B" };
    String[] sorted = { "A", "B", "C", "D", "E" };

    List<String> actual = List.asList(unsorted); // actual list before sort
    List<String> expected = List.asList(sorted); // expected sorted list

    // trigger sort
    actual.mergeSort();

    // make sure actual matches expected
    assertEquals(expected, actual);
    assertEquals(expected.size(), actual.size());
  }

  /**
   * Tests the {@link List#mergeSort()} method works correctly when called on a
   * list with 5 of the same element in sorted order.
   */
  @Test
  @Order(10)
  public void testSortAAAAA() {
    String[] unsorted = { "A", "A", "A", "A", "A" };
    String[] sorted = { "A", "A", "A", "A", "A" };

    List<String> actual = List.asList(unsorted); // actual list before sort
    List<String> expected = List.asList(sorted); // expected sorted list

    // trigger sort
    actual.mergeSort();

    // make sure actual matches expected
    assertEquals(expected, actual);
    assertEquals(expected.size(), actual.size());
  }

  /**
   * Tests the {@link List#mergeSort()} method works correctly when called on a
   * list with 4 of the same element and 1 unique element in the wrong order.
   */
  @Test
  @Order(11)
  public void testSortZAAAA() {
    String[] unsorted = { "Z", "A", "A", "A", "A" };
    String[] sorted = { "A", "A", "A", "A", "Z" };

    List<String> actual = List.asList(unsorted); // actual list before sort
    List<String> expected = List.asList(sorted); // expected sorted list

    // trigger sort
    actual.mergeSort();

    // make sure actual matches expected
    assertEquals(expected, actual);
    assertEquals(expected.size(), actual.size());
  }

  /**
   * Tests the {@link List#mergeSort()} method works correctly when called on a
   * list with 2 null elements.
   */
  @Test
  @Order(12)
  public void testSortNulls() {
    String[] unsorted = { null, null };
    List<String> actual = List.asList(unsorted);

    // trigger merge
    // this should trigger an exception!
    assertThrows(NullPointerException.class, // type of expected exception
        () -> actual.mergeSort());
  }
}
