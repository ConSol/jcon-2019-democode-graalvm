package de.consol.dus.graal.numbercrunching.wordcount;

import de.consol.dus.graal.numbercrunching.AbstractNative;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Optional;

public abstract class WordCountNative extends AbstractNative {

  private static final String PATH = "wordCount/le_grand_cyrus.txt";

  private final WordCount wordCount;

  protected abstract WordCount getFreshInstance(String... content);

  WordCountNative() throws IOException {
    final StringBuilder builder = new StringBuilder();
    try (
            final BufferedInputStream is =
                Optional.of(
                    new BufferedInputStream(
                        getClass().getClassLoader().getResourceAsStream(PATH)))
                    .get();
            final BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
      String line = reader.readLine();
      while (line != null) {
        builder.append(line);
        line = reader.readLine();
      }
    }
    wordCount = getFreshInstance(builder.toString());
  }

  @Override
  public void execute() {
    wordCount.count();
  }
}