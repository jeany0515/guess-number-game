package cn.xpbootcamp.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RandomGeneratorTest {

    @Test
    void should_return_random_list_with_4_item_when_generate_random() {
        RandomGenerator randoms = new RandomGenerator();
        RandomNumber result = randoms.generate();

        assertThat(result.getRandoms().length).isEqualTo(4);
    }

}