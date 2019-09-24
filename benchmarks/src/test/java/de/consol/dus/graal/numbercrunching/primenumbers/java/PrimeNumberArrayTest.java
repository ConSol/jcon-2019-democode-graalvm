package de.consol.dus.graal.numbercrunching.primenumbers.java;

import de.consol.dus.graal.numbercrunching.primenumbers.PrimeNumberTest;
import de.consol.dus.graal.numbercrunching.primenumbers.java.PrimeNumberArray;

public class PrimeNumberArrayTest extends PrimeNumberTest {

  @Override
  protected PrimeNumberArray getFreshInstance() {
    return new PrimeNumberArray();
  }
}
