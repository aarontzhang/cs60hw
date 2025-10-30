package com.gradescope.hw6.tests;

import org.junit.jupiter.api.ClassOrderer.OrderAnnotation;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestClassOrder;

import com.gradescope.hw6.List;

// https://github.com/CSGreater-Developers/CS60_Autograders/blob/main/hw6_LinkedLists/hw6pr2_list/dockerfied_version/src/main/java/com/gradescope/hw6/tests/ListTest.java

/**
 * JUnit tests for the {@link List} class.
 * 
 * @see List
 * 
 * @author HMC CS 60 Instructors
 * @version Fall 2025
 */
@TestClassOrder(OrderAnnotation.class)
public class ListTests {
  /** Initializes these tests. */
  public ListTests() {
  }

  // RUN THIS AS A FINAL CHECK ONLY!
  // Otherwise, run the individual test classes.

  /**
   * Inherits test cases from the {@link List01EqualsTests}class.
   */
  @Nested
  @Order(1)
  public class EqualsTests extends List01EqualsTests {
    /** Initializes these tests. */
    public EqualsTests() {
      super();
    }
  }

  /**
   * Inherits test cases from the {@link List02AddFirstTests} class.
   */
  @Nested
  @Order(2)
  public class AddFirstTests extends List02AddFirstTests {
    /** Initializes these tests. */
    public AddFirstTests() {
      super();
    }
  }

  /**
   * Inherits test cases from the {@link List03AddLastTests} class.
   */
  @Nested
  @Order(3)
  public class AddTests extends List03AddLastTests {
    /** Initializes these tests. */
    public AddTests() {
      super();
    }
  }

  /**
   * Inherits test cases from the {@link List04AddAllTests} class.
   */
  @Nested
  @Order(4)
  public class AddAllTests extends List04AddAllTests {
    /** Initializes these tests. */
    public AddAllTests() {
      super();
    }
  }

  /**
   * Inherits test cases from the {@link List05RemoveFirstTests} class.
   */
  @Nested
  @Order(5)
  public class RemoveFirstTests extends List05RemoveFirstTests {
    /** Initializes these tests. */
    public RemoveFirstTests() {
      super();
    }
  }

  /**
   * Inherits test cases from the {@link List06MoveFirstToTests} class.
   */
  @Nested
  @Order(6)
  public class MoveFirstToTests extends List06MoveFirstToTests {
    /** Initializes these tests. */
    public MoveFirstToTests() {
      super();
    }
  }

  /**
   * Inherits test cases from the {@link List07AsListTests} class.
   */
  @Nested
  @Order(7)
  public class AsListTests extends List07AsListTests {
    /** Initializes these tests. */
    public AsListTests() {
      super();
    }
  }

  /**
   * Inherits test cases from the {@link List08ToArrayTests} class.
   */
  @Nested
  @Order(8)
  public class ToArrayTests extends List08ToArrayTests {
    /** Initializes these tests. */
    public ToArrayTests() {
      super();
    }
  }

  /**
   * Inherits test cases from the {@link List09ReverseTests} class.
   */
  @Nested
  @Order(9)
  public class ReverseTests extends List09ReverseTests {
    /** Initializes these tests. */
    public ReverseTests() {
      super();
    }
  }

  /**
   * Inherits test cases from the {@link List10SplitTests} class.
   */
  @Nested
  @Order(10)
  public class SplitTests extends List10SplitTests {
    /** Initializes these tests. */
    public SplitTests() {
      super();
    }
  }

  /**
   * Inherits test cases from the {@link List11MergeTests} class.
   */
  @Nested
  @Order(11)
  public class MergeTests extends List11MergeTests {
    /** Initializes these tests. */
    public MergeTests() {
      super();
    }
  }

  /**
   * Inherits test cases from the {@link List12MergeSortTests} class.
   */
  @Nested
  @Order(12)
  public class MergeSortTests extends List12MergeSortTests {
    /** Initializes these tests. */
    public MergeSortTests() {
      super();
    }
  }
}
