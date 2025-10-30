package com.gradescope.hw1;

/**
 * Explores basic Java syntax. Go to the {@link BasicPests} class for test
 * cases. Most of the content is based upon problems at CodingBat.com or
 * developed by Mudd faculty.
 * 
 * @author HMC CS 60 Instructors
 * @version Fall 2025
 * 
 * @see BasicsTests
 * @see <a href="https://codingbat.com/java">codingbat.com</a>
 */
public class Basics {

  /**
   * The parameter weekday is true if it is a weekday, and the parameter
   * vacation is true if we are on vacation. We sleep in if it is not a weekday
   * or we're on vacation. Return true if we sleep in.
   *
   * @param weekday  true if it is a weekday
   * @param vacation true if we are on vacation
   * @return true if we sleep in
   * 
   */
  public static boolean sleepIn(boolean weekday, boolean vacation) {
    // check if not weekday or vacation 
    if (!weekday || vacation){
      return true;
    }
    else {
      return false;
    }
  }

  /**
   * Given 2 ints, a and b, return true if one of them is 10 or if their sum is
   * 10.
   * 
   * @param a the first integer
   * @param b the second integer
   * @return true if one of them or their sum is 10
   *
   */
  public static boolean makes10(int a, int b) {
    //check individually, then sum 
    if (a == 10 || b == 10 || a + b == 10) {
      return true;
    } 
    else {
      return false;
    }
  }

  /**
   * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate
   * if each is smiling. We are in trouble if they are both smiling or if
   * neither of them is smiling. Return true if we are in trouble.
   * 
   * @param aSmile true if monkey a is smiling
   * @param bSmile true if monkey b is smiling
   * @return true if we are in trouble
   * 
   */
  public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    if (aSmile == bSmile) { 
      return true;
    } 
    else { 
      return false;
      }
    }
  

  /**
   * Given 2 int values, return true if either of them is in the range 10..20
   * inclusive.
   * 
   * @param a the first integer
   * @param b the second integer
   * @return true if either integer is between 10 and 20 inclusive
   * 
   */
  public static boolean in10to20(int a, int b) {
    if (a >= 10 && a <= 20 || b >= 10 && b <= 20){
      return true; 
    }
    else {
      return false;
    }
  }

  /**
   * Given two temperatures, return true if one is less than 0 and the other is
   * greater than 100.
   * 
   * @param temp1 the first temperature
   * @param temp2 the second temperature
   * @return true if one temperature is less than 0 (icy) and the other is
   *         greater than 100 (hot)
   * 
   */
  public static boolean isIcyHot(int temp1, int temp2) {
    if (temp1 < 0 && temp2 > 100 || temp1 > 100 && temp2 < 0){
      return true; 
    }
    else {
      return false;
    }
  }

  /**
   * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
   * Given 3 int values, return true if 1 or more of them are teen.
   * 
   * @param a the first integer
   * @param b the second integer
   * @param c the third integer
   * @return true if 1 or more of the integers are a teen
   * 
   */
  public static boolean hasTeen(int a, int b, int c) {
    if (a >= 13 && a <= 19 || b >= 13 && b <= 19 || c >= 13 && c <= 19 ){
      return true;
    }
    else {
      return false;
    }
  }

  /**
   * Given two non-negative int values, return true if they have the same last
   * digit, such as with 27 and 57. Note that the % "mod" operator computes
   * remainders, so 17 % 10 is 7.
   * 
   * @param a the first non-negative integer
   * @param b the second non-negative integer
   * @return true if the integers have the same last digit
   * 
   */
  public static boolean sameLastDigit(int a, int b) {
    if (a % 10 == b % 10){ 
      return true;
    }
    else { 
      return false;
    }
  }

  /**
   * Given 2 int values, return true if one is negative and one is positive.
   * Except if the parameter "negative" is true, then return true only if both
   * are negative.
   * 
   * @param a        the first integer
   * @param b        the second integer
   * @param negative toggles whether to test for only negative values
   * @return true if one number is negative and one is positive, unless the
   *         negative toggle is true, then returns true only if both numbers are
   *         negative
   * 
   * @see <a href="https://codingbat.com/prob/p159227">Source: CodingBat.com</a>
   */
  public static boolean isPositiveOrNegative(int a, int b, boolean negative) {
    // branch 1 - if negative, both must be negative 
    if (negative) {
      if (a < 0 && b < 0) {
        return true;
      } else {
        return false;
      }
    // branch 2 - if not negative, one negative one positive
    } else {
      if ((a > 0 && b < 0) || (a < 0 && b > 0)) {
        return true;
      } else {
        return false;
      }
    }
  }

  /**
   * Given 2 int values, return the largest.
   * 
   * @param a the first integer
   * @param b the second integer
   * @return the largest integer of the two
   * 
   */
  public static int calculateMax(int a, int b) {
    return Math.max(a, b);
  }

  /**
   * Given 4 int values, return the largest.
   * 
   * @param a the first integer
   * @param b the second integer
   * @param c the third integer
   * @param d the fourth integer
   * @return the largest integer of the four
   * 
   */
  public static int calculateMax(int a, int b, int c, int d) {
    return calculateMax(d,calculateMax(c,calculateMax(a,b)));
  }

  /**
   * Given 2 int values, return the value with the highest absolute value.
   * 
   * @param a the first integer
   * @param b the second integer
   * @return the integer with the highest absolute value
   * 
   */
  public static int calculateAbsoluteMax(int a, int b) {
    if (Math.abs(a) > Math.abs(b)) {
      return a;
    } else {
      return b;
    }
  }

  /**
   * Given the radius of a circle, calculate its perimeter.
   * 
   * @param radius the circle radius
   * @return the perimeter (or circumference)
   * 
   */
  public static double calculatePerimeter(double radius) {
    return (2 * Math.PI * radius); 
  }

  /**
   * Runs this class. Useful for debugging, but use the {@link BasicsTests}
   * class for test cases and grading.
   * 
   * @param args unused command-line arguments
   */
  public static void main(String[] args) {
    System.out.println("""
        --------------------------------------------
        Message from the CS 60 teaching team:

        Run the tests in BasicsTests.java instead of
        running Basics.java!

        Running a Java file calls the main method,
        not the test cases.

        You can find the text of this message at the
        bottom of the file: Basics.java
        --------------------------------------------
        """);

    // You can add debugging statements here to test your methods!
  }
}
