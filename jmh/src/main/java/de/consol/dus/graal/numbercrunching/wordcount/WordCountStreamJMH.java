package de.consol.dus.graal.numbercrunching.wordcount;

public class WordCountStreamJMH extends WordCountJMH {

  @Override
  protected WordCountStream getFreshInstance(final String... content) {
    return WordCountStream.of(content);
  }
}