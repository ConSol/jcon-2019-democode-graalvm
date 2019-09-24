package de.consol.dus.graal.numbercrunching.fibonacci.java;

import de.consol.dus.graal.numbercrunching.fibonacci.Fibonacci;

public class FibonacciRecursive implements Fibonacci {

  @Override
  public long calculateNthFibonacci(final int n) {
    if ((n == 0) || (n == 1)) {
      return n;
    }

    return calculateNthFibonacci(n - 1) + calculateNthFibonacci(n - 2);
  }
}