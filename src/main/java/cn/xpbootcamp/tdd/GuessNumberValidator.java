package cn.xpbootcamp.tdd;

import java.util.Arrays;

public class GuessNumberValidator {

    public boolean verify(int[] guessNumber) {
        RandomNumber randomNumber = new RandomNumber();
        int size = randomNumber.getSize();
        boolean isLengthValidate = guessNumber.length == size;

        if (isLengthValidate) {
            boolean hasRepeat = Arrays.stream(guessNumber).boxed().distinct().count() < size;
            return !hasRepeat;
        }
        return false;
    }
}
