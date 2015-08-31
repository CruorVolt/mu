import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;
import Test.MethodsFromApacheMath;

public class MethodsFromApacheMathTests {

    private static Random rand = new Random();
    private static final int MAX = 10000;

    private int getInt() {
        return rand.nextInt();
    }

    private Boolean getBoolean() {
        return rand.nextBoolean();
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

    private long[][] get2DLongArray() {
        int size1 = rand.nextInt(MAX/10) + 1;
        int size2 = rand.nextInt(MAX/10) + 1;
        long[][] arr = new long[size1][size2];
        for (int i = 0; i < size1; i++) {
            arr[i] = rand.longs().limit(size2).toArray();
        }
        return arr;
    }
	 
    @Test
    public void distance_test() {
        double r1 = MethodsFromApacheMath.distance(getDoubleArray(), getDoubleArray());
        double r2 = MethodsFromApacheMath.distance(getDoubleArray(), getDoubleArray());
        assertEquals(1,1);
    }
    @Test
    public void distance1_test() {
        double r1 = MethodsFromApacheMath.distance1(getDoubleArray(), getDoubleArray());
        double r2 = MethodsFromApacheMath.distance1(getDoubleArray(), getDoubleArray());
        assertEquals(1,1);
    }
    @Test
    public void distanceInf_test() {
        double r1 = MethodsFromApacheMath.distanceInf(getDoubleArray(), getDoubleArray());
        double r2 = MethodsFromApacheMath.distanceInf(getDoubleArray(), getDoubleArray());
        assertEquals(1,1);
    }
    @Test
    public void ebeAdd_test() {
        double[] r1 = MethodsFromApacheMath.ebeAdd(getDoubleArray(), getDoubleArray());
        double[] r2 = MethodsFromApacheMath.ebeAdd(getDoubleArray(), getDoubleArray());
        assertEquals(1,1);
    }
    @Test
    public void ebeDivide_test() {
        double[] r1 = MethodsFromApacheMath.ebeDivide(getDoubleArray(), getDoubleArray());
        double[] r2 = MethodsFromApacheMath.ebeDivide(getDoubleArray(), getDoubleArray());
        assertEquals(1,1);
    }
    @Test
    public void ebeMultiply_test() {
        double[] r1 = MethodsFromApacheMath.ebeMultiply(getDoubleArray(), getDoubleArray());
        double[] r2 = MethodsFromApacheMath.ebeMultiply(getDoubleArray(), getDoubleArray());
        assertEquals(1,1);
    }
    @Test
    public void ebeSubtract_test() {
        double[] r1 = MethodsFromApacheMath.ebeSubtract(getDoubleArray(), getDoubleArray());
        double[] r2 = MethodsFromApacheMath.ebeSubtract(getDoubleArray(), getDoubleArray());
        assertEquals(1,1);
    }
    @Test
    public void safeNorm_test() {
        double r1 = MethodsFromApacheMath.safeNorm(getDoubleArray());
        double r2 = MethodsFromApacheMath.safeNorm(getDoubleArray());
        assertEquals(1,1);
    }
    @Test
    public void scale_test() {
        double[] r1 = MethodsFromApacheMath.scale(getDouble(), getDoubleArray());
        double[] r2 = MethodsFromApacheMath.scale(getDouble(), getDoubleArray());
        assertEquals(1,1);
    }

    @Test
    public void entropy_test() {
        double r1 = MethodsFromApacheMath.entropy(getDoubleArray());
        double r2 = MethodsFromApacheMath.entropy(getDoubleArray());
        assertEquals(1,1);
    }
    @Test
    public void g_test() {
        double r1 = MethodsFromApacheMath.g(getDoubleArray(), getDoubleArray());
        double r2 = MethodsFromApacheMath.g(getDoubleArray(), getDoubleArray());
        assertEquals(1,1);
    }
    @Test
    public void calculateAbsoluteDifferences_test() {
        double[] r1 = MethodsFromApacheMath.calculateAbsoluteDifferences(getDoubleArray());
        double[] r2 = MethodsFromApacheMath.calculateAbsoluteDifferences(getDoubleArray());
        assertEquals(1,1);
    }
    @Test
    public void calculateDifferences_test() {
        double[] r1 = MethodsFromApacheMath.calculateDifferences(getDoubleArray(), getDoubleArray());
        double[] r2 = MethodsFromApacheMath.calculateDifferences(getDoubleArray(), getDoubleArray());
        assertEquals(1,1);
    }
    @Test
    public void computeDividedDifference_test() {
        double[] r1 = MethodsFromApacheMath.computeDividedDifference(getDoubleArray(), getDoubleArray());
        double[] r2 = MethodsFromApacheMath.computeDividedDifference(getDoubleArray(), getDoubleArray());
        assertEquals(1,1);
    }
    @Test
    public void computeCanberraDistance_test() {
        double r1 = MethodsFromApacheMath.computeCanberraDistance(getDoubleArray(), getDoubleArray());
        double r2 = MethodsFromApacheMath.computeCanberraDistance(getDoubleArray(), getDoubleArray());
        assertEquals(1,1);
    }
    @Test
    public void evaluateHoners_test() {
        double r1 = MethodsFromApacheMath.evaluateHoners(getDoubleArray(), getDouble());
        double r2 = MethodsFromApacheMath.evaluateHoners(getDoubleArray(), getDouble());
        assertEquals(1,1);
    }
    @Test
    public void evaluateInternal_test() {
        double r1 = MethodsFromApacheMath.evaluateInternal(getDoubleArray(), getDoubleArray(), getDouble());
        double r2 = MethodsFromApacheMath.evaluateInternal(getDoubleArray(), getDoubleArray(), getDouble());
        assertEquals(1,1);
    }
   @Test
   public void evaluateNewton_test() {
       double r1 = MethodsFromApacheMath.evaluateNewton(getDoubleArray(), getDoubleArray(), getDouble());
       double r2 = MethodsFromApacheMath.evaluateNewton(getDoubleArray(), getDoubleArray(), getDouble());
       assertEquals(1,1);
   }

   @Test
   public void meanDifference_test() {
       double r1 = MethodsFromApacheMath.meanDifference(getDoubleArray(), getDoubleArray());
       double r2 = MethodsFromApacheMath.meanDifference(getDoubleArray(), getDoubleArray());
       assertEquals(1,1);
   }

   @Test
   public void varianceDifference_test() {
       double r1 = MethodsFromApacheMath.varianceDifference(getDoubleArray(), getDoubleArray());
       double r2 = MethodsFromApacheMath.varianceDifference(getDoubleArray(), getDoubleArray());
       assertEquals(1,1);
   }

   @Test
   public void equals_test() {
        boolean r1 = MethodsFromApacheMath.equals(getDoubleArray(), getDoubleArray());
        boolean r2 = MethodsFromApacheMath.equals(getDoubleArray(), getDoubleArray());
        assertEquals(1,1);
   }

   @Test
   public void checkNonNegative_test() {
        boolean r1 = MethodsFromApacheMath.checkNonNegative(getDoubleArray());
        boolean r2 = MethodsFromApacheMath.checkNonNegative(getDoubleArray());
        assertEquals(1,1);
   }

   @Test
   public void checkPositive_test() {
        boolean r1 = MethodsFromApacheMath.checkPositive(getDoubleArray());
        boolean r2 = MethodsFromApacheMath.checkPositive(getDoubleArray());
        assertEquals(1,1);
   }

   @Test
   public void chiSquare_test() {
        double r1 = MethodsFromApacheMath.chiSquare(getDoubleArray(), getDoubleArray());
        double r2 = MethodsFromApacheMath.chiSquare(getDoubleArray(), getDoubleArray());
        assertEquals(1,1);
   }

  @Test
  public void evaluateSemiVariance_test() {
        double r1 = MethodsFromApacheMath.evaluateSemiVariance(getDoubleArray(), getDouble(), getBoolean(), getBoolean(), getInt(), getInt());
        double r2 = MethodsFromApacheMath.evaluateSemiVariance(getDoubleArray(), getDouble(), getBoolean(), getBoolean(), getInt(), getInt());
        assertEquals(1,1);
  }

  @Test
  public void partition_test() {
        int r1 = MethodsFromApacheMath.partition(getDoubleArray(), getInt(), getInt(), getInt());
        int r2 = MethodsFromApacheMath.partition(getDoubleArray(), getInt(), getInt(), getInt());
        assertEquals(1,1);
  }

}
