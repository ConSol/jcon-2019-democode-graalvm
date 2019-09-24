function getNthPrime(n) {
  if (n === 1) {
    return 2
  }
  if (n === 2) {
    return 3
  }

  var primes = [];
  primes.push(2);
  primes.push(3);

  var primeCounter = 2;
  var candidate = 5;
  while (primeCounter < n) {
    var isPrime = true;
    var dividerIndex = 0;
    while (isPrime) {
      var divider = primes[dividerIndex];
      if (divider * divider > candidate) {
        break;
      }

      if (candidate % divider === 0) {
        isPrime = false;
      }
      dividerIndex++;
    }
    if (isPrime) {
      primes.push(candidate);
      ++primeCounter;
    }
    candidate += 2;
  }
  return primes[primes.length - 1];
}