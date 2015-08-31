import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;
import Test.MethodsFromMahout;

public class MethodsFromMahoutTests {

    private static Random rand = new Random();
    private static final int MAX = 10000;

    private int getInt() {
        return rand.nextInt();
    }

    private int[] getIntArray() {
        int size = rand.nextInt(MAX) + 1;
        return rand.ints().limit(size).toArray();
    }

    private double getDouble() {
        return rand.nextDouble();
    }

    private double[] getDoubleArray() {
        int size = rand.nextInt(MAX) + 1;
        return rand.doubles().limit(size).toArray();
    }

    @Test
    public void cosinedistance_test() {
        double r1 = MethodsFromMahout.cosineDistance(getDoubleArray(), getDoubleArray());
        double r2 = MethodsFromMahout.cosineDistance(getDoubleArray(), getDoubleArray());
        assertEquals(1,1);
    }
    @Test
    public void manhattandistance_test() {
        double r1 = MethodsFromMahout.manhattanDistance(getDoubleArray(), getDoubleArray());
        double r2 = MethodsFromMahout.manhattanDistance(getDoubleArray(), getDoubleArray());
        assertEquals(1,1);
    }
    @Test
    public void chebyshevdistance_test() {
        double r1 = MethodsFromMahout.chebyshevDistance(getDoubleArray(), getDoubleArray());
        double r2 = MethodsFromMahout.chebyshevDistance(getDoubleArray(), getDoubleArray());
        assertEquals(1,1);
    }
    @Test
    public void tanimotodistance_test() {
        double r1 = MethodsFromMahout.tanimotoDistance(getDoubleArray(), getDoubleArray());
        double r2 = MethodsFromMahout.tanimotoDistance(getDoubleArray(), getDoubleArray());
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
        int[] r1 = MethodsFromMahout.add(getIntArray(), getIntArray());
        int[] r2 = MethodsFromMahout.add(getIntArray(), getIntArray());
        assertEquals(1,1);
    }
    @Test
    public void dec_test() {
        int[] r1 = MethodsFromMahout.dec(getIntArray(), getIntArray());
        int[] r2 = MethodsFromMahout.dec(getIntArray(), getIntArray());
        assertEquals(1,1);
    }
    @Test
    public void givens_test() {
        double[] r1 = MethodsFromMahout.givens(getDouble(), getDouble(), getDoubleArray());
        double[] r2 = MethodsFromMahout.givens(getDouble(), getDouble(), getDoubleArray());
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
        int r1 = MethodsFromMahout.nbTrees(getInt(), getInt(), getInt());
        int r2 = MethodsFromMahout.nbTrees(getInt(), getInt(), getInt());
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
        double r1 = MethodsFromMahout.errorRate(getDoubleArray(),getDoubleArray());
        double r2 = MethodsFromMahout.errorRate(getDoubleArray(),getDoubleArray());
        assertEquals(1,1);
    }
    @Test
    public void fromrho_test() {
        double[] r1 = MethodsFromMahout.fromRho(getDouble(), getDoubleArray());
        double[] r2 = MethodsFromMahout.fromRho(getDouble(), getDoubleArray());
        assertEquals(1,1);
    }

}
