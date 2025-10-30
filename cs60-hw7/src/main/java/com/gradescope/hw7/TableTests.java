package com.gradescope.hw7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.function.Executable;

/**
 * JUnit tests for the {@link Table} and related classes.
 * 
 * @see Table
 * @see SnackTable
 * @see HochTable
 * @see SuperFriendlyHochTable
 * 
 * @author HMC CS 60 Instructors
 * @version Fall 2025
 */
@TestMethodOrder(OrderAnnotation.class)
public class TableTests {
  /** Initializes these tests. */
  public TableTests() {

  }

  /*-------------------
   * Constructors
   *-------------------*/

  /**
   * Tests the {@link Table} constructors with valid input.
   */
  @Order(1)
  @Test
  public void testTableConstructor() {
    new Table();
    new Table(0);
    new Table(100);
  }

  /**
   * Tests the {@link SnackTable} constructors with valid input.
   */
  @Order(2)
  @Test
  public void testSnackTableConstructor() {
    new SnackTable();
    new SnackTable(0);
    new SnackTable(100);
  }

  /**
   * Tests the {@link HochTable} constructors with valid input.
   */
  @Order(3)
  @Test
  public void testHochTableConstructor() {
    new HochTable();
    new HochTable(0);
    new HochTable(100);
  }

  /**
   * Tests the {@link SuperFriendlyHochTable} constructors with valid input.
   */
  @Order(4)
  @Test
  public void testSuperFriendlyHochTableConstructor() {
    new SuperFriendlyHochTable();
    new SuperFriendlyHochTable(0);
    new SuperFriendlyHochTable(100);
  }

  /**
   * Tests the {@link Table} constructor with invalid input. Should throw an
   * exception.
   */
  @Order(5)
  @Test
  public void testTableInvalidConstructor() {
    Executable test = () -> new Table(-5);
    Assertions.assertThrows(IllegalArgumentException.class, test);

  }

  /**
   * Tests the {@link SnackTable} constructor with invalid input. Should throw
   * an exception.
   */
  @Order(6)
  @Test
  public void testSnackTableInvalidConstructor() {
    Executable test = () -> new SnackTable(-5);
    Assertions.assertThrows(IllegalArgumentException.class, test);
  }

  /**
   * Tests the {@link HochTable} constructor with invalid input. Should throw an
   * exception.
   */
  @Order(7)
  @Test
  public void testHochTableInvalidConstructor() {
    Executable test = () -> new HochTable(-5);
    Assertions.assertThrows(IllegalArgumentException.class, test);
  }

  /**
   * Tests the {@link SuperFriendlyHochTable} constructor with invalid input.
   * Should throw an exception.
   */
  @Order(8)
  @Test
  public void testSuperFriendlyHochTableInvalidConstructor() {
    Executable test = () -> new SuperFriendlyHochTable(-5);
    Assertions.assertThrows(IllegalArgumentException.class, test);
  }

  /*-------------------
   * Getters
   *-------------------*/

  /**
   * Tests the {@link Table#numChairs} method.
   */
  @Order(9)
  @Test
  public void testTableNumChairs() {
    Table t = new Table();
    assertEquals(Table.NUMBER_OF_CHAIRS, t.numChairs());

    Table t0 = new Table(0);
    assertEquals(0, t0.numChairs());

    Table t100 = new Table(100);
    assertEquals(100, t100.numChairs());
  }

  /**
   * Tests the {@link Table#numPeople} method.
   */
  @Order(10)
  @Test
  public void testTableNumPeople() {
    Table t = new Table();
    assertEquals(0, t.numPeople());

    Table t0 = new Table(0);
    assertEquals(0, t0.numPeople());

    Table t100 = new Table(100);
    assertEquals(0, t100.numPeople());
  }

  /**
   * Tests the {@link Table#getPeople()} method.
   */
  @Order(11)
  @Test
  public void testTableGetPeople() {
    Table t = new Table();
    assertEquals("[]", t.getPeople());

    Table t0 = new Table(0);
    assertEquals("[]", t0.getPeople());

    Table t100 = new Table(100);
    assertEquals("[]", t100.getPeople());
  }

