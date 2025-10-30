package com.gradescope.hw6.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.gradescope.hw6.List;

/**
 * JUnit tests for the {@link List#moveFirstTo(List)} method.
 * 
 * @see List
 * 
 * @author HMC CS 60 Instructors
 * @version Fall 2025
 */
@TestMethodOrder(OrderAnnotation.class)
public class List06MoveFirstToTests {
  /** Initializes these tests. */
  public List06MoveFirstToTests() {
  }

  /**
   * Tests the {@link List#moveFirstTo(List)} method works correctly when called
   * 1 time on a list starting with 0 items to another list with 0 items. This
   * SHOULD throw an exception!
   */
  @Test
  @Order(1)
  public void testMove1From0To0() {
    // actual source list (moving from) and target list (moving to)
    List<String> actualSource = new List<String>(); // (empty)
    List<String> actualTarget = new List<String>(); // (empty)

    // move item(s) - this should trigger an exception!
    assertThrows(NoSuchElementException.class, // type of exception expected
        () -> actualSource.moveFirstTo(actualTarget));
  }

  /**
   * Tests the {@link List#moveFirstTo(List)} method works correctly when called
   * 1 time on a list starting with 1 items to another list with 0 items.
   */
  @Test
  @Order(2)
  public void testMove1From1To0() {
    // actual source list (moving from) and target list (moving to)
    List<String> actualSource = new List<String>(); // a
    List<String> actualTarget = new List<String>(); // (empty)

    // expected source and target *after* moving
    List<String> expectSource = new List<String>(); // (empty)
    List<String> expectTarget = new List<String>(); // a

    // setup actual lists
    actualSource.addFirst("a");

    // setup expected lists
    expectTarget.addFirst("a");

    // move item(s)
    actualSource.moveFirstTo(actualTarget); // moves a

    // make sure actual matches expected
    assertEquals(expectSource, actualSource);
    assertEquals(expectSource.size(), actualSource.size());

    assertEquals(expectTarget, actualTarget);
    assertEquals(expectTarget.size(), actualTarget.size());
  }

  /**
   * Tests the {@link List#moveFirstTo(List)} method works correctly when called
   * 1 time on a list starting with 3 items to another list with 0 items.
   */
  @Test
  @Order(3)
  public void testMove1From3To0() {
    // actual source list (moving from) and target list (moving to)
    List<String> actualSource = new List<String>(); // a b c
    List<String> actualTarget = new List<String>(); // (empty)

    // expected source and target *after* moving
    List<String> expectSource = new List<String>(); // b c
    List<String> expectTarget = new List<String>(); // a

    // setup actual lists
    actualSource.addFirst("c");
    actualSource.addFirst("b");
    actualSource.addFirst("a");

    // setup expected lists
    expectSource.addFirst("c");
    expectSource.addFirst("b");

    expectTarget.addFirst("a");

    // move item(s)
    actualSource.moveFirstTo(actualTarget); // moves a

    // make sure actual matches expected
    assertEquals(expectSource, actualSource);
    assertEquals(expectSource.size(), actualSource.size());

    assertEquals(expectTarget, actualTarget);
    assertEquals(expectTarget.size(), actualTarget.size());
  }

  /**
   * Tests the {@link List#moveFirstTo(List)} method works correctly when called
   * 1 time on a list starting with 3 items to another list with 3 items.
   */
  @Test
  @Order(4)
  public void testMove1From3To3() {
    // actual source list (moving from) and target list (moving to)
    List<String> actualSource = new List<String>(); // a b c
    List<String> actualTarget = new List<String>(); // x y z

    // expected source and target *after* moving
    List<String> expectSource = new List<String>(); // b c
    List<String> expectTarget = new List<String>(); // a x y z

    // setup actual lists
    actualSource.addFirst("c");
    actualSource.addFirst("b");
    actualSource.addFirst("a");

    actualTarget.addFirst("z");
    actualTarget.addFirst("y");
    actualTarget.addFirst("x");

    // setup expected lists
    expectSource.addFirst("c");
    expectSource.addFirst("b");

    expectTarget.addFirst("z");
    expectTarget.addFirst("y");
    expectTarget.addFirst("x");

    expectTarget.addFirst("a");

    // move item(s)
    actualSource.moveFirstTo(actualTarget); // moves a

    // make sure actual matches expected
    assertEquals(expectSource, actualSource);
    assertEquals(expectSource.size(), actualSource.size());

    assertEquals(expectTarget, actualTarget);
    assertEquals(expectTarget.size(), actualTarget.size());
  }

