package com.gradescope.hw7;

/**
 * An instrument.
 * 
 * @author HMC CS 60 Instructors
 * @version Fall 2025
 */
public class Instrument {
  /** The key of the instrument. */
  private String key;

  /**
   * Initializes a new instrument object.
   * 
   * @param key the key of the instrument
   */
  public Instrument(String key) {
    this.key = key;
  }

  /**
   * Returns the key of this instrument.
   * 
   * @return the key of this instrument
   */
  public String getKey() {
    return this.key;
  }
}
