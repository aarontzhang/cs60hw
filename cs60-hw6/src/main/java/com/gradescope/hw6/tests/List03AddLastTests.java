package com.gradescope.hw6.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.gradescope.hw6.List;

/**
 * JUnit tests for the {@link List#addLast(Comparable)} method.
 * 
 * @see List
 * 
 * @author HMC CS 60 Instructors
 * @version Fall 2025
 */
@TestMethodOrder(OrderAnnotation.class)
public class List03AddLastTests {
  /** Initializes these tests. */
  public List03AddLastTests() {
  }

  /**
   * Tests the {@link List#addLast(Comparable)} method works correctly when called
   * to add one non-null item.
   */
  @Test
  @Order(1)
  public void testAdd1Item() {
    List<String> list = new List<String>();

    list.addLast("x");

    assertFalse(list.isEmpty());
    assertEquals(1, list.size());
    assertEquals("( x )", list.toString());
  }

  /**
   * Tests the {@link List#addLast(Comparable)} method works correctly when called
   * to add two non-null items.
   */
  @Test
  @Order(2)
  public void testAdd2Items() {
    List<String> list = new List<String>();

    list.addLast("x");
    list.addLast("y");

    assertFalse(list.isEmpty());
    assertEquals(2, list.size());
    assertEquals("( x y )", list.toString());
  }

  /**
   * Tests the {@link List#addLast(Comparable)} method works correctly when called
   * to add three non-null items.
   */
  @Test
  @Order(3)
  public void testAdd3Items() {
    List<String> list = new List<String>();

    list.addLast("x");
    list.addLast("y");
    list.addLast("z");

    assertFalse(list.isEmpty());
    assertEquals(3, list.size());
    assertEquals("( x y z )", list.toString());
  }

  /**
   * Tests the {@link List#addLast(Comparable)} method works correctly when called
   * when used alongside the {@link List#addFirst(Comparable)} method.
   */
  @Test
  @Order(4)
  public void testMixedAdds() {
    List<String> list = new List<String>();

    list.addFirst("b");
    list.addLast("y");

    list.addFirst("a");
    list.addLast("z");

    assertFalse(list.isEmpty());
    assertEquals(4, list.size());
    assertEquals("( a b y z )", list.toString());
  }

  /**
   * Tests that the two add methods {@link List#addLast(Comparable)} and
   * {@link List#addFirst(Comparable)} can be used to create equivalent lists.
   */
  @Test
  @Order(5)
  public void testEqualAdds() {
    List<String> list1 = new List<String>();
    List<String> list2 = new List<String>();

    list1.addFirst("z");
    list1.addFirst("y");
    list1.addFirst("x");

    list2.addLast("x");
    list2.addLast("y");
    list2.addLast("z");

    assertEquals(list1.size(), list2.size());
    assertEquals(list1, list2);
  }

  /**
   * Tests the {@link List#addLast(Comparable)} method works correctly when called
   * to add one null item.
   */
  @Test
  @Order(6)
  public void testAddNull() {
    List<String> list = new List<String>();

    list.addLast(null);

    assertFalse(list.isEmpty());
    assertEquals(1, list.size());
    assertEquals("( null )", list.toString());
  }

  /**
   * Tests the {@link List#addLast(Comparable)} method works correctly when called
   * to add three a mix of non-null and null items.
   */
  @Test
  @Order(7)
  public void testMixedItems() {
    List<String> list = new List<String>();

    list.addLast("x");
    list.addLast(null);
    list.addLast("z");

    assertFalse(list.isEmpty());
    assertEquals(3, list.size());
    assertEquals("( x null z )", list.toString());
  }
}
