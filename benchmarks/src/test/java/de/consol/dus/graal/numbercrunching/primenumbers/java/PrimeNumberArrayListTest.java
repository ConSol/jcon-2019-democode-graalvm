package de.consol.dus.graal.numbercrunching.primenumbers.java;

import de.consol.dus.graal.numbercrunching.primenumbers.PrimeNumberTest;
import de.consol.dus.graal.numbercrunching.primenumbers.java.PrimeNumberArrayList;

public class PrimeNumberArrayListTest extends PrimeNumberTest {

  @Override
  protected PrimeNumberArrayList getFreshInstance() {
    return new PrimeNumberArrayList();
  }
}
