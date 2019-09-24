package de.consol.dus.graal.numbercrunching.primenumbers.java;

import de.consol.dus.graal.numbercrunching.primenumbers.PrimeNumberJMH;

public class PrimeNumberArrayListJMH extends PrimeNumberJMH {

  @Override
  protected PrimeNumberArrayList getFreshInstance() {
    return new PrimeNumberArrayList();
  }
}