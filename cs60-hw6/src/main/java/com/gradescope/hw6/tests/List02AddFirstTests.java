package com.gradescope.hw6.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.gradescope.hw6.List;

/**
 * JUnit tests for the {@link List#addFirst(Comparable)} method.
 * 
 * @see List
 * 
 * @author HMC CS 60 Instructors
 * @version Fall 2025
 */
@TestMethodOrder(OrderAnnotation.class)
public class List02AddFirstTests {
  /** Initializes these tests. */
  public List02AddFirstTests() {
  }

  /**
   * Tests the {@link List#addFirst(Comparable)} method works correctly when
   * called once for {@link String} types.
   */
  @Test
  @Order(1)
  public void testAdd1String() {
    List<String> list = new List<String>();

    list.addFirst("a");

    assertFalse(list.isEmpty());
    assertEquals(1, list.size());
    assertEquals("( a )", list.toString());
  }

  /**
   * Tests the {@link List#addFirst(Comparable)} method works correctly when
   * called twice for {@link String} types.
   */
  @Test
  @Order(2)
  public void testAdd2Strings() {
    List<String> list = new List<String>();

    list.addFirst("b");
    list.addFirst("a");

    assertFalse(list.isEmpty());
    assertEquals(2, list.size());
    assertEquals("( a b )", list.toString());
  }

  /**
   * Tests the {@link List#addFirst(Comparable)} method works correctly when
   * called three times for {@link String} types.
   */
  @Test
  @Order(3)
  public void testAdd3Strings() {
    List<String> list = new List<String>();

    list.addFirst("c");
    list.addFirst("b");
    list.addFirst("a");

    assertFalse(list.isEmpty());
    assertEquals(3, list.size());
    assertEquals("( a b c )", list.toString());
  }

  /**
   * Tests the {@link List#addFirst(Comparable)} method works correctly when
   * called once for {@link Integer} types.
   */
  @Test
  @Order(4)
  public void testAdd1Integer() {
    List<Integer> list = new List<Integer>();

    list.addFirst(1);

    assertFalse(list.isEmpty());
    assertEquals(1, list.size());
    assertEquals("( 1 )", list.toString());
  }

  /**
   * Tests the {@link List#addFirst(Comparable)} method works correctly when
   * called once given a {@code null} value.
   */
  @Test
  @Order(5)
  public void testAddNull() {
    List<String> list = new List<String>();

    list.addFirst(null);

    assertFalse(list.isEmpty());
    assertEquals(1, list.size());
    assertEquals("( null )", list.toString());
  }
}
