package de.consol.dus.graal.numbercrunching.fibonacci.java;

import de.consol.dus.graal.numbercrunching.fibonacci.Fibonacci;

public class FibonacciArray implements Fibonacci {

  @Override
  public long calculateNthFibonacci(final int n) {
    if (n <= 1) {
      return n;
    }

    final int[] values = new int[n + 1];
    values[0] = 0;
    values[1] = 1;

    for (int i = 2; i <= n; ++i) {
      values[i] = values[i - 1] + values[i - 2];
    }

    return values[n];
  }
}