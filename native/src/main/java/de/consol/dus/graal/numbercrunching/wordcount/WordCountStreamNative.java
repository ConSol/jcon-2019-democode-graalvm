package de.consol.dus.graal.numbercrunching.wordcount;

import java.io.IOException;

public class WordCountStreamNative extends WordCountNative {

  public WordCountStreamNative() throws IOException {
    super();
  }

  @Override
  protected WordCountStream getFreshInstance(final String... content) {
    return WordCountStream.of(content);
  }

  public static void main(final String... args) throws IOException {
    new WordCountStreamNative().benchmark();
  }
}