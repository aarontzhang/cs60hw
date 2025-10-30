package com.gradescope.hw2;

/**
 * Includes implementations implemented recursively.
 * 
 * @author HMC CS 60 Instructors
 * @version Fall 2025
 */
public class Recursion {
  /**
   * Determines the number of ways to choose {@code k} unordered items from a
   * list of {@code n} items. Called "n choose k" in combinatorics:
   * {@code (n choose k) = n! / (k!(n-k)!)}, where {@code !} is the factorial
   * operation.
   * 
   * <p>
   * For example, (4 choose 2) = 6 because there are six ways to choose two
   * dwarves from a list of four (Happy, Sleepy, Grumpy, Dopey): 1: (Happy,
   * Sleepy) 2: (Happy, Grumpy) 3: (Happy, Dopey) 4: (Sleepy, Grumpy) 5:
   * (Sleepy, Dopey) 6: (Grumpy, Dopey)
   * 
   * <p>
   * This implements "choose" recursively.
   * 
   * @param n a positive integer indicating the number of items in a list
   * @param k a nonnegative integer {@code <= n} indicating the number of items
   *          to choose
   * @return (n choose k)
   */
  public static int choose(int n, int k) {
    if (k > n) {
      return 0;
    }
  // Base cases
    if (k == 0 || k == n){
      return 1; 
    } else { 
  // Following racket logic given
      return (choose(n - 1, k) * n) / (n - k);
    }
  }

  // Racket Implementation:
  // -------------------------------------
  // (define (choose n k)
  // (if (or (= k 0) (= k n))
  // 1
  // (/ (* (choose (- n 1) (- k 1)) n) k)))

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
  private Recursion() {
  }
}
