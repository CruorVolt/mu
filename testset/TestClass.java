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

/*//////////////////////////////////////////////////////
    ADDITIVE: add a positive constant.
        Expected result: increase or remain constant
*///////////////////////////////////////////////////////

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
        int[] additive = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            additive[i] = original[i] + constant;
        }
        return additive;
    }

    public static double[] add(double[] original, int constant) {
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
        if (orig.length != next.length) { return false; }
        for (int i = 0; i < orig.length; i++) {
            if (!addTest(orig[i], next[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean addTest(double[] orig, double[] next) {
        if (orig.length != next.length) { return false; }
        for (int i = 0; i < orig.length; i++) {
            if (!addTest(orig[i], next[i])) {
                return false;
            }
        }
        return true;
    }


/*//////////////////////////////////////////////////////
    EXCLUSIVE: remove an element
        Expected result: decrease or remain constant
*///////////////////////////////////////////////////////

    public static int[] exc(int[] original) {
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

    public static boolean excTest(int pre, int post) {
        return (post <= pre);
    }

    public static boolean excTest(int[] pre, int[] post) {
        if (pre.length != post.length) { return false; }
        for (int i = 0; i < pre.length; i++) {
            if (!excTest(pre[i], post[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean excTest(double pre, double post) {
        return (post <= pre);
    }

    public static boolean excTest(double[] pre, double[] post) {
        if (pre.length != post.length) { return false; }
        for (int i = 0; i < pre.length; i++) {
            if (!excTest(pre[i], post[i])) {
                return false;
            }
        }
        return true;
    }



/*//////////////////////////////////////////////////////
    INCLUSIVE: add a new element
        Expected result: increase or remain constant
*///////////////////////////////////////////////////////

    public static int[] inc(int[] original) {
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

    public static boolean incTest(int o, int n) { return addTest(o, n); }
    public static boolean incTest(double o, double n) { return addTest(o, n); }
    public static boolean incTest(int[] o, int[] n) { return addTest(o, n); }
    public static boolean incTest(double[] o, double[] n) { return addTest(o, n); }


/*//////////////////////////////////////////////////////
    INVERTIVE: take the inverse of each element
        Expected result: decrease or remain constant
*///////////////////////////////////////////////////////

    public static int[] inv(int[] original) {
        int[] inverse = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            inverse[i] = 1 / original[i]; //Integer arithmetic. Problem?
        }
        return inverse;
    }

    public static double[] inv(double[] original) {
        double[] inverse = new double[original.length];
        for (int i = 0; i < original.length; i++) {
            inverse[i] = 1.0 / original[i];
        }
        return inverse;
    }

    public static boolean invTest(int o, int n) { return excTest(o, n); }
    public static boolean invTest(double o, double n) { return excTest(o, n); }
    public static boolean invTest(int[] o, int[] n) { return excTest(o, n); }
    public static boolean invTest(double[] o, double[] n) { return excTest(o, n); }


/*//////////////////////////////////////////////////////
    MULTIPLICATIVE: multiply by a positive constant
        Expected result: increase or remain constant
*///////////////////////////////////////////////////////

    public static int[] mult(int[] original, int constant) {
        int[] multiplied = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            multiplied[i] = original[i] * constant;
        }
        return multiplied;
    }

    public static double[] mult(double[] original, int constant) {
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


/*//////////////////////////////////////////////////////
    PERMUTIVE: randomly permute the elements
        Expected result: remain constant
*///////////////////////////////////////////////////////

    public static int[] perm(int[] original) {
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

    public static boolean permTest(int o, int n) {
        return (o == n);
    }

    public static boolean permTest(double o, double n) {
        return (Math.abs(o - n) > 0.0001);
    }

    public static boolean permTest(int[] o, int[] n) {
        if (o.length != n.length) { return false; }
        for (int i = 0; i < o.length; i++) {
            if (!permTest(o[i], n[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean permTest(double[] o, double[] n) {
        if (o.length != n.length) { return false; }
        for (int i = 0; i < o.length; i++) {
            if (!permTest(o[i], n[i])) {
                return false;
            }
        }
        return true;
    }

/*//////////////////////////////////////////////////////////////////////
    testThis(): test the given method on the given 
                metamorphic relation.
        
    @param test      The relationship to test, ("add", "exc", etc.)
    @param thisClass The class the test function belongs to, assumed to 
                     be part of the Test package
    @param function  The function name to be tested
    @param args      The arguments to the function

    @return boolean if the relation holds,
            otherwise false
*///////////////////////////////////////////////////////////////////////
    public boolean testThis(String test, String thisClass, String function, Object... args) {

        boolean passed = false;
        thisClass = "Test." + thisClass; //All /src classes are in Test package

        //find the correct function to execute
        Class[] argClasses = new Class[args.length];
        for (int i = 0; i < argClasses.length; i++) {
            argClasses[i] = args[i].getClass();
        }

        //Get the method being tested
        try {
            Class<?> clazz = Class.forName(thisClass);
            //All constructors should be default
            Constructor<?> construct = clazz.getConstructor();
            Object inst = construct.newInstance();

            Method func = clazz.getMethod(function, argClasses);

                //Get the test support functions
                try {
                    //takes arg classes as input - THERE MAY BE MORE THAN ONE PERMUTE FUNCTION PER TEST
                    Method[] permuteFuncs = new Method[argClasses.length];
                    for (int j = 0; j < argClasses.length; j++) {
                        if ((test == "add") || (test == "mult")) { //These functions have two args - 2nd always int
                            permuteFuncs[j] = TestClass.class.getMethod(test, argClasses[j], int.class); 
                        } else { //Other functions have only one arg
                            permuteFuncs[j] = TestClass.class.getMethod(test, argClasses[j]); 
                        }
                    }
                    //takes return types as input and all have two matching args
                    Class type = func.getReturnType();
                    Method MRTestFunc = TestClass.class.getMethod(test + "Test", type, type);

                    //get original return value
                    Object return1 = func.invoke(inst, args);
                    //modify arguments
                    Object[] permutedArgs = new Object[args.length];
                    int constant = getInt(); //if required
                    for (int j = 0; j < args.length; j++) {
                        if ((test == "add") || (test == "mult")) { //requires constant arg
                            permutedArgs[j] = permuteFuncs[j].invoke(null, args[j], constant);
                        } else {
                            permutedArgs[j] = permuteFuncs[j].invoke(null, args[j]);
                        }
                    }
                    //get modified return value
                    Object return2 = func.invoke(inst, permutedArgs);
                    //run test
                    if ((boolean)MRTestFunc.invoke(null, return1, return2)) {
                        passed = true;
                    }
                } catch(NoSuchMethodException e) {
                    e.printStackTrace();
                }

        } catch(Exception e) {
            e.printStackTrace();
        }

        return passed;
    }


/*//////////////////////////////////////////////////////
    Random retreival methods
        - Get input values for test instances
*///////////////////////////////////////////////////////

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


    public static void main(String[] args) {
        int c = 2;
        int[] intarr = {1,2,3,4,5};
        double[] darr = {1.3,4.0};
        int i = 5;
        double d = 0.34;
        add(intarr, c);
        add(darr, c);
        add(i, c);
        add(d, c);
    }
}
