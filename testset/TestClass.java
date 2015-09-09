import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class TestClass {

    protected static Random rand = new Random();
    protected static final int MAX = 10000;

    protected static int getInt() {
        return rand.nextInt(MAX);
    }

    protected static int getInt(int max) {
        return rand.nextInt(max);
    }

    protected static int[] getIntArray() {
        int size = rand.nextInt(MAX) + 1;
        return rand.ints().limit(size).toArray();
    }

    protected static int[] getIntArray(int size) {
        return rand.ints(size, 0, MAX).toArray();
    }

    protected static double getDouble() {
        return rand.nextDouble() * getInt() + 1;
    }

    protected static double getNextDouble() {
        return rand.nextDouble();
    }

    protected static double[] getDoubleArray() {
        int size = rand.nextInt(MAX) + 1;
        return rand.doubles().limit(size).toArray();
    }

    protected static double[] getDoubleArray(int size) {
        return rand.doubles().limit(size).toArray();
    }

    protected static long getLong() {
        return Math.abs(rand.nextLong());
    }

    protected static Boolean getBoolean() {
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

    protected static int[] add(int[] original) {
        //Additive: Add a positive constant. Expected: Increase or remain constant
        int[] additive = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            additive[i] = original[i] + getInt();
        }
        return additive;
    }

    protected static double[] add(double[] original) {
        //Additive: Add a positive constant. Expected: Increase or remain constant
        double[] additive = new double[original.length];
        for (int i = 0; i < original.length; i++) {
            additive[i] = original[i] + getDouble();
        }
        return additive;
    }

    protected static int[] exc(int[] original) {
        //Exclusive: Remove an element. Expected: Decrease or remain constant
        int[] excluded = new int[original.length - 1];
        int excludeIndex = rand.nextInt(original.length);
        int offset = 0;
        for (int i = 0; i < original.length; i++) {
            if (i != excludeIndex) {
                excluded[i + offset] = original[i];
            } else {
                offset = -1;
            }
        }
        return excluded;
    }

    protected static double[] exc(double[] original) {
        //Exclusive: Remove an element. Expected: Decrease or remain constant
        double[] excluded = new double[original.length - 1];
        int excludeIndex = rand.nextInt(original.length);
        int offset = 0;
        for (int i = 0; i < original.length; i++) {
            if (i != excludeIndex) {
                excluded[i + offset] = original[i];
            } else {
                offset = -1;
            }
        }
        return excluded;
    }

    protected static int[] inc(int[] original) {
        // Inclusive: Add a new element. Expected: Increase or remain constant
        int[] included = new int[original.length + 1];
        int includeIndex = rand.nextInt(original.length);
        int offset = 0;
        for (int i = 0; i <= original.length; i++) {
            if (i != includeIndex) {
                included[i] = original[i + offset];
            } else {
                included[i] = getInt();
                offset = -1;
            }
        }
        return included;
    }

    protected static double[] inc(double[] original) {
        // Inclusive: Add a new element. Expected: Increase or remain constant
        double[] included = new double[original.length + 1];
        int includeIndex = rand.nextInt(original.length);
        int offset = 0;
        for (int i = 0; i <= original.length; i++) {
            if (i != includeIndex) {
                included[i] = original[i + offset];
            } else {
                included[i] = getDouble();
                offset = -1;
            }
        }
        return included;
    }

    protected static int[] inv(int[] original) {
        //Invertive: Take the inverse of each element. Expected: Decrease or remain constant
        int[] inverse = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            inverse[i] = 1 / original[i]; //Integer arithmetic. Problem?
        }
        return inverse;
    }

    protected static double[] inv(double[] original) {
        //Invertive: Take the inverse of each element. Expected: Decrease or remain constant
        double[] inverse = new double[original.length];
        for (int i = 0; i < original.length; i++) {
            inverse[i] = 1.0 / original[i];
        }
        return inverse;
    }

    protected static int[] mult(int[] original) {
        //Multiplicative: Multiply by a positive constant. Expected: Increase or remain constant
        int constant = getInt() + 2;
        int[] multiplied = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            multiplied[i] = original[i] * constant;
        }
        return multiplied;
    }

    protected static double[] mult(double[] original) {
        //Multiplicative: Multiply by a positive constant. Expected: Increase or remain constant
        int constant = getInt() + 2;
        double[] multiplied = new double[original.length];
        for (int i = 0; i < original.length; i++) {
            multiplied[i] = original[i] * constant;
        }
        return multiplied;
    }

    protected static int[] perm(int[] original) {
        //Permutative: Randomly permute the elements. Expected: Remain constant
        int[] permuted = new int[original.length];
        ArrayList<int> range = new
        for (int i = 0; i < original.length; i++) {
        }
        return permuted;
    }
/*

    protected static ArrayList<T> perm(ArrayList<T> original) {
        return new ArrayList<T>();
    }
    */

    public static void main(String[] args) {
        TestClass test = new TestClass();
        double[] thing = test.getDoubleArray(8);
        System.out.println("thing: " + Arrays.toString(thing));
        double[] next = mult(thing);
        System.out.println("next:  " + Arrays.toString(next));
    }
}
