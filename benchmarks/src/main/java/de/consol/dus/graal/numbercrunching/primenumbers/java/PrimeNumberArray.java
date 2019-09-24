package de.consol.dus.graal.numbercrunching.primenumbers.java;

import de.consol.dus.graal.numbercrunching.primenumbers.PrimeNumber;

public class PrimeNumberArray implements PrimeNumber {

  @Override
  public long getNthPrime(final int n) {
    if (n == 1) {
      return 2L;
    }
    if (n == 2) {
      return 3L;
    }

    final long[] primes = new long[n];
    primes[0] = 2;
    primes[1] = 3;

    int primeCounter = 2;
    long candidate = 5;
    while (primeCounter < n) {
      boolean isPrime = true;
      int dividerIndex = 0;
      while (isPrime) {
        final long divider = primes[dividerIndex];
        if (divider * divider > candidate) {
          break;
        }

        if (candidate % divider == 0) {
          isPrime = false;
        }
        ++dividerIndex;
      }
      if (isPrime) {
        primes[primeCounter] = candidate;
        ++primeCounter;
      }
      candidate += 2;
    }

    return primes[n -1];
  }
}
