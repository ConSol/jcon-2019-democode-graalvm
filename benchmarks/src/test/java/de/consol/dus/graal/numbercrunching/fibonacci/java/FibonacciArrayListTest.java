package de.consol.dus.graal.numbercrunching.fibonacci.java;

import de.consol.dus.graal.numbercrunching.fibonacci.FibonacciTest;
import de.consol.dus.graal.numbercrunching.fibonacci.java.FibonacciArrayList;

public class FibonacciArrayListTest extends FibonacciTest {

  @Override
  protected FibonacciArrayList getFreshInstance() {
    return new FibonacciArrayList();
  }
}