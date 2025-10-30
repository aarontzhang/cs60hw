package com.gradescope.hw6.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.gradescope.hw6.List;

/**
 * JUnit tests for the {@link List#asList(String[])} method.
 * 
 * @see List
 * 
 * @author HMC CS 60 Instructors
 * @version Fall 2025
 */
@TestMethodOrder(OrderAnnotation.class)
public class List07AsListTests {
  /** Initializes these tests. */
  public List07AsListTests() {
  }

  /**
   * Tests the {@link List#asList(String[])} method works correctly when called
   * on an array with 0 items.
   */
  @Test
  @Order(1)
  public void testEmpty() {
    String[] input = {}; // test input
    List<String> actual = List.asList(input); // actual output
    List<String> expected = new List<String>(); // expected output

    // make sure actual matches expected
    assertEquals(expected, actual);
    assertEquals(expected.size(), actual.size());
  }

  /**
   * Tests the {@link List#asList(String[])} method works correctly when called
   * on an array with 1 items.
   */
  @Test
  @Order(2)
  public void test1Item() {
    String[] input = { "A" }; // test input
    List<String> actual = List.asList(input); // actual output
    List<String> expected = new List<String>(); // expected output

    // setup expected lists
    expected.addFirst("A");

    // make sure actual matches expected
    assertEquals(expected, actual);
    assertEquals(expected.size(), actual.size());
  }

  /**
   * Tests the {@link List#asList(String[])} method works correctly when called
   * on an array with 2 items.
   */
  @Test
  @Order(3)
  public void test2Items() {
    String[] input = { "A", "B" }; // test input
    List<String> actual = List.asList(input); // actual output
    List<String> expected = new List<String>(); // expected output

    // setup expected lists
    expected.addFirst("B");
    expected.addFirst("A");

    // make sure actual matches expected
    assertEquals(expected, actual);
    assertEquals(expected.size(), actual.size());
  }

  /**
   * Tests the {@link List#asList(String[])} method works correctly when called
   * on an array with 5 items.
   */
  @Test
  @Order(4)
  public void test5Items() {
    String[] input = { "A", "B", "C", "D", "E" }; // test input
    List<String> actual = List.asList(input); // actual output
    List<String> expected = new List<String>(); // expected output

    // setup expected lists
    expected.addFirst("E");
    expected.addFirst("D");
    expected.addFirst("C");
    expected.addFirst("B");
    expected.addFirst("A");

    // make sure actual matches expected
    assertEquals(expected, actual);
    assertEquals(expected.size(), actual.size());
  }

  /**
   * Tests the {@link List#asList(String[])} method works correctly when called
   * on an array with 1 null item.
   */
  @Test
  @Order(5)
  public void testNullItem() {
    String[] input = { null }; // test input
    List<String> actual = List.asList(input); // actual output
    List<String> expected = new List<String>(); // expected output

    // setup expected lists
    expected.addFirst(null);

    // make sure actual matches expected
    assertEquals(expected, actual);
    assertEquals(expected.size(), actual.size());
  }
}
