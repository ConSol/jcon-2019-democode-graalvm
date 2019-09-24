import sys
import time
from primenumbers_array import get_nth_prime

n = int(sys.argv[1])
times = []
for run in range(1, 11):
  start = time.time()
  prime = get_nth_prime(n)
  executionTime = time.time() - start
  print("Run %d: %2.5f ms" % (run, executionTime))
  times.append(executionTime)

print("Average: %2.5f ms\n" % (sum(times) / len(times)))
