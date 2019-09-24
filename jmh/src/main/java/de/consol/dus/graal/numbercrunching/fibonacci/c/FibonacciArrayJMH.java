package de.consol.dus.graal.numbercrunching.fibonacci.c;

import org.openjdk.jmh.annotations.Param;

import de.consol.dus.graal.numbercrunching.fibonacci.FibonacciJMH;

public class FibonacciArrayJMH extends FibonacciJMH {

  @Param("10000000")
  private int n;

  @Override
  protected FibonacciArray getFreshInstance() {
    return new FibonacciArray();
  }

  @Override
  public int getN() {
    return n;
  }
}