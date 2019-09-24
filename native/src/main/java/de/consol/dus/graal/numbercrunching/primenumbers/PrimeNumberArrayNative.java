package de.consol.dus.graal.numbercrunching.primenumbers;

import de.consol.dus.graal.numbercrunching.primenumbers.java.PrimeNumberArray;

public class PrimeNumberArrayNative extends PrimeNumberNative {

  @Override
  protected PrimeNumber getFreshInstance() {
    return new PrimeNumberArray();
  }

  public static void main(final String... args) {
    new PrimeNumberArrayNative().benchmark();
  }
}