import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;
import java.lang.reflect.*;

import Test.MethodCollection2;
import Test.MethodsFromApacheMath;
import Test.MethodsFromColt;
import Test.MethodsFromMahout;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestClass {

    public static Random rand = new Random();
    public static int CONSTANT_INT = TestClass.getInt(); //dependent on rand
    public static final int MAX = 100;

    public static void mutConst() {
        CONSTANT_INT = getInt();
    }

/*//////////////////////////////////////////////////////
    ADDITIVE: add a positive constant.
        Expected result: increase or remain constant
*///////////////////////////////////////////////////////

    public static int add(int original) {
        return original + CONSTANT_INT;
    }

    public static double add(double original) {
        return original + ( (double)CONSTANT_INT);
    }

    public static long add(long original) {
        return original + ( (long)CONSTANT_INT);
    }

    public static int[] add(int[] original) {
        int[] additive = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            additive[i] = original[i] + CONSTANT_INT;
        }
        return additive;
    }

    public static double[] add(double[] original) {
        double[] additive = new double[original.length];
        for (int i = 0; i < original.length; i++) {
            additive[i] = original[i] + ( (double)CONSTANT_INT);
        }
        return additive;
    }

    public static boolean addTest(int orig, int next) {
        //orig = Math.abs(orig);
        //next = Math.abs(orig);
        return orig <= next;
    }

    public static boolean addTest(double orig, double next) {
        return ((Double.compare(orig, next) <= 0) || ((next - orig) > -0.0001));
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
        for (int i = 0; i < excluded.length; i++) { //output excludes final element
            excluded[i] = original[i];
        }
        return excluded;
    }

    public static double[] exc(double[] original) {
        double[] excluded = new double[original.length - 1];
        for (int i = 0; i < excluded.length; i++) { //output excludes final element
            excluded[i] = original[i];
        }
        return excluded;
    }

    public static int exc(int original) { return original; }

    public static double exc(double original) { return original; }

    public static boolean excTest(int pre, int post) {
        //pre = Math.abs(pre);
        //post = Math.abs(post);
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
        return ( (Double.compare(pre, post) >= 0) || ((pre - post) > -0.0001) );
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
        for (int i = 0; i < original.length; i++) {
            included[i] = original[i];
        }
        included[original.length] = getInt(); //new final element
        return included;
    }

    public static double[] inc(double[] original) {
        double[] included = new double[original.length + 1];
        for (int i = 0; i < original.length; i++) {
            included[i] = original[i];
        }
        included[original.length] = getDouble(); //new final element
        return included;
    }

    public static int inc(int original) { return original; }

    public static double inc(double original) { return original; }

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

    public static double inv(double original) {
        return 1.0 / original;
    }

    public static int inv(int original) {
        return 1 / original;
    }

    public static boolean invTest(int o, int n) { return excTest(o, n); }
    public static boolean invTest(double o, double n) { return excTest(o, n); }
    public static boolean invTest(int[] o, int[] n) { return excTest(o, n); }
    public static boolean invTest(double[] o, double[] n) { return excTest(o, n); }


