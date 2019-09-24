function fibonacci(n) {
  if (n <= 1) {
    return n;
  }

  var nMinusOne = fibonacci(n - 1);
  var nMinusTwo = fibonacci(n - 2);

  return nMinusOne + nMinusTwo;
}