package cn.xpbootcamp.tdd;

public class RandomNumber {
    private final static int size = 4;
    private int[] randoms;

    public int getSize() {
        return size;
    }

    public int[] getRandoms() {
        return randoms;
    }

    public void setRandoms(int[] randoms) {
        this.randoms = randoms;
    }
}
