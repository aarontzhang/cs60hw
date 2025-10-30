package com.gradescope.hw6.tests;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.gradescope.hw6.List;

/**
 * JUnit tests for the {@link List#removeFirst()} method.
 * 
 * @see List
 * 
 * @author HMC CS 60 Instructors
 * @version Fall 2025
 */
@TestMethodOrder(OrderAnnotation.class)
public class List05RemoveFirstTests {
  /** Initializes these tests. */
  public List05RemoveFirstTests() {
  }

  /**
   * Tests the {@link List#removeFirst()} method works correctly when called on
   * a list with 0 items. This SHOULD cause an exception!
   */
  @Test
  @Order(1)
  public void testRemove1From0() {
    List<String> actual = new List<String>(); // actual list removing from

    // this should trigger an exception!
    assertThrows(NoSuchElementException.class, () -> actual.removeFirst());
  }

  /**
   * Tests the {@link List#removeFirst()} method works correctly when called on
   * a list with 1 items.
   */
  @Test
  @Order(2)
  public void testRemove1From1() {
    List<String> actual = new List<String>(); // actual list removing from
    List<String> expected = new List<String>(); // expected list after remove

    // setup lists
    actual.addFirst("one");

    // remove item(s) from list
    String first = actual.removeFirst();

    // make sure item removed as expected
    assertEquals("one", first);

    // make sure actual matches expected
    assertEquals(expected, actual);
    assertEquals(expected.size(), actual.size());
  }

  /**
   * Tests the {@link List#removeFirst()} method works correctly when called on
   * a list with 0 items.
   */
  @Test
  @Order(3)
  public void testRemove1From2() {
    List<String> actual = new List<String>(); // actual list removing from
    List<String> expected = new List<String>(); // expected list after remove

    // setup lists
    actual.addFirst("two");
    actual.addFirst("one");

    expected.addFirst("two");

    // remove item(s) from list
    String first = actual.removeFirst();

    // make sure item removed as expected
    assertEquals("one", first);

    // make sure actual matches expected
    assertEquals(expected, actual);
    assertEquals(expected.size(), actual.size());
  }

  /**
   * Tests the {@link List#removeFirst()} method works correctly when called on
   * a list with 0 items.
   */
  @Test
  @Order(4)
  public void testRemove2From2() {
    List<String> actual = new List<String>(); // actual list removing from
    List<String> expected = new List<String>(); // expected list after remove

    // setup lists
    actual.addFirst("two");
    actual.addFirst("one");

    // remove item(s) from list
    String first = actual.removeFirst();
    String second = actual.removeFirst();

    // make sure item removed as expected
    assertEquals("one", first);
    assertEquals("two", second);

    // make sure actual matches expected
    assertEquals(expected, actual);
    assertEquals(expected.size(), actual.size());
  }

  /**
   * Tests the {@link List#removeFirst()} method works correctly when called on
   * a list with 0 items. This SHOULD cause an exception!
   */
  @Test
  @Order(5)
  public void testRemove3From2() {
    List<String> actual = new List<String>(); // actual list removing from

    // setup lists
    actual.addFirst("two");
    actual.addFirst("one");

    // remove item(s) from list
    actual.removeFirst(); // removes one
    actual.removeFirst(); // removes two, list empty

    // this should trigger an exception!
    assertThrows(NoSuchElementException.class, () -> actual.removeFirst());
  }

  /**
   * Tests the {@link List#removeFirst()} method works correctly when called on
   * a list with 1 items.
   */
  @Test
  @Order(6)
  public void testRemoveNull() {
    List<String> actual = new List<String>(); // actual list removing from
    List<String> expected = new List<String>(); // expected list after remove

    // setup lists
    actual.addFirst(null);

    // remove item(s) from list
    String first = actual.removeFirst();

    // make sure item removed as expected
    assertNull(first);

    // make sure actual matches expected
    assertEquals(expected, actual);
    assertEquals(expected.size(), actual.size());
  }
}
