for (var run = 1; run <= 10; ++run) {
  console.time('fibonacci');
  fibonacci(268435456);
  console.timeEnd('fibonacci');
}

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