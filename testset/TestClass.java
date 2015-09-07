import java.util.Random;
import java.util.Arrays;

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

    protected double getNextDouble() {
        return rand.nextDouble();
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

/*
    protected static <T> T[] add(T[] original) {
        //Additive: Add a positive constant. Expected: Increase or remain constant
        T[] additive = new T[original.length];
        for (int i = 0; i < original.length; i++) {
            additive[i] = original[i] + rand.nextInt();
        }
    }

    protected static ArrayList<T> exc(ArrayList<T> original) {
        //Exclusive: Remove an element. Expected: Decrease or remain constant
        return new ArrayList<T>();
    }

    protected static ArrayList<T> inc(ArrayList<T> original) {
        // Inclusive: Add a new element. Expected: Increase or remain constant
        return new ArrayList<T>();
    }

    protected static ArrayList<T> inv(ArrayList<T> original) {
        //Invertive: Take the inverse of each element. Expected: Decrease or remain constant
        return new ArrayList<T>();
    }

    protected static ArrayList<T> mult(ArrayList<T> original) {
        //Multiplicative: Multiply by a positive constant. Expected: Increase or remain constant
        return new ArrayList<T>();
    }

    protected static ArrayList<T> perm(ArrayList<T> original) {
        //Permutative: Randomly permute the elements. Expected: Remain constant
        return new ArrayList<T>();
    }
    */
}