  /**
   * Tests the {@link SnackTable#numChairs()} method.
   */
  @Order(12)
  @Test
  public void testSnackTableNumChairs() {
    SnackTable t = new SnackTable();
    assertEquals(SnackTable.NUMBER_OF_CHAIRS, t.numChairs());

    SnackTable t0 = new SnackTable(0);
    assertEquals(0, t0.numChairs());

    SnackTable t100 = new SnackTable(100);
    assertEquals(100, t100.numChairs());
  }

  /**
   * Tests the {@link SnackTable#numPeople()} method.
   */
  @Order(13)
  @Test
  public void testSnackTableNumPeople() {
    SnackTable t = new SnackTable();
    assertEquals(0, t.numPeople());

    SnackTable t0 = new SnackTable(0);
    assertEquals(0, t0.numPeople());

    SnackTable t100 = new SnackTable(100);
    assertEquals(0, t100.numPeople());
  }

  /**
   * Tests the {@link SnackTable#getPeople()} method.
   */
  @Order(14)
  @Test
  public void testSnackTableGetPeople() {
    SnackTable t = new SnackTable();
    assertEquals("[]", t.getPeople());

    SnackTable t0 = new SnackTable(0);
    assertEquals("[]", t0.getPeople());

    SnackTable t100 = new SnackTable(100);
    assertEquals("[]", t100.getPeople());
  }

  /**
   * Tests the {@link HochTable#numChairs()} method.
   */
  @Order(15)
  @Test
  public void testHochTableNumChairs() {
    HochTable t = new HochTable();
    assertEquals(HochTable.NUMBER_OF_CHAIRS, t.numChairs());

    HochTable t0 = new HochTable(0);
    assertEquals(0, t0.numChairs());

    HochTable t100 = new HochTable(100);
    assertEquals(100, t100.numChairs());
  }

  /**
   * Tests the {@link HochTable#numPeople()} method.
   */
  @Order(16)
  @Test
  public void testHochTableNumPeople() {
    HochTable t = new HochTable();
    assertEquals(0, t.numPeople());

    HochTable t0 = new HochTable(0);
    assertEquals(0, t0.numPeople());

    HochTable t100 = new HochTable(100);
    assertEquals(0, t100.numPeople());
  }

  /**
   * Tests the {@link HochTable#getPeople()} method.
   */
  @Order(17)
  @Test
  public void testHochTableGetPeople() {
    HochTable t = new HochTable();
    assertEquals("[]", t.getPeople());

    HochTable t0 = new HochTable(0);
    assertEquals("[]", t0.getPeople());

    HochTable t100 = new HochTable(100);
    assertEquals("[]", t100.getPeople());
  }

  /**
   * Tests the {@link SuperFriendlyHochTable#numChairs()} method.
   */
  @Order(18)
  @Test
  public void testSuperFriendlyHochTableNumChairs() {
    SuperFriendlyHochTable t = new SuperFriendlyHochTable();
    assertEquals(SuperFriendlyHochTable.NUMBER_OF_CHAIRS, t.numChairs());

    SuperFriendlyHochTable t0 = new SuperFriendlyHochTable(0);
    assertEquals(0, t0.numChairs());

    SuperFriendlyHochTable t100 = new SuperFriendlyHochTable(100);
    assertEquals(100, t100.numChairs());
  }

  /**
   * Tests the {@link SuperFriendlyHochTable#numPeople()} method.
   */
  @Order(19)
  @Test
  public void testSuperFriendlyHochTableNumPeople() {
    SuperFriendlyHochTable t = new SuperFriendlyHochTable();
    assertEquals(0, t.numPeople());

    SuperFriendlyHochTable t0 = new SuperFriendlyHochTable(0);
    assertEquals(0, t0.numPeople());

    SuperFriendlyHochTable t100 = new SuperFriendlyHochTable(100);
    assertEquals(0, t100.numPeople());
  }

  /**
   * Tests the {@link SuperFriendlyHochTable#getPeople()} method.
   */
  @Order(20)
  @Test
  public void testSuperFriendlyHochTableGetPeople() {
    SuperFriendlyHochTable t = new SuperFriendlyHochTable();
    assertEquals("[]", t.getPeople());

    SuperFriendlyHochTable t0 = new SuperFriendlyHochTable(0);
    assertEquals("[]", t0.getPeople());

    SuperFriendlyHochTable t100 = new SuperFriendlyHochTable(100);
    assertEquals("[]", t100.getPeople());
  }

