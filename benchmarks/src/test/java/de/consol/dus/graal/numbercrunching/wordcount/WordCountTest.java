package de.consol.dus.graal.numbercrunching.wordcount;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public abstract class WordCountTest {
  public abstract WordCount getFreshInstance(String... content);

  @Nested
  @DisplayName("Sanity tests")
  class SanityTest {

    @Test
    public void test_shouldReturnExpectedResult_whenCalledWithSampleSentence() {
      // Given:
      final String sampleSentence = "Hello World! Hello Germany. Hello Düsseldorf! Hello JCON from ConSol.";
      final HashMap<String, Long> expected = new HashMap<>();
      expected.put("Hello", 4L);
      expected.put("World", 1L);
      expected.put("Germany", 1L);
      expected.put("Düsseldorf", 1L);
      expected.put("JCON", 1L);
      expected.put("from", 1L);
      expected.put("ConSol", 1L);

      // When:
      final Map<String, Long> actual = getFreshInstance(sampleSentence).count();

      // Then:
      assertEquals(expected, actual);
    }
  }
}
