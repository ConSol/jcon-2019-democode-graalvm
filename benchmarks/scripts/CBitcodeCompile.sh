#!/bin/bash

CLANG=$(which clang)
if [[ -z "$CLANG" ]]
then
  echo "Could not find clang. Please make sure clang is on the \$PATH"
  exit 42
else
  cd src/main/c

  mkdir -p ../resources/c
  echo "#### compiling fibonacci_array.c to bitcode ####"
  clang -c -emit-llvm fibonacci_array.c -o ../resources/c/fibonacci_array.bc

  echo "#### compiling fibonacci_iterative.c to bitcode ####"
  clang -c -emit-llvm fibonacci_iterative.c -o ../resources/c/fibonacci_iterative.bc

  echo "#### compiling fibonacci_recursive.c to bitcode ####"
  clang -c -emit-llvm fibonacci_recursive.c -o ../resources/c/fibonacci_recursive.bc
fi