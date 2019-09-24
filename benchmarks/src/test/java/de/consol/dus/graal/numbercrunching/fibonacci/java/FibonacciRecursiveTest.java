package de.consol.dus.graal.numbercrunching.fibonacci.java;

import de.consol.dus.graal.numbercrunching.fibonacci.FibonacciTest;
import de.consol.dus.graal.numbercrunching.fibonacci.java.FibonacciRecursive;

public class FibonacciRecursiveTest extends FibonacciTest {
  @Override
  protected FibonacciRecursive getFreshInstance() {
    return new FibonacciRecursive();
  }
}