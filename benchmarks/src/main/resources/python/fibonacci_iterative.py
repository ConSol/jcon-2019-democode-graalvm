def fibonacci(n):
  if n <= 1:
    return n
  nMinusOne = 1.0
  nMinusTwo = 0.0
  for index in range(2, n + 1):
    nMinusOne = nMinusOne + nMinusTwo
    nMinusTwo = nMinusOne - nMinusTwo

  return nMinusOne