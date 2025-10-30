package com.gradescope.hw7;

/**
 * A guinea pig.
 * 
 * @author HMC CS 60 Instructors
 * @version Fall 2025
 */
// TODO Implement required interface(s)
public class GuineaPig implements Comparable<GuineaPig> { 
  /** The guinea pig's age. */
  private int age;

  /** The guinea pig's name. */
  private String name;

  /**
   * Initializes a new guinea pig.
   * 
   * @param name the name
   * @param age  the age
   */
  public GuineaPig(String name, int age) {
    this.name = name;
    this.age = age;
  }

  /**
   * Initializes a new guinea pig with default name "arya" and age 1 (Prof Wu's
   * pet).
   */
  public GuineaPig() {
    this("arya", 1);
  }

  /**
   * Returns the name of this guinea pig.
   * 
   * @return the name of this guinea pig
   */
  public String getName() {
    return this.name;
  }

  // TODO Add method(s) to implement required interface(s).
}
