package de.consol.dus.graal.numbercrunching.primenumbers;

import java.io.IOException;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Source;

public abstract class PolyglotPrimeNumber implements PrimeNumber {

  private static final Context context = Context.newBuilder().allowAllAccess(true).build();

  protected PolyglotPrimeNumber() {
  }

  protected static Context getContext() {
    return context;
  }

  protected static Source getSource(final String pathToSourcheFile, final String sourceLanguage) throws IOException {
    return Source
        .newBuilder(sourceLanguage, ClassLoader.getSystemResource(pathToSourcheFile))
        .cached(true)
        .build();
  }
}