package com.gradescope.hw6.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.gradescope.hw6.Dog;
import com.gradescope.hw6.List;

/**
 * JUnit tests for the {@link List#List()} constructor and
 * {@link List#equals(Object)} method for different types.
 * 
 * <p>
 * Requires the {@link List#addFirst(Comparable)} method to work properly.
 * 
 * @see List
 * 
 * @author HMC CS 60 Instructors
 * @version Fall 2025
 */
@TestMethodOrder(OrderAnnotation.class)
public class List01EqualsTests {
  /** Initializes these tests. */
  public List01EqualsTests() {
  }

  // ---- CONSTRUCTOR TESTS ----

  /**
   * Tests the result of the {@link List} constructor for {@link String} types.
   * 
   * @see List#List()
   */
  @Test
  @Order(1)
  public void testStringConstructor() {
    List<String> list = new List<String>();

    assertTrue(list.isEmpty());
    assertEquals(0, list.size());
    assertEquals("( )", list.toString());
  }

  /**
   * Tests the result of the {@link List} constructor for {@link Integer} types.
   * 
   * @see List#List()
   */
  @Test
  @Order(2)
  public void testIntegerConstructor() {
    List<Integer> list = new List<Integer>();

    assertTrue(list.isEmpty());
    assertEquals(0, list.size());
    assertEquals("( )", list.toString());
  }

  /**
   * Tests the result of the {@link List} constructor for {@link Dog} types.
   * 
   * @see List#List()
   */
  @Test
  @Order(3)
  public void testDogConstructor() {
    List<Dog> list = new List<Dog>();

    assertTrue(list.isEmpty());
    assertEquals(0, list.size());
    assertEquals("( )", list.toString());
  }

  // ----- EQUAL STRING TESTS -----

  /**
   * Tests the result of the {@link List#equals(Object)} method for empty
   * {@link String} lists.
   * 
   * <p>
   * Assumes {@link List#addFirst(Comparable)} works.
   * 
   * @see List#equals(Object)
   */
  @Test
  @Order(4)
  public void testEqualEmpty() {
    List<String> empty1 = new List<String>();
    List<String> empty2 = new List<String>();

    assertTrue(empty1.equals(empty1)); // same instances
    assertTrue(empty1.equals(empty2)); // diff instances
    assertTrue(empty2.equals(empty1)); // diff instances (swapped)
  }

  /**
   * Tests the result of the {@link List#equals(Object)} method for non-empty
   * {@link String} lists with one non-null element.
   * 
   * <p>
   * Assumes {@link List#addFirst(Comparable)} works.
   * 
   * @see List#equals(Object)
   */
  @Test
  @Order(5)
  public void testEqual1String() {
    List<String> list = new List<String>();
    List<String> same = new List<String>();
    List<String> diff = new List<String>();

    String a = "a";

    list.addFirst(a);
    same.addFirst(a);
    diff.addFirst(new String(a));

    assertTrue(list.equals(list)); // same list instances
    assertTrue(list.equals(same)); // diff list instances, same data instances
    assertTrue(list.equals(diff)); // diff list instances, diff data instances
  }

  /**
   * Tests the result of the {@link List#equals(Object)} method for non-empty
   * {@link String} lists with multiple non-null elements.
   * 
   * <p>
   * Assumes {@link List#addFirst(Comparable)} works.
   * 
   * @see List#equals(Object)
   */
  @Test
  @Order(6)
  public void testEqual3Strings() {
    List<String> list = new List<String>(); // "a", "b", "c"
    List<String> same = new List<String>(); // "a", "b", "c"
    List<String> diff = new List<String>(); // "a", "b", "c"

    String a = "a";
    String b = "b";
    String c = "c";

    list.addFirst(c); // add data to list
    list.addFirst(b);
    list.addFirst(a);

    same.addFirst(c); // same data instances
    same.addFirst(b);
    same.addFirst(a);

    diff.addFirst(new String(c)); // different data instances (same content)
    diff.addFirst(new String(b));
    diff.addFirst(new String(a));

    assertTrue(list.equals(list)); // same list instances
    assertTrue(list.equals(same)); // diff list instances, same data instances
    assertTrue(list.equals(diff)); // diff list instances, diff data instances
  }

  /**
   * Tests the result of the {@link List#equals(Object)} method for non-empty
   * {@link String} lists with one null element.
   * 
   * <p>
   * Assumes {@link List#addFirst(Comparable)} works.
   * 
   * @see List#equals(Object)
   */
  @Test
  @Order(7)
  public void testEqualNull() {
    List<String> list = new List<String>();
    List<String> same = new List<String>();

    list.addFirst(null);
    same.addFirst(null);

    assertTrue(list.equals(list)); // same list instances
    assertTrue(list.equals(same)); // diff list instances, same data instances
  }

  // ----- EQUAL OTHER TESTS -----

