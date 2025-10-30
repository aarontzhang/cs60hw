package com.gradescope.hw5;

/**
 * Represents a box of cookies.
 * 
 * @author CS 60 Cookie Monster
 */
public class CookieBox {
  /*-------------------------------
   * Instance Variables
   *-------------------------------*/

  /**
   * The cookies in this box.
   */
  private Cookie[] allTheCookies;

  /*-------------------------------
   * Constructors
   *-------------------------------*/

  /**
   * Initializes a new box of cookies.
   */
  public CookieBox() {
    // Start with no cookies :-(
    this.allTheCookies = new Cookie[0];
  }

  /*-------------------------------
   * Non-static Methods
   *-------------------------------*/

  /**
   * Adds a single cookie to this cookie box.
   * 
   * @param cookie the cookie to add
   */
  public void addCookie(Cookie cookie) {
    int numCookies = this.allTheCookies.length;
    Cookie[] updatedCookies = new Cookie[numCookies + 1];

    for (int index = 0; index < numCookies; index++) {
      updatedCookies[index] = this.allTheCookies[index];
    }

    updatedCookies[numCookies] = cookie;
    this.allTheCookies = updatedCookies;
  }

  /**
   * Counts the total calories for all the cookies in the this cookie box.
   * 
   * @return the total calorie count
   */
  public int totalCaloriesInBox() {
    int totalCalories = 0;
    int numCookies = this.allTheCookies.length;

    for (int index = 0; index < numCookies; index++) {
      totalCalories += this.allTheCookies[index].getCalories();
    }

    return totalCalories;
  }
}
