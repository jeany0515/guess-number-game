package cn.xpbootcamp.tdd;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

class RandomGeneratorTest {

    @Test
    void should_return_random_list_with_4_item_when_generate_random() {
        RandomGenerator randoms = new RandomGenerator();
        RandomNumber result = randoms.generate();

        assertThat(result.getRandoms().length).isEqualTo(4);
    }

    @Test
    void should_return_no_item_repeat_random_list_when_generate_random_list() {
        RandomGenerator randoms = new RandomGenerator();
        RandomNumber result = randoms.generate();

        List<Integer> resultList = Arrays.stream(result.getRandoms()).boxed().collect(Collectors.toList());
        List<Integer> expected = Arrays.stream(result.getRandoms()).boxed().distinct().collect(Collectors.toList());

        assertThat(resultList).isEqualTo(expected);
    }

    @Test
    void should_return_different_random_list_when_generate_two_random_list_given_each_list_size_is_4() {
        RandomGenerator randomGenerator = new RandomGenerator();
        RandomNumber result_1 = randomGenerator.generate();
        RandomNumber result_2 = randomGenerator.generate();

        assertThat(result_1.getRandoms()).isNotEqualTo(result_2.getRandoms());
    }
}