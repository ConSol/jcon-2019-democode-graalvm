def get_nth_prime(n):
  if n == 1:
    return 2
  if n == 2:
    return 3
  primes = [2.0, 3.0]
  found = 2
  candidate = 5.0
  while found < n:
    is_prime = True
    for prime in primes:
      if prime * prime > candidate:
        break

      if candidate % prime == 0:
        is_prime = False
        break

    if is_prime:
      primes.append(candidate)
      found += 1

    candidate += 2

  return primes[n - 1]