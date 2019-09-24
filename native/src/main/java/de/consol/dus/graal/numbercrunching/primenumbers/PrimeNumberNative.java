package de.consol.dus.graal.numbercrunching.primenumbers;

import de.consol.dus.graal.numbercrunching.AbstractNative;

public abstract class PrimeNumberNative extends AbstractNative {

  private static final int NTH = 500_000;

  protected abstract PrimeNumber getFreshInstance();

  @Override
  public final void execute() {
    getFreshInstance().getNthPrime(getNth());
  }

  private int getNth() {
    return NTH;
  }
}
