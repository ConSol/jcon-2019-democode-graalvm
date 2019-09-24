package de.consol.dus.graal.numbercrunching.wordcount;

import java.io.IOException;

public class WordCountIterativeNative extends WordCountNative {

  public WordCountIterativeNative() throws IOException {
    super();
  }

  @Override
  protected WordCountIterative getFreshInstance(final String... content) {
    return WordCountIterative.of(content);
  }

  public static void main(final String... args) throws IOException {
    new WordCountIterativeNative().benchmark();
  }
}