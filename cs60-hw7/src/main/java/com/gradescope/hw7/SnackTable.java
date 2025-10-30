package com.gradescope.hw7;

import java.util.ArrayList;

/**
 * A table with chairs and people that also has snacks.
 * 
 * @author HMC CS 60 Instructors
 * @version Fall 2025
 */
public class SnackTable {
  /** The default number of chairs. */
  public static final int NUMBER_OF_CHAIRS = 5;

  /** The number of snacks in a bag of snacks. */
  public static final int BAG_OF_SNACKS = 6;

  /** The number of chairs at this table. */
  private int numChairs;

  /** The number of people at this table. */
  private int numPeople;

  /** The number of snacks at this table. */
  private int numSnacks;

  /**
   * The list of people at this table.
   * 
   * <p>
   * NOTE: ArrayLists are common and helpful! Read more at:
   * https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/ArrayList.html
   */
  private ArrayList<String> people;

  /**
   * Constructs a table with the default number of chairs.
   */
  public SnackTable() {
    this(SnackTable.NUMBER_OF_CHAIRS);
  }

  /**
   * Constructs a table with the specified number of chairs.
   * 
   * @param numChairs the number of seats
   * @throws IllegalArgumentException if the capacity is less than 0
   */
  public SnackTable(int numChairs) {
    if (numChairs < 0) {
      throw new IllegalArgumentException(
          "Tables must start with a capacity of 0 or more");
    }

    this.numChairs = numChairs;
    this.numPeople = 0;
    this.people = new ArrayList<String>();
    this.numSnacks = 0;
  }

  /**
   * Returns the number of chairs at this table.
   * 
   * @return the number of chairs at this table
   */
  public int numChairs() {
    return this.numChairs;
  }

  /**
   * Returns the number of people at this table.
   * 
   * @return the number of people at this table
   */
  public int numPeople() {
    return this.numPeople;
  }

  /**
   * Returns the number of snacks at this table.
   * 
   * @return the number of snacks at this table
   */
  public int numSnacks() {
    return this.numSnacks;
  }

  /**
   * Returns list of people at this table.
   * 
   * @return list of people at this table as text
   */
  public String getPeople() {
    return this.people.toString();
  }

  /**
   * Returns {@code true} if there are fewer people than seats at this table.
   * 
   * @return {@code true} if there are fewer people than seats at this table
   */
  public boolean emptySeat() {
    return this.numPeople < this.numChairs;
  }

  /**
   * Adds snacks to this table.
   */
  public void addSnacks() {
    this.numSnacks += BAG_OF_SNACKS;
  }

  /**
   * Adds a person to this table if there is space.
   * 
   * @param name the name of the person to add
   * @return a welcome message
   */
  public String addPerson(String name) {
    if (this.emptySeat()) {
      this.numPeople++;
      this.people.add(name);

      if (this.numPeople == 1) {
        return "(Silence - no one is here to say hello.)";
      } else {
        return "Welcome " + name + "!";
      }
    } else {
      if (this.numPeople == 0) {
        return "(Silence - no one is here to say sorry.)";
      } else {
        return "Sorry - there is no space for you " + name + ".";
      }
    }
  }

  /**
   * Adds a hungry person to this table if there is space and an available
   * snack. A hungry person eats one snack.
   * 
   * @param name the name of the person to add
   * @return a welcome message
   */
  public String addHungryPerson(String name) {
    if (this.emptySeat() && this.numSnacks > 0) {
      String welcome = this.addPerson(name);
      String eating = name + " says yummy!";
      this.numSnacks--;
      return welcome + " " + eating;
    }

    if (this.numPeople == 0) {
      return "(Silence - no one is here to say sorry.)";
    }

    // either there were no empty seats or there was no snack
    if (!this.emptySeat()) {
      return "Sorry - there is no space for you " + name + ".";
    }

    // no snack
    return "Sorry - there is no snack for you " + name + ".";
  }

  /**
   * Removes a person from this table.
   * 
   * @param name the name of the person to remove
   * @return a goodbye message
   */
  public String removePerson(String name) {
    boolean wasRemoved = this.people.remove(name);

    if (!wasRemoved) {
      return "Weird! " + name + " was not here!";
    }

    this.numPeople--;

    if (this.numPeople == 0) {
      return "(Silence - no one is here to say goodbye.)";
    }

    return "Bye " + name + ".";
  }
}