  /*-------------------
   * Empty Seat
   *-------------------*/

  /**
   * Tests the {@link Table#emptySeat()} method.
   */
  @Order(21)
  @Test
  public void testTableEmptySeat() {
    Table t0 = new Table(0);
    assertFalse(t0.emptySeat());

    Table t1 = new Table(1);
    assertTrue(t1.emptySeat());
  }

  /**
   * Tests the {@link Table#emptySeat()} method.
   */
  @Order(22)
  @Test
  public void testSnackTableEmptySeat() {
    SnackTable t0 = new SnackTable(0);
    assertFalse(t0.emptySeat());

    SnackTable t1 = new SnackTable(1);
    assertTrue(t1.emptySeat());
  }

  /**
   * Tests the {@link Table#emptySeat()} method.
   */
  @Order(23)
  @Test
  public void testHochTableEmptySeat() {
    HochTable t0 = new HochTable(0);
    assertTrue(t0.emptySeat());

    HochTable t1 = new HochTable(1);
    assertTrue(t1.emptySeat());
  }

  /**
   * Tests the {@link Table#emptySeat()} method.
   */
  @Order(24)
  @Test
  public void testSuperFriendlyHochTableEmptySeat() {
    SuperFriendlyHochTable t0 = new SuperFriendlyHochTable(0);
    assertTrue(t0.emptySeat());

    SuperFriendlyHochTable t1 = new SuperFriendlyHochTable(1);
    assertTrue(t1.emptySeat());
  }

  /*-------------------
   * Add Person
   *-------------------*/

  /**
   * Tests the {@link Table#addPerson(String)} method.
   */
  @Order(25)
  @Test
  public void testTableAddPerson() {
    String salutation;

    Table t0 = new Table(0);
    salutation = t0.addPerson("Katherine");
    assertEquals(0, t0.numChairs());
    assertEquals(0, t0.numPeople());
    assertEquals("(Silence - no one is here to say sorry.)", salutation);

    Table t2 = new Table(2);
    salutation = t2.addPerson("Beth");
    assertEquals(2, t2.numChairs());
    assertEquals(1, t2.numPeople());
    assertEquals("(Silence - no one is here to say hello.)", salutation);

    salutation = t2.addPerson("Jim");
    assertEquals(2, t2.numChairs());
    assertEquals(2, t2.numPeople());
    assertEquals("Welcome Jim!", salutation);

    salutation = t2.addPerson("Wally");
    assertEquals(2, t2.numChairs());
    assertEquals(2, t2.numPeople());
    assertEquals("Sorry - there is no space for you Wally.", salutation);

    assertEquals("[Beth, Jim]", t2.getPeople());
  }

  /**
   * Tests the {@link SnackTable#addPerson(String)} method.
   */
  @Order(26)
  @Test
  public void testSnackTableAddPerson() {
    String salutation;

    SnackTable t0 = new SnackTable(0);
    salutation = t0.addPerson("Katherine");
    assertEquals(0, t0.numChairs());
    assertEquals(0, t0.numPeople());
    assertEquals("(Silence - no one is here to say sorry.)", salutation);

    SnackTable t2 = new SnackTable(2);
    salutation = t2.addPerson("Beth");
    assertEquals(2, t2.numChairs());
    assertEquals(1, t2.numPeople());
    assertEquals("(Silence - no one is here to say hello.)", salutation);

    salutation = t2.addPerson("Jim");
    assertEquals(2, t2.numChairs());
    assertEquals(2, t2.numPeople());
    assertEquals("Welcome Jim!", salutation);

    salutation = t2.addPerson("Wally");
    assertEquals(2, t2.numChairs());
    assertEquals(2, t2.numPeople());
    assertEquals("Sorry - there is no space for you Wally.", salutation);

    assertEquals("[Beth, Jim]", t2.getPeople());
  }

