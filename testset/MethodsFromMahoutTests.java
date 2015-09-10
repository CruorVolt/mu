import org.junit.Test;
import static org.junit.Assert.*;
import Test.MethodsFromMahout;

public class MethodsFromMahoutTests extends TestClass {

    @Test
    public void cosinedistance_test() {
        //array lengths should match
        int size = getInt();
	double[] arg1 = getDoubleArray(size);
	double[] arg2 = getDoubleArray(size);
        double r1 = MethodsFromMahout.cosineDistance(arg1, arg2);
    }
    @Test
    public void manhattandistance_test() {
        //array lengths should match
        int size = getInt();
	double[] arg1 = getDoubleArray(size);
	double[] arg2 = getDoubleArray(size);
        double r1 = MethodsFromMahout.manhattanDistance(arg1, arg2);
    }
    @Test
    public void chebyshevdistance_test() {
        //array lengths should match
        int size = getInt();
	double[] arg1 = getDoubleArray(size);
	double[] arg2 = getDoubleArray(size);
        double r1 = MethodsFromMahout.chebyshevDistance(arg1, arg2);
    }
    @Test
    public void tanimotodistance_test() {
        //array lengths should match
        int size = getInt();
	double[] arg1 = getDoubleArray(size);
	double[] arg2 = getDoubleArray(size);
        double r1 = MethodsFromMahout.tanimotoDistance(arg1, arg2);
    }
    @Test
    public void sum_test() {
        int[] orig = getIntArray();
        int r1 = MethodsFromMahout.sum(orig);
        
        //add
        int c = getInt();
        int[] addIn = add(orig, c);
        int addOut = MethodsFromMahout.sum(addIn);
        assertTrue("add failure", addTest(r1, addOut));
    }
    @Test
    public void add_test() {
        //array lengths should match
        int size = getInt();
        int[] orig1 = getIntArray(size);
        int[] orig2 = getIntArray(size);
        int[] r1 = MethodsFromMahout.add(orig1, orig2);

        //add
        int c = getInt();
        int[] addIn1 = add(orig1, c);
        int[] addIn2 = add(orig2, c);
        int[] addOut = MethodsFromMahout.add(addIn1, addIn2);
        assertTrue("add failure", addTest(r1, addOut));
    }
    @Test
    public void dec_test() {
        //array lengths should match
        int size = getInt();
	int[] arg1 = getIntArray(size);
	int[] arg2 = getIntArray(size);
        int[] r1 = MethodsFromMahout.dec(arg1, arg2);
    }
    @Test
    public void givens_test() {
        //input array should be size 2?
	double arg1 = getDouble();
	double arg2 = getDouble();
	double arg3 = getDoubleArray(2);
        double[] r1 = MethodsFromMahout.givens(arg1, arg2, arg3):
    }
    @Test
    public void link_test() {
	double arg1 = getDouble();
        double r1 = MethodsFromMahout.link(arg1);
    }
    @Test
    public void nbtrees_test() {
        //keep inputs small and nonzero
	int arg1 = getInt(10) + 1;
	int arg2 = getInt(10) + 1;
	int arg3 = getInt(10) + 1;
        int r1 = MethodsFromMahout.nbTrees(arg1, arg2, arg3);
    }
    @Test
    public void stepsize_test() {
	int arg1 = getInt();
	double arg2 = getDouble();
        int r1 = MethodsFromMahout.stepSize(arg1, arg2);
    }
    @Test
    public void choose2_test() {
	double arg1 = getDouble();
        double r1 = MethodsFromMahout.choose2(arg1);
    }
    @Test
    public void computeweight_1_test() {
	double arg1 = getDouble();
	double arg2 = getDouble();
	double arg3 = getDouble();
	double arg4 = getDouble();
        double r1 = MethodsFromMahout.computeWeight(arg1, arg2, arg3, arg4);
    }
    @Test
    public void computeweight_2_test() {
	double arg1 = getDouble();
	double arg2 = getDouble();
	double arg3 = getDouble();
	double arg4 = getDouble();
	double arg6 = getDouble();
	double arg5 = getDouble();
        double r1 = MethodsFromMahout.computeWeight(arg1, arg2, arg3, arg4, arg5, arg6);
    }
    @Test
    public void errorrate_test() {
        //arrays should be same size
        int size = getInt();
        double[] orig1 = getDoubleArray(size);
        double[] orig2 = getDoubleArray(size);
        double r1 = MethodsFromMahout.errorRate(orig1, orig2);

        //add
        int c = getInt();
        double[] add1 = add(orig1, c);
        double[] add2 = add(orig2, c);
        double addOut = MethodsFromMahout.errorRate(add1, add2);
        assertTrue("add failure", addTest(r1, addOut));
    }

    @Test
    public void fromrho_test() {
        //array should be size 2
	double arg1 = getDouble();
	double[] arg2 = getDoubleArray(2);
        double[] r1 = MethodsFromMahout.fromRho(arg1, arg2);
    }

}
