package de.consol.dus.graal.numbercrunching.primenumbers.python;

import java.io.IOException;
import java.util.function.Function;
import org.graalvm.polyglot.Source;

import de.consol.dus.graal.numbercrunching.primenumbers.PolyglotPrimeNumber;

@SuppressWarnings("unchecked")
public class PrimeNumberArray extends PolyglotPrimeNumber {

  private static Function<Integer, Number> function;

  static {
    try {
      final Source source = getSource("python/primenumbers_array.py", "python");
      getContext().eval(source);
      function = getContext()
          .getBindings("python")
          .getMember("get_nth_prime")
          .as(Function.class);
    } catch (final IOException e) {
      System.exit(42);
    }
  }

  @Override
  public long getNthPrime(final int n) {
    return function.apply(n).longValue();
  }
}