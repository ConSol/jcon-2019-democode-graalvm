package de.consol.dus.graal.numbercrunching.fibonacci;

import de.consol.dus.graal.numbercrunching.AbstractNative;

public abstract class FibonacciNative extends AbstractNative {

  private static final int NTH = 268_435_456;

  protected abstract Fibonacci getFreshInstance();

  public int getNth() {
    return NTH;
  }

  public void execute() {
    getFreshInstance().calculateNthFibonacci(getNth());
  }
}