package com.gradescope.hw4;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * JUnit tests for the {@link Strings} class.
 * 
 * @see Strings
 * 
 * @author HMC CS 60 Instructors
 * @version Fall 2025
 */
@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class StringsTests {
  /**
   * Initializes this class.
   */
  public StringsTests() {
  }

  /**
   * Tests the {@link Strings#notString(String)} method.
   * 
   * @param expected the expected output
   * @param input    the test input
   */
  @Order(1)
  @ParameterizedTest(name = "[{index}] {arguments}")
  @CsvSource(textBlock = """
      not candy, candy
      not x, x
      not bad, not bad
      not bad, bad
      not, not
      not is not, is not
      not no, no
      """)
  public void testNotString(String expected, String input) {
    String actual = Strings.notString(input);
    Assertions.assertEquals(expected, actual);
  }

  /**
   * Tests the {@link Strings#missingChar(String, int)} method.
   * 
   * @param expected the expected output
   * @param input    the test input
   * @param index    the test index
   */
  @Order(2)
  @ParameterizedTest(name = "[{index}] {arguments}")
  @CsvSource(textBlock = """
      ktten, kitten, 1
      itten, kitten, 0
      kittn, kitten, 4
      i, Hi, 0
      H, Hi, 1
      ode, code, 0
      cde, code, 1
      coe, code, 2
      cod, code, 3
      chocolat, chocolate, 8
      """)
  public void testMissingChar(String expected, String input, int index) {
    String actual = Strings.missingChar(input, index);
    Assertions.assertEquals(expected, actual);
  }

  /**
   * Tests the {@link Strings#frontBack(String)} method.
   * 
   * @param expected the expected output
   * @param input    the test input
   */
  @Order(3)
  @ParameterizedTest(name = "[{index}] {arguments}")
  @CsvSource(textBlock = """
      eodc, code
      a, a
      ba, ab
      cba, abc
      '', ''
      ehocolatC, Chocolate
      Java, aavJ
      oellh, hello
      """)
  public void testFrontBack(String expected, String input) {
    String actual = Strings.frontBack(input);
    Assertions.assertEquals(expected, actual);
  }

  /**
   * Tests the {@link Strings#front3(String)} method.
   * 
   * @param expected the expected output
   * @param input    the test input
   */
  @Order(4)
  @ParameterizedTest(name = "[{index}] {arguments}")
  @CsvSource(textBlock = """
      JavJavJav, Java
      ChoChoCho, Chocolate
      abcabcabc, abc
      abcabcabc, abcXYZ
      ababab, ab
      aaa, a
      '', ''
      """)
  public void testFront3(String expected, String input) {
    String actual = Strings.front3(input);
    Assertions.assertEquals(expected, actual);
  }

  /**
   * Tests the {@link Strings#backAround(String)} method.
   * 
   * @param expected the expected output
   * @param input    the test input
   */
  @Order(5)
  @ParameterizedTest(name = "[{index}] {arguments}")
  @CsvSource(textBlock = """
      tcatt, cat
      oHelloo, Hello
      aaa, a
      cabcc, abc
      dreadd, read
      obooo, boo
      """)
  public void testBackAround(String expected, String input) {
    String actual = Strings.backAround(input);
    Assertions.assertEquals(expected, actual);
  }

  /**
   * Tests the {@link Strings#front22(String)} method.
   * 
   * @param expected the expected output
   * @param input    the test input
   */
  @Order(6)
  @ParameterizedTest(name = "[{index}] {arguments}")
  @CsvSource(textBlock = """
      kikittenki, kitten
      HaHaHa, Ha
      ababcab, abc
      ababab, ab
      aaa, a
      '', ''
      LoLogicLo, Logic
      """)
  public void testFront22(String expected, String input) {
    String actual = Strings.front22(input);
    Assertions.assertEquals(expected, actual);
  }

  /**
   * Tests the {@link Strings#startHi(String)} method.
   * 
   * @param expected the expected output
   * @param input    the test input
   */
  @Order(7)
  @ParameterizedTest(name = "[{index}] {arguments}")
  @CsvSource(textBlock = """
      true, hi there
      true, hi
      true, hi ho
      false, hello hi
      false, he
      false, h
      false, ''
      false, ho hi
      """)
  public void testStartHi(boolean expected, String input) {
    boolean actual = Strings.startHi(input);
    Assertions.assertEquals(expected, actual);
  }

  /**
   * Tests the {@link Strings#startOz(String)} method.
   * 
   * @param expected the expected output
   * @param input    the test input
   */
  @Order(8)
  @ParameterizedTest(name = "[{index}] {arguments}")
  @CsvSource(textBlock = """
      oz, ozymandias
      z, bzoo
      o, oxx
      oz, oz
      o, ounce
      o, o
      '', abc
      '', ''
      '', zoo
      z, aztec
      z, zzzz
      oz, oznic
      """)
  public void testStartOz(String expected, String input) {
    String actual = Strings.startOz(input);
    Assertions.assertEquals(expected, actual);
  }
}
