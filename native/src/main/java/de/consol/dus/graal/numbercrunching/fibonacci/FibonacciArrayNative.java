package de.consol.dus.graal.numbercrunching.fibonacci;

import de.consol.dus.graal.numbercrunching.fibonacci.java.FibonacciArray;

public class FibonacciArrayNative extends FibonacciNative {

  @Override
  protected FibonacciArray getFreshInstance() {
    return new FibonacciArray();
  }

  public static void main(final String... args) {
    new FibonacciArrayNative().benchmark();
  }
}