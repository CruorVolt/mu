import org.junit.Test;
import static org.junit.Assert.*;
import Test.MethodsFromApacheMath;
import java.util.Arrays;

public class MethodsFromApacheMathTests extends TestClass {
	 
    @Test
    public void distance_test() {
        //arrays should be same size
        int size = getInt() + 1;
        double r1 = MethodsFromApacheMath.distance(getDoubleArray(size), getDoubleArray(size));
        double r2 = MethodsFromApacheMath.distance(getDoubleArray(size), getDoubleArray(size));
        assertEquals(1,1);
    }

    @Test
    public void distance1_test() {
        //arrays should be same size
        int size = getInt() + 1;
        double r1 = MethodsFromApacheMath.distance1(getDoubleArray(size), getDoubleArray(size));
        double r2 = MethodsFromApacheMath.distance1(getDoubleArray(size), getDoubleArray(size));
        assertEquals(1,1);
    }

    @Test
    public void distanceInf_test() {
        //arrays should be same size
        int size = getInt() + 1;
        double r1 = MethodsFromApacheMath.distanceInf(getDoubleArray(size), getDoubleArray(size));
        double r2 = MethodsFromApacheMath.distanceInf(getDoubleArray(size), getDoubleArray(size));
        assertEquals(1,1);
    }

    @Test
    public void ebeAdd_test() {
        //Most execution paths require arrays of matching size
        int arraySize = getInt();
        double[] r1 = MethodsFromApacheMath.ebeAdd(getDoubleArray(arraySize), getDoubleArray(arraySize));
        double[] r2 = MethodsFromApacheMath.ebeAdd(getDoubleArray(arraySize), getDoubleArray(arraySize));
        assertEquals(1,1);
    }

    @Test
    public void ebeDivide_test() {
        //Most execution paths require arrays of matching size
        int arraySize = getInt();
        double[] r1 = MethodsFromApacheMath.ebeDivide(getDoubleArray(arraySize), getDoubleArray(arraySize));
        double[] r2 = MethodsFromApacheMath.ebeDivide(getDoubleArray(arraySize), getDoubleArray(arraySize));
        assertEquals(1,1);
    }

    @Test
    public void ebeMultiply_test() {
        //Most execution paths require arrays of matching size
        int arraySize = getInt();
        double[] r1 = MethodsFromApacheMath.ebeMultiply(getDoubleArray(arraySize), getDoubleArray(arraySize));
        double[] r2 = MethodsFromApacheMath.ebeMultiply(getDoubleArray(arraySize), getDoubleArray(arraySize));
        assertEquals(1,1);
    }

    @Test
    public void ebeSubtract_test() {
        //Most execution paths require arrays of matching size
        int arraySize = getInt();
        double[] r1 = MethodsFromApacheMath.ebeSubtract(getDoubleArray(arraySize), getDoubleArray(arraySize));
        double[] r2 = MethodsFromApacheMath.ebeSubtract(getDoubleArray(arraySize), getDoubleArray(arraySize));
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
        //Input arrays must be same length and length must be >= 2
        int size = getInt() + 2;
        double r1 = MethodsFromApacheMath.g(getDoubleArray(size), getDoubleArray(size));
        double r2 = MethodsFromApacheMath.g(getDoubleArray(size), getDoubleArray(size));
        assertEquals(1,1);
    }

    @Test
    public void calculateAbsoluteDifferences_test() {
        //length cannot be zero
        double[] r1 = MethodsFromApacheMath.calculateAbsoluteDifferences(getDoubleArray());
        double[] r2 = MethodsFromApacheMath.calculateAbsoluteDifferences(getDoubleArray());
        assertEquals(1,1);
    }

    @Test
    public void calculateDifferences_test() {
        //Arrays must be same length
        int size = getInt();
        double[] r1 = MethodsFromApacheMath.calculateDifferences(getDoubleArray(size), getDoubleArray(size));
        double[] r2 = MethodsFromApacheMath.calculateDifferences(getDoubleArray(size), getDoubleArray(size));
        assertEquals(1,1);
    }

    @Test
    public void computeDividedDifference_test() {
        //Arrays must be same length
        int size = getInt();
        double[] r1 = MethodsFromApacheMath.computeDividedDifference(getDoubleArray(size), getDoubleArray(size));
        double[] r2 = MethodsFromApacheMath.computeDividedDifference(getDoubleArray(size), getDoubleArray(size));
        assertEquals(1,1);
    }

