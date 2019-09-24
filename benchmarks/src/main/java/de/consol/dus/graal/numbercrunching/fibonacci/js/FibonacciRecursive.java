package de.consol.dus.graal.numbercrunching.fibonacci.js;

import java.io.IOException;
import java.util.function.Function;
import org.graalvm.polyglot.Source;

import de.consol.dus.graal.numbercrunching.fibonacci.PolyglotFibonacci;

@SuppressWarnings("unchecked")
public class FibonacciRecursive extends PolyglotFibonacci {

  private static Function<Integer, Number> function;

  static {
    init();
  }

  @SuppressWarnings("unchecked")
  private static void init() {
    try {
      final Source source = getSource("js/fibonacci.recursive.js", "js");
      getContext().eval(source);
      function = getContext()
              .getBindings("js")
              .getMember("fibonacci")
              .as(Function.class);
    } catch (final IOException e) {
      System.exit(42);
    }
  }


  @Override
  public long calculateNthFibonacci(final int n) {
    return function.apply(n).longValue();
  }
}