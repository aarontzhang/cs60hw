package com.gradescope.hw5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CookieTests {

// Part B 
  @Test
  public void testDefaultConstructor_isSugar() {
    // check default constructor
    Cookie c = new Cookie();
    assertEquals("sugar", c.getType());
    assertEquals(400, c.getCalories()); 
    assertEquals("[butter, sugar, eggs, flour]", c.listIngredients()); 
  }

  @Test
  public void testConstructor_sugarRecipe() {
    // sugar 
    Cookie c = new Cookie("sugar");
    assertEquals("sugar", c.getType());
    assertEquals(400, c.getCalories());
    assertEquals("[butter, sugar, eggs, flour]", c.listIngredients());
  }

  @Test
  public void testConstructor_chocolateChipRecipe() {
    // chocolate chip
    Cookie c = new Cookie("chocolate chip");
    assertEquals("chocolate chip", c.getType());
    assertEquals(500, c.getCalories());
    assertEquals("[chocolate chips, butter, sugar, eggs, flour]", c.listIngredients());
  }

  @Test
public void testConstructor_glutenFreeRecipe() {
  // gluten free
  Cookie c = new Cookie("gluten free");
  assertEquals("gluten free", c.getType()); // check type
  assertEquals(400, c.getCalories());
  assertEquals("[eggs, sugar, peanut butter, chocolate chips]", c.listIngredients());
}

  @Test
  public void testConstructor_otherType_pluralizedFirstIngredient() {
    // other -> cookieType + s first
    Cookie c = new Cookie("raisin");
    assertEquals("raisin", c.getType()); // typestays
    assertEquals(500, c.getCalories());
    assertEquals("[raisins, butter, sugar, eggs, flour]", c.listIngredients());
  }

  @Test
  public void testAddIngredient_appendsAndUpdatesCalories() {
    // addIngredient and add 100 to cals
    Cookie c = new Cookie("sugar"); // start at 4
    c.addIngredient("vanilla");
    assertEquals(500, c.getCalories()); //set to 5
    assertEquals("[butter, sugar, eggs, flour, vanilla]", c.listIngredients());
  }

// Part C 
  @Test
public void testResetCookieCount_setsZero() {
  // reset
  Cookie.resetCookieCount();
  assertEquals(0, Cookie.getCookieCount());
}

@Test
public void testCookieCount_from0to1() {
  // 0 -> 1 after one constructions
  Cookie.resetCookieCount();
  new Cookie();
  assertEquals(1, Cookie.getCookieCount());
}

@Test
public void testCookieCount_from0to4() {
  // 0 -> 4 after four constructions
  Cookie.resetCookieCount();
  for (int i = 0; i < 4; i++) new Cookie();
  assertEquals(4, Cookie.getCookieCount());
}

@Test
public void testRightNumberOfCookies_isSix() {
  assertEquals(6, Cookie.rightNumberOfCookies());
}

@Test
public void testIsDeliciousCookieType_prefixChocolate() {
  //true if starts with chocolate
  assertEquals(true, Cookie.isDeliciousCookieType("chocolate chip"));
  assertEquals(true, Cookie.isDeliciousCookieType("chocolate lava"));
  assertEquals(false, Cookie.isDeliciousCookieType("sugar"));
  assertEquals(false, Cookie.isDeliciousCookieType("white chocolate"));
}

// Part D
  @Test
  public void testCookieBox_startsEmpty() {
    // new box
    CookieBox box = new CookieBox();
    assertEquals(0, box.totalCaloriesInBox());
  }

  @Test
  public void testAddCookie_addsCaloriesOnce() {
    // add 1 cookie
    CookieBox box = new CookieBox();
    Cookie c = new Cookie("sugar"); // 400 cals
    box.addCookie(c);
    assertEquals(400, box.totalCaloriesInBox());
  }

  @Test
  public void testAddMultipleCookies_accumulates() {
    // add 3 cookies
    CookieBox box = new CookieBox();
    box.addCookie(new Cookie("sugar"));          // 400 +
    box.addCookie(new Cookie("chocolate chip")); // 500 +
    box.addCookie(new Cookie("gluten free"));    // 400 = 1300
    assertEquals(1300, box.totalCaloriesInBox());
  }

}