  /**
   * Tests the result of the {@link List#equals(Object)} method for non-empty
   * {@link Integer} lists with multiple non-null elements.
   * 
   * <p>
   * Assumes {@link List#addFirst(Comparable)} works.
   * 
   * @see List#equals(Object)
   */
  @Test
  @Order(8)
  public void testEqual2Integers() {
    List<Integer> list = new List<Integer>(); // 1, 2
    List<Integer> same = new List<Integer>(); // 1, 2

    Integer one = 1;
    Integer two = 2;

    list.addFirst(two); // add data to list
    list.addFirst(one);

    same.addFirst(two); // same data instances
    same.addFirst(one);

    assertTrue(list.equals(list)); // same list instances
    assertTrue(list.equals(same)); // diff list instances, same data instances
  }

  /**
   * Tests the result of the {@link List#equals(Object)} method for non-empty
   * {@link Dog} lists with multiple non-null elements.
   * 
   * <p>
   * Assumes {@link List#addFirst(Comparable)} works.
   * 
   * @see List#equals(Object)
   */
  @Test
  @Order(9)
  public void testEqual2Dogs() {
    List<Dog> list = new List<Dog>(); // 2, 6, 10
    List<Dog> same = new List<Dog>(); // 2, 6, 10
    List<Dog> diff = new List<Dog>(); // 2, 6, 10

    Dog two = new Dog(2);
    Dog six = new Dog(6);
    Dog ten = new Dog(10);

    list.addFirst(ten); // add data to list
    list.addFirst(six);
    list.addFirst(two);

    same.addFirst(ten); // same data instances
    same.addFirst(six);
    same.addFirst(two);

    diff.addFirst(new Dog(ten.getAge())); // different data instances (same content)
    diff.addFirst(new Dog(six.getAge()));
    diff.addFirst(new Dog(two.getAge()));

    assertTrue(list.equals(list)); // same list instances
    assertTrue(list.equals(same)); // diff list instances, same data instances
    assertTrue(list.equals(diff)); // diff list instances, diff data instances
  }

  // ---- NOT EQUAL TESTS ----

  /**
   * Tests the result of the {@link List#equals(Object)} method for non-empty
   * {@link String} lists with one element versus no elements.
   * 
   * <p>
   * Assumes {@link List#addFirst(Comparable)} works.
   * 
   * @see List#equals(Object)
   */
  @Test
  @Order(10)
  public void testSingleEmpty() {
    List<String> hello = new List<String>(); // "hello"
    List<String> empty = new List<String>(); // (empty)

    hello.addFirst("hello");

    assertFalse(hello.equals(empty));
    assertFalse(empty.equals(hello));
  }

  /**
   * Tests the result of the {@link List#equals(Object)} method for non-empty
   * {@link String} lists with different sizes.
   * 
   * <p>
   * Assumes {@link List#addFirst(Comparable)} works.
   * 
   * @see List#equals(Object)
   */
  @Test
  @Order(11)
  public void testDifferentSizes() {
    List<String> abc = new List<String>(); // "a", "b", "c"
    List<String> ab = new List<String>(); // "a", "b"

    String a = "a";
    String b = "b";
    String c = "c";

    abc.addFirst(c);
    abc.addFirst(b);
    abc.addFirst(a);

    ab.addFirst(b);
    ab.addFirst(a);

    assertFalse(abc.equals(ab));
    assertFalse(ab.equals(abc));
  }

  /**
   * Tests the result of the {@link List#equals(Object)} method for non-empty
   * {@link String} lists with differently ordered elements.
   * 
   * <p>
   * Assumes {@link List#addFirst(Comparable)} works.
   * 
   * @see List#equals(Object)
   */
  @Test
  @Order(12)
  public void testDifferentOrder() {
    List<String> abc = new List<String>(); // "a", "b", "c"
    List<String> acb = new List<String>(); // "a", "c", "b"

    String a = "a";
    String b = "b";
    String c = "c";

    abc.addFirst(c);
    abc.addFirst(b);
    abc.addFirst(a);

    acb.addFirst(b);
    acb.addFirst(c);
    acb.addFirst(a);

    assertFalse(abc.equals(acb));
    assertFalse(acb.equals(abc));
  }
  
  /**
   * Tests the result of the {@link List#equals(Object)} method for non-empty
   * {@link String} lists with one element versus no elements.
   * 
   * <p>
   * Assumes {@link List#addFirst(Comparable)} works.
   * 
   * @see List#equals(Object)
   */
  @Test
  @Order(13)
  public void testSingleNull() {
    List<String> oneItem = new List<String>(); // "hello"
    List<String> oneNull = new List<String>(); // null

    oneItem.addFirst("hello");
    oneNull.addFirst(null);

    assertFalse(oneItem.equals(oneNull));
    assertFalse(oneNull.equals(oneItem));
  }
}
