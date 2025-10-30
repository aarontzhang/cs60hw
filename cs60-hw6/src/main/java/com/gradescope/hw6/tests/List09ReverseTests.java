package com.gradescope.hw6.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.gradescope.hw6.List;

/**
 * JUnit tests for the {@link List#reverse()} method.
 * 
 * @see List
 * 
 * @author HMC CS 60 Instructors
 * @version Fall 2025
 */
@TestMethodOrder(OrderAnnotation.class)
public class List09ReverseTests {
  /** Initializes these tests. */
  public List09ReverseTests() {
  }

  /**
   * Tests the {@link List#reverse()} method works correctly when called on a
   * list with 0 items.
   */
  @Test
  @Order(1)
  public void testEmpty() {
    List<String> actual = new List<String>(); // actual list
    List<String> expected = new List<String>(); // expected list

    // reverse actual list
    actual.reverse();

    // make sure actual matches expected
    assertEquals(expected, actual);
    assertEquals(expected.size(), actual.size());
  }

  /**
   * Tests the {@link List#reverse()} method works correctly when called on a
   * list with 1 items.
   */
  @Test
  @Order(2)
  public void test1Item() {
    List<String> actual = new List<String>(); // actual list
    List<String> expected = new List<String>(); // expected list

    // setup lists
    actual.addFirst("A");
    expected.addFirst("A");

    // reverse actual list
    actual.reverse();

    // make sure actual matches expected
    assertEquals(expected, actual);
    assertEquals(expected.size(), actual.size());
  }

  /**
   * Tests the {@link List#reverse()} method works correctly when called on a
   * list with 2 items.
   */
  @Test
  @Order(3)
  public void test2Items() {
    List<String> actual = new List<String>(); // actual list
    List<String> expected = new List<String>(); // expected list

    // setup lists
    actual.addFirst("B");
    actual.addFirst("A");

    expected.addFirst("A");
    expected.addFirst("B");

    // reverse actual list
    actual.reverse();

    // make sure actual matches expected
    assertEquals(expected, actual);
    assertEquals(expected.size(), actual.size());
  }

  /**
   * Tests the {@link List#reverse()} method works correctly when called on a
   * list with 5 items.
   */
  @Test
  @Order(4)
  public void test5Items() {
    List<String> actual = new List<String>(); // actual list
    List<String> expected = new List<String>(); // expected list

    // setup lists
    actual.addFirst("E");
    actual.addFirst("D");
    actual.addFirst("C");
    actual.addFirst("B");
    actual.addFirst("A");

    expected.addFirst("A");
    expected.addFirst("B");
    expected.addFirst("C");
    expected.addFirst("D");
    expected.addFirst("E");

    // reverse actual list
    actual.reverse();

    // make sure actual matches expected
    assertEquals(expected, actual); 
    assertEquals(expected.size(), actual.size());
  }

  /**
   * Tests the {@link List#reverse()} method works correctly when called on a
   * list with 1 items.
   */
  @Test
  @Order(5)
  public void testNullItem() {
    List<String> actual = new List<String>(); // actual list
    List<String> expected = new List<String>(); // expected list

    // setup lists
    actual.addFirst(null);
    expected.addFirst(null);

    // reverse actual list
    actual.reverse();

    // make sure actual matches expected
    assertEquals(expected, actual);
    assertEquals(expected.size(), actual.size());
  }
}
