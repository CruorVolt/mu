import org.junit.Test;
import static org.junit.Assert.*;
import Test.MethodsFromMahout;

public class MethodsFromMahoutTests extends TestClass {
    
    public boolean testThis(String test, String function, Object... args) {
        return super.testThis(test, "MethodsFromMahout", function, args);
    }    

    @Test
    public void manhattandistance_test() {
        //array lengths should match
        int size = getInt();
	double[] arg1 = getDoubleArray(size);
	double[] arg2 = getDoubleArray(size);
        //double r1 = MethodsFromMahout.manhattanDistance(arg1, arg2);

        assertTrue("mult failure", testThis("mult", "manhattanDistance", arg1, arg2));
        assertTrue("exc failure", testThis("exc", "manhattanDistance", arg1, arg2));
        assertTrue("inc failure", testThis("inc", "manhattanDistance", arg1, arg2));
        assertTrue("inv failure", testThis("inv", "manhattanDistance", arg1, arg2));
    }
    @Test
    public void chebyshevdistance_test() {
        //array lengths should match
        int size = getInt();
	double[] arg1 = getDoubleArray(size);
	double[] arg2 = getDoubleArray(size);
        //double r1 = MethodsFromMahout.chebyshevDistance(arg1, arg2);

	assertTrue("mult failure", testThis("mult", "chebyshevDistance", arg1, arg2));
    }
    @Test
    public void tanimotodistance_test() {
        //array lengths should match
        int size = getInt();
	double[] arg1 = getDoubleArray(size);
	double[] arg2 = getDoubleArray(size);
        //double r1 = MethodsFromMahout.tanimotoDistance(arg1, arg2);

	assertTrue("mult failure", testThis("mult", "tanimotoDistance", arg1, arg2));
    }
    @Test
    public void sum_test() {
        int[] orig = getIntArray();
        //int r1 = MethodsFromMahout.sum(orig);
        
        assertTrue("add failure", testThis("add", "sum", orig));
        assertTrue("mult failure", testThis("mult", "sum", orig));
        assertTrue("exc failure", testThis("exc", "sum", orig));
        assertTrue("inc failure", testThis("inc", "sum", orig));
        assertTrue("perm failure", testThis("perm", "sum", orig));
        assertTrue("inv failure", testThis("inv", "sum", orig));
    }
    @Test
    public void add_test() {
        //array lengths should match
        int size = getInt();
        int[] orig1 = getIntArray(size);
        int[] orig2 = getIntArray(size);
        //int[] r1 = MethodsFromMahout.add(orig1, orig2);

        assertTrue("add failure", testThis("add", "add", orig1, orig2)); //this one only!
        assertTrue("mult failure", testThis("mult", "add", orig1, orig2)); //this one only!
        assertTrue("inv failure", testThis("inv", "add", orig1, orig2)); //this one only!
    }

    @Test
    public void errorrate_test() {
        //arrays should be same size
        int size = getInt();
        double[] orig1 = getDoubleArray(size);
        double[] orig2 = getDoubleArray(size);
        //double r1 = MethodsFromMahout.errorRate(orig1, orig2);

        assertTrue("add failure", testThis("add", "errorRate", orig1, orig2));
        assertTrue("mult failure", testThis("mult", "errorRate", orig1, orig2));
        assertTrue("perm failure", testThis("perm", "errorRate", orig1, orig2));
        assertTrue("inv failure", testThis("inv", "errorRate", orig1, orig2));
    }

}
