#!/bin/bash

if [[ -z "$GRAALVM_HOME" ]]
then
  echo "\$GRAALVM_HOME is not set or Graal is not installed"
else
  export OLD_JAVA_HOME=$JAVA_HOME
  export JAVA_HOME=$GRAALVM_HOME
  if [[ ! -f ../../target/dus.graal.native-1.0-SNAPSHOT.jar ]] | [[ ! -f ../../benchmarks/target/dus.graal.benchmarks-1.0-SNAPSHOT.jar ]]
  then
    cd ../..
    mvn clean package
    cd native/target
  else
    cd ../target
  fi
  echo "#### compiling array-based fibonacci benchmark ####"
  $GRAALVM_HOME/bin/native-image --no-server -cp ./dus.graal.native-1.0-SNAPSHOT.jar:../../benchmarks/target/dus.graal.benchmarks-1.0-SNAPSHOT.jar de.consol.dus.graal.numbercrunching.fibonacci.FibonacciArrayNative -O1 -da --static

  echo "#### compiling arraylist-based fibonacci benchmark ####"
  $GRAALVM_HOME/bin/native-image --no-server -cp ./dus.graal.native-1.0-SNAPSHOT.jar:../../benchmarks/target/dus.graal.benchmarks-1.0-SNAPSHOT.jar de.consol.dus.graal.numbercrunching.fibonacci.FibonacciArrayListNative -O1 -da --static

  echo "#### compiling iterative fibonacci benchmark ####"
  $GRAALVM_HOME/bin/native-image --no-server -cp ./dus.graal.native-1.0-SNAPSHOT.jar:../../benchmarks/target/dus.graal.benchmarks-1.0-SNAPSHOT.jar de.consol.dus.graal.numbercrunching.fibonacci.FibonacciIterativeNative -O1 -da --static

  echo "#### compiling recursive fibonacci benchmark ####"
  $GRAALVM_HOME/bin/native-image --no-server -cp ./dus.graal.native-1.0-SNAPSHOT.jar:../../benchmarks/target/dus.graal.benchmarks-1.0-SNAPSHOT.jar de.consol.dus.graal.numbercrunching.fibonacci.FibonacciRecursiveNative -O1 -da --static

  echo "#### compiling arraylist-based primenumber benchmark ####"
  $GRAALVM_HOME/bin/native-image --no-server -cp ./dus.graal.native-1.0-SNAPSHOT.jar:../../benchmarks/target/dus.graal.benchmarks-1.0-SNAPSHOT.jar de.consol.dus.graal.numbercrunching.primenumbers.PrimeNumberArrayListNative -O1 -da --static

  echo "#### compiling array-based primenumber benchmark ####"
  $GRAALVM_HOME/bin/native-image --no-server -cp ./dus.graal.native-1.0-SNAPSHOT.jar:../../benchmarks/target/dus.graal.benchmarks-1.0-SNAPSHOT.jar de.consol.dus.graal.numbercrunching.primenumbers.PrimeNumberArrayNative -O1 -da --static

  echo "#### compiling Graal's sample stream benchmark ####"
  $GRAALVM_HOME/bin/native-image --no-server -cp ./dus.graal.native-1.0-SNAPSHOT.jar:../../benchmarks/target/dus.graal.benchmarks-1.0-SNAPSHOT.jar de.consol.dus.graal.numbercrunching.streams.GraalExampleSimpleStreamNative -O1 -da --static

  echo "#### compiling word count stream benchmark ####"
  $GRAALVM_HOME/bin/native-image --no-server -cp ./dus.graal.native-1.0-SNAPSHOT.jar:../../benchmarks/target/dus.graal.benchmarks-1.0-SNAPSHOT.jar de.consol.dus.graal.numbercrunching.wordcount.WordCountStreamNative -O1 -da --static -H:IncludeResources='.*wordCount/.*\.txt$' -H:Log=registerResource

  echo "#### compiling word count iterative benchmark ####"
  $GRAALVM_HOME/bin/native-image --no-server -cp ./dus.graal.native-1.0-SNAPSHOT.jar:../../benchmarks/target/dus.graal.benchmarks-1.0-SNAPSHOT.jar de.consol.dus.graal.numbercrunching.wordcount.WordCountIterativeNative -O1 -da --static -H:IncludeResources='.*wordCount/.*\.txt$' -H:Log=registerResource
fi