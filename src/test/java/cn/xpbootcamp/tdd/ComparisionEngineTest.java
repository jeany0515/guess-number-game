package cn.xpbootcamp.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ComparisionEngineTest {
    private ComparisonEngine comparisonEngine;
    private RandomNumber randomNumber;
    private int[] randoms = {1, 2, 3, 4};

    @BeforeEach
    void setUp() {
        comparisonEngine = new ComparisonEngine();
        randomNumber = new RandomNumber();
        randomNumber.setRandoms(randoms);
    }

    @Test
    void should_return_0A0B_when_comparison_engine_compare_given_guess_numbers_5678_with_randoms_1234() {
        int[] guessNumber = {5, 6, 7, 8};

        String result = comparisonEngine.compare(guessNumber, randomNumber);

        assertThat(result).isEqualTo("0A0B");
    }

    @Test
    void should_return_0A1B_when_comparison_engine_compare_given_guess_numbers_5178_with_randoms_1234() {
        int[] guessNumber = {5, 1, 7, 8};

        String result = comparisonEngine.compare(guessNumber, randomNumber);

        assertThat(result).isEqualTo("0A1B");
    }

    @Test
    void should_return_1A1B_when_comparison_engine_compare_given_guess_numbers_1456_with_randoms_1234() {
        int[] guessNumber = {1, 4, 5, 6};

        String result = comparisonEngine.compare(guessNumber, randomNumber);

        assertThat(result).isEqualTo("1A1B");
    }


    @Test
    void should_return_4A0B_when_comparison_engine_compare_given_guess_numbers_1234_with_randoms_1234() {
        int[] guessNumber = {1, 2, 3, 4};

        String result = comparisonEngine.compare(guessNumber, randomNumber);

        assertThat(result).isEqualTo("4A0B");
    }
}
