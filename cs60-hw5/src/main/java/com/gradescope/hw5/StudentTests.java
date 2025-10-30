package com.gradescope.hw5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Tests the {@link Student} class.
 * 
 * <pre>
 * Fun facts:
 * - Wally the Wart is the unofficial mascot of HMC
 * - Sammy the Owl is the mascot of Rice (where Prof Wu got her Bachelors)
 * </pre>
 * 
 * @see Student
 * 
 * @author HMC CS 60 Instructors
 * @version Fall 2025
 */
public class StudentTests {
  /**
   * Initializes these tests.
   */
  public StudentTests() {

  }

  /*-------------------
   * constructors
   *-------------------*/

  /**
   * Tests initializing a new student does not throw any unexpected exceptions.
   * 
   * @see Student#Student(String, long)
   */
  @Test
  public void testStudent() {
    new Student("Wally", 42);
  }

  /*-------------------
   * getters
   *-------------------*/

  /**
   * Tests getting an id.
   * 
   * @see Student#getId()
   */
  @Test
  public void testGetId() {
    Student wally = new Student("Wally", 42);
    assertEquals(42, wally.getId());
  }

  /**
   * Tests getting a name.
   * 
   * @see Student#getName()
   */
  @Test
  public void testGetName() {
    Student wally = new Student("Wally", 42);
    assertEquals("Wally", wally.getName());
  }

  /*-------------------
   * setters
   *-------------------*/

  /**
   * Tests setting a student's name.
   * 
   * @see Student#setName(String)
   */
  @Test
  public void testSetName() {
    Student mascot = new Student("Wally", 42);
    mascot.setName("Sammy");
    assertEquals("Sammy", mascot.getName());
  }

  /*-------------------
   * methods
   *-------------------*/

  /**
   * Tests the {@link String} representation of a student.
   * 
   * @see Student#toString()
   */
  @Test
  public void testToString() {
    Student wally = new Student("Wally", 42);
    assertEquals("Wally [42]", wally.toString());
  }

  /**
   * Tests whether students with the same ID are considered equal.
   * 
   * @see Student#equals(Student)
   */
  @Test
  public void testEqualStudents() {
    Student wally = new Student("Wally", 42);
    Student mascot = new Student("Unnamed Mascot", 42);

    assertTrue(wally.equals(mascot));
  }

  /**
   * Tests whether students with different IDs are considered not equal.
   * 
   * @see Student#equals(Student)
   */
  @Test
  public void testNotEqualStudents() {
    Student wally42 = new Student("Wally", 42);
    Student wally55 = new Student("Wally", 1955);
    Student sammy = new Student("Sammy", 1912);

    assertFalse(wally42.equals(wally55));
    assertFalse(wally42.equals(sammy));
  }
}
