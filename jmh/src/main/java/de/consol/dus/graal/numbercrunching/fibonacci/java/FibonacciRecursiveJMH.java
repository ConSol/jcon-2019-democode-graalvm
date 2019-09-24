package de.consol.dus.graal.numbercrunching.fibonacci.java;

import org.openjdk.jmh.annotations.Param;

import de.consol.dus.graal.numbercrunching.fibonacci.FibonacciJMH;

public class FibonacciRecursiveJMH extends FibonacciJMH {

  @Param("40")
  private int n = 0;

  @Override
  protected FibonacciRecursive getFreshInstance() {
    return new FibonacciRecursive();
  }

  @Override
  public int getN() {
    return n;
  }
}