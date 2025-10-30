package com.gradescope.hw5;

import java.util.Arrays;

public class Course {
  // course code
  private final String code;
  // enrollment cap
  private final int cap;
  // students enrolled
  private final Student[] enrolled;
  // current count
  private int numEnrolled;

  // create course with code & cap
  public Course(String code, int cap) {
    this.code = code;
    this.cap = cap;
    this.enrolled = new Student[cap];
    this.numEnrolled = 0;
  }

  // get code
  public String getCode() {
    return this.code;
  }

  // get cap
  public int getCap() {
    return this.cap;
  }

  // get number enrolled
  public int getNumEnrolled() {
    return this.numEnrolled;
  }

  // enroll student (-1 if full) returning new count 
  public int enrollStudent(Student student) {
    for (int i = 0; i < numEnrolled; i++) {
      if (enrolled[i].equals(student)) return -1;
    }
    if (numEnrolled >= cap) return -1;
    enrolled[numEnrolled] = student;
    numEnrolled++;
    return numEnrolled;
  }

  // list students 
  public String getStudents() {
    return Arrays.toString(Arrays.copyOf(enrolled, numEnrolled));
  }
}
