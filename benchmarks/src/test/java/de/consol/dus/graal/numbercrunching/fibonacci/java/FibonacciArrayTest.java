package de.consol.dus.graal.numbercrunching.fibonacci.java;

import de.consol.dus.graal.numbercrunching.fibonacci.FibonacciTest;
import de.consol.dus.graal.numbercrunching.fibonacci.java.FibonacciArray;

public class FibonacciArrayTest extends FibonacciTest {

  @Override
  protected FibonacciArray getFreshInstance() {
    return new FibonacciArray();
  }
}