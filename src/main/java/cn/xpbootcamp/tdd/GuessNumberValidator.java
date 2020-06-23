package cn.xpbootcamp.tdd;

public class GuessNumberValidator {

    public boolean verify(int[] guessNumber) {
        RandomNumber randomNumber = new RandomNumber();
        return guessNumber.length == randomNumber.getSize();
    }
}
