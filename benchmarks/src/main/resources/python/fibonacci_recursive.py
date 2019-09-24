def fibonacci(n):
  if n <= 1:
    return float(n)
  return fibonacci(n - 1) + fibonacci(n - 2)