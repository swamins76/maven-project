package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

/**
* @param Swaminathan
* @return greeting string
*/

  public final String greet(final String someone) {
    return String.format("i modified, %s!", someone);
  }
}
