package com.gradescope.hw6.tests;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.gradescope.hw6.List;

/**
 * JUnit tests for the {@link List#toArray()} method.
 * 
 * @see List
 * 
 * @author HMC CS 60 Instructors
 * @version Fall 2025
 */
@TestMethodOrder(OrderAnnotation.class)
public class List08ToArrayTests {
  /** Initializes these tests. */
  public List08ToArrayTests() {
  }

  /**
   * Tests the {@link List#toArray()} method works correctly when called on a
   * list with 0 items.
   */
  @Test
  @Order(1)
  public void testEmpty() {
    List<String> list = new List<String>(); // test list
    String[] expected = {}; // expected output

    String[] actual = list.toArray(); // actual output
    assertArrayEquals(expected, actual); // make sure actual matches expected
  }

  /**
   * Tests the {@link List#toArray()} method works correctly when called on a
   * list with 1 items.
   */
  @Test
  @Order(2)
  public void test1Item() {
    List<String> list = new List<String>(); // test list
    String[] expected = { "A" }; // expected output

    // setup test list
    list.addFirst("A");

    String[] actual = list.toArray(); // actual output
    assertArrayEquals(expected, actual); // make sure actual matches expected
  }

  /**
   * Tests the {@link List#toArray()} method works correctly when called on a
   * list with 2 items.
   */
  @Test
  @Order(3)
  public void test2Items() {
    List<String> list = new List<String>(); // test list
    String[] expected = { "A", "B" }; // expected output

    // setup test list
    list.addFirst("B");
    list.addFirst("A");

    String[] actual = list.toArray(); // actual output
    assertArrayEquals(expected, actual); // make sure actual matches expected
  }

  /**
   * Tests the {@link List#toArray()} method works correctly when called on a
   * list with 5 items.
   */
  @Test
  @Order(4)
  public void test5Items() {
    List<String> list = new List<String>(); // test list
    String[] expected = { "A", "B", "C", "D", "E" }; // expected output

    // setup test list
    list.addFirst("E");
    list.addFirst("D");
    list.addFirst("C");
    list.addFirst("B");
    list.addFirst("A");

    String[] actual = list.toArray(); // actual output
    assertArrayEquals(expected, actual); // make sure actual matches expected
  }

  /**
   * Tests the {@link List#toArray()} method works correctly when called on a
   * list with 1 null item.
   */
  @Test
  @Order(5)
  public void testNullItem() {
    List<String> list = new List<String>(); // test list
    String[] expected = { null }; // expected output

    // setup test list
    list.addFirst(null);

    String[] actual = list.toArray(); // actual output
    assertArrayEquals(expected, actual); // make sure actual matches expected
  }
}
