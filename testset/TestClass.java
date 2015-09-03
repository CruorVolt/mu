import java.util.Random;

public class TestClass {

    protected static Random rand = new Random();
    protected static final int MAX = 10000;

    protected int getInt() {
        return rand.nextInt(MAX);
    }

    protected int getInt(int max) {
        return rand.nextInt(max);
    }

    protected int[] getIntArray() {
        int size = rand.nextInt(MAX) + 1;
        return rand.ints().limit(size).toArray();
    }

    protected int[] getIntArray(int size) {
        return rand.ints().limit(size).toArray();
    }

    protected double getDouble() {
        return rand.nextDouble() * getInt() + 1;
    }

    protected double[] getDoubleArray() {
        int size = rand.nextInt(MAX) + 1;
        return rand.doubles().limit(size).toArray();
    }

    protected double[] getDoubleArray(int size) {
        return rand.doubles().limit(size).toArray();
    }

    protected long getLong() {
        return rand.nextLong();
    }

    protected Boolean getBoolean() {
        return rand.nextBoolean();
    }

    protected long[][] get2DLongArray() {
        int size1 = rand.nextInt(MAX/10) + 1;
        int size2 = rand.nextInt(MAX/10) + 1;
        long[][] arr = new long[size1][size2];
        for (int i = 0; i < size1; i++) {
            arr[i] = rand.longs().limit(size2).toArray();
        }
        return arr;
    }

}
