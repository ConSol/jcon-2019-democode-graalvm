package de.consol.dus.graal.numbercrunching.primenumbers.python;

import de.consol.dus.graal.numbercrunching.primenumbers.PrimeNumberJMH;

public class PrimeNumberArrayJMH extends PrimeNumberJMH {

  @Override
  protected PrimeNumberArray getFreshInstance() {
    return new PrimeNumberArray();
  }
}