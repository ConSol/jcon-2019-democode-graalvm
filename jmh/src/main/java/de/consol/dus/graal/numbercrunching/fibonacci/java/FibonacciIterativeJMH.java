package de.consol.dus.graal.numbercrunching.fibonacci.java;

import org.openjdk.jmh.annotations.Param;

import de.consol.dus.graal.numbercrunching.fibonacci.FibonacciJMH;

public class FibonacciIterativeJMH extends FibonacciJMH {

  @Param("268435456")
  private int n = 0;

  @Override
  protected FibonacciIterative getFreshInstance() {
    return new FibonacciIterative();
  }

  @Override
  public int getN() {
    return n;
  }
}