  /**
   * Tests the {@link HochTable#addPerson(String)} method.
   */
  @Order(27)
  @Test
  public void testHochTableAddPerson() {
    String salutation;

    HochTable t0 = new HochTable(0);
    salutation = t0.addPerson("Katherine");
    assertEquals(1, t0.numChairs());
    assertEquals(1, t0.numPeople());
    assertEquals("(Silence - no one is here to say hello.)", salutation);

    HochTable t2 = new HochTable(2);
    salutation = t2.addPerson("Beth");
    assertEquals(2, t2.numChairs());
    assertEquals(1, t2.numPeople());
    assertEquals("(Silence - no one is here to say hello.)", salutation);

    salutation = t2.addPerson("Jim");
    assertEquals(2, t2.numChairs());
    assertEquals(2, t2.numPeople());
    assertEquals("Welcome Jim!", salutation);

    salutation = t2.addPerson("Wally");
    assertEquals(3, t2.numChairs());
    assertEquals(3, t2.numPeople());
    assertEquals("Welcome Wally!", salutation);

    assertEquals("[Beth, Jim, Wally]", t2.getPeople());
  }

  /**
   * Tests the {@link SuperFriendlyHochTable#addPerson(String)} method.
   */
  @Order(28)
  @Test
  public void testSuperFriendlyHochTableAddPerson() {
    String salutation;

    SuperFriendlyHochTable t0 = new SuperFriendlyHochTable(0);
    salutation = t0.addPerson("Katherine");
    assertEquals(1, t0.numChairs());
    assertEquals(1, t0.numPeople());
    assertEquals("(Silence - no one is here to say hello.)", salutation);

    SuperFriendlyHochTable t2 = new SuperFriendlyHochTable(2);
    salutation = t2.addPerson("Beth");
    assertEquals(2, t2.numChairs());
    assertEquals(1, t2.numPeople());
    assertEquals("(Silence - no one is here to say hello.)", salutation);

    salutation = t2.addPerson("Jim");
    assertEquals(2, t2.numChairs());
    assertEquals(2, t2.numPeople());
    assertEquals("Welcome Jim! Thanks Beth!!!!!", salutation);

    salutation = t2.addPerson("Wally");
    assertEquals(3, t2.numChairs());
    assertEquals(3, t2.numPeople());
    assertEquals("Welcome Wally! Thanks Beth, Jim!!!!!", salutation);

    assertEquals("[Beth, Jim, Wally]", t2.getPeople());
  }

  /*-------------------
   * Remove Person
   *-------------------*/

  /**
   * Tests the {@link Table#removePerson(String)} method.
   */
  @Order(29)
  @Test
  public void testTableRemovePerson() {
    String salutation;

    Table t3 = new Table(3);
    t3.addPerson("Beth");
    salutation = t3.removePerson("Alien");
    assertEquals(3, t3.numChairs());
    assertEquals(1, t3.numPeople());
    assertEquals("Weird! Alien was not here!", salutation);

    t3.addPerson("Jim");
    t3.addPerson("Wally");
    salutation = t3.removePerson("Jim");
    assertEquals(3, t3.numChairs());
    assertEquals(2, t3.numPeople());
    assertEquals("Bye Jim.", salutation);

    salutation = t3.removePerson("Jim");
    assertEquals(3, t3.numChairs());
    assertEquals(2, t3.numPeople());
    assertEquals("Weird! Jim was not here!", salutation);

    salutation = t3.removePerson("Beth");
    assertEquals(3, t3.numChairs());
    assertEquals(1, t3.numPeople());
    assertEquals("Bye Beth.", salutation);

    salutation = t3.removePerson("Wally");
    assertEquals(3, t3.numChairs());
    assertEquals(0, t3.numPeople());
    assertEquals("(Silence - no one is here to say goodbye.)", salutation);
  }

  /**
   * Tests the {@link SnackTable#removePerson(String)} method.
   */
  @Order(30)
  @Test
  public void testSnackTableRemovePerson() {
    String salutation;

    SnackTable t3 = new SnackTable(3);
    t3.addPerson("Beth");
    salutation = t3.removePerson("Alien");
    assertEquals(3, t3.numChairs());
    assertEquals(1, t3.numPeople());
    assertEquals("Weird! Alien was not here!", salutation);

    t3.addPerson("Jim");
    t3.addPerson("Wally");
    salutation = t3.removePerson("Jim");
    assertEquals(3, t3.numChairs());
    assertEquals(2, t3.numPeople());
    assertEquals("Bye Jim.", salutation);

    salutation = t3.removePerson("Jim");
    assertEquals(3, t3.numChairs());
    assertEquals(2, t3.numPeople());
    assertEquals("Weird! Jim was not here!", salutation);

    salutation = t3.removePerson("Beth");
    assertEquals(3, t3.numChairs());
    assertEquals(1, t3.numPeople());
    assertEquals("Bye Beth.", salutation);

    salutation = t3.removePerson("Wally");
    assertEquals(3, t3.numChairs());
    assertEquals(0, t3.numPeople());
    assertEquals("(Silence - no one is here to say goodbye.)", salutation);
  }

