package de.consol.dus.graal.numbercrunching.wordcount;

public class WordCountIterativeTest extends WordCountTest {

  @Override
  public WordCountIterative getFreshInstance(final String... content) {
    return WordCountIterative.of(content);
  }
}
