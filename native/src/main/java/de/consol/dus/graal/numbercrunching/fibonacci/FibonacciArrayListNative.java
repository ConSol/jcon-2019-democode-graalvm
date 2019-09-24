package de.consol.dus.graal.numbercrunching.fibonacci;

import de.consol.dus.graal.numbercrunching.fibonacci.java.FibonacciArrayList;

public class FibonacciArrayListNative extends FibonacciNative {

  private static final int NTH = 8_388_608;

  @Override
  public int getNth() {
    return NTH;
  }

  @Override
  protected FibonacciArrayList getFreshInstance() {
    return new FibonacciArrayList();
  }

  public static void main(final String... args) {
    new FibonacciArrayListNative().benchmark();
  }
}