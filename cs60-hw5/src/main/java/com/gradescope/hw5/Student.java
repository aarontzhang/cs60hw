package com.gradescope.hw5;

public class Student {
  // name
  private String name;
  //ID: can't be changed
  private final long id;

  // create a new student w name & ID
  public Student(String name, long id) {
    this.name = name;
    this.id = id;
  }

  // get ID
  public long getId() {
    return this.id;
  }

  // get name 
  public String getName() {
    return this.name;
  }

  // change name
  public void setName(String newName) {
    this.name = newName;
  }

  // return name & ID 
  @Override
  public String toString() {
    return this.name + " [" + this.id + "]";
  }

  // same student if ID match
  public boolean equals(Student other) {
    if (other == null) return false;
    return this.id == other.id;
  }
}

