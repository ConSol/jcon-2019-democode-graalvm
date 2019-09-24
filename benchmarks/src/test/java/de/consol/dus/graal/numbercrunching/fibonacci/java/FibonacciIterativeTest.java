package de.consol.dus.graal.numbercrunching.fibonacci.java;

import de.consol.dus.graal.numbercrunching.fibonacci.FibonacciTest;
import de.consol.dus.graal.numbercrunching.fibonacci.java.FibonacciIterative;

public class FibonacciIterativeTest extends FibonacciTest {

  @Override
  protected FibonacciIterative getFreshInstance() {
    return new FibonacciIterative();
  }
}