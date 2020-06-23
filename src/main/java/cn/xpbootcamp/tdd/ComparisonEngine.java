package cn.xpbootcamp.tdd;

public class ComparisonEngine {
    public String compare(int[] guessNumber, RandomNumber randomNumber) {
        int size = randomNumber.getSize();
        int[] randoms = randomNumber.getRandoms();
        int numberMatchCount = 0;

        for (int compare = 0; compare < size; compare++) {
            for (int index = 0; index < size; index++) {
                boolean isNumberMatch = guessNumber[compare] == randoms[index];
                boolean isPositionMatch = compare == index;
                if(isNumberMatch && !isPositionMatch) numberMatchCount++;
            }
        }

        if (numberMatchCount == 0) return "0A0B";
        return "4A0B";
    }
}
