package com.gradescope.hw2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

/**
 * JUnit tests for the {@link Recursion} class.
 * 
 * @see Recursion
 * 
 * @author HMC CS 60 Instructors
 * @version Fall 2025
 */
@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
public class RecursionTests {
  /**
   * Initializes this class.
   */
  public RecursionTests() {
  }

  /**
   * Tests the result of the {@link Recursion#choose(int, int)} method.
   * 
   * @see Recursion#choose(int, int)
   */
  @Test
  public void test4Choose0() {
    assertEquals(1, Recursion.choose(4, 0));
  }

  /**
   * Tests the result of the {@link Recursion#choose(int, int)} method.
   * 
   * @see Recursion#choose(int, int)
   */
  @Test
  public void test6Choose2() {
    assertEquals(15, Recursion.choose(6, 2));
  }

  /**
   * Tests the result of the {@link Recursion#choose(int, int)} method.
   * 
   * @see Recursion#choose(int, int)
   */
  @Test
  public void test3Choose1() {
    assertEquals(3, Recursion.choose(3, 1));
  }
}