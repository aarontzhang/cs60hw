package com.gradescope.hw7;

import java.util.ArrayList;
import java.util.List;

/**
 * A table at the Hoch with chairs and people. Hoch tables are never full!
 * (There's always room for N+1.)
 * 
 * <p>
 * At a super friendly table, whenever a person is or removed added, they say
 * thanks or bye to everyone else at the table. When class starts, everyone says
 * bye.
 * 
 * @author HMC CS 60 Instructors
 * @version Fall 2025
 */
public class SuperFriendlyHochTable {
  /** The default number of chairs. */
  public static final int NUMBER_OF_CHAIRS = 5;

  /** The number of chairs at this table. */
  private int numChairs;

  /** The number of people at this table. */
  private int numPeople;

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
  public SuperFriendlyHochTable() {
    this(SuperFriendlyHochTable.NUMBER_OF_CHAIRS);
  }

  /**
   * Constructs a table with the specified number of chairs.
   *
   * @param numChairs the number of chairs at this table
   * @throws IllegalArgumentException if the capacity is less than 0
   */
  public SuperFriendlyHochTable(int numChairs) {
    if (numChairs < 0) {
      throw new IllegalArgumentException(
          "Tables must start with a capacity of 0 or more");
    }

    this.numChairs = numChairs;
    this.numPeople = 0;
    this.people = new ArrayList<String>();
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
   * Returns list of people at this table.
   * 
   * @return list of people at this table as text
   */
  public String getPeople() {
    return this.people.toString();
  }

  /**
   * Returns {@code true} because Hoch tables are never full.
   * 
   * @return {@code true} because Hoch tables are never full
   */
  public boolean emptySeat() {
    return true;
  }

  /**
   * Adds a person to this table if there is space. In addition to the standard
   * welcome message, the new person says thanks to everyone else at the table.
   *
   * @param name the name of the person to add
   * @return a welcome message
   */
  public String addPerson(String name) {
    // add a chair if needed
    if (this.numChairs == this.numPeople) {
      this.numChairs++;
    }

    String welcome = "";

    // greet the person
    if (this.emptySeat()) {
      this.numPeople++;
      this.people.add(name);

      if (this.numPeople == 1) {
        welcome = "(Silence - no one is here to say hello.)";
      } else {
        welcome = "Welcome " + name + "!";
      }
    } else {
      if (this.numPeople == 0) {
        welcome = "(Silence - no one is here to say sorry.)";
      } else {
        welcome = "Sorry - there is no space for you " + name + ".";
      }
    }

    String thanks = "";

    if (this.numPeople > 1) {
      List<String> sublist = this.people.subList(0, this.people.size() - 1);
      String others = sublist.toString(); // includes [ ]
      others = others.substring(1, others.length() - 1); // remove [ ]
      thanks = "Thanks " + others + "!!!!!";
    }

    if (!welcome.isEmpty() && !thanks.isEmpty()) {
      welcome += " ";
    }

    return welcome + thanks;
  }

  /**
   * Removes a person from this table. If removed, everyone says bye.
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

    String names = this.people.toString();
    names = names.substring(1, names.length() - 1); // strip square brackets
    return "Bye " + name + ". " + "Bye " + names + ".";
  }

  /**
   * Clears the table as everyone goes to class.
   *
   * @return a goodbye message
   */
  public String classStartingSoon() {
    String message;

    if (this.numPeople > 1) {
      message = "Bye everyone!";
    } else {
      message = "(Silence - no one is here to say goodbye.)";
    }

    this.numPeople = 0;
    this.people.clear();

    return message;
  }
}
