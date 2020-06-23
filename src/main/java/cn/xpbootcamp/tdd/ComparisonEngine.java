package cn.xpbootcamp.tdd;

public class ComparisonEngine {
    public String compare(int[] guessNumber, RandomNumber randomNumber) {
        int size = randomNumber.getSize();
        int[] randoms = randomNumber.getRandoms();

        int numberMatchCount = 0;
        int bothNumberAndPositionMatchCount = 0;

        for (int compare = 0; compare < size; compare++) {
            for (int index = 0; index < size; index++) {
                boolean isNumberMatch = guessNumber[compare] == randoms[index];
                boolean isPositionMatch = compare == index;
                if(isNumberMatch && !isPositionMatch) numberMatchCount++;
                if(isNumberMatch && isPositionMatch) bothNumberAndPositionMatchCount++;
            }
        }

        return bothNumberAndPositionMatchCount + "A" + numberMatchCount + "B";
    }
}
