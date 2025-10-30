package com.gradescope.hw5;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Tests the {@link Image} class.
 * 
 * @see Image
 * 
 * @author HMC CS 60 Instructors
 * @version Fall 2025
 */
public class ImageTests {
  /** Initializes these tests. */
  public ImageTests() {
  }

  /**
   * Tests the result of the {@link Image#equals(Image)} method.
   * 
   * @see Image#equals(Image)
   */
  @Test
  public void equalImages() {
    char[][] one = { { '1', '2' }, { '3', '4' }, { '5', '6' } };
    char[][] two = { { '1', '2' }, { '3', '4' }, { '5', '6' } };

    Image oneImage = new Image(one);
    Image twoImage = new Image(two);

    assertTrue(oneImage.equals(twoImage));
  }

  /**
   * Tests the result of the {@link Image#equals(Image)} method.
   * 
   * @see Image#equals(Image)
   */
  @Test
  public void equalSizeDifferentImages() {
    char[][] one = { { '1', '2' }, { '3', '4' }, { '5', '6' } };
    char[][] two = { { '6', '5' }, { '4', '3' }, { '2', '1' } };

    Image oneImage = new Image(one);
    Image twoImage = new Image(two);

    assertFalse(oneImage.equals(twoImage));
  }

  /**
   * Tests the result of the {@link Image#equals(Image)} method.
   * 
   * @see Image#equals(Image)
   */
  @Test
  public void equalImagesDifferentSize() {
    char[][] one = { { '1', '1', '1' }, { '1', '1', '1' }, { '1', '1', '1' } };

    char[][] two = { { '1', '1' }, { '1', '1' } };

    Image oneImage = new Image(one);
    Image twoImage = new Image(two);

    assertFalse(oneImage.equals(twoImage));
  }

  /**
   * Tests the result of the {@link Image#flipVertical()} method.
   * 
   * @see Image#flipVertical()
   */
  @Test
  public void flipVertical2x2() {
    char[][] original = { { '1', '2' }, { '3', '4' } };
    char[][] expected = { { '3', '4' }, { '1', '2' } };

    Image originalImage = new Image(original);
    Image expectedImage = new Image(expected);

    Image actualImage = originalImage.flipVertical();

    assertTrue(expectedImage.equals(actualImage));
  }

  /**
   * Tests the result of the {@link Image#flipVertical()} method.
   * 
   * @see Image#flipVertical()
   */
  @Test
  public void flipVertical2x3() {
    char[][] original = { { '1', '2' }, { '3', '4' }, { '5', '6' } };
    char[][] expected = { { '5', '6' }, { '3', '4' }, { '1', '2' } };

    Image originalImage = new Image(original);
    Image expectedImage = new Image(expected);

    Image actualImage = originalImage.flipVertical();

    assertTrue(expectedImage.equals(actualImage));
  }

  /**
   * Tests the result of the {@link Image#flipDiagonal()} method.
   * 
   * @see Image#flipDiagonal()
   */
  @Test
  public void flipDiagonal() {
    char[][] original = { { '1', '2' }, { '3', '4' } };
    char[][] expected = { { '1', '3' }, { '2', '4' } };

    Image originalImage = new Image(original);
    Image expectedImage = new Image(expected);

    Image actualImage = originalImage.flipDiagonal();

    assertTrue(expectedImage.equals(actualImage));
  }

  /**
   * Tests the result of the {@link Image#rotateRight()} method.
   * 
   * @see Image#rotateRight()
   */
  @Test
  public void rotateRight2x2() {
    char[][] original = { { '1', '2' }, { '3', '4' } };
    char[][] expected = { { '3', '1' }, { '4', '2' } };

    Image originalImage = new Image(original);
    Image expectedImage = new Image(expected);

    Image actualImage = originalImage.rotateRight();

    assertTrue(expectedImage.equals(actualImage));
  }

  /**
   * Tests the result of the {@link Image#rotateRight()} method.
   * 
   * @see Image#rotateRight()
   */
  @Test
  public void rotateRight2x3() {
    char[][] original = { { '1', '2', '3' }, { '4', '5', '6' } };
    char[][] expected = { { '4', '1' }, { '5', '2' }, { '6', '3' } };

    Image originalImage = new Image(original);
    Image expectedImage = new Image(expected);

    Image actualImage = originalImage.rotateRight();

    assertTrue(expectedImage.equals(actualImage));
  }

  /**
   * Tests the result of the {@link Image#rotateRight()} method.
   * 
   * @see Image#rotateRight()
   */
  @Test
  public void rotateRight3x2() {
    char[][] original = { { '1', '2' }, { '3', '4' }, { '5', '6' } };
    char[][] expected = { { '5', '3', '1' }, { '6', '4', '2' } };

    Image originalImage = new Image(original);
    Image expectedImage = new Image(expected);

    Image actualImage = originalImage.rotateRight();

    assertTrue(expectedImage.equals(actualImage));
  }
}
