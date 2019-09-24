package de.consol.dus.graal.numbercrunching.wordcount;

import java.util.Arrays;
import java.util.Map;

public abstract class WordCount {
  private final String content;

  WordCount(final String... content) {
    final StringBuilder builder = new StringBuilder();
    Arrays.stream(content)
        .forEach(builder::append);
    this.content = builder.toString();
  }

  public String getContent() {
    return content;
  }

  public abstract Map<String, Long> count();
}