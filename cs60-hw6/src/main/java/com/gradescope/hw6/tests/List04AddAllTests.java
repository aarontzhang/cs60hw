package com.gradescope.hw6.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.gradescope.hw6.List;

/**
 * JUnit tests for the {@link List#addAll(List)} method.
 * 
 * @see List
 * 
 * @author HMC CS 60 Instructors
 * @version Fall 2025
 */
@TestMethodOrder(OrderAnnotation.class)
public class List04AddAllTests {
  /** Initializes these tests. */
  public List04AddAllTests() {
  }

  /**
   * Tests the {@link List#addAll(List)} method works correctly when called to
   * add a list with 0 items to one with 0 items.
   */
  @Test
  @Order(1)
  public void testAddFrom0To0() {
    List<String> actual = new List<String>(); // actual list adding to
    List<String> from = new List<String>(); // items adding from
    List<String> copy = new List<String>(); // copy of the items adding from
    List<String> expected = new List<String>(); // expected output

    // add items to actual list
    actual.addAll(from);

    // make sure items list is not modified
    assertEquals(copy, from);
    assertEquals(copy.size(), from.size());

    // make sure actual matches expected
    assertEquals(expected, actual);
    assertEquals(expected.size(), actual.size());
  }

  /**
   * Tests the {@link List#addAll(List)} method works correctly when called to
   * add a list with 1 items to one with 0 items.
   */
  @Test
  @Order(2)
  public void testAddFrom1To0() {
    List<String> actual = new List<String>(); // actual list adding to
    List<String> from = new List<String>(); // items adding from
    List<String> copy = new List<String>(); // copy of the items adding from
    List<String> expected = new List<String>(); // expected output

    // setup lists
    from.addFirst("x");
    copy.addFirst("x");

    expected.addFirst("x");

    // add items to actual list
    actual.addAll(from);

    // make sure items list is not modified
    assertEquals(copy, from);
    assertEquals(copy.size(), from.size());

    // make sure actual matches expected
    assertEquals(expected, actual);
    assertEquals(expected.size(), actual.size());
  }

  /**
   * Tests the {@link List#addAll(List)} method works correctly when called to
   * add a list with 0 items to one with 1 items.
   */
  @Test
  @Order(3)
  public void testAddFrom0To1() {
    List<String> actual = new List<String>(); // actual list adding to
    List<String> from = new List<String>(); // items adding from
    List<String> copy = new List<String>(); // copy of the items adding from
    List<String> expected = new List<String>(); // expected output

    // setup lists
    actual.addFirst("x");
    expected.addFirst("x");

    // add items to actual list
    actual.addAll(from);

    // make sure items list is not modified
    assertEquals(copy, from);
    assertEquals(copy.size(), from.size());

    // make sure actual matches expected
    assertEquals(expected, actual);
    assertEquals(expected.size(), actual.size());
  }

  /**
   * Tests the {@link List#addAll(List)} method works correctly when called to
   * add a list with 1 items to one with 1 items.
   */
  @Test
  @Order(4)
  public void testAddFrom1To1() {
    List<String> actual = new List<String>(); // actual list adding to
    List<String> from = new List<String>(); // items adding from
    List<String> copy = new List<String>(); // copy of the items adding from
    List<String> expected = new List<String>(); // expected output

    // setup lists
    actual.addFirst("x");

    from.addFirst("y");
    copy.addFirst("y");

    expected.addFirst("y");
    expected.addFirst("x");

    // add items to actual list
    actual.addAll(from);

    // make sure items list is not modified
    assertEquals(copy, from);
    assertEquals(copy.size(), from.size());

    // make sure actual matches expected
    assertEquals(expected, actual);
    assertEquals(expected.size(), actual.size());
  }

  /**
   * Tests the {@link List#addAll(List)} method works correctly when called to
   * add a list with 3 items to one with 3 items.
   */
  @Test
  @Order(5)
  public void testAddFrom3To3() {
    List<String> actual = new List<String>(); // actual list adding to
    List<String> from = new List<String>(); // items adding from
    List<String> copy = new List<String>(); // copy of the items adding from
    List<String> expected = new List<String>(); // expected output

    // setup lists
    actual.addFirst("c");
    actual.addFirst("b");
    actual.addFirst("a");

    from.addFirst("z");
    from.addFirst("y");
    from.addFirst("x");

    copy.addFirst("z");
    copy.addFirst("y");
    copy.addFirst("x");

    expected.addFirst("z");
    expected.addFirst("y");
    expected.addFirst("x");
    expected.addFirst("c");
    expected.addFirst("b");
    expected.addFirst("a");

    // add items to actual list
    actual.addAll(from);

    // make sure items list is not modified
    assertEquals(copy, from);
    assertEquals(copy.size(), from.size());

    // make sure actual matches expected
    assertEquals(expected, actual);
    assertEquals(expected.size(), actual.size());
  }

  /**
   * Tests the {@link List#addAll(List)} method works correctly when called to
   * add a list with 1 null item to one with 1 null item.
   */
  @Test
  @Order(5)
  public void testAddNulls() {
    List<String> actual = new List<String>(); // actual list adding to
    List<String> from = new List<String>(); // items adding from
    List<String> copy = new List<String>(); // copy of the items adding from
    List<String> expected = new List<String>(); // expected output

    // setup lists
    actual.addFirst(null);
    from.addFirst(null);
    copy.addFirst(null);
    expected.addFirst(null);
    expected.addFirst(null);

    // add items to actual list
    actual.addAll(from);

    // make sure items list is not modified
    assertEquals(copy, from);
    assertEquals(copy.size(), from.size());

    // make sure actual matches expected
    assertEquals(expected, actual);
    assertEquals(expected.size(), actual.size());
  }
}
