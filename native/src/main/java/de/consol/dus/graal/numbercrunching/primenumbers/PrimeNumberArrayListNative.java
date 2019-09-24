package de.consol.dus.graal.numbercrunching.primenumbers;

import de.consol.dus.graal.numbercrunching.primenumbers.java.PrimeNumberArrayList;

public class PrimeNumberArrayListNative extends PrimeNumberNative {

  @Override
  protected PrimeNumber getFreshInstance() {
    return new PrimeNumberArrayList();
  }

  public static void main(final String... args) {
    new PrimeNumberArrayListNative().benchmark();
  }
}