import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;
import java.lang.reflect.*;

import Test.MethodCollection2;
import Test.MethodsFromApacheMath;
import Test.MethodsFromColt;
import Test.MethodsFromMahout;

public class TestClass {

    public static Random rand = new Random();
    public static final int MAX = 10000;

    public static int getInt() {
        return rand.nextInt(MAX);
    }

    public static int getInt(int max) {
        return rand.nextInt(max);
    }

    public static int[] getIntArray() {
        int size = rand.nextInt(MAX) + 1;
        return rand.ints().limit(size).toArray();
    }

    public static int[] getIntArray(int size) {
        return rand.ints(size, 0, MAX).toArray();
    }

    public static double getDouble() {
        return rand.nextDouble() * getInt() + 1;
    }

    public static double getNextDouble() {
        return rand.nextDouble();
    }

    public static double[] getDoubleArray() {
        int size = rand.nextInt(MAX) + 1;
        return rand.doubles().limit(size).toArray();
    }

    public static double[] getDoubleArray(int size) {
        return rand.doubles().limit(size).toArray();
    }

    public static long getLong() {
        return Math.abs(rand.nextLong());
    }

    public static Boolean getBoolean() {
        return rand.nextBoolean();
    }

    public long[][] get2DLongArray() {
        int size1 = rand.nextInt(MAX/10) + 1;
        int size2 = rand.nextInt(MAX/10) + 1;
        long[][] arr = new long[size1][size2];
        for (int i = 0; i < size1; i++) {
            arr[i] = rand.longs().limit(size2).toArray();
        }
        return arr;
    }

    public static int add(int original, int constant) {
        return original + constant;
    }

    public static double add(double original, int constant) {
        return original + ( (double)constant);
    }

    public static long add(long original, int constant) {
        return original + ( (long)constant);
    }

