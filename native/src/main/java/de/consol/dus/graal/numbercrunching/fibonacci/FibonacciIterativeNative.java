package de.consol.dus.graal.numbercrunching.fibonacci;

import de.consol.dus.graal.numbercrunching.fibonacci.java.FibonacciIterative;

public class FibonacciIterativeNative extends FibonacciNative {

  @Override
  protected FibonacciIterative getFreshInstance() {
    return new FibonacciIterative();
  }

  public static void main(final String... args) {
    new FibonacciIterativeNative().benchmark();
  }
}