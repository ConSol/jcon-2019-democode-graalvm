package de.consol.dus.graal.numbercrunching.fibonacci.c;

import org.openjdk.jmh.annotations.Param;

import de.consol.dus.graal.numbercrunching.fibonacci.FibonacciJMH;

public class FibonacciIterativeJMH extends FibonacciJMH {

  @Param("10000000")
  private int n;

  @Override
  protected FibonacciIterative getFreshInstance() {
    return new FibonacciIterative();
  }

  @Override
  public int getN() {
    return n;
  }
}