    public static int[] add(int[] original, int constant) {
        //Additive: Add a positive constant. Expected: Increase or remain constant
        int[] additive = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            additive[i] = original[i] + constant;
        }
        return additive;
    }

    public static double[] add(double[] original, int constant) {
        //Additive: Add a positive constant. Expected: Increase or remain constant
        double[] additive = new double[original.length];
        for (int i = 0; i < original.length; i++) {
            additive[i] = original[i] + ( (double)constant);
        }
        return additive;
    }

    public static boolean addTest(int orig, int next) {
        return orig <= next;
    }

    public static boolean addTest(double orig, double next) {
        return orig <= next;
    }

    public static boolean addTest(int[] orig, int[] next) {
        if (orig.length != next.length) {
            System.out.println("PROBLEM WITH INPUT LENGTH (int addTest) <<<<<<<-----------------------");
            return false;
        }
        for (int i = 0; i < orig.length; i++) {
            if (next[i] < orig[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean addTest(double[] orig, double[] next) {
        if (orig.length != next.length) {
            System.out.println("PROBLEM WITH INPUT LENGTH (double addTest) <<<<<<<-----------------------");
            return false;
        }
        for (int i = 0; i < orig.length; i++) {
            if (next[i] < orig[i]) {
                return false;
            }
        }
        return true;
    }

    /* This doesn't really make sense
    public static boolean addTest(boolean[] orig, boolean[] next) {
        if (orig.length != next.length) {
            System.out.println("PROBLEM WITH INPUT LENGTH (boolean addTest) <<<<<<<-----------------------");
            return false;
        }
        for (int i = 0; i < orig.length; i++) {
            if (next[i] < orig[i]) {
                return false;
            }
        }
        return true;
    }
    */

    public static int[] exc(int[] original) {
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

    public static double[] exc(double[] original) {
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

    public static int[] inc(int[] original) {
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

    public static double[] inc(double[] original) {
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

    public static int[] inv(int[] original) {
        //Invertive: Take the inverse of each element. Expected: Decrease or remain constant
        int[] inverse = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            inverse[i] = 1 / original[i]; //Integer arithmetic. Problem?
        }
        return inverse;
    }

    public static double[] inv(double[] original) {
        //Invertive: Take the inverse of each element. Expected: Decrease or remain constant
        double[] inverse = new double[original.length];
        for (int i = 0; i < original.length; i++) {
            inverse[i] = 1.0 / original[i];
        }
        return inverse;
    }

    public static int[] mult(int[] original, int constant) {
        //Multiplicative: Multiply by a positive constant. Expected: Increase or remain constant
        int[] multiplied = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            multiplied[i] = original[i] * constant;
        }
        return multiplied;
    }

    public static double[] mult(double[] original, int constant) {
        //Multiplicative: Multiply by a positive constant. Expected: Increase or remain constant
        double[] multiplied = new double[original.length];
        for (int i = 0; i < original.length; i++) {
            multiplied[i] = original[i] * constant;
        }
        return multiplied;
    }

    public static double mult(double original, int constant) {
        return original * (double)constant;
    }

    public static int mult(int original, int constant) {
        return original * constant;
    }

    public static boolean multTest(int o, int n) { return addTest(o, n); }
    public static boolean multTest(double o, double n) { return addTest(o, n); }
    public static boolean multTest(int[] o, int[] n) { return addTest(o, n); }
    public static boolean multTest(double[] o, double[] n) { return addTest(o, n); }

    public static int[] perm(int[] original) {
        //Permutative: Randomly permute the elements. Expected: Remain constant
        int temp, index;
        int[] permuted = Arrays.copyOf(original, original.length);
        Random r = new Random();
        for (int i = original.length - 1; i > 0; i--) {
            index = r.nextInt(i+1);
            temp = permuted[i];
            permuted[i] = permuted[index];
            permuted[index] = temp;
        }
        return permuted;
    }

    public static double[] perm(double[] original) {
        //Permutative: Randomly permute the elements. Expected: Remain constant
        int index;
        double temp;
        double[] permuted = Arrays.copyOf(original, original.length);
        Random r = new Random();
        for (int i = original.length - 1; i > 0; i--) {
            index = r.nextInt(i+1);
            temp = permuted[i];
            permuted[i] = permuted[index];
            permuted[index] = temp;
        }
        return permuted;
    }

// Determine function to invoke
// Determine permutation function
// Run original inputs
// Run modified inputs
// Determine test function and run

    public static boolean testThis(String test, String thisClass, String function, Object... args) {

        thisClass = "Test." + thisClass; //All /src classes are in Test package

        //find the correct function to execute
        Class[] argClasses = new Class[args.length];
        int i = 0;
        for (Object o : args) {
            switch (o.getClass().toString()) {
                case "class java.lang.Integer":
                    argClasses[i] = Integer.class;
                    break;
                case "class java.lang.Double":
                    argClasses[i] = Double.class;
                    break;
                case "class java.lang.Long":
                    argClasses[i] = Long.class;
                    break;
                case "class [I": //int array
                    argClasses[i] = int[].class;
                    break;
                case "class [D": //double array
                    argClasses[i] = double[].class;
                    break;
                case "class [J": //long array
                    argClasses[i] = long[].class;
                    break;
            }
            i++;
        }


        //Get the method being tested
        try {
            Class<?> clazz = Class.forName(thisClass);
            //All constructors should be default
            Constructor<?> construct = clazz.getConstructor();
            Object inst = construct.newInstance();

            Method func = clazz.getMethod(function, argClasses);
            Object returnVal = func.invoke(inst, args);

                //Get the test support functions
                try {
                    //takes arg classes as input - THERE MAY BE MORE THAN ONE PERMUTE FUNCTION PER TEST
                    Method[] permuteFuncs = new Method[argClasses.length];
                    for (int j = 0; j < argClasses.length; j++) {
                        if ((test == "add") || (test == "mult")) { //These functions have two args
                            permuteFuncs[j] = TestClass.class.getMethod(test, argClasses[j], int.class); 
                        } else { //Other functions have only one arg
                            permuteFuncs[j] = TestClass.class.getMethod(test, argClasses[j]); 
                        }
                    }
                    //takes return types as input and all have two matching args
                    Class type = func.getReturnType();
                    Method MRTestFunc = TestClass.class.getMethod(test + "Test", type, type);
                } catch(NoSuchMethodException e) {
                    e.printStackTrace();
                }

        } catch(Exception e) {
            e.printStackTrace();
        }


        return true;
    }

    public static void main(String[] args) {
        //int[] ithing = new int[2];
        //double[] dthing = new double[2];
        //long[] lthing = new long[2];
        //System.out.println(ithing.getClass().toString());
        //System.out.println(dthing.getClass().toString());
        //System.out.println(lthing.getClass().toString());
        int[] intarr = {1,2,3,4,5,4,5,4,};
        testThis("mult", "MethodCollection2", "shell_sort", intarr);
    }
}
