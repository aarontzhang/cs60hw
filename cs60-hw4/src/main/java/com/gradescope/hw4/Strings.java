package com.gradescope.hw4;

/**
 * Fill in the body of the methods below based upon the specification provided.
 * It may be helpful to look at the test cases provided in {@link StringsTests}
 * to understand the intended behavior of the method.
 * 
 * All content is based upon problems at
 * <a href="https://codingbat.com/">CodingBat.com</a>.
 * 
 * @see StringsTests
 * 
 * @author HMC CS 60 Instructors
 * @version Fall 2025
 */
public class Strings {
  // add "not " prefix if not there
  public static String notString(String text) {
    if (text.startsWith("not")) {
      return text; // already starts with "not"
    }
    return "not " + text; // add "not " prefix
  }

  // remove character at given index
  public static String missingChar(String text, int index) {
    String before = text.substring(0, index); // chars before index
    String after = text.substring(index + 1); // chars after index
    return before + after; // combine without char at index
  }

  // swap first and last characters
  public static String frontBack(String text) {
    if (text.length() <= 1) {
      return text; // nothing to swap for short strings
    }
    char first = text.charAt(0); // first char
    char last = text.charAt(text.length() - 1); // last char
    String middle = text.substring(1, text.length() - 1); // middle part
    return last + middle + first; // swap first and last
  }

  // return first 3 chars repeated 3 times
  public static String front3(String text) {
    String front;
    if (text.length() < 3) {
      front = text; // use entire string if less than 3 chars
    } else {
      front = text.substring(0, 3); // first 3 chars
    }
    return front + front + front; // repeat 3 times
  }

  // add last char to front and back
  public static String backAround(String text) {
    char lastChar = text.charAt(text.length() - 1); // get last char
    return lastChar + text + lastChar; // add to front and back
  }

  // add first 2 chars to front and back
  public static String front22(String text) {
    String front;
    if (text.length() < 2) {
      front = text; // use entire string if less than 2 chars
    } else {
      front = text.substring(0, 2); // first 2 chars
    }
    return front + text + front; // add to front and back
  }

  // check if string starts with "hi"
  public static boolean startHi(String text) {
    if (text.length() < 2) {
      return false; // too short to start with "hi"
    }
    return text.substring(0, 2).equals("hi"); // check first 2 chars
  }

  // return "o" and "z" if string starts with those chars
  public static String startOz(String text) {
    String result = "";
    if (text.length() >= 1 && text.charAt(0) == 'o') {
      result += "o"; // add "o" if first char is 'o'
    }
    if (text.length() >= 2 && text.charAt(1) == 'z') {
      result += "z"; // add "z" if second char is 'z'
    }
    return result; // return combined result
  }

  /**
   * Produces console output to help debug this class.
   * 
   * @param args unused
   */
  public static void main(String[] args) {
    // You can add debugging statements here to test your methods!
  }

  /**
   * Private constructor to prevent instantiating this class of static methods.
   */
  private Strings() {
  }

}
