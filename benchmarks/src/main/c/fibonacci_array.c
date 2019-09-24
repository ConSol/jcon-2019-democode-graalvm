#include <inttypes.h>
#include <stdio.h>
#include <stdlib.h>

int64_t fibonacci(const int32_t n)
{
  if (1 >= n)
  {
    return n;
  }

  int64_t fibonacci[n + 1];

  fibonacci[0] = 0;
  fibonacci[1] = 1;

  for (int index = 2; n >= index; ++index)
  {
    fibonacci[index] = fibonacci[index - 1] + fibonacci[index - 2];
  }

  return fibonacci[n];
}

int main(int32_t argc, char** argv)
{
  if (2 > argc)
  {
    printf("please provide n as command line argument.");
    return 42;
  }

  uint32_t n;
  char c;
  sscanf(argv[1], "%" SCNu32 "%c", &n, &c);
  printf("%"PRId64"\n", fibonacci(n));
  return 0;
}
