package de.consol.dus.graal.numbercrunching.fibonacci.java;

import org.openjdk.jmh.annotations.Param;

import de.consol.dus.graal.numbercrunching.fibonacci.FibonacciJMH;

public class FibonacciArrayJMH extends FibonacciJMH {

  @Param("268435456")
  private int n = 0;

  @Override
  protected FibonacciArray getFreshInstance() {
    return new FibonacciArray();
  }

  @Override
  public int getN() {
    return n;
  }
}