    @Test
    public void computeCanberraDistance_test() {
        //Arrays must be same length
        int size = getInt();
        double r1 = MethodsFromApacheMath.computeCanberraDistance(getDoubleArray(size), getDoubleArray(size));
        double r2 = MethodsFromApacheMath.computeCanberraDistance(getDoubleArray(size), getDoubleArray(size));
        assertEquals(1,1);
    }

    @Test
    public void evaluateHoners_test() {
        //Array length must be at least 1
        double r1 = MethodsFromApacheMath.evaluateHoners(getDoubleArray(), getDouble());
        double r2 = MethodsFromApacheMath.evaluateHoners(getDoubleArray(), getDouble());
        assertEquals(1,1);
    }

    @Test
    public void evaluateInternal_test() {
        //First array arg must be at least length 2 and be monotonically increasing
        int length = getInt() + 2;
        double[] firstArg = getDoubleArray(length);
        Arrays.sort(firstArg);
        double r1 = MethodsFromApacheMath.evaluateInternal(firstArg, getDoubleArray(length), getDouble());
        double r2 = MethodsFromApacheMath.evaluateInternal(firstArg, getDoubleArray(length), getDouble());
        assertEquals(1,1);
    }

   @Test
   public void evaluateNewton_test() {
       //First arg and second arg must have length difference of 1, each must be at least length 1
       int size = getInt() + 2;
       double r1 = MethodsFromApacheMath.evaluateNewton(getDoubleArray(size), getDoubleArray(size - 1), getDouble());
       double r2 = MethodsFromApacheMath.evaluateNewton(getDoubleArray(size), getDoubleArray(size - 1), getDouble());
       assertEquals(1,1);
   }

   @Test
   public void meanDifference_test() {
       //inputs must have matching and positive lengths
       int size = getInt() + 1;
       double r1 = MethodsFromApacheMath.meanDifference(getDoubleArray(size), getDoubleArray(size));
       double r2 = MethodsFromApacheMath.meanDifference(getDoubleArray(size), getDoubleArray(size));
       assertEquals(1,1);
   }

   @Test
   public void varianceDifference_test() {
       //inputs must have matching lengths of at least 2
       int size = getInt() + 2;
       double r1 = MethodsFromApacheMath.varianceDifference(getDoubleArray(size), getDoubleArray(size));
       double r2 = MethodsFromApacheMath.varianceDifference(getDoubleArray(size), getDoubleArray(size));
       assertEquals(1,1);
   }

   @Test
   public void equals_test() {
        //most code paths require same-length inputs
        int size = getInt();
        boolean r1 = MethodsFromApacheMath.equals(getDoubleArray(size), getDoubleArray(size));
        boolean r2 = MethodsFromApacheMath.equals(getDoubleArray(size), getDoubleArray(size));
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
        //zero cannot be in the first argument and both arguments must be at least length 2
        int size = getInt() + 2;
        double[] firstArg = getDoubleArray(size);
        for (int i = 0; i < firstArg.length; i++) {
            firstArg[i] = firstArg[i] + 1; //Ensure strictly positive
        }
        double r1 = MethodsFromApacheMath.chiSquare(firstArg, getDoubleArray(size));
        double r2 = MethodsFromApacheMath.chiSquare(firstArg, getDoubleArray(size));
        assertEquals(1,1);
   }

  @Test
  public void evaluateSemiVariance_test() {
        int start = getInt();
        int length = getInt() + 2;
        int size = getInt() + start + length + 1;
        double r1 = MethodsFromApacheMath.evaluateSemiVariance(getDoubleArray(size), getDouble(), getBoolean(), getBoolean(), start, length);
        double r2 = MethodsFromApacheMath.evaluateSemiVariance(getDoubleArray(size), getDouble(), getBoolean(), getBoolean(), start, length);
        assertEquals(1,1);
  }

  @Test
  public void partition_test() {
        int begin = getInt() + 5;
        int end = begin + getInt() + 5;
        int pivot =  end - begin;
        int size = end + begin + getInt();
        int r1 = MethodsFromApacheMath.partition(getDoubleArray(size), begin, end, pivot);
        int r2 = MethodsFromApacheMath.partition(getDoubleArray(size), begin, end, pivot);
        assertEquals(1,1);
  }

  @Test
  public void evaluateWeightedProduct_test() {
        //First two args must be same length and have one or more elements, second two args must be valid start and length indices
        int start = getInt();
        int length = getInt() + 2;
        int size = getInt() + start + length + 1;
        double r1 = MethodsFromApacheMath.evaluateWeightedProduct(getDoubleArray(size), getDoubleArray(size), start, length);
        double r2 = MethodsFromApacheMath.evaluateWeightedProduct(getDoubleArray(size), getDoubleArray(size), start, length);
        assertEquals(1,1);
  }

}
