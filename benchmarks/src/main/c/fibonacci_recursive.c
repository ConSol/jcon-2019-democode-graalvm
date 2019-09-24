#include <inttypes.h>
#include <stdio.h>
#include <stdlib.h>

int64_t fibonacci(const int32_t n)
{
  if (1 >= n)
  {
    return n;
  }

  return fibonacci(n - 1) +  fibonacci(n - 2);
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
