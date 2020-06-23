package cn.xpbootcamp.tdd;

import java.security.SecureRandom;

public class RandomGenerator {
    public RandomNumber generate() {
        RandomNumber randomNumber = new RandomNumber();
        SecureRandom secureRandom = new SecureRandom();

        int size = randomNumber.getSize();
        int[] randomList = new int[size];
        for (int index = 0; index < size; index++) {
            randomList[index] = generateAndValidate(secureRandom, randomList, index);
        }

        randomNumber.setRandoms(randomList);

        return randomNumber;
    }

    private int generateAndValidate(SecureRandom secureRandom, int[] randomList, int size) {
        boolean isRepeat = false;
        int randomNumber = secureRandom.nextInt(10);

        for (int index = 0; index < size; index++) {
            if (randomNumber == randomList[index]) {
                isRepeat = true;
                break;
            }
        }

        if (isRepeat) {
            randomNumber = generateAndValidate(secureRandom, randomList, size);
        }
        return randomNumber;
    }
}
