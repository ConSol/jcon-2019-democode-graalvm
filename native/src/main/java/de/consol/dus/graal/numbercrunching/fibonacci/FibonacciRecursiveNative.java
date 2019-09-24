package de.consol.dus.graal.numbercrunching.fibonacci;

import de.consol.dus.graal.numbercrunching.fibonacci.java.FibonacciRecursive;

public class FibonacciRecursiveNative extends FibonacciNative {

  private static final int NTH = 40;

  @Override
  public int getNth() {
    return NTH;
  }

  @Override
  protected FibonacciRecursive getFreshInstance() {
    return new FibonacciRecursive();
  }

  public static void main(final String... args) {
    new FibonacciRecursiveNative().benchmark();
  }
}