  /**
   * Tests the {@link HochTable#removePerson(String)} method.
   */
  @Order(31)
  @Test
  public void testHochTableRemovePerson() {
    String salutation;

    HochTable t2 = new HochTable(2);
    t2.addPerson("Beth");
    salutation = t2.removePerson("Alien");
    assertEquals(2, t2.numChairs());
    assertEquals(1, t2.numPeople());
    assertEquals("Weird! Alien was not here!", salutation);

    t2.addPerson("Jim");
    t2.addPerson("Wally");
    salutation = t2.removePerson("Jim");
    assertEquals(3, t2.numChairs());
    assertEquals(2, t2.numPeople());
    assertEquals("Bye Jim.", salutation);

    salutation = t2.removePerson("Jim");
    assertEquals(3, t2.numChairs());
    assertEquals(2, t2.numPeople());
    assertEquals("Weird! Jim was not here!", salutation);

    salutation = t2.removePerson("Beth");
    assertEquals(3, t2.numChairs());
    assertEquals(1, t2.numPeople());
    assertEquals("Bye Beth.", salutation);

    salutation = t2.removePerson("Wally");
    assertEquals(3, t2.numChairs());
    assertEquals(0, t2.numPeople());
    assertEquals("(Silence - no one is here to say goodbye.)", salutation);
  }

  /**
   * Tests the {@link SuperFriendlyHochTable#removePerson(String)} method.
   */
  @Order(32)
  @Test
  public void testSuperFriendlyHochTableRemovePerson() {
    String salutation;

    SuperFriendlyHochTable t2 = new SuperFriendlyHochTable(2);
    t2.addPerson("Beth");
    salutation = t2.removePerson("Alien");
    assertEquals(2, t2.numChairs());
    assertEquals(1, t2.numPeople());
    assertEquals("Weird! Alien was not here!", salutation);

    t2.addPerson("Jim");
    t2.addPerson("Wally");
    salutation = t2.removePerson("Jim");
    assertEquals(3, t2.numChairs());
    assertEquals(2, t2.numPeople());
    assertEquals("Bye Jim. Bye Beth, Wally.", salutation);

    salutation = t2.removePerson("Jim");
    assertEquals(3, t2.numChairs());
    assertEquals(2, t2.numPeople());
    assertEquals("Weird! Jim was not here!", salutation);

    salutation = t2.removePerson("Beth");
    assertEquals(3, t2.numChairs());
    assertEquals(1, t2.numPeople());
    assertEquals("Bye Beth. Bye Wally.", salutation);

    salutation = t2.removePerson("Wally");
    assertEquals(3, t2.numChairs());
    assertEquals(0, t2.numPeople());
    assertEquals("(Silence - no one is here to say goodbye.)", salutation);
  }

  /*-------------------
   * Specific Methods
   *-------------------*/