/*//////////////////////////////////////////////////////
    MULTIPLICATIVE: multiply by a positive constant
        Expected result: increase or remain constant
*///////////////////////////////////////////////////////

    public static int[] mult(int[] original) {
        int[] multiplied = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            multiplied[i] = original[i] * CONSTANT_INT;
        }
        return multiplied;
    }

    public static double[] mult(double[] original) {
        double[] multiplied = new double[original.length];
        for (int i = 0; i < original.length; i++) {
            multiplied[i] = original[i] * CONSTANT_INT;
        }
        return multiplied;
    }

    public static double mult(double original) {
        return original * (double)CONSTANT_INT;
    }

    public static int mult(int original) {
        return original * CONSTANT_INT;
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

    public static double perm(double original) { return original; }
    public static int perm(int original) { return original; }

    public static boolean permTest(int o, int n) {
        return (o == n);
    }

    public static boolean permTest(double o, double n) {
        return ((Double.compare(o,n) == 0) || (Math.abs(o - n) < 0.0001));
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

        //System.out.println("testThis() Entering <<<<<<");

        boolean passed = false;
        thisClass = "Test." + thisClass; //All /src classes are in Test package

        //find the correct function to execute - That long function is going to cause problems
        Class[] argClasses = new Class[args.length];
        Class argClass;
        for (int i = 0; i < argClasses.length; i++) {
            argClass = args[i].getClass();
            //System.out.println("Class: " + argClass);
            //System.out.println("Component: " + argClass.getComponentType());
            if (argClass == Integer.class) {
                argClasses[i] = int.class;
            } else if (argClass == Double.class) {
                argClasses[i] = double.class;
            } else if (argClass.getComponentType() == int.class) {
                argClasses[i] = int[].class;
            } else if (argClass.getComponentType() == double.class) {
                argClasses[i] = double[].class;
            } else {
                System.out.println("PROBLEM - NO CLASS ASSIGNED");
            }
                
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
                        permuteFuncs[j] = TestClass.class.getMethod(test, argClasses[j]); 
                    }
                    //takes return types as input and all have two matching args
                    Class type = func.getReturnType();
                    Method MRTestFunc = TestClass.class.getMethod(test + "Test", type, type);

                    //System.out.println("Original Inputs:");
                    //for (Object in: args) {
                        //System.out.println(in);
                    //}

                    //get original return value
                    Object return1 = func.invoke(inst, args);

                    //System.out.println("Original Output: " + return1);

                    //modify arguments
                    Object[] permutedArgs = new Object[args.length];
                    for (int j = 0; j < args.length; j++) {
                        permutedArgs[j] = permuteFuncs[j].invoke(null, args[j]);
                    }

                    //System.out.println("Modified Inputs:");
                    //for (Object in: permutedArgs) {
                        //System.out.println(Arrays.toString((int[])in));
                    //}
        
                    //get modified return value
                    Object return2 = func.invoke(inst, permutedArgs);

                    //System.out.println("Modified Output: " + return2);

                    //System.out.println ("Running test: " + MRTestFunc);

                    //run test
                    if ((boolean)MRTestFunc.invoke(null, return1, return2)) {
                        passed = true;
                    }
                } catch(NoSuchMethodException e) {
                    System.out.println("TESTTHIS EXCEPTION: NO SUCH METHOD ");
                    e.printStackTrace();
                }

        } catch(Exception e) {
            System.out.println("TESTTHIS EXCEPTION OKAY");
            e.printStackTrace();
        }

        //System.out.println("testThis() Exiting with " + passed);
        return passed;
    }


/*//////////////////////////////////////////////////////
    Random retreival methods
        - Get input values for test instances
*///////////////////////////////////////////////////////

    public static int getInt() {
        return rand.nextInt(MAX) + 1;
    }

    public static int getInt(int max) {
        return rand.nextInt(max) + 1;
    }

    public static int[] getIntArray() {
        int size = rand.nextInt(8) + 2;
        return getIntArray(size);
    }

    public static int[] getIntArray(int size) {
        return rand.ints(size, 1, MAX).toArray();
    }

    public static double getDouble() {
        return rand.nextDouble() * getInt() + 1;
    }

    public static double getNextDouble() {
        return rand.nextDouble();
    }

    public static double[] getDoubleArray() {
        int size = rand.nextInt(9) + 1;
        return rand.doubles(size, 1.0, MAX).toArray();
    }

    public static double[] getDoubleArray(int size) {
        return rand.doubles(size, 1.0, MAX).toArray();
    }

    public static long getLong() {
        return Math.abs(rand.nextLong());
    }

    public static Boolean getBoolean() {
        return rand.nextBoolean();
    }

    public long[][] get2DLongArray() {
        int size1 = rand.nextInt(MAX) + 1;
        int size2 = rand.nextInt(MAX) + 1;
        long[][] arr = new long[size1][size2];
        for (int i = 0; i < size1; i++) {
            arr[i] = rand.longs().limit(size2).toArray();
        }
        return arr;
    }


    public static void main(String[] args) {

        TestClass tester = new TestClass();

        //arrays should be same size
        int[] orig = getIntArray();

        tester.testThis("add", "MethodsFromMahout", "sum", orig);
        tester.testThis("mult", "MethodsFromMahout", "sum", orig);
        tester.testThis("perm", "MethodsFromMahout", "sum", orig);
        tester.testThis("inv", "MethodsFromMahout", "sum", orig);
        tester.testThis("exc", "MethodsFromMahout", "sum", orig);
        tester.testThis("inc", "MethodsFromMahout", "sum", orig);
    }
}
