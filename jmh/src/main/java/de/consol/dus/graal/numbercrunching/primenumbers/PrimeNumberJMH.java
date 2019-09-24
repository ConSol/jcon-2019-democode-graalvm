package de.consol.dus.graal.numbercrunching.primenumbers;

import de.consol.dus.graal.AbstractBenchmark;
import org.openjdk.jmh.annotations.Param;

public abstract class PrimeNumberJMH extends AbstractBenchmark {

  @Param("500000")
  private int n = 0;

  private PrimeNumber primeNumber;

  @Override
  public final void setup() {
    primeNumber = getFreshInstance();
  }

  @Override
  public final void tearDown() {
    primeNumber = null;
  }

  @Override
  public void execute() {
    primeNumber.getNthPrime(getN());
  }

  public int getN() {
    return n;
  }

  protected abstract PrimeNumber getFreshInstance();
}