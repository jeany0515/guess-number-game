package cn.xpbootcamp.tdd;

import java.security.SecureRandom;

public class RandomGenerator {
    public RandomNumber generate() {
        RandomNumber randomNumber = new RandomNumber();
        SecureRandom secureRandom = new SecureRandom();

        int size = randomNumber.getSize();
        int[] randomList = new int[size];
        for (int randomIndex = 0; randomIndex < size; randomIndex++) {
            randomList[randomIndex] = secureRandom.nextInt(10);
        }

        randomNumber.setRandoms(randomList);

        return randomNumber;
    }
}
