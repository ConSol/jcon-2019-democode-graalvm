package de.consol.dus.graal.numbercrunching.wordcount;

public class WordCountIterativeJMH extends WordCountJMH {

  @Override
  protected WordCountIterative getFreshInstance(final String... content) {
    return WordCountIterative.of(content);
  }
}