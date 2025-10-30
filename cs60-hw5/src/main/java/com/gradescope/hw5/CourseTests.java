package com.gradescope.hw5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Tests the {@link Course} class.
 * 
 * <pre>
 * Fun facts:
 * - Wally the Wart is the unofficial mascot of HMC
 * - Sammy the Owl is the mascot of Rice (where Prof Wu got her Bachelors)
 * </pre>
 * 
 * @see Course
 * @see Student
 * 
 * @author HMC CS 60 Instructors
 * @version Fall 2025
 */
public class CourseTests {
  /**
   * Initializes these tests.
   */
  public CourseTests() {

  }

  /*-------------------
   * constructors
   *-------------------*/

  /**
   * Tests creating a new course does not throw any unexpected exceptions.
   */
  @Test
  public void testCourse() {
    new Course("CSCI060", 80);
  }

  /*-------------------
   * getters
   *-------------------*/

  /**
   * Tests the course code.
   * 
   * @see Course#getCode()
   */
  @Test
  public void testGetCode() {
    Course cs60 = new Course("CSCI060", 80);
    assertEquals("CSCI060", cs60.getCode());
  }

  /**
   * Tests the cousre cap.
   * 
   * @see Course#getCap()
   */
  @Test
  public void testGetCap() {
    Course cs60 = new Course("CSCI060", 80);
    assertEquals(80, cs60.getCap());
  }

  /*-------------------
   * methods
   *-------------------*/

  /**
   * Tests the number of students enrolled in an empty course.
   * 
   * @see Course#getNumEnrolled()
   */
  @Test
  public void testGetNumEnrolled0() {
    Course cs60 = new Course("CSCI060", 80);
    assertEquals(0, cs60.getNumEnrolled());
  }

  /**
   * Tests a course with zero cap cannot enroll any students.
   * 
   * @see Course#enrollStudent(Student)
   * @see Course#getNumEnrolled()
   */
  @Test
  public void testEnrollStudentCap0() {
    Student wally = new Student("Wally", 1955);
    Course cs60 = new Course("CSCI060", 0);

    assertEquals(-1, cs60.enrollStudent(wally));
    assertEquals(0, cs60.getNumEnrolled());
  }

  /**
   * Tests a course with cap of 3 can enroll 3 different students.
   * 
   * @see Course#enrollStudent(Student)
   * @see Course#getNumEnrolled()
   */
  @Test
  public void testEnrollStudentCap3() {
    Student wally = new Student("Wally", 1955);
    Student sammy = new Student("Sammy", 1912);
    Student tim = new Student("Tim", 1861);
    Course cs60 = new Course("CSCI060", 3);

    assertEquals(1, cs60.enrollStudent(wally));
    assertEquals(1, cs60.getNumEnrolled());

    assertEquals(2, cs60.enrollStudent(sammy));
    assertEquals(2, cs60.getNumEnrolled());

    assertEquals(3, cs60.enrollStudent(tim));
    assertEquals(3, cs60.getNumEnrolled());
  }

  /**
   * Tests a course will not double-enroll a student with the same ID.
   * 
   * @see Course#enrollStudent(Student)
   * @see Course#getNumEnrolled()
   */
  @Test
  public void testEnrollStudentAlreadyEnrolled() {
    Student wally = new Student("Wally", 1955);
    Course cs60 = new Course("CSCI060", 3);

    assertEquals(1, cs60.enrollStudent(wally));
    assertEquals(1, cs60.getNumEnrolled());
    assertEquals(-1, cs60.enrollStudent(wally));
    assertEquals(1, cs60.getNumEnrolled());
  }

  /**
   * Tests the output for an empty class.
   * 
   * @see Course#getStudents()
   */
  @Test
  public void testGetStudents0() {
    Course cs60 = new Course("CSCI060", 80);
    String students = cs60.getStudents();
    assertEquals("[]", students);
  }

  /**
   * Tests the output for a class with 3 students.
   * 
   * @see Course#enrollStudent(Student)
   * @see Course#getStudents()
   */
  @Test
  public void testGetStudents3() {
    Student wally = new Student("Wally", 1955);
    Student sammy = new Student("Sammy", 1912);
    Student tim = new Student("Tim", 1861);

    Course cs60 = new Course("CSCI060", 80);
    cs60.enrollStudent(wally);
    cs60.enrollStudent(sammy);
    cs60.enrollStudent(tim);

    String students = cs60.getStudents();
    assertEquals("[Wally [1955], Sammy [1912], Tim [1861]]", students);
  }
}
