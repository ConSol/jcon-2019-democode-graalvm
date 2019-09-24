package de.consol.dus.graal.numbercrunching.fibonacci.js;

import de.consol.dus.graal.numbercrunching.fibonacci.FibonacciTest;

public class FibonacciIterativeTest extends FibonacciTest {

  @Override
  protected FibonacciIterative getFreshInstance() {
    return new FibonacciIterative();
  }
}