  /**
   * Tests the {@link SnackTable} specific methods.
   */
  @Order(33)
  @Test
  public void testSnackTableMethods() {
    int numSnacks;
    String salutation;

    // number of seats < number of snacks
    int numChairsSmall = 1;
    SnackTable tSmall = new SnackTable(numChairsSmall);
    numSnacks = SnackTable.BAG_OF_SNACKS;
    assertEquals(0, tSmall.numSnacks());

    salutation = tSmall.addHungryPerson("Beth");
    assertEquals(numChairsSmall, tSmall.numChairs());
    assertEquals(0, tSmall.numPeople());
    assertEquals(0, tSmall.numSnacks());
    assertEquals("(Silence - no one is here to say sorry.)", salutation);

    tSmall.addSnacks();
    assertEquals(numChairsSmall, tSmall.numChairs());
    assertEquals(0, tSmall.numPeople());
    assertEquals(numSnacks, tSmall.numSnacks());

    salutation = tSmall.addHungryPerson("Jim");
    numSnacks--;
    assertEquals(numChairsSmall, tSmall.numChairs());
    assertEquals(1, tSmall.numPeople());
    assertEquals(numSnacks, tSmall.numSnacks());
    assertEquals("(Silence - no one is here to say hello.) Jim says yummy!",
        salutation);

    // chairs exhausted
    salutation = tSmall.addHungryPerson("Wally");
    assertEquals(numChairsSmall, tSmall.numChairs());
    assertEquals(1, tSmall.numPeople());
    assertEquals(numSnacks, tSmall.numSnacks());
    assertEquals("Sorry - there is no space for you Wally.", salutation);

    // number of seats > number of snacks
    int numChairsLarge = SnackTable.BAG_OF_SNACKS + 2;
    SnackTable tLarge = new SnackTable(numChairsLarge);
    numSnacks = SnackTable.BAG_OF_SNACKS;
    assertEquals(0, tLarge.numSnacks());

    salutation = tLarge.addHungryPerson("Beth");
    assertEquals(numChairsLarge, tLarge.numChairs());
    assertEquals(0, tLarge.numPeople());
    assertEquals(0, tLarge.numSnacks());
    assertEquals("(Silence - no one is here to say sorry.)", salutation);

    tLarge.addSnacks();
    assertEquals(numChairsLarge, tLarge.numChairs());
    assertEquals(0, tLarge.numPeople());
    assertEquals(numSnacks, tLarge.numSnacks());

    salutation = tLarge.addHungryPerson("Jim");
    numSnacks--;
    assertEquals(numChairsLarge, tLarge.numChairs());
    assertEquals(1, tLarge.numPeople());
    assertEquals(numSnacks, tLarge.numSnacks());
    assertEquals("(Silence - no one is here to say hello.) Jim says yummy!",
        salutation);

    // exhaust snacks
    for (int i = numSnacks; i > 0; i--) {
      salutation = tLarge.addHungryPerson("Person " + i);
    }
    assertEquals(numChairsLarge, tLarge.numChairs());
    assertEquals(6, tLarge.numPeople());
    assertEquals(0, tLarge.numSnacks());

    // snacks exhausted
    salutation = tLarge.addHungryPerson("Wally");
    assertEquals(numChairsLarge, tLarge.numChairs());
    assertEquals(6, tLarge.numPeople());
    assertEquals(0, tLarge.numSnacks());
    assertEquals("Sorry - there is no snack for you Wally.", salutation);
  }

  /**
   * Tests the {@link HochTable#classStartingSoon()} method.
   */
  @Order(34)
  @Test
  public void testHochTableClassStartingSoon() {
    String salutation;

    HochTable t1 = new HochTable(1);
    salutation = t1.classStartingSoon();
    assertEquals(0, t1.numPeople());
    assertEquals("[]", t1.getPeople());
    assertEquals("(Silence - no one is here to say goodbye.)", salutation);

    HochTable t5 = new HochTable(5);
    t5.addPerson("Beth");
    t5.addPerson("Jim");
    t5.addPerson("Zach");
    t5.addPerson("Melissa");
    t5.addPerson("Julie");
    t5.addPerson("Ben");
    t5.addPerson("Arthi");

    salutation = t5.classStartingSoon();
    assertEquals(0, t5.numPeople());
    assertEquals("[]", t5.getPeople());
    assertEquals("(Silence - everyone runs to class.)", salutation);
  }

  /**
   * Tests the {@link SuperFriendlyHochTable#classStartingSoon()} method.
   */
  @Order(35)
  @Test
  public void testSuperFriendlyHochTableClassStartingSoon() {
    String salutation;

    SuperFriendlyHochTable t1 = new SuperFriendlyHochTable(1);
    salutation = t1.classStartingSoon();
    assertEquals(0, t1.numPeople());
    assertEquals("[]", t1.getPeople());
    assertEquals("(Silence - no one is here to say goodbye.)", salutation);

    SuperFriendlyHochTable t5 = new SuperFriendlyHochTable(5);
    t5.addPerson("Beth");
    t5.addPerson("Jim");
    t5.addPerson("Zach");
    t5.addPerson("Melissa");
    t5.addPerson("Julie");
    t5.addPerson("Ben");
    t5.addPerson("Arthi");

    salutation = t5.classStartingSoon();
    assertEquals(0, t5.numPeople());
    assertEquals("[]", t5.getPeople());
    assertEquals("Bye everyone!", salutation);
  }
}
