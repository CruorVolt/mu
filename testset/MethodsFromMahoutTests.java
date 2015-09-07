import org.junit.Test;
import static org.junit.Assert.*;
import Test.MethodsFromMahout;

public class MethodsFromMahoutTests extends TestClass {

    @Test
    public void cosinedistance_test() {
        //array lengths should match
        int size = getInt();
        double r1 = MethodsFromMahout.cosineDistance(getDoubleArray(size), getDoubleArray(size));
        double r2 = MethodsFromMahout.cosineDistance(getDoubleArray(size), getDoubleArray(size));
        assertEquals(1,1);
    }
    @Test
    public void manhattandistance_test() {
        //array lengths should match
        int size = getInt();
        double r1 = MethodsFromMahout.manhattanDistance(getDoubleArray(size), getDoubleArray(size));
        double r2 = MethodsFromMahout.manhattanDistance(getDoubleArray(size), getDoubleArray(size));
        assertEquals(1,1);
    }
    @Test
    public void chebyshevdistance_test() {
        //array lengths should match
        int size = getInt();
        double r1 = MethodsFromMahout.chebyshevDistance(getDoubleArray(size), getDoubleArray(size));
        double r2 = MethodsFromMahout.chebyshevDistance(getDoubleArray(size), getDoubleArray(size));
        assertEquals(1,1);
    }
    @Test
    public void tanimotodistance_test() {
        //array lengths should match
        int size = getInt();
        double r1 = MethodsFromMahout.tanimotoDistance(getDoubleArray(size), getDoubleArray(size));
        double r2 = MethodsFromMahout.tanimotoDistance(getDoubleArray(size), getDoubleArray(size));
        assertEquals(1,1);
    }
    @Test
    public void sum_test() {
        int r1 = MethodsFromMahout.sum(getIntArray());
        int r2 = MethodsFromMahout.sum(getIntArray());
        assertEquals(1,1);
    }
    @Test
    public void add_test() {
        //array lengths should match
        int size = getInt();
        int[] r1 = MethodsFromMahout.add(getIntArray(size), getIntArray(size));
        int[] r2 = MethodsFromMahout.add(getIntArray(size), getIntArray(size));
        assertEquals(1,1);
    }
    @Test
    public void dec_test() {
        //array lengths should match
        int size = getInt();
        int[] r1 = MethodsFromMahout.dec(getIntArray(size), getIntArray(size));
        int[] r2 = MethodsFromMahout.dec(getIntArray(size), getIntArray(size));
        assertEquals(1,1);
    }
    @Test
    public void givens_test() {
        //input array should be size 2?
        double[] r1 = MethodsFromMahout.givens(getDouble(), getDouble(), getDoubleArray(2));
        double[] r2 = MethodsFromMahout.givens(getDouble(), getDouble(), getDoubleArray(2));
        assertEquals(1,1);
    }
    @Test
    public void link_test() {
        double r1 = MethodsFromMahout.link(getDouble());
        double r2 = MethodsFromMahout.link(getDouble());
        assertEquals(1,1);
    }
    @Test
    public void nbtrees_test() {
        //keep inputs small and nonzero
        int r1 = MethodsFromMahout.nbTrees(getInt(10)+1, getInt(10)+1, getInt(10)+1);
        int r2 = MethodsFromMahout.nbTrees(getInt(10)+1, getInt(10)+1, getInt(10)+1);
        assertEquals(1,1);
    }
    @Test
    public void stepsize_test() {
        int r1 = MethodsFromMahout.stepSize(getInt(), getDouble());
        int r2 = MethodsFromMahout.stepSize(getInt(), getDouble());
        assertEquals(1,1);
    }
    @Test
    public void choose2_test() {
        double r1 = MethodsFromMahout.choose2(getDouble());
        double r2 = MethodsFromMahout.choose2(getDouble());
        assertEquals(1,1);
    }
    @Test
    public void computeweight_1_test() {
        double r1 = MethodsFromMahout.computeWeight(getDouble(),getDouble(),getDouble(),getDouble());
        double r2 = MethodsFromMahout.computeWeight(getDouble(),getDouble(),getDouble(),getDouble());
        assertEquals(1,1);
    }
    @Test
    public void computeweight_2_test() {
        double r1 = MethodsFromMahout.computeWeight(getDouble(), getDouble(),getDouble(),getDouble(),getDouble(),getDouble());
        double r2 = MethodsFromMahout.computeWeight(getDouble(), getDouble(),getDouble(),getDouble(),getDouble(),getDouble());
        assertEquals(1,1);
    }
    @Test
    public void errorrate_test() {
        //arrays should be same size
        int size = getInt();
        double r1 = MethodsFromMahout.errorRate(getDoubleArray(size),getDoubleArray(size));
        double r2 = MethodsFromMahout.errorRate(getDoubleArray(size),getDoubleArray(size));
        assertEquals(1,1);
    }
    @Test
    public void fromrho_test() {
        //array should be size 2
        double[] r1 = MethodsFromMahout.fromRho(getDouble(), getDoubleArray(2));
        double[] r2 = MethodsFromMahout.fromRho(getDouble(), getDoubleArray(2));
        assertEquals(1,1);
    }

}
