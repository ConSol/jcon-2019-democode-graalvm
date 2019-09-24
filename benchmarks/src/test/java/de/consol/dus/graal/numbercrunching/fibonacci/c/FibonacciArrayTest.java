package de.consol.dus.graal.numbercrunching.fibonacci.c;

import de.consol.dus.graal.numbercrunching.fibonacci.FibonacciTest;

public class FibonacciArrayTest extends FibonacciTest {

  @Override
  protected FibonacciArray getFreshInstance() {
    return new FibonacciArray();
  }
}