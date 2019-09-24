package de.consol.dus.graal.numbercrunching.fibonacci.java;

import de.consol.dus.graal.numbercrunching.fibonacci.Fibonacci;

public class FibonacciIterative implements Fibonacci {

  public final long calculateNthFibonacci(final int n) {
    if (n <= 1) {
      return n;
    }

    long nMinusTwo = 0;
    long nMinusOne = 1;

    for (int current = 2; current <= n; ++current) {
      nMinusOne += nMinusTwo;
      nMinusTwo = nMinusOne - nMinusTwo;
    }

    return nMinusOne;
  }
}