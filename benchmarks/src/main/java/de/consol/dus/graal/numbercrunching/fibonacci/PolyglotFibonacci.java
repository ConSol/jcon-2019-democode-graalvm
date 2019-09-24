package de.consol.dus.graal.numbercrunching.fibonacci;

import java.io.IOException;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Source;

public abstract class PolyglotFibonacci implements Fibonacci {

  private static final Context context = Context.newBuilder().allowAllAccess(true).build();

  protected PolyglotFibonacci() {
    // hide public constructor
  }

  protected static Context getContext() {
    return context;
  }

  protected static Source getSource(final String pathToSourceFile, final String sourceLanguage) throws IOException {
    return Source
        .newBuilder(sourceLanguage, ClassLoader.getSystemResource(pathToSourceFile))
        .cached(true)
        .build();
  }

}