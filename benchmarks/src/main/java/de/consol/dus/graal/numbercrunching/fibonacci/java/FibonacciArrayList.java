package de.consol.dus.graal.numbercrunching.fibonacci.java;

import java.util.ArrayList;

import de.consol.dus.graal.numbercrunching.fibonacci.Fibonacci;

public class FibonacciArrayList implements Fibonacci {

  @Override
  public long calculateNthFibonacci(final int n) {
    if (n <= 1) {
      return n;
    }

    final ArrayList<Long> sequence = new ArrayList<>(n);

    sequence.add(0L);
    sequence.add(1L);

    for (int index = 2; index <=n; ++index) {
      final long nthFibonacci = sequence.get(index - 1)  + sequence.get(index - 2);
      sequence.add(nthFibonacci);
    }

    return sequence.get(n);
  }
}