import org.junit.Test;
import static org.junit.Assert.*;
import Test.MethodsFromMahout;

public class MethodsFromMahoutTests extends TestClass {
    
    public boolean testThis(String test, String function, Object... args) {
        return super.testThis(test, "MethodsFromMahout", function, args);
    }    

    /*
    //@Test
    public void cosinedistance_test() {
        //array lengths should match
        int size = getInt();
	double[] arg1 = getDoubleArray(size);
	double[] arg2 = getDoubleArray(size);
        //double r1 = MethodsFromMahout.cosineDistance(arg1, arg2);

        //assertTrue("NOPE", true);
    }
    */

    //@Test
    public void manhattandistance_test() {
        //array lengths should match
        int size = getInt();
	double[] arg1 = getDoubleArray(size);
	double[] arg2 = getDoubleArray(size);
        //double r1 = MethodsFromMahout.manhattanDistance(arg1, arg2);

        //assertTrue("mult failure", testThis("mult", "manhattanDistance", arg1, arg2));
        //assertTrue("exc failure", testThis("exc", "manhattanDistance", arg1, arg2));
        //assertTrue("inc failure", testThis("inc", "manhattanDistance", arg1, arg2));
        //assertTrue("inv failure", testThis("inv", "manhattanDistance", arg1, arg2));
    }
    //@Test
    public void chebyshevdistance_test() {
        //array lengths should match
        int size = getInt();
	double[] arg1 = getDoubleArray(size);
	double[] arg2 = getDoubleArray(size);
        //double r1 = MethodsFromMahout.chebyshevDistance(arg1, arg2);

	//assertTrue("mult failure", testThis("mult", "chebyshevDistance", arg1, arg2));
    }
    //@Test
    public void tanimotodistance_test() {
        //array lengths should match
        int size = getInt();
	double[] arg1 = getDoubleArray(size);
	double[] arg2 = getDoubleArray(size);
        //double r1 = MethodsFromMahout.tanimotoDistance(arg1, arg2);

	//assertTrue("mult failure", testThis("mult", "tanimotoDist", arg1, arg2));
    }
    //@Test
    public void sum_test() {
        int[] orig = getIntArray();
        //int r1 = MethodsFromMahout.sum(orig);
        
        //assertTrue("add failure", testThis("add", "sum", orig));
        //assertTrue("mult failure", testThis("mult", "sum", orig));
        //assertTrue("exc failure", testThis("exc", "sum", orig));
        //assertTrue("inc failure", testThis("inc", "sum", orig));
        //assertTrue("per failure", testThis("per", "sum", orig));
        //assertTrue("inv failure", testThis("inv", "sum", orig));
    }
    //@Test
    public void add_test() {
        //array lengths should match
        int size = getInt();
        int[] orig1 = getIntArray(size);
        int[] orig2 = getIntArray(size);
        //int[] r1 = MethodsFromMahout.add(orig1, orig2);

        //assertTrue("add failure", testThis("add", "add", orig1, orig2)); //this one only!
        //assertTrue("mult failure", testThis("mult", "add", orig1, orig2)); //this one only!
        //assertTrue("inv failure", testThis("inv", "add", orig1, orig2)); //this one only!
    }
    /*
    //@Test
    public void dec_test() {
        //array lengths should match
        int size = getInt();
	int[] arg1 = getIntArray(size);
	int[] arg2 = getIntArray(size);
        //int[] r1 = MethodsFromMahout.dec(arg1, arg2);
        //assertTrue("NOPE", true);
    }
    */

    /*
    //@Test
    public void givens_test() {
        //input array should be size 2?
	double arg1 = getDouble();
	double arg2 = getDouble();
	double[] arg3 = getDoubleArray(2);
        //double[] r1 = MethodsFromMahout.givens(arg1, arg2, arg3);
        //assertTrue("NOPE", true);
    }
    */

    /*
    //@Test
    public void link_test() {
	double arg1 = getDouble();
        //double r1 = MethodsFromMahout.link(arg1);
        //assertTrue("NOPE", true);
    }
    */

    /*
    //@Test
    public void nbtrees_test() {
        //keep inputs small and nonzero
	int arg1 = getInt(10) + 1;
	int arg2 = getInt(10) + 1;
	int arg3 = getInt(10) + 1;
        //int r1 = MethodsFromMahout.nbTrees(arg1, arg2, arg3);
        //assertTrue("NOPE", true);
    }
    */

    /*
    //@Test
    public void stepsize_test() {
	int arg1 = getInt();
	double arg2 = getDouble();
        //int r1 = MethodsFromMahout.stepSize(arg1, arg2);
        //assertTrue("NOPE", true);
    }
    */

    /*
    //@Test
    public void choose2_test() {
	double arg1 = getDouble();
        //double r1 = MethodsFromMahout.choose2(arg1);
        //assertTrue("NOPE", true);
    }
    */

    /*
    //@Test
    public void computeweight_1_test() {
	double arg1 = getDouble();
	double arg2 = getDouble();
	double arg3 = getDouble();
	double arg4 = getDouble();
        //double r1 = MethodsFromMahout.computeWeight(arg1, arg2, arg3, arg4);
        //assertTrue("NOPE", true);
    }
    */

    /*
    //@Test
    public void computeweight_2_test() {
	double arg1 = getDouble();
	double arg2 = getDouble();
	double arg3 = getDouble();
	double arg4 = getDouble();
	double arg6 = getDouble();
	double arg5 = getDouble();
        //double r1 = MethodsFromMahout.computeWeight(arg1, arg2, arg3, arg4, arg5, arg6);
        //assertTrue("NOPE", true);
    }
    */

    //@Test
    public void errorrate_test() {
        //arrays should be same size
        int size = getInt();
        double[] orig1 = getDoubleArray(size);
        double[] orig2 = getDoubleArray(size);
        //double r1 = MethodsFromMahout.errorRate(orig1, orig2);

        //assertTrue("add failure", testThis("add", "errorRate", orig1, orig2));
        //assertTrue("mult failure", testThis("mult", "errorRate", orig1, orig2));
        //assertTrue("per failure", testThis("per", "errorRate", orig1, orig2));
        //assertTrue("inv failure", testThis("inv", "errorRate", orig1, orig2));
    }

    /*
    //@Test
    public void fromrho_test() {
        //array should be size 2
	double arg1 = getDouble();
	double[] arg2 = getDoubleArray(2);
        //double[] r1 = MethodsFromMahout.fromRho(arg1, arg2);
        //assertTrue("NOPE", true);
    }
    */


}
