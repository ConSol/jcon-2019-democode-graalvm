package de.consol.dus.graal.numbercrunching.wordcount;

import java.util.Arrays;
import java.util.HashMap;

public class WordCountStream extends WordCount {

  private WordCountStream(final String... content) {
    super(content);
  }

  public static WordCountStream of(final String... content) {
    return new WordCountStream(content);
  }

  public HashMap<String, Long> count() {
    final HashMap<String, Long> wordCount = new HashMap<>();
    Arrays.stream(getContent().split("[,.!?]?\\s"))
        .filter(word -> word.equals("") == false)
        .map(word -> word.replaceAll("[,.!?]", ""))
        .forEach(
            word -> {
              if (wordCount.containsKey(word)) {
                wordCount.put(
                    word,
                    wordCount.get(word) + 1L);
              } else {
                wordCount.put(word, 1L);
              }
            });

    return wordCount;
  }
}