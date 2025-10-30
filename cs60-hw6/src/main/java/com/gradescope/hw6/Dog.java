package com.gradescope.hw6;

/**
 * An adorable dog!
 * 
 * @author HMC CS 60 Instructors
 * @version Fall 2025
 */
public class Dog implements Comparable<Dog> {
  /**
   * The age
   */
  private int age;

  /**
   * Constructs a dog with the specified age.
   * 
   * @param age The age
   */
  public Dog(int age) {
    this.age = age;
  }

  /**
   * Returns the dog's age.
   * 
   * @return the dog's age
   */
  public int getAge() {
    return this.age;
  }

  /**
   * Increases the dog's age.
   */
  public void getOlder() {
    this.age++;
  }

  /**
   * Compares two dogs' ages.
   * 
   * The result is a negative integer if this dog is younger than the other dog.
   * The result is a positive integer if this dog is older than the other dog.
   * The result is zero if the two dogs are the same age.
   * 
   * @return the comparison between this dog's age and the other dog's age
   * 
   * @see Integer#compare(int, int)
   */
  @Override
  public int compareTo(Dog other) {
    return Integer.compare(this.age, other.age);
  }

  /**
   * Compares this dog to the specified object. The result is {@code true} if
   * and only if the specified object is also a dog, and both dogs have the same
   * age.
   * 
   * @param o the object to be compared for equality with this dog
   * @return {@code true} if the specified object is equal to this dog
   */
  @Override
  public boolean equals(Object o) {
    if (o instanceof Dog) {
      Dog otherDog = (Dog) o;
      return this.compareTo(otherDog) == 0;
    }

    return false;
  }
}
