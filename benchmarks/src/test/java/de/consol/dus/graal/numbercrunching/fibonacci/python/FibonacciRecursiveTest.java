package de.consol.dus.graal.numbercrunching.fibonacci.python;

import de.consol.dus.graal.numbercrunching.fibonacci.FibonacciTest;

public class FibonacciRecursiveTest extends FibonacciTest {

  @Override
  protected FibonacciRecursive getFreshInstance() {
    return new FibonacciRecursive();
  }
}