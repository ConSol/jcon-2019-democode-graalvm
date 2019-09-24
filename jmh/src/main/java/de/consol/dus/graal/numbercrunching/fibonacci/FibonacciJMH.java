package de.consol.dus.graal.numbercrunching.fibonacci;

import de.consol.dus.graal.AbstractBenchmark;

public abstract class FibonacciJMH extends AbstractBenchmark {

  private Fibonacci fibonacci;

  @Override
  public final void setup() {
    fibonacci = getFreshInstance();
  }

  @Override
  public void tearDown() {
    fibonacci = null;
  }

  protected abstract Fibonacci getFreshInstance();

  public abstract int getN();

  public final Fibonacci getFibonacci() {
    return fibonacci;
  }

  @Override
  public final void execute() {
    getFibonacci().calculateNthFibonacci(getN());
  }
}