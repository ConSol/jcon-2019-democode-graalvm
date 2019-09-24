package de.consol.dus.graal.numbercrunching.fibonacci.c;

import java.io.IOException;
import java.util.function.Function;
import org.graalvm.polyglot.Source;

import de.consol.dus.graal.numbercrunching.fibonacci.PolyglotFibonacci;

@SuppressWarnings("unchecked")
public class FibonacciRecursive extends PolyglotFibonacci {

  private static Function<Integer, Long> function;

  static {
    try {
      final Source source = getSource("c/fibonacci_recursive.bc", "llvm");
      getContext().eval(source);
      function = getContext()
          .getBindings("llvm")
          .getMember("fibonacci")
          .as(Function.class);
    } catch (final IOException e) {
      System.exit(42);
    }
  }

  @Override
  public long calculateNthFibonacci(final int n) {
    return function.apply(n);
  }
}