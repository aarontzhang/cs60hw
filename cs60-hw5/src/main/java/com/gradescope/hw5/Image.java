package com.gradescope.hw5;

import java.util.Arrays;

/**
 * Represents a text-based 2D image.
 */
public class Image {
  /** The symbols making up this image. */
  private char[][] image;

  /** The height (in number of symbols) of this image. */
  private int height;

  /** The width (in number of symbols) of this image. */
  private int width;

  /** The contents of a smily face as a text-based image. */
  protected static char[][] smiley = {
      { ' ', '*', '*', '*', '*', '*', '*', '*', '*', '*', ' ' },
      { '*', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '*' },
      { '*', ' ', ' ', '^', ' ', ' ', ' ', '^', ' ', ' ', '*' },
      { '*', ' ', ' ', ' ', ' ', 'N', ' ', ' ', ' ', ' ', '*' },
      { '*', ' ', '\\', ' ', ' ', ' ', ' ', ' ', '/', ' ', '*' },
      { '*', ' ', ' ', '-', '-', '-', '-', '-', ' ', ' ', '*' },
      { '*', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '*' },
      { ' ', '*', '*', '*', '*', '*', '*', '*', '*', '*', ' ' } };

  /**
   * Initializes an image with the provided contents.
   * 
   * @param contents the text-based image contents
   */
  public Image(char[][] contents) {
    this.image = contents;

    // always assume the array is at least of size 1x1
    this.height = this.image.length;
    this.width = this.image[0].length;
  }

  /**
   * Prints the image to the console.
   */
  public void printImage() {
    for (int i = 0; i < height; i++)
    System.out.println(new String(image[i]));
  }

  /**
   * Returns whether two images are equal. Two images are equal if they have the
   * same dimensions and their contents are the same.
   * 
   * @param other the other image
   * @return true if the images have the same contents
   * 
   * @see Arrays#equals(char[], char[])
   */

  public boolean equals(Image other) {
  if (this.height != other.height || this.width != other.width) {
    return false; //if matrix not same size, instantly false 
  }
  for (int i = 0; i < height; i++) {
    if (!java.util.Arrays.equals(this.image[i], other.image[i])) {//match
      return false;
    }
  }

  return true; // all rows match
}

  /**
   * This method mirrors a given m x n array of characters across its bottom
   * edge.
   * 
   * @return the mirrored image
   */
  public Image flipVertical() {
    char[][] flipped = new char[height][width];
    
    // reverse order of rows
    for (int i = 0; i < height; i++) {
      flipped[i] = this.image[height - 1 - i]; 
    }
    
    return new Image(flipped);
  }

  /**
   * This method mirrors a given n x n (square) array across its main diagonal.
   * The main diagonal of a matrix consists of all indices i, j such that i ==
   * j.
   * 
   * @return the image mirroed across the main diagonal
   */
  public Image flipDiagonal() {
    // create new matrix for transposed image
    char[][] flipped = new char[width][height];
    //swap rows and columns across diagonal
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        flipped[j][i] = this.image[i][j];
      }
    }
    
    return new Image(flipped);
  }

  /**
   * This method rotates a given m x n array of characters 90° to the right. If
   * the input array has dimensions m x n, then the output array will have
   * dimensions n x m.
   * 
   * @return the rotated image
   */
  public Image rotateRight() {
    char[][] rotated = new char[width][height];
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        rotated[j][height - 1 - i] = this.image[i][j]; 
      }
    }
    
    return new Image(rotated);
  }

  /**
   * Outputs the smiley face image and its variants.
   * 
   * @param args unused
   */
  public static void main(String[] args) {
    System.out.println("CS60 Face");
    Image face = new Image(smiley);
    face.printImage();

    System.out.println("\nUpside Down");
    face = new Image(smiley).flipVertical();
    face.printImage();

    System.out.println("\nFlip Diagonal");
    face = new Image(smiley).flipDiagonal();
    face.printImage();

    System.out.println("\nRotate Right");
    face = new Image(smiley).rotateRight();
    face.printImage();
  }
}
