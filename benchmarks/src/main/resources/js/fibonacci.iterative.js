function fibonacci(n) {
  if (n <= 1) {
    return n;
  }

  var nMinusOne = 1;
  var nMinusTwo = 0;
  for (var index = 2; index <= n; ++index) {
    nMinusOne += nMinusTwo;
    nMinusTwo = nMinusOne - nMinusTwo;
  }

  return nMinusOne;
}