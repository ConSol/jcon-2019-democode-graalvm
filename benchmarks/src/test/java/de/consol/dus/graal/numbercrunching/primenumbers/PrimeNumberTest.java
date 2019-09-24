package de.consol.dus.graal.numbercrunching.primenumbers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public abstract class PrimeNumberTest {

  private PrimeNumber underTest;

  @BeforeEach
  void setup() {
    underTest = getFreshInstance();
  }

  protected abstract PrimeNumber getFreshInstance();

  @Nested
  @DisplayName("Sanity test")
  class SanityTest {

    @ParameterizedTest(name = "{0}th prime should be {1}")
    @CsvFileSource(resources = "/primenumbers/testValues.csv")
    void test_shouldReturnSecondArgument_whenCalledWithFirstArgument(final int nth, final long expected) {
      // Given: nothing

      // When:
      final long actual = underTest.getNthPrime(nth);

      // Then:
      assertEquals(expected, actual);
    }
  }
}