  /**
   * Tests the {@link List#moveFirstTo(List)} method works correctly when called
   * 2 times on a list starting with 3 items to another list with 3 items.
   */
  @Test
  @Order(5)
  public void testMove2From3To3() {
    // actual source list (moving from) and target list (moving to)
    List<String> actualSource = new List<String>(); // a b c
    List<String> actualTarget = new List<String>(); // x y z

    // expected source and target *after* moving
    List<String> expectSource = new List<String>(); // c
    List<String> expectTarget = new List<String>(); // b a x y z

    // setup actual lists
    actualSource.addFirst("c");
    actualSource.addFirst("b");
    actualSource.addFirst("a");

    actualTarget.addFirst("z");
    actualTarget.addFirst("y");
    actualTarget.addFirst("x");

    // setup expected lists
    expectSource.addFirst("c");

    expectTarget.addFirst("z");
    expectTarget.addFirst("y");
    expectTarget.addFirst("x");

    expectTarget.addFirst("a");
    expectTarget.addFirst("b");

    // move item(s)
    actualSource.moveFirstTo(actualTarget); // moves a
    actualSource.moveFirstTo(actualTarget); // moves b

    // make sure actual matches expected
    assertEquals(expectSource, actualSource);
    assertEquals(expectSource.size(), actualSource.size());

    assertEquals(expectTarget, actualTarget);
    assertEquals(expectTarget.size(), actualTarget.size());
  }

  /**
   * Tests the {@link List#moveFirstTo(List)} method works correctly when called
   * 3 times on a list starting with 3 items to another list with 3 items.
   */
  @Test
  @Order(6)
  public void testMove3From3To3() {
    // actual source list (moving from) and target list (moving to)
    List<String> actualSource = new List<String>(); // a b c
    List<String> actualTarget = new List<String>(); // x y z

    // expected source and target *after* moving
    List<String> expectSource = new List<String>(); // (empty)
    List<String> expectTarget = new List<String>(); // c b a x y z

    // setup actual lists
    actualSource.addFirst("c");
    actualSource.addFirst("b");
    actualSource.addFirst("a");

    actualTarget.addFirst("z");
    actualTarget.addFirst("y");
    actualTarget.addFirst("x");

    // setup expected lists
    expectTarget.addFirst("z");
    expectTarget.addFirst("y");
    expectTarget.addFirst("x");

    expectTarget.addFirst("a");
    expectTarget.addFirst("b");
    expectTarget.addFirst("c");

    // move item(s)
    actualSource.moveFirstTo(actualTarget); // moves a
    actualSource.moveFirstTo(actualTarget); // moves b
    actualSource.moveFirstTo(actualTarget); // moves c

    // make sure actual matches expected
    assertEquals(expectSource, actualSource);
    assertEquals(expectSource.size(), actualSource.size());

    assertEquals(expectTarget, actualTarget);
    assertEquals(expectTarget.size(), actualTarget.size());
  }

  /**
   * Tests the {@link List#moveFirstTo(List)} method works correctly when called
   * 1 time on a list starting with 1 null item to another empty list.
   */
  @Test
  @Order(7)
  public void testMoveNull() {
    // actual source list (moving from) and target list (moving to)
    List<String> actualSource = new List<String>(); // null
    List<String> actualTarget = new List<String>(); // (empty)

    // expected source and target *after* moving
    List<String> expectSource = new List<String>(); // (empty)
    List<String> expectTarget = new List<String>(); // null

    // setup actual lists
    actualSource.addFirst(null);

    // setup expected lists
    expectTarget.addFirst(null);

    // move item(s)
    actualSource.moveFirstTo(actualTarget); // moves null

    // make sure actual matches expected
    assertEquals(expectSource, actualSource);
    assertEquals(expectSource.size(), actualSource.size());

    assertEquals(expectTarget, actualTarget);
    assertEquals(expectTarget.size(), actualTarget.size());